package com.braindatawire.serviceImpl;

import java.util.Scanner;

import org.hibernate.Session;

import com.braindatawire.HibernateUtil.HibernateUtil;
import com.braindatawire.model.Employee;
import com.braindatawire.serviceI.ServiceI;

public class Operation implements ServiceI {
	
	Scanner sc=new Scanner(System.in);
	@Override
	public void insertData() {
		
		Session session =HibernateUtil.getSessionFactory().openSession();
		
		
		System.out.println("Enter No. of Employee Insert to Table");
		int no=sc.nextInt();
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter Employee Id");
			int id=sc.nextInt();
			System.out.println("Enter Employee Name");
			String name=sc.next();
			System.out.println("Enter Employee Address");
			String addr=sc.next();
			
			Employee em=new Employee();
			em.setEid(id);
			em.setName(name);
			em.setAddr(addr);
			
			session.save(em);
			session.beginTransaction().commit();
			
	
		}
	
		
	}

	@Override
	public void updateData() {
    Session session=HibernateUtil.getSessionFactory().openSession();
    
    System.out.println("Enter Employee Id For update Data");
    int id=sc.nextInt();
		
    System.out.println("Eneter name you want to Update");
    String name=sc.next();
    System.out.println("Enter Address you want to update");
    String addr=sc.next();
		
    Employee em=session.get(Employee.class,id);

		em.setName(name);
        em.setAddr(addr);
        
        session.beginTransaction();
        
        session.update(em);
        session.getTransaction().commit();
		
	}

	@Override
	public void selectData() {
		
  Session session=HibernateUtil.getSessionFactory().openSession();
  
  System.out.println("Enter Employee Id For Fetch Data");
  int id=sc.nextInt();
  
 
  Employee em=session.load(Employee.class,id);
  System.out.println("Employee Id="+em.getEid());
  System.out.println("Employee Name="+em.getName());
  System.out.println("Employee Address="+em.getAddr());
  System.out.println();
		
	}

	@Override
public void deleteData() {
		
Session session=HibernateUtil.getSessionFactory().openSession();

System.out.println("Enter No. of Employee Id For Delete Data");
int no=sc.nextInt();
for(int i=0;i<no;i++)
{
	System.out.println("Enter Employee Id For Delete");
	int id=sc.nextInt();
		Employee em=session.get(Employee.class,id);

		
        session.beginTransaction();
        
        session.delete(em);
        session.getTransaction().commit();
		
	}
	}
}
