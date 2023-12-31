package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App1 
{
	public static void main( String[] args )
    {
    	System.out.println("Connection Started..");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction ts = session.beginTransaction();
        Student p=new Student();
        p.setStdId(1);
        p.setStdName("Prasanna");
        p.setStdDegree("B.E.");
        p.setStdGender("M");
        p.setStdPhoneNumber(78998976);
        Student p1=new Student();
        p1.setStdId(2);
        p1.setStdName("Pooja");
        p1.setStdDegree("B.E.");
        p1.setStdGender("F");
        p1.setStdPhoneNumber(627848454);
        
        
    	
    	session.save(p1);
    	session.save(p);
        ts.commit();
        session.close();
        System.out.println("Student data Saved Successfully");


    }
}
