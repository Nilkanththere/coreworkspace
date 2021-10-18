package com.hibernate_Stored_procedure;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Student stu=new Student();
		stu.setName("Anil");
		stu.setAddr("Pune");
		
		
		Phone p1=new Phone();
		
		 p1.setPhoneno("9561753361");
		 p1.setStudent(stu);
		 
		 Phone p2=new Phone();
			
		 p2.setPhoneno("784589632");
		 p2.setStudent(stu);
		 
		 stu.getSphone().add(p1);
		 stu.getSphone().add(p2);
		
		 session.save(stu);
		 session.beginTransaction().commit();
	}

}
