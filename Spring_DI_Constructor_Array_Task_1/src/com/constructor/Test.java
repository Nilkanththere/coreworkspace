package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext acp=new ClassPathXmlApplicationContext("bean.xml");
		
		  Student stu= acp.getBean("c",Student.class);
		  System.out.println(stu);

	}

}
