package com.mvc.HomedaoImpl;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.Homedao.HomeDao;
import com.mvc.model.Customer;
import com.mvc.model.Employee;




@Repository
public class HomedaoImpl implements HomeDao {

	@Autowired
	SessionFactory sf;
	
	@Override
	public int saveData(Employee emp) {
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		
		int id=(Integer)ses.save(emp);
		
		tr.commit();
		
		return id;
		
	}

	@Override
	public int saveDatacstr(Customer cstr) {
		
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		
		int id=(Integer)ses.save(cstr);
		
		tr.commit();
		
		return id;
	}

	
	

	

}
