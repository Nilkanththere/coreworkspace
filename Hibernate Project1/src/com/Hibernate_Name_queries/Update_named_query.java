package com.Hibernate_Name_queries;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Update_named_query {

	public static void main(String[] args) {
		
		
		Session session =HibernateUtil.getsessionFactory().openSession();
		
		Transaction tx=session.beginTransaction();
		Query<Student>query=session.createNamedQuery("update_name");
		Query<Student>query1=session.createNamedQuery("update_addr");
		Query<Student>query2=session.createNamedQuery("delete_row");
		
	      query.setParameter("rno",1);
		  query.setParameter("nm","Ashish");
		  
		 query1=session.createNamedQuery("update_addr");
		 
		  
		  query1.setParameter("rno",1);
		  query1.setParameter("adr","Nagpur");
		
		  
		  query2.setParameter("rno",1);
		
		  
		  
		query.executeUpdate();
		query1.executeUpdate();
		query2.executeUpdate();
		
		tx.commit();
		

	}

}
