package com.mvc.daoImpl;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.dao.HomeDao;
import com.mvc.model.Student;

@Repository
public class HomeDaoImpl implements HomeDao {

	@Autowired
	SessionFactory sf;
	
	
	@Override
	public int saveData(Student s) {
		
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		
		int id=(Integer)ses.save(s);
		
		tr.commit();
		
		return id;
	}


	@Override
	public List<Student> loginCheck(String uname, String pass) {
		
		Session ses=sf.openSession();
		if(uname.equals("admin")&& pass.equals("admin"))
		{
			Query q=ses.createQuery("from Student");
			List<Student>slist=q.getResultList();
			return slist;
		}
		else
		{
		
			Query q=ses.createQuery("from Student where uname=:uname and pass=:pass");
			
			q.setParameter("uname",uname);
			q.setParameter("pass",pass);
			List<Student>slist=q.getResultList();
			
			
			
			System.out.println(slist);
			return slist;
			
			
		}
		
		
	}


	@Override
	public List<Student> deleteRecord(int id) {

		Session ses=sf.openSession();
		Student stu=ses.get(Student.class,id);
		ses.delete(stu);
		ses.beginTransaction().commit();
		
		Query q=ses.createQuery("from Student");
		List<Student>slist=q.getResultList();

		return slist;
	}


	@Override
	public Student editRecord(int id) {
		
		Session ses=sf.openSession();
		
		Student stu=ses.get(Student.class,id);
		return stu;
	}


	@Override
	public List<Student> updateRecord(Student s) {
		
		Session ses=sf.openSession();
		ses.update(s);
		ses.beginTransaction().commit();
		Query q=ses.createQuery("from Student");
		List<Student>slist=q.getResultList();
		
		return slist;
	}

}
