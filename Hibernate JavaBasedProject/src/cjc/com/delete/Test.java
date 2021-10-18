package cjc.com.delete;

import org.hibernate.Session;

import cjc.com.Employee;
import cjc.com.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Employee em=session.get(Employee.class,2);

		
        session.beginTransaction();
        
        session.delete(em);
        session.getTransaction().commit();
        
		} 
	}
