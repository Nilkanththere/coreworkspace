package com.braindatawire.collegemanagement.serviceImpl;

import java.util.*;

import com.braindatawire.collegemanagement.model.Batch;
import com.braindatawire.collegemanagement.model.Course;
import com.braindatawire.collegemanagement.model.Faculty;
import com.braindatawire.collegemanagement.model.Student;
import com.braindatawire.collegemanagement.service.Cjc;

public  class Karvenagar implements Cjc{

		List<Course> clist=new ArrayList<>();
		
		List<Faculty> flist=new ArrayList<>();
		
		List<Batch> blist=new ArrayList<>();
		
		List<Student> slist=new ArrayList<>();

	Scanner sc=new Scanner(System.in);
	
	    int cno=0;
	    int fno=0;
	    int bno=0;
	    int sno=0;
	    
    public void addCourse()
    {
    	if(cno==0)
    	{
    	Course c=new Course();
    
    	 while(true)
    	 {
    		 Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter Course Id");
    	   try{
    	      int a=sc.nextInt();
    	     c.setCid(a);
    	     break;
    	   }
    	   catch(InputMismatchException e)
    	   {
    		   System.out.println("Please Enter Valid Key");
    	   }
    	 }
    	 while(true)
    	 {
    		 Scanner sc=new Scanner(System.in);
    	 
    	   System.out.println("Enter Course Name");
    	   
    	    String b=sc.next();
    	    
    	    boolean p=b.matches("[A-Za-z]{1,9}");
    	    
		    if(p==true)
		    {				
    	    c.setCname(b);
    	    break;
		    }
    	    	
		    else
		    {
		    	System.out.println("Plese Enter Valid key");
		    }
    	    }
    	 
    	   System.out.println("Add course Sucessfully"); 
    	   clist.add(c);
    	   cno++;
    }
    
    else
    {
    	System.out.println(" Course Data is Already Added to List");
    }
    }
    
    public void viewCourse()
    {   
    	if(cno>0)
    	{
    
    	   Iterator<Course>itr=clist.iterator();
    	   while(itr.hasNext())
    	   {
    		   Course s1=itr.next();
    		   System.out.println("Student Course Id="+s1.getCid());
    		   System.out.println("Student Name="+s1.getCname());
    	   }
    	}
    	else{
    		System.out.println("No data found Add Course Data");
    		addCourse();
    	}
    }
    public void addFaculty()
    {
    	if(fno==0)
    	{
    	Faculty f=new Faculty();
    	while(true)
    	{
    		Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter Faculty Id");
    	 try{
	      int a=sc.nextInt();
	     f.setFid(a);
	     break;
    	 }
    	 catch(InputMismatchException e)
    	 {
    		 System.out.println("Please Enter Valid Key");
    	 }
    	}
    	while(true)
    	{
    		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter Faculty Name");
	     String b=sc.next();
	     boolean p=b.matches("[A-Za-z]{1,9}");
		    if(p==true)
		    {
	     f.setFname(b);
	     break;
		    }
		    else
		    {
		    	System.out.println("Please Enter Valid Key");
		    }
    	}
	    
	    Iterator<Course>itr2=clist.iterator();
 	   while(itr2.hasNext())
 	   {
 		  Course s1=itr2.next();
 		   f.setCourse(s1);
 		   break;
 		  
 	   }
	   System.out.println("Add Faculty Sucessfully");
	    flist.add(f);
	    
	    fno++;
	    cno++;
	    
        }
    	else{
    		System.out.println("Faclty Data  Already Added to List ");
    	}
        }
   
    	   
    public void viewfaculty()
    {
    	if(fno>0&&cno>0)
    	{
    	Faculty f=new Faculty();
    	Iterator<Faculty>itr=flist.iterator();
 	   while(itr.hasNext())
 	   {  
 		   Faculty s2=itr.next();
 		
		   System.out.println("Course Id="+s2.getCourse().getCid());
		   System.out.println("Course Name="+s2.getCourse().getCname());
		   System.out.println("Faculty Id="+s2.getFid());
		   System.out.println("Faculty Name="+s2.getFname());
		
 	   }	  
 	   }
 	  
    	else{
    		System.out.println("NO Data Found1 ");
    	
    		
    		System.out.println("Add Course Data First");
    		addCourse();
    		System.out.println("Add faculty Data First");
    		addFaculty();
    		
    		
    	} 			 
 		   }
 	   
