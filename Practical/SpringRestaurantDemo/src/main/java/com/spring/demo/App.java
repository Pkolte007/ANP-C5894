package com.spring.demo;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
    	Restaurant res= (Restaurant) context.getBean("restaurantBean");
    	res.greetmessage();
    	res.prepareDrink();
    }
}