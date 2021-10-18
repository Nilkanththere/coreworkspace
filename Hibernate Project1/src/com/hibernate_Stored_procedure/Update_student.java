package com.hibernate_Stored_procedure;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Update_student {

	public static void main(String[] args) {
     Session session=HibernateUtil.getSessionFactory().openSession();
		
     Transaction tx=session.beginTransaction();
	StoredProcedureQuery spq=session.createStoredProcedureQuery("student_update");
	spq.registerStoredProcedureParameter("rno",Integer.class, ParameterMode.IN);
	spq.registerStoredProcedureParameter("name",String.class,ParameterMode.IN);
	spq.registerStoredProcedureParameter("addr",String.class,ParameterMode.IN);
	
	spq.setParameter("rno",1);
	spq.setParameter("name","Vijay");
	spq.setParameter("addr","Thane");
	spq.execute();
	 tx.commit();
	
	}

}
