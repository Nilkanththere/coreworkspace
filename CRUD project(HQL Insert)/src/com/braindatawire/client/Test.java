package com.braindatawire.client;

import java.util.Scanner;

import org.hibernate.Session;

import com.braindatawire.HibernateUtil.HibernateUtil;
import com.braindatawire.model.BackupEmployee;
import com.braindatawire.model.Employee;
import com.braindatawire.serviceI.ServiceI;
import com.braindatawire.serviceImpl.Operation;


public class Test {
	
	
	public static void main(String[] args) {
		
		
		/*Employee e=new Employee();
		
		         e.setEid(1);
		         e.setName("Ashsish");
		         e.setAddr("pune");
		         e.setSalary(35000.00);
		         e.setPhno(9562214);
		         
		         
		 BackupEmployee e1=new BackupEmployee();
		 		
		         e1.setEid(2);
		         e1.setName("Rakesh");
		         e1.setAddr("Nagpur");
		         e1.setSalary(45000.00);
		         e1.setPhno(86562214);      
		
		   Session session=HibernateUtil.getSessionFactory().openSession();
		   
		          session.save(e);
		          session.save(e1);
		          session.beginTransaction().commit();*/
		
		ServiceI  s=new Operation();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("*****CRUD Hibernate Project*****");
			System.out.println("Enter 1.Insert Data");
			System.out.println("Enter 2.Update Data");
			System.out.println("Enter 3.Select Data");
			System.out.println("Enter 4.Delete Data");
			
		System.out.println("*****Select No. of Operation Perform*****");
		int no=sc.nextInt();
		
		switch(no)
		{
		case 1:
			s.insertData() ;
			break;
		case 2:
			s.updateData() ;
			break;
			
		case 3:
			s. selectData() ;
			break;
			
		case 4:
			s.deleteData() ;
			break;
			
			default:
				System.out.println("Enter valid Key");
}	}
	}
	}


