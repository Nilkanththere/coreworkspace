package com.braindatawire.serviceImpl;



import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


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
		{     Employee em=new Employee();
		
			System.out.println("Enter Employee Id");
			em.setEid(sc.nextInt());
			System.out.println("Enter Employee Name");
			em.setName(sc.next());
			System.out.println("Enter Employee Address");
			em.setAddr(sc.next());
			System.out.println("Enter Employee salary");
			em.setSalary(sc.nextDouble());
			System.out.println("Enter Employee phon no");
			em.setPhno(sc.nextLong());
		
			session.save(em);
			session.beginTransaction().commit();
			
	
		}
	
		
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
		     query =session.createNamedQuery("update_name");
		     query.setParameter("id",id);
			 query.setParameter("nm",name);
			 query.executeUpdate();
			 tx.commit();
			 break;
			 
		case 2:
		      System.out.println("Enter new Address");
		      String adr=sc.next();
		     query =session.createNamedQuery("update_addr");
		     query.setParameter("id",id);
			 query.setParameter("adr",adr);
			 query.executeUpdate();
			 tx.commit();
			 break;
			 
		case 3:
		      System.out.println("Enter new Salary");
		      double sal=sc.nextDouble();
		     query =session.createNamedQuery("update_salary");
		     query.setParameter("id",id);
			 query.setParameter("sal",sal);
			 query.executeUpdate();
			 tx.commit();
			 break;
		
		case 4:
		      System.out.println("Enter new Phone No");
		      long ph=sc.nextLong();
		     query =session.createNamedQuery("update_salary");
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

Query query=session.createNamedQuery("view_data");
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
      
      Query<Employee>query=session.createNamedQuery("delete_row");
     
      query.setParameter("id",id);
      query.executeUpdate();
      tx.commit();

	}
}
