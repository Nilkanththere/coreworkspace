package com.secondary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext acp=new ClassPathXmlApplicationContext("com/secondary/bean.xml");
		
		   Employee emp=acp.getBean("c",Employee.class);
		   System.out.println(emp);

	}

}
