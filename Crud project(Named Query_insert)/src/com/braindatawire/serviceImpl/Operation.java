package com.braindatawire.serviceImpl;



import java.util.Scanner;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

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

		Transaction tx=session.beginTransaction();
		StoredProcedureQuery sql=session.createStoredProcedureCall("insertdata");
		
		sql.registerStoredProcedureParameter("id",Integer.class,ParameterMode.IN);
		sql.registerStoredProcedureParameter("name",String.class,ParameterMode.IN);
		sql.registerStoredProcedureParameter("adr", String.class,ParameterMode.IN);
		sql.registerStoredProcedureParameter("salary",Double.class,ParameterMode.IN);
		sql.registerStoredProcedureParameter("phoneno",String.class,ParameterMode.IN);
		
		
		
//		
//		System.out.println("Enter No. of Employee Insert to Table");
//		int no=sc.nextInt();
//		for(int i=0;i<no;i++)
//		{  
//			
//			System.out.println("Enter Employee Id");
//			int id=sc.nextInt();
//			
//			System.out.println("Enter Employee Name");
//			String name=sc.next();
//			System.out.println("Enter Employee Address");
//			String addr=sc.next();
//			System.out.println("Enter Employee salary");
//			double sal=sc.nextDouble();
//			System.out.println("Enter Employee phon no");
//			long phno=sc.nextLong();
//	
			sql.setParameter("id",101);
			sql.setParameter("name","Rakesh");
			sql.setParameter("adr","pune");
			sql.setParameter("salary",35000.00);
			sql.setParameter("phoneno","9561753");
			sql.execute();
			tx.commit();
			
			
			
			
			        id int=0,
					adr varchar(225)=null,
					nm varchar(225)=null,
					phoneno varchar(225)=null,
					sal varchar(225)=null,
					choice varchar(100)

					)
					BEGIN
					if choice ='Insert'
					begin
					insert into Employee(addr,name,phno,salary)values(adr,nm,phoneno,sal);
					END $$

					if choice ='Update'
					begin
					update  Employee set

					addr=adr,name=nm,phno=phoneno,salary=sal where eid=id;
					END $$

					if choice ='Delete'
					begin
					Delete from Employee where eid=id;


					END $$	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
		}
	
		
	//}

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
