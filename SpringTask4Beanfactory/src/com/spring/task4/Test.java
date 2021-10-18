package com.spring.task4;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class Test {

	public static void main(String[] args) {
		
         Scanner sc=new Scanner(System.in);
         Resource rs=new ClassPathResource("Bean.xml");
 		
 		BeanFactory beanf=new XmlBeanFactory(rs);
 		
 		Calculator cal=(Calculator) beanf.getBean("b");
 	
 	     
		while(true)
		{
			
			
			System.out.println("press 1 for Addition");
			System.out.println("press 2 for Substraction");
			System.out.println("press 3 for Multiplication");
			System.out.println("press 4 for Division");
			
		
		     int no=sc.nextInt();
		     
		switch(no)
		
		{ 
		case 1:
			cal.add();
			break;	
		
		case 2:
			cal.sub();
			break;	
		
		case 3:
			cal.div();
			break;	
	
	}
		}
}
}