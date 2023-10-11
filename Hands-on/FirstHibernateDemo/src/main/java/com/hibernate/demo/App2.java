package com.hibernate.demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App2 
{
    public static void main( String[] args )
    {
    	System.out.println("Connection Started..");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction ts = session.beginTransaction();
        Fruitss p=new Fruitss();
    	p.setId(3);
    	session.save(p);
        ts.commit();
        session.close();
        System.out.println("Employee data Saved Successfully");


    }
}