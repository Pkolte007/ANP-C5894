package com.hiber4.demo.config;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.hiber4.demo.entity.Student;

public class HiberUtil {

	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory()
	{
		if (sessionFactory == null) {
			try {
				System.out.println("im into a method");
				Configuration configuration = new Configuration();
				Properties settings = new Properties(); //collection franework  java 1.2
				settings.put(Environment.DIALECT,"org.hibernate.dialect.MySQL5Dialect");
				settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				settings.put(Environment.USER, "root");
				settings.put(Environment.PASS, "Iaf@1932");
				settings.put(Environment.HBM2DDL_AUTO, "update");
				settings.put(Environment.URL, "jdbc:mysql://localhost:3306/student");
				settings.put(Environment.SHOW_SQL, "true");
				configuration.setProperties(settings);
				System.out.println("property set ho gaya");
				configuration.addAnnotatedClass(com.hiber4.demo.entity.Student.class);
				
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();
				System.out.println("Hibernate Java Config serviceRegistry created");
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
				//return sessionFactory;
				System.out.println("session Fcatory");
				
			}
			catch(Exception ex)
			{
				System.out.println("error");
			}
		}
		return sessionFactory;
		
		
	}
	public static Session getSession() 
	{
		return getSessionFactory().openSession();
	
	}

}
