package com.Hibernate_Named_query;

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
		

	}

}
