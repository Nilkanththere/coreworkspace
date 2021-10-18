package com.hibernatepro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test1 {

	public static void main(String[] args) {
		
		
	StandardServiceRegistry rg=new StandardServiceRegistryBuilder().configure().build();	

	MetadataSources mds=new MetadataSources(rg);
	
	Metadata md=mds.getMetadataBuilder().build();
   
	 SessionFactory sf=md.getSessionFactoryBuilder().build();
	 
	 Session ss=sf.openSession();
	 
	 Student stu=new Student();
	 
	 stu.setId(123);
	 stu.setName("Akash");
	 stu.setGrade("A");
	 stu.setAddr("Nagpur");
	 stu.setResult("Pass");
	 
	 
	 ss.save(stu);
  	
		
		ss.beginTransaction().commit();
			
	 
	}

}
