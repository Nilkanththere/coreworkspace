package com.SQL_query;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;



public class Test {

	public static void main(String[] args) {
		
		Session session=HibernateUtil.getsessionFactory().openSession();
		

		Query query=session.createNativeQuery("select * from Student123",Student123.class);
		
		List<Student123>list=query.getResultList();
		
		for(Student123 stu:list)
		{
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
			System.out.println(stu.getAddr());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
