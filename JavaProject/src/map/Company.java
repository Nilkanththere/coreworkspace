package map;

import java.util.*;

public class Company {

	public Map designation()
	{
		
		Map team=new HashMap();
		
		Map developer=new HashMap();
		Employee e1=new Employee();
		         e1.setEid(123);
		         e1.setEname("Rakesh");
		         e1.setEsalary(30000.00);
		         
		 Employee e2=new Employee();
		          e2.setEid(639);
		          e2.setEname("Ashish");
		          e2.setEsalary(35000.00);
		        
		     developer.put("Developer 1", e1);
		     developer.put("Developer 2",e2);
		     
		  
		 Map tester =new HashMap();
		       
		      Employee e3=new Employee();
		          e3.setEid(987);
		          e3.setEname("Shivraj");
		          e3.setEsalary(40000.00);
		          
		     Employee e4=new Employee();
		              e4.setEid(563);
		              e4.setEname("Swapnil");
		              e4.setEsalary(350000.00);
		              
		           tester.put("Tester 1",e3);
		           tester.put("Tester 2",e4);
		           
		   team.put("Team 1",developer);
		   team.put("Team 2",tester);
		   
		   return team;
		           
	}
	public static void main(String[] args) {
		
		       Company c=new Company();
		        Map data=c.designation();
		        
		       Set keys=(Set)data.keySet();
		       System.out.println(keys);
		       
		       Iterator itr=keys.iterator();
		       while(itr.hasNext())
		       {
		    	   String s=(String)itr.next();
		    	   System.out.println(s);
		    	 Map m1=(Map)data.get(s);
		    	 
		    	 Set keys1=(Set)m1.keySet();
		    	 System.out.println(keys1);
		    	  
		    	 Iterator itr1=keys1.iterator();
		    	 while(itr1.hasNext())
		    	 {
		    		 String st1=(String)itr1.next();
		    		 
		    		 Employee emp=(Employee)m1.get(st1);
		    		 
		    		 System.out.println("Employee Id="+emp.getEid());
		    		 System.out.println("Employee Name="+emp.getEname());
		    		 System.out.println("Employee Salary="+emp.getEsalary());
		    	 }
		        
		
	}
		       
		       
		           
		           
		           
		              
		              
		              
		              
		          
		          
		          
		 
		 
		 
		 
		
	}
		

	

}
