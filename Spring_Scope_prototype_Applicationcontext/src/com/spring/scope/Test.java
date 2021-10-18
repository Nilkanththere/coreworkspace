package com.spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main(String[] args) {
		
		ApplicationContext aps=new ClassPathXmlApplicationContext("spring.xml");
		
		   Student stu=(Student)aps.getBean("sp");
	
		   System.out.println(stu);
		   
		   Student stu1=(Student) aps.getBean("sp");
			
		   System.out.println(stu1);
		   
		   Student stu2=(Student) aps.getBean("sp");
			
		   System.out.println(stu2);
	}
	
	
}
