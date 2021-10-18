package com.hibernate.practice;

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
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. of Employee Add in Table");
		int no=sc.nextInt();
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter Employee Id");
			int id=sc.nextInt();
			System.out.println("Enter Employee Name");
			String name=sc.next();
			System.out.println("Enter Employee Address");
			String addr=sc.next();
			System.out.println("Enter Employee Email Address");
			String email=sc.next();
			System.out.println("Enter Employee Salary");
			double salary=sc.nextDouble();
		
		em.setId(id);
		em.setName(name);
		em.setAddr(addr);
		em.setEmail(email);
		em.setSalary(salary);

		session.save(em);
		
		
		session.beginTransaction().commit();
		}

	}

}
