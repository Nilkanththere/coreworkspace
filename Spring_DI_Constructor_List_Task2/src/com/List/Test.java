package com.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext acp=new ClassPathXmlApplicationContext("bean.xml");
		
		  Student stu=  acp.getBean("cons",Student.class);
		  System.out.println(stu);
	}

}
