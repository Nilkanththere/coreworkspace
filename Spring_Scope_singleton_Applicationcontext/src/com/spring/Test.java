package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
      ApplicationContext apc=new ClassPathXmlApplicationContext("bean.xml");
      
                 Student stu=(Student) apc.getBean("a");
                 System.out.println(stu);
                 
                 
                 Student stu1=(Student) apc.getBean("a");
                 System.out.println(stu1);
                 
                 
                 Student stu2=(Student) apc.getBean("a");
                 System.out.println(stu2);
	}

}
