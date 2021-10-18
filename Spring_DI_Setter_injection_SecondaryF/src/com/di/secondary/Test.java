package com.di.secondary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {


		ApplicationContext aps=new ClassPathXmlApplicationContext("secondary.xml");
		
		  Student stu =aps.getBean("stu",Student.class);

		  System.out.println("Student Rollno="+stu.getRollno());
		  System.out.println("Student Name="+stu.getName());
		  
		  System.out.println("AreaName="+stu.getAdr().getAreaname());
		  System.out.println("CityName="+stu.getAdr().getCityname());
		  
	}

}