    public void addBatch()
    {
    	if(bno==0)
    	{
    		
    	
    	Batch b=new Batch();
    	
    	while(true)
    	{
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter Batch Id");
    	try{
	      int a=sc.nextInt();
	     b.setBid(a);
	     break;
    	}
    	catch(InputMismatchException e)
    	{
    		System.out.println("Please Enter Valid Key");
    	}
    	}
   while(true)
   {
	   System.out.println("Enter Batch Name");
	   
	    String b1=sc.next();
	    boolean p=b1.matches("[A-Za-z]{1,9}");
	    if(p==true)
	    {
	    b.setBname(b1);
	    break;
	    
	   }
	 
	    else
	    {
		   System.out.println("Please Enter Valid Key");
	    }
	   }
    
    
    
	    Iterator<Faculty>itr2=flist.iterator();
	 	   while(itr2.hasNext())
	 	   {
	 		   Faculty s1=itr2.next();
	 		   b.setFaculty(s1);
	 	   }
	  
	    blist.add(b);
	    System.out.println("Add Batch Sucessfully");
	    bno++;
	    
	   
    }
    	else{
    		System.out.println("Batch Already Add To list");
    	}
    }
    
    
    public void viewbatch()
    {
      if(bno>0)
      {
    	Iterator<Batch>itr=blist.iterator();
 	   while(itr.hasNext())
 	   {
 		Batch s2=itr.next();
 	    System.out.println("Batch Id="+s2.getBid());
 		System.out.println("Batch Name="+s2.getBname());
 		
 		System.out.println("Faculty Id="+s2.getFaculty().getFid());
 		System.out.println("Faculty Name="+s2.getFaculty().getFname());
 	    System.out.println("Course Id="+s2.getFaculty().getCourse().getCid());
 		System.out.println("Course Name="+s2.getFaculty().getCourse().getCname());
 		
 		}
      }
 	   else{
 		  System.out.println("No Data Found");
 		  System.out.println("Add First Course Data");
 			   addCourse();
 			  System.out.println("Add First Faculty Data");
			   addFaculty();
			   addBatch();
 			   
 	   }
 	   }
    	   
   	   
    
    
    public void addStudent()
    {
    	if(sno==0)
    	{
    	  Student s=new Student();
    	while(true)
    	{
    		Scanner sc=new Scanner(System.in);
    	 System.out.println("enter Student Id");
    	 try{
	      int a=sc.nextInt();
	     s.setSid(a);
	     break;
    	 }
    	 catch(InputMismatchException e)
    	 {
    		 System.out.println("Please Enter valid Key");
    	 }
    	}
	    while(true)
	    {
	     System.out.println("Enter Student Name");
	     String b=sc.next();
	     boolean p=b.matches("[A-Za-z]{1,9}");
		    if(p==true)
		    {
	        s.setSname(b);
	        break;
		    }
		    else
		    {
		    	System.out.println("Please Enter Valid Key");
		    }
	    }
	    Iterator<Batch>itr2=blist.iterator();
	 	   while(itr2.hasNext())
	 	   {
	 		   Batch s3=itr2.next();
	 		   s.setBatch(s3);
	 	   }
	    System.out.println("Add Student Sucessfully"); 
	   
	    slist.add(s);
	    sno++;
	    bno++;
	    fno++;
	    cno++;
    }
    	else
    	{
    		System.out.println("Already Add to List");
    	}
    }
    	   
    public void viewstudent()
    {
    	
    	if(sno>0&&cno>0&&fno>0&&bno>0)
    	{
    	Iterator<Student>itr=slist.iterator();
 	   while(itr.hasNext())
 	   {
 		  
 Student s2=itr.next();
 
 System.out.println("Student Id="+s2.getSid());
 System.out.println("Student Name="+s2.getSname());
 
 System.out.println("Student Batch Id="+s2.getBatch().getBid());
 System.out.println("Student Batch Name="+s2.getBatch().getBname());
 System.out.println("Faculty Id="+s2.getBatch().getFaculty().getFid());
 System.out.println("Faculty Name="+s2.getBatch().getFaculty().getFname());
 System.out.println("Student Course Id="+s2.getBatch().getFaculty().getCourse().getCid());
 System.out.println("Student Course Name="+s2.getBatch().getFaculty().getCourse().getCname());
    
    	}
    	}
    	else{
 		   
 			  System.out.println("No Data Found First Add Data Course Data");
 			  addCourse();
 			  System.out.println("No Data Found Add first Faculty  Data");
 			  addFaculty();
 			  System.out.println("No Data found Add first Batch Data");
 			  addBatch();
 			  
 			  addStudent();
    	}
 
 		   
 
 	   }
    	   
   	   
    }

	

	
	
	
	


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

