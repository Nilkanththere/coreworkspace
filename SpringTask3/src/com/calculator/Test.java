package com.calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
	ApplicationContext apc=new ClassPathXmlApplicationContext("bean.xml");	
		
	Calculator cal=(Calculator) apc.getBean("a");
	
	      cal.add();
	      cal.sub();
	      cal.mul();
	      cal.div();
	}

}
