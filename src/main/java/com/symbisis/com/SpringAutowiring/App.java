package com.symbisis.com.SpringAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Auther;


public class App 
{
	public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring2.xml");
    	
    	Auther auther = (Auther) context.getBean("auth");
    	System.out.println(auther);
    }
}
