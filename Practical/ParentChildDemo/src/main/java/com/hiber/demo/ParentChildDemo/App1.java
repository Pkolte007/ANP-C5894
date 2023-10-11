package com.hiber.demo.ParentChildDemo;

import java.util.HashSet;

import javax.persistence.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App1 
{
	 public static void main( String[] args ) {
		 Configuration cfg=new Configuration(); 
		 cfg.configure("hibernate1.cfg.xml");
			
		  SessionFactory factory=cfg.buildSessionFactory(); 
		  Session session=factory.openSession(); 
		  Transaction tx=session.beginTransaction();
		
       
       
       Department d1=new Department();
       d1.setdId(1);
       d1.setdName("SAP");
       
       Employee2 e1=new Employee2();
       e1.seteId(1);
       e1.setEname("Prasanna");
       e1.setDepartment(d1);
       
       Employee2 e2=new Employee2();
       e2.seteId(2);
       e2.setEname("Pooja");
       e2.setDepartment(d1);
       
       
     
       
       HashSet<Employee2> employee2set=new HashSet<Employee2>();
       employee2set.add(e1);
       employee2set.add(e2);
       session.save(e1);
       session.save(e2);
       
       
       d1.setEmployee(employee2set);
       
       session.save(d1);
       
       tx.commit();
       session.close();
       System.out.println("Data store sucessfully");


	 }
}

