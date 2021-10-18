package collectionframework;

import java.util.*;

public class College {

	
	public List m1()
	{
		Scanner s=new Scanner(System.in);
		 
		 System.out.println("enter the Number Of student");
		 
		   int a=s.nextInt();
		  
    	List l=new ArrayList();
    	
    	 for(int i=0;i<=a;i++)
    	{
    		 
   		 System.out.println("Enter student rollno="+i);
       	 int rollno=s.nextInt();
       	 System.out.println("Enter student name="+i);
       	 String name=s.next();
    		
    	
    	 Student3 s1=new Student3();
    	         s1.setRollno(rollno);
    	         s1.setName(name);
    	       
    	          l.add(s1); 
    	
    	          
    	  System.out.println(l);
    	  
    	}
		
    	 return l;
		
		
	}
}
