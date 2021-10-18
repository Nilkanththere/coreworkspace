package com.hibernatepro;


	import java.util.Scanner;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.boot.Metadata;
	import org.hibernate.boot.MetadataSources;
	import org.hibernate.boot.registry.StandardServiceRegistry;
	import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

	
	public class Test {

		public static void main(String[] args) {
		
			StandardServiceRegistry rg=new StandardServiceRegistryBuilder().configure().build();
			
			MetadataSources mds=new MetadataSources(rg);
			
			Metadata md=mds.getMetadataBuilder().build();
			
			SessionFactory sf=md.getSessionFactoryBuilder().build();
			
			Session session =sf.openSession();
			
			EmployeeInfo em=new EmployeeInfo();
			
			
			
			
			em.setId(10001);
			em.setName("Akshay");
			em.setAddr("Nashik");
			em.setEmail("akshay123@gmail.com");
			em.setSalary(35000.0);
				
			
			session.save(em);
		     	
		
			session.beginTransaction().commit();
				
			}
			 
			}
			
		
	

