package com.braindatawire.serviceImpl;


import java.util.List;
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
		
	Session session =HibernateUtil.getSessionFactory().openSession();
Transaction tx=session.beginTransaction();
	Query<Employee>query=session.createNativeQuery("update Employee set name=:nm where eid=:id",Employee.class);
		
		query.setParameter("id",1);
		query.setParameter("nm","Akshay");
		 
		  query.executeUpdate();
		  tx.commit();
    
		
	}

	@Override
	public void selectData() {
		
Session session=HibernateUtil.getSessionFactory().openSession();

Query query=session.createNativeQuery("select * from Employee",Employee.class);

  List<Employee>list=query.getResultList();
  
  for(Employee em:list)
  {
	  System.out.println(em.getEid());
	  System.out.println(em.getName());
	  System.out.println(em.getAddr());
  }
  
	}

	@Override
public void deleteData() {
		
Session session=HibernateUtil.getSessionFactory().openSession();
     
      Transaction tx=session.beginTransaction();
      
Query<Employee>query=session.createNativeQuery("delete from  Employee where eid=:id",Employee.class);
      query.setParameter("id",111);
      query.executeUpdate();
      tx.commit();

	}
}
