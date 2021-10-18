package com.hibernate;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;



public class Test {

	public static void main(String[] args) {
		
		Session session=HibernateUtil.getsessionFactory().openSession();
		

		/*Student123 stu=new Student123();
        stu.setRollno(1);
        stu.setName("Rahul");
        stu.setAddr("Nagpur");
        
        Student123 stu1=new Student123();
        stu1.setRollno(2);
        stu1.setName("Ashish");
        stu1.setAddr("Pune");
        
        Student123 stu2=new Student123();
        stu2.setRollno(3);
        stu2.setName("Mukesh");
        stu2.setAddr("Nashik");
        
		        
		         
		        //session.save(stu);
		        session.save(stu1);
		        session.save(stu2);
		        session.beginTransaction().commit();*/
		
		
		
		Query query=session.createQuery("from Student123");
		
		List<Student123>list=query.getResultList();
		
		for(Student123 stu:list)
		{
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
			System.out.println(stu.getAddr());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
