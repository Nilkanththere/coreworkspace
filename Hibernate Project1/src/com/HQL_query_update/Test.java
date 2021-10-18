package com.HQL_query_update;





import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;



public class Test {

	public static void main(String[] args) {
		
		Session session=HibernateUtil.getsessionFactory().openSession();
		
       Transaction tx=session.beginTransaction();
       
		Query<Student123> query=session.createQuery("update Student123 set name=:nm where rollno=:rno");
		
	   query.setParameter("rno",1);
	   query.setParameter("nm","Nikhil");
	   
	  
		query.executeUpdate();
		tx.commit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
