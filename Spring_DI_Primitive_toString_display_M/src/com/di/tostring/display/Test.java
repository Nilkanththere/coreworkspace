package com.di.tostring.display;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

ApplicationContext aps=new ClassPathXmlApplicationContext("bean.xml");
	
       Employee emp=aps.getBean("pri",Employee.class);
       System.out.println(emp);
       
       emp.display();

	}

}
