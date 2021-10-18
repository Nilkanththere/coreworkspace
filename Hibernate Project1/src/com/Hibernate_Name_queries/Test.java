package com.Hibernate_Name_queries;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		
		Session session=HibernateUtil.getsessionFactory().openSession();
		
		Query query=session.createNamedQuery("all_stu");
		
		List<Student>list=query.getResultList();
		
		for(Student stu:list)
		{
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
			System.out.println(stu.getAddr());
		}
		
		//Student s=(Student)session.createNamedQuery("one_stu").setParameter("rno",5).getSingleResult();
		query=session.createNamedQuery("one_stu");
		 query.setParameter("rno",1);
		 
		 Student s=(Student)query.getSingleResult();
		
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getAddr());
		
		
		

	}

}
