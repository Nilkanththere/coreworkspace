package com.hibernate_Stored_procedure;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Insert_student {

	public static void main(String[] args) {
		
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Transaction tx=session.beginTransaction();
		StoredProcedureQuery spq=session.createStoredProcedureQuery("student_insert");
		spq.registerStoredProcedureParameter("rno",Integer.class, ParameterMode.IN);
		spq.registerStoredProcedureParameter("name",String.class,ParameterMode.IN);
		spq.registerStoredProcedureParameter("addr",String.class,ParameterMode.IN);
		
		spq.setParameter("rno",2);
		spq.setParameter("name","Ashish");
		spq.setParameter("addr","Nashik");
		spq.execute();
		 tx.commit();
		
		
	}

}
