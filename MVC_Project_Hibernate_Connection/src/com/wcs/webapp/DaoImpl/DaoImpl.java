package com.wcs.webapp.DaoImpl;



import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.wcs.webapp.DaoI.DaoI;
import com.wcs.webapp.HibernateUtil.HibernateUtil;

import com.wcs.webapp.model.Employee;



public class DaoImpl implements DaoI{

	
	@Override
	public void deleteEmployee(String username) {

		
Session session=HibernateUtil.getSessionFactory().openSession();
		
		
		Transaction tx=session.beginTransaction();
	      
	      Query<Employee>query=session.createNamedQuery("delete_row");
	     
	      query.setParameter("uname",username);
	      query.executeUpdate();
	      tx.commit();
		
		
		
	}

	@Override
	public Employee editEmployee(String username) {
		
		 Session session=HibernateUtil.getSessionFactory().openSession();
		
     Employee emp=session.get(Employee.class,username);
		
              
	
              
               
               
        
		  
		

		return emp;
	}

	

	@Override
	public void saveEmployee(Employee emp) {
		
		 
		 
		 Session session=HibernateUtil.getSessionFactory().openSession();
			
		   session.save(emp);
		   session.beginTransaction().commit();
		
	}

	@Override
	public Employee updateEmployee(Employee emp) {

		 Session session=HibernateUtil.getSessionFactory().openSession();
		
         
          Transaction tx=session.beginTransaction();
		 Query<Employee>query=session.createNamedQuery("update");
		 
		
		   
          query.setParameter("pass",emp.getPassword());
	       query.setParameter("nm",emp.getName());
		   query.setParameter("adr",emp.getAddr());
		   query.setParameter("mb",emp.getMobno());
		   query.setParameter("gen",emp.getGender());
	       query.setParameter("dpt",emp.getDept());
	       query.setParameter("des",emp.getDesig());
	       query.setParameter("sal",emp.getSalary());
	       query.setParameter("eml",emp.getEmail());
	       query.setParameter("uname",emp.getUsername());
	       query.executeUpdate();
	       tx.commit();	 

	return emp;	
			
	
}

	@Override
	public List<Employee>loginEmployee(String username, String password) {
		
		
		List<Employee>list=new ArrayList<Employee>();
		if(username.equals("admin")&& password.equals("admin"))
		{
			
	 Session session=HibernateUtil.getSessionFactory().openSession();
	Query<Employee> query=session.createNamedQuery("view_data");

   List<Employee>list1= query.getResultList();


		for(Employee emp:list1)
		{
			list.add(emp);
		}
					
					  	 		 
		}		
		
			
			
		else
	{
	Session session=HibernateUtil.getSessionFactory().openSession();
		
	Employee emp=session.get(Employee.class,username);
	
	 
  
	  list.add(emp); 
 
	}
		return list;		 
		
		
	
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		List<Employee>list=new ArrayList<Employee>();
		 Session session=HibernateUtil.getSessionFactory().openSession();
   
	Query<Employee> query=session.createNamedQuery("view_data");
    
	 List<Employee>list1=query.getResultList();
	  
 for(Employee emp:list1)
 {
	 list.add(emp);
 }
  
 
		return list;
			
			 
		
		
	}
	
		

}
