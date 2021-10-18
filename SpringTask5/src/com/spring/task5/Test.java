package com.spring.task5;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
	ApplicationContext apc=new ClassPathXmlApplicationContext("bean.xml");	
		
	Calculator cal=(Calculator) apc.getBean("a");
	
	      Scanner sc=new Scanner(System.in);
	      while(true)
			{
				
				
				System.out.println("press 1 for Square of Number");
				System.out.println("press 2 for Cube of Number");
				
				
			
			     int no=sc.nextInt();
			     
			switch(no)
			
			{ 
			case 1:
				cal.square();
				break;	
			
			case 2:
				cal.cube();
				break;	
			
			
		}
			}    
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	}

}
