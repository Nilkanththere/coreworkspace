package com.braindatawire.serviceImpl;



import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.braindatawire.HibernateUtil.HibernateUtil;
import com.braindatawire.model.BackupEmployee;
import com.braindatawire.model.Employee;
import com.braindatawire.serviceI.ServiceI;

public class Operation implements ServiceI {
	
	Scanner sc=new Scanner(System.in);
	@Override
	public void insertData() {
		
		Session session =HibernateUtil.getSessionFactory().openSession();
				
			String hql="INSERT INTO Employee(eid,name,addr,salary,phno)"+
		      "SELECT eid,name,addr,salary,phno FROM BackupEmployee ";
			Query query=session.createQuery(hql);
			  session.beginTransaction();
			
			  
			int result=query.executeUpdate();
			
			System.out.println("BackupEmployee Data insert sucesfully into Employee:"+result);
			
		
			session.getTransaction().commit();
			
	
		}
	
	
	

	@Override
	public void updateData() {
		
		System.out.println("Enter Id you want To Update");
		int id=sc.nextInt();
		while(true){
			
			System.out.println("Enter 1.Name Update");
			System.out.println("Enter 2.Address Update");
			System.out.println("Enter 3.Salary Update");
			System.out.println("Enter 4.Phone No Update");
			
			System.out.println("***Enter Your Choice***");
			int no=sc.nextInt();
			Session session =HibernateUtil.getSessionFactory().openSession();
			Transaction tx=session.beginTransaction();
			Query<Employee>query;
		switch(no)
		{
		
		case 1:
		      System.out.println("Enter new Name");
		      String name=sc.next();
		     query =session.createQuery("update Employee set name=:nm where eid=:id");
		     query.setParameter("id",id);
			 query.setParameter("nm",name);
			 query.executeUpdate();
			 tx.commit();
			 break;
			 
		case 2:
		      System.out.println("Enter new Address");
		      String adr=sc.next();
		     query =session.createQuery("update Employee set addr=:adr where eid=:id");
		     query.setParameter("id",id);
			 query.setParameter("adr",adr);
			 query.executeUpdate();
			 tx.commit();
			 break;
			 
		case 3:
		      System.out.println("Enter new Salary");
		      double sal=sc.nextDouble();
		     query =session.createQuery("update Employee set salary=:sal where eid=:id");
		     query.setParameter("id",id);
			 query.setParameter("sal",sal);
			 query.executeUpdate();
			 tx.commit();
			 break;
		
		case 4:
		      System.out.println("Enter new Phone No");
		      long ph=sc.nextLong();
		     query =session.createQuery("update Employee set phno=:ph where eid=:id");
		     query.setParameter("id",id);
			 query.setParameter("ph",ph);
			 query.executeUpdate();
			 tx.commit();
			 break;


		}
		break;
		}
   
    
		
	}

	@Override
	public void selectData() {
		System.out.println("Enter Id For Fetch data");
		int id=sc.nextInt();	
Session session=HibernateUtil.getSessionFactory().openSession();

Query<Employee>query=session.createQuery("from Employee where eid=:id");

query.setParameter("id",id);
Employee em=(Employee) query.getSingleResult();

  
	  System.out.println(em.getEid());
	  System.out.println(em.getName());
	  System.out.println(em.getAddr());
      System.out.println(em.getSalary());
      System.out.println(em.getPhno());
  
	}

	@Override
public void deleteData() {
		System.out.println("Enter employee Id For Delete");
		int id=sc.nextInt();
Session session=HibernateUtil.getSessionFactory().openSession();
     
      Transaction tx=session.beginTransaction();
      
      Query<Employee>query=session.createQuery("delete from Employee where eid=:id");
      
      query.setParameter("id",id);
      query.executeUpdate();
      tx.commit();

	}
}
