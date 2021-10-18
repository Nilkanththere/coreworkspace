package com.HQL_query_delete;



import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;



public class Test {

	public static void main(String[] args) {
		
		Session session=HibernateUtil.getsessionFactory().openSession();
		
       Transaction tx=session.beginTransaction();
       
		Query query=session.createQuery("delete from Student123  where rollno=:rno");
		
	   query.setParameter("rno",2);
	  
	   
	  
		query.executeUpdate();
		tx.commit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
