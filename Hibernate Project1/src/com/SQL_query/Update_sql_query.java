package com.SQL_query;





import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Update_sql_query {

	public static void main(String[] args) {
		
		Session session =HibernateUtil.getsessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Query<Student123>query=session.createNativeQuery("update Student123 set name=:nm where rollno=:rno",Student123.class);
		
		query.setParameter("rno",1);
		query.setParameter("nm","Akshay");
		 
		  query.executeUpdate();
		  tx.commit();
		
		
		
		
		

	}

}
