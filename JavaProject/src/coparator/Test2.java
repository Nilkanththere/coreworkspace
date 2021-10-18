package coparator;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {

	public static void main(String[] args) {
	     
		 Employee e=new Employee();
        e.setEid(888);
        e.setEname("Rakesh");
        e.setEsalary(35000.00);
   
  Employee e1=new Employee();
           e1.setEid(456);
           e1.setEname("Pavan");
           e1.setEsalary(45000.00);
           
   Employee e2=new Employee();
           e2.setEid(359);
           e2.setEname("Nikhil");
           e2.setEsalary(48000.00);
           
        
        Set<Employee> eset=null;
         Scanner sc=new Scanner(System.in);
         
         while(true)
         {
        	 System.out.println("*****Select Number for Sorting**** ");
        	 
        	 System.out.println("1.Employee ID Sorting");
        	 System.out.println("2.Employee Name Sorting");
        	 System.out.println("3.Employee Salary Sorting");
              int a=sc.nextInt();
         
         switch(a)
         {
         case 1:
        	 eset=new TreeSet<>(new EmidSort());
        	 break;
        	 
         case 2:
        	 eset=new TreeSet<>(new EmnameSort());
        	 break;
        	 
         case 3:
        	 eset=new TreeSet<>(new Emsalary());
        	 break;
         
         default:
        	 System.out.println("Enter Valid Choice");
         }
         eset.add(e);
         eset.add(e1);
         eset.add(e2);
         
         Iterator<Employee>itr=eset.iterator();
         while(itr.hasNext())
         {
       	  Employee emp=itr.next();
       	  System.out.println(emp.getEid());
         	  System.out.println(emp.getEname());
         	  System.out.println(emp.getEsalary());
         }
         
     System.out.println("*****for Each loop*****");
         
       for(Employee emp:eset)
       {
       	System.out.println(emp.getEid());
       	System.out.println(emp.getEname());
       	System.out.println(emp.getEsalary());
       }
         
     
	}

}


	}


