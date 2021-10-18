package com.Setterprimitive;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	ApplicationContext aps=new ClassPathXmlApplicationContext("primitive.xml"); 
   
	 Student stu= aps.getBean("pri",Student.class);
	 
	    System.out.println("Student Rollno="+stu.getRollno());
	    System.out.println("Student Name="+stu.getName());
	    System.out.println("Student Address="+stu.getAddr());
	}

}
