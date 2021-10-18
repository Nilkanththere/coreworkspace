package collection.practice;

import java.util.*;
import java.util.Scanner;

public class University {

	
public void m1()
{
	
	   Scanner sc=new Scanner(System.in);
	   System.out.println("****Enter No.of Student Details here*****");
	  
	   int no=sc.nextInt();
	   List stu=new ArrayList();
	   for(int i=0;i<=no;i++)
	   {
		   Student s=new Student();
		   System.out.println("Enter Student id="+i);
		   int a=sc.nextInt();
		   System.out.println("Enter Student Name"+i);
		   String b=sc.next();
		   System.out.println("Enter Student Address"+i);
		   String c=sc.next();
	   
		   
		  
		           s.setSid(a);
		           s.setSname(b);
		           s.setSaddr(c);
		     
		      
		           stu.add(s);
	   
		      List college=new ArrayList();
		         
		          college.add(stu);
		          
		      List university=new ArrayList();
		          
		          university.add(college);
		          
	       
		      Iterator itr=university.iterator();
		      while(itr.hasNext())
		      {
		    	  List l=(List)itr.next();
		    	  System.out.println(l);
		    	 Iterator itr1=l.iterator();
		    	 while(itr1.hasNext())
		    	 {
		    		 List l1=(List)itr1.next();
		    		 
		    		 Iterator itr2=l1.iterator();
		    		 while(itr2.hasNext())
		    		 {
		    			 
		    			 
		    			 Student s1=(Student)itr2.next();
		    			 System.out.println(s1.getSid());
		    			 System.out.println(s1.getSname());
		    			 System.out.println(s1.getSaddr());
		    		 }
		    		 
		    		 
		    	 }
		      }
	   }
		      
		    
		           
		     
	   }  
		           
		           
	   
 

public static void main(String[] args) {
	
	         University u=new University();
	                    u.m1();
	                    
	                    
	                    
	                    
	                    
}
}
