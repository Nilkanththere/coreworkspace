package com.braindatawire.institutemanagementsystem.serviceImpl;


import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.hibernate.Session;

import com.braindatawire.HibernateUtil.HibernateUtil;
import com.braindatawire.institutemanagementsystem.model.Batch;
import com.braindatawire.institutemanagementsystem.model.Course;
import com.braindatawire.institutemanagementsystem.model.Faculty;
import com.braindatawire.institutemanagementsystem.model.Student;
import com.braindatawire.institutemanagementsystem.service.ServiceI;

public class Operation implements ServiceI {

	Scanner sc=new Scanner(System.in);
	Session session=HibernateUtil.getSessionFactory().openSession();
	public void addCourse() {
	Session session=HibernateUtil.getSessionFactory().openSession();
		System.out.println("Enter No.of Course Insert Table");
		int no=sc.nextInt();
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter Course Id");
			int id=sc.nextInt();
			System.out.println("Enter Course Name");
			String name=sc.next();
			
			Course c=new Course();
			 c.setCid(id);
			 c.setCname(name);
			
			session.save(c);
			session.beginTransaction().commit();
		}
			
		}

	@Override
	public void viewCourse() {
	Session session=HibernateUtil.getSessionFactory().openSession();
	System.out.println("Enter Course Id");
	       int cid=sc.nextInt();
	      Course cs=session.get(Course.class,cid);
	      System.out.println("Course ID="+cs.getCid());
	      System.out.println("Course Name="+cs.getCname());	
	}
	@Override
	public void addFaculty() {
		Session session=HibernateUtil.getSessionFactory().openSession();
		System.out.println("Enter No.of Faculty Insert Table");
		int no=sc.nextInt();
		for(int i=0;i<no;i++)
		{
		      Faculty f=new Faculty();
			System.out.println("Enter Faculty Id");
			int id=sc.nextInt();
			System.out.println("Enter Faculty Name");
			String name=sc.next();
			System.out.println("Enter Course Id Assign For Faculty");
			int cid=sc.nextInt();
			Course c=session.get(Course.class,cid);
			
			 f.setFid(id);
			 f.setFname(name);
			 f.getCourse().add(c);
			 session.save(f);
			session.beginTransaction().commit();
		}
			
	}

	@Override
	public void viewfaculty() {
		 Faculty f=new Faculty();
		Session session=HibernateUtil.getSessionFactory().openSession();
		System.out.println("Enter Faculty Id");
	       int fid=sc.nextInt();
	      Faculty fs =session.get(Faculty.class,fid);
	      System.out.println("Faculty ID="+fs.getFid());
	      System.out.println("Faculty Name="+fs.getFname()); 
		/*for(Course cs:fs.getCourse())
		{
			System.out.println("Course Id="+cs.getCid());
			System.out.println("Course Name="+cs.getCname());
		}*/
	      
	      Set<Course>f1=fs.getCourse();
	      Iterator<Course>itr=f1.iterator();
	      while(itr.hasNext())
	      {
	    	  Course cs=itr.next();
	    	  System.out.println(cs.getCid());
	    	  System.out.println(cs.getCname());
	      }
	}
	@Override
	public void addBatch() {
		Session session=HibernateUtil.getSessionFactory().openSession();
		System.out.println("Enter No.of Batch Insert Table");
		int no=sc.nextInt();
		for(int i=0;i<no;i++)
		{      
			System.out.println("Enter Batch Id");
			int id=sc.nextInt();
			System.out.println("Enter Batch Name");
			String name=sc.next();
			System.out.println("Enter Faculty Id Assign For Batch");
			int fid=sc.nextInt();
			
			Faculty f=session.get(Faculty.class,fid);
			Batch b=new Batch();
			 b.setBid(id);
			 b.setBname(name);
			 b.getFaculty().add(f); 
			session.save(b);
			session.beginTransaction().commit();
		}	
	}

	@Override
	public void viewbatch() {
		Session session=HibernateUtil.getSessionFactory().openSession();
		System.out.println("Enter Batch Id");
	       int bid=sc.nextInt();
	      Batch bs =session.get(Batch.class,bid);
	      System.out.println("Batch ID="+bs.getBid());
	      System.out.println("Batch Name="+bs.getBname());
	     /* for(Faculty f:bs.getFaculty())
	    {
	    	System.out.println("Faculty Id="+f.getFid());
	    	System.out.println("Faculty Name="+f.getFname());
	    	
	    	for(Course cs:f.getCourse())
	    	{
	    		System.out.println("Course Id="+cs.getCid());
	    		System.out.println("Course Name="+cs.getCname());
	    	}
	    }*/
	      
	      Set<Faculty>f2=bs.getFaculty();
	      Iterator<Faculty>itr=f2.iterator();
	      while(itr.hasNext())
	      {
	    	  Faculty fs=itr.next();
	    	  System.out.println(fs.getFid());
	    	  System.out.println(fs.getFname());
	      
	      
	      Set<Course>c1=fs.getCourse();
	      Iterator<Course>itr1=c1.iterator();
	      while(itr1.hasNext())
	      {
	    	  Course cs=itr1.next();
	    	  System.out.println(cs.getCid());
	    	  System.out.println(cs.getCname());
	      }
	   
	      }
	      
	      
		
	}

	@Override
	public void addStudent() {
		Session session=HibernateUtil.getSessionFactory().openSession();
				System.out.println("Enter No.of Student Insert Table");
				int no=sc.nextInt();
				for(int i=0;i<no;i++)
				{      Student s=new Student();
					System.out.println("Enter Student Id");
					int id=sc.nextInt();
					System.out.println("Enter Student Name");
					String name=sc.next();
					System.out.println("Enter Batch Id Assign For Student");
					int bid=sc.nextInt();
				
					Batch b=session.get(Batch.class,bid);
					 s.setSid(id);
					 s.setSname(name);
					 s.getBatch().add(b);
					
					session.save(s);
					session.beginTransaction().commit();
				}
		
	}

	@Override
	public void viewstudent() {
		Session session=HibernateUtil.getSessionFactory().openSession();
		System.out.println("Enter Student Id");
	       int sid=sc.nextInt();
	      Student stu =session.get(Student.class,sid);
	      System.out.println("Studnet ID="+stu.getSid());
	      System.out.println("Student Name="+stu.getSname());
	    /* for(Batch b:stu.getBatch())
	     {
	    	 System.out.println("Batch Id="+b.getBid());
	    	 System.out.println("Batch Name="+b.getBname());
	    	 
	    	 for(Faculty f:b.getFaculty())
	    	 {
	    		 System.out.println("Faculty Id="+f.getFid());
	    		 System.out.println("Faculty Name="+f.getFname());
	    		 
	    		 for(Course cs:f.getCourse())
	    		 {
	    			 System.out.println("Course Id="+cs.getCid());
	    			 System.out.println("Course Name="+cs.getCname());
	    		 }
	    	 }
	     }*/
	      
	      Set<Batch>b1=stu.getBatch();
	      Iterator<Batch>itr=b1.iterator();
	      while(itr.hasNext())
	      {
	    	  Batch bs=itr.next();
	    	  System.out.println(bs.getBid());
	    	  System.out.println(bs.getBname());
	    	  
	    	
	    	Set<Faculty>f1=bs.getFaculty();
	    	Iterator<Faculty> itr1=f1.iterator();
	    	while(itr1.hasNext())
	    	{
	    		Faculty fs=itr1.next();
	    		System.out.println(fs.getFid());
	    		System.out.println(fs.getFname());
	    		
	    		Set<Course>c1=fs.getCourse();
	    		Iterator<Course>itr2=c1.iterator();
	    		while(itr2.hasNext())
	    		{
	    			Course cs=itr2.next();
	    			System.out.println(cs.getCid());
	    			System.out.println(cs.getCname());
	    		}
	    	}
	      }
	      
		
	}

}
