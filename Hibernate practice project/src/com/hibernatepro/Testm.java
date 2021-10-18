package com.hibernatepro;

import org.hibernate.Session;

public class Testm {

	public static void main(String[] args) {
		
		Student1 stu=new Student1();
		
		  stu.setId(101);
		  stu.setName("Rakesh");
		  stu.setAddr("Nagpur");
		  
		  Student1 stu1=new Student1();
			
		  stu1.setId(102);
		  stu1.setName("Ashish");
		  stu1.setAddr("pune");
		  
		  
		  Corse cs=new Corse();
		       cs.setCid(111);
		       cs.setCname("java");
		       
		   Corse cs1=new Corse();
		       cs1.setCid(112);
		       cs1.setCname("Python");
		       
		      cs.getStu().add(stu);
	          cs1.getStu().add(stu);
	          cs.getStu().add(stu1);
	          cs1.getStu().add(stu1);
		      
 Session session =HibernateUtil.getsessionFactory().openSession();
		     
		     session.save(cs);
		     session.save(cs1);
		     session.beginTransaction().commit();
		          
		
		
		
	}

}
