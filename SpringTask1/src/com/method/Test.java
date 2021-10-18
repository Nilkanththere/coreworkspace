package com.method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		
		ApplicationContext apc=new ClassPathXmlApplicationContext("Apcbean.xml");
		
	
		Method m=(Method) apc.getBean("ap");
		
		m.m1();
		
		
		
	}

}
