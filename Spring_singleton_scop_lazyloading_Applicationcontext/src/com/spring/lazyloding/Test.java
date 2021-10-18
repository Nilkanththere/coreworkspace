package com.spring.lazyloding;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext aps=new ClassPathXmlApplicationContext("bean.xml");
		
		
//		Student stu=aps.getBean("sp",Student.class);
//		
//		System.out.println(stu);
//		
//		
		
		
		

	}

}
