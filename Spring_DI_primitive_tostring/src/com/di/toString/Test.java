package com.di.toString;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext aps=new ClassPathXmlApplicationContext("primitive.xml");

		 
		Student stu=aps.getBean("pri",Student.class);
		
		System.out.println(stu);
	}

}
