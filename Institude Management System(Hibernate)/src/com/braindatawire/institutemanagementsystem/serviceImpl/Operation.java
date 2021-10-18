package com.braindatawire.institutemanagementsystem.serviceImpl;


import java.util.Scanner;

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
			System.out.println("Enter Faculty Id");
			int id=sc.nextInt();
			System.out.println("Enter Faculty Name");
			String name=sc.next();
			
			Faculty f=new Faculty();
			
			 f.setFid(id);
			 f.setFname(name);
			 System.out.println("Enter Course id Assign for Faculty");
			 int course=sc.nextInt();
			Course c=session.get(Course.class,course);
			 
			 f.setCourse(c);
			 session.save(f);
			
			session.beginTransaction().commit();
		}
			
	}

	@Override
	public void viewfaculty() {
		Session session=HibernateUtil.getSessionFactory().openSession();
		System.out.println("Enter Faculty Id");
	       int fid=sc.nextInt();
	      Faculty fs =session.get(Faculty.class,fid);
	      System.out.println("Faculty ID="+fs.getFid());
	      System.out.println("Faculty Name="+fs.getFname());
	      System.out.println("Course ID="+fs.getCourse().getCid());
	      System.out.println("Course Name="+fs.getCourse().getCname());
		
	
		
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
			
			Batch b=new Batch();
			
			 b.setBid(id);
			 b.setBname(name);
			 System.out.println("Enter Faculty id Assign for Batch");
			 int faculty=sc.nextInt();
			 Faculty f=session.get(Faculty.class,faculty);
			
			 b.setFaculty(f);
			 
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
	      System.out.println("Faculty ID="+bs.getFaculty().getFid());
	      System.out.println("Faculty Name="+bs.getFaculty().getFname());
	      System.out.println("Course ID="+bs.getFaculty().getCourse().getCid());
	      System.out.println("Course Name="+bs.getFaculty().getCourse().getCname());
	      
		
	}

	@Override
	public void addStudent() {
		Session session=HibernateUtil.getSessionFactory().openSession();
				System.out.println("Enter No.of Student Insert Table");
				int no=sc.nextInt();
				for(int i=0;i<no;i++)
				{
					System.out.println("Enter Student Id");
					int id=sc.nextInt();
					System.out.println("Enter Student Name");
					String name=sc.next();
					
					Student s=new Student();
					 s.setSid(id);
					 s.setSname(name);
					 System.out.println("Enter Batch id Assign for Student");
					 int batch=sc.nextInt();
					 Batch b=session.get(Batch.class,batch);
					 s.setBatch(b);
					 
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
	      System.out.println("Batch Id="+stu.getBatch().getBid());
	      System.out.println("Batch Name="+stu.getBatch().getBname());
	      System.out.println("Faculty ID="+stu.getBatch().getFaculty().getFid());
	      System.out.println("Faculty Name="+stu.getBatch().getFaculty().getFname());
	      System.out.println("Course ID="+stu.getBatch().getFaculty().getCourse().getCid());
	      System.out.println("Course Name="+stu.getBatch().getFaculty().getCourse().getCname());
	      
		
	}

}
