package com.di.secondary_tostring_costom_M;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext aps=new ClassPathXmlApplicationContext("secondary.xml");
		
	Employee emp=aps.getBean("emp",Employee.class);
	
	System.out.println(emp);
	
	
	emp.getdisplay();
	
		

	}

}
