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
	public int saveData1(Student s) {
		
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		
		int id=(Integer)ses.save(s);
		
		tr.commit();
		
		return id;
	}


	@Override
	public List<Student> loginCheck(String name, String mobno) {
		
		Session ses=sf.openSession();
		if(name.equals("admin")&& mobno.equals("admin"))
		{
			
			List<Student>slist=displayall();  
//			Query q=ses.createQuery("from Student");
//			List<Student>slist=q.getResultList();
			return slist;
		}
		else
		{
		
			Query q=ses.createQuery("from Student where name=:name and mobno=:mobno");
			
			q.setParameter("name",name);
			q.setParameter("mobno",mobno);
			List<Student>slist=q.getResultList();
			
			
			
			System.out.println(slist);
			return slist;
			
			
		}
		
	}


	@Override
	public Student editdata(int rollno) {
		
		Session ses=sf.openSession();
		
		
		  Student stu=ses.get(Student.class,rollno);
		
		System.out.println(stu);
		return stu;
	}


	@Override
	public List<Student> updateRecord(Student s) {

            Session ses=sf.openSession();
            ses.update(s);
            Transaction tr=ses.beginTransaction();
            tr.commit();
            
            List<Student>slist=displayall();  
            
//            Query q=ses.createQuery("from Student");
//            List<Student>slist=q.getResultList();
//                 
		
		return slist;
	}


	@Override
	public List<Student> deletedata(int rollno) {
		
		Session ses=sf.openSession();
		Student stu=ses.get(Student.class,rollno);
		
		ses.delete(stu);
		  ses.beginTransaction().commit();
		  
		  
		
		  
		  List<Student>slist=displayall();  
		  
//		  Query q=ses.createQuery("from Student");
//		
//		 List<Student>slist=q.getResultList();
//		        
		return slist;
	}


	@Override
	public List<Student> displayall() {
		
		Session ses=sf.openSession();
		Query q=ses.createQuery("from Student");
		
		 List<Student>slist=q.getResultList();
		        
		
		
		return slist;
	}


	
	
	}


	
	
	
	
	
	
	
	
	


