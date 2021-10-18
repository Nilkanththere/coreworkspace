package com.HQL_qurey_where;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;



public class Test {

	public static void main(String[] args) {
		
		Session session=HibernateUtil.getsessionFactory().openSession();
		

		Query query=session.createQuery("from Student123 where rollno=:rno");
		
	   query.setParameter("rno",1);
	  
		List<Student123>list=query.getResultList();
		
		for(Student123 stu:list)
		{
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
			System.out.println(stu.getAddr());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
