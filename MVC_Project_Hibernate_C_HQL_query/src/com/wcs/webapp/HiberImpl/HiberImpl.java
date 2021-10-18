package com.wcs.webapp.HiberImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.wcs.webapp.HiberI.HiberI;
import com.wcs.webapp.HibernateUtil.HibernateUtil;
import com.wcs.webapp.model.Employee;

public class HiberImpl implements HiberI {

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

		Query<Employee>query=session.createQuery("update Employee set password='"+ emp.getPassword()+"',name='"+emp.getName()+"',addr='"+emp.getAddr()+"', mobno='"+emp.getMobno()+"',gender='"+emp.getGender()+"',dept='"+emp.getDept()+"',desig='"+emp.getDesig()+"',salary='"+emp.getSalary()+"',email='"+emp.getEmail()+"' where username='"+emp.getUsername()+"'");
		
		
		query.executeUpdate();
		 tx.commit();
		   
		
		
		return emp;
	}

	@Override
	public void deleteEmployee(String username) {
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();

		Query<Employee>query=session.createQuery("delete from Employee where username='"+username+"'"); 
				
		
				query.executeUpdate();
				 tx.commit();
		
	}

	@Override
	public Employee editEmployee(String username) {

Session session=HibernateUtil.getSessionFactory().openSession();
		
       Employee emp=session.get(Employee.class,username);
       
		    emp.getUsername();
		    emp.getPassword();
		    emp.getName();
		    emp.getAddr();
		    emp.getMobno();
		    emp.getGender();
		    emp.getDept();
		    emp.getDesig();
		    emp.getSalary();
		    emp.getEmail();
		
		
		
		
		
		return emp;
	}

	@Override
	public List<Employee> loginEmployee(String username, String password) {
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		List<Employee>list=new ArrayList<Employee>();
		if(username.equals("admin")&& password.equals("admin"))
		
		{
		Query<Employee>query=session.createQuery("from Employee");
		
		List<Employee>lst=query.getResultList();
		
		for(Employee emp:lst)
		{
			list.add(emp);
		}
		}
		
		else
		{
			
			
			Employee emp=session.get(Employee.class,username);
			
			
				list.add(emp);
			
			
		}
		
		
		
		
		return list;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee>list=new ArrayList<Employee>();
Session session=HibernateUtil.getSessionFactory().openSession();
Query<Employee>query=session.createQuery("from Employee");
		
		List<Employee>lst=query.getResultList();
		
		for(Employee emp:lst)
		{
			list.add(emp);
		}
		
		
		return list;
	}

}
