package com.hibernate_Stored_procedure;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Delete_student {

	public static void main(String[] args) {
Session session=HibernateUtil.getSessionFactory().openSession();
		
		Transaction tx=session.beginTransaction();
		StoredProcedureQuery spq=session.createStoredProcedureQuery("delete_student");
		spq.registerStoredProcedureParameter("rno",Integer.class, ParameterMode.IN);
		
		spq.setParameter("rno",2);
		
		spq.execute();
		 tx.commit();
		

	}

}
