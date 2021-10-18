package com.hibernate1;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		/*Student stu=session.load(Student.class,5);
		System.out.println(stu.getRollno());
		System.out.println(stu.getName());
		System.out.println(stu.getAddr());*/
		
		
		Student stu =new Student();
		        stu.setRollno(1);
		        stu.setName("Rakesh");
		        stu.setAddr("Nashik");
        
		        session.save(stu);
		        session.beginTransaction().commit();
		        
		        session.close();
		        
		        
	}

}
