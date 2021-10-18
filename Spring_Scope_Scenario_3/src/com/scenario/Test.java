package com.scenario;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		
		
		ApplicationContext acp=new ClassPathXmlApplicationContext("bean.xml");
		
		    Student stu= acp.getBean("stu",Student.class);
		    System.out.println(stu);
            System.out.println(stu.getAddr());
		    
		    Student stu1= acp.getBean("stu",Student.class);
		    System.out.println(stu1);
		    System.out.println(stu1.getAddr());
		    
		    Student stu2= acp.getBean("stu",Student.class);
		    System.out.println(stu2);
		    System.out.println(stu2.getAddr());
		  
		    
	}

}
