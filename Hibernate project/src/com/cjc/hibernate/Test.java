package com.cjc.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test {

	public static void main(String[] args) {
		
		StandardServiceRegistry registry = new  StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources mds=new MetadataSources(registry);
		
		Metadata md=mds.getMetadataBuilder().build();
		
		SessionFactory sessionf=md.getSessionFactoryBuilder().build();
		
		Session session=sessionf.openSession();
		
		Student stu=new Student();
		
		stu.setRollno(4);
		stu.setName("Rakesh");
		stu.setAddr("Nagpur");
		stu.setAge(25);
		
		session.save(stu);
		
		session.beginTransaction().commit();
		
		

	}

}
