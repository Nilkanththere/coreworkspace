package com.mvc.daoImpl;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.dao.HomeDao;
import com.mvc.model.CustomerOrder;

import com.mvc.model.Product;



@Repository
public class HomeDaoImpl implements HomeDao {

	@Autowired
	SessionFactory sf;
	
	
	@Override
	public int saveData1(Product p) {
		
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		
		int id=(Integer)ses.save(p);
		
		tr.commit();
		
		return id;
	}
	
	@Override
	public int saveData2(CustomerOrder o) {
		
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		
		int id=(Integer)ses.save(o);
		
		tr.commit();
		
		return id;
	}

	@Override
	public List<Product> loginCheck(int id, String name) 
	
	{
		
		Session ses=sf.openSession();
		Query q=ses.createQuery("from product where id=:id and name=:name");
		
		q.setParameter("id",id);
		q.setParameter("name",name);
		List<Product>plist=q.getResultList();
		
		
		
		System.out.println(plist);
		return plist;
		
	
	
		
	}
	
	
	
	
	
	
//	@Override
//	public List<Admin> loginCheck(String uname, String pass) {
//		
//		Session ses=sf.openSession();
//		if(uname.equals("admin")&& pass.equals("admin"))
//		{
//			Query q=ses.createQuery("from Student");
//			List<Admin>slist=q.getResultList();
//			return slist;
//		}
//		else
//		{
//		
//			Query q=ses.createQuery("from Student where uname=:uname and pass=:pass");
//			
//			q.setParameter("uname",uname);
//			q.setParameter("pass",pass);
//			List<Admin>slist=q.getResultList();
//			
//			
//			
//			System.out.println(slist);
//			return slist;
//			
//			
//		}
//		
//		
//	}
//
//
//	@Override
//	public List<Admin> deleteRecord(int id) {
//
//		Session ses=sf.openSession();
//		Admin adm=ses.get(Admin.class,id);
//		ses.delete(adm);
//		ses.beginTransaction().commit();
//		
//		Query q=ses.createQuery("from Admin");
//		List<Admin>slist=q.getResultList();
//
//		return slist;
//	}
//
//
//	@Override
//	public Admin editRecord(int id) {
//		
//		Session ses=sf.openSession();
//		
//		Admin adm=ses.get(Admin.class,id);
//		return adm;
//	}
//
//
//	@Override
//	public List<Admin> updateRecord(Admin s) {
//		
//		Session ses=sf.openSession();
//		ses.update(s);
//		ses.beginTransaction().commit();
//		Query q=ses.createQuery("from Admin");
//		List<Admin>slist=q.getResultList();
//		
//		return slist;
//	}

}
