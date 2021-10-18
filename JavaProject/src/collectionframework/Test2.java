package collectionframework;

import java.util.*;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		 
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
    	 System.out.println("enter Student addres="+i);
    	 String addr=s.next();
    	
    	 Student2 s1=new Student2();
    	         s1.setRollno(rollno);
    	         s1.setName(name);
    	         s1.setAddr(addr);
    	         
    	     l.add(s1);    
    	         
     }
     
     System.out.println(l);
     Iterator itr=l.iterator();
     
     while(itr.hasNext())
     {
    	Student2 stu=(Student2)itr.next();
    	  
    	System.out.println(stu.getRollno());
    	System.out.println(stu.getName());
    	System.out.println(stu.getAddr());
     
     }
	}
}
