package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.*;

public class Company1 {
	public Map<String, Map<String, Employee1>> designation()
	{
		
		Map<String, Map<String, Employee1>> team=new HashMap<>();
		
		Map<String, Employee1> developer=new HashMap<>();
		Employee1 e1=new Employee1();
		          e1.setEid(123);
		          e1.setEname("Rakesh");
		          e1.setEsalary(30000.00);
		         
		 Employee1 e2=new Employee1();
		           e2.setEid(639);
		           e2.setEname("Ashish");
		           e2.setEsalary(35000.00);
		        
		     developer.put("Developer 1",e1);
		     developer.put("Developer 2",e2);
		     
		  
		 Map<String, Employee1> tester =new HashMap<>();
		       
		      Employee1 e3=new Employee1();
		          e3.setEid(987);
		          e3.setEname("Shivraj");
		          e3.setEsalary(40000.00);
		          
		     Employee1 e4=new Employee1();
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
		
		       Company1 c=new Company1();
		 Map<String, Map<String, Employee1>> data=c.designation();
		        
		       Set<String>keys=data.keySet();
		       System.out.println(keys);
		       
		       Iterator<String> itr=keys.iterator();
		       while(itr.hasNext())
		       {
		    	   String s=itr.next();
		    	   System.out.println(s);
		    	 Map<String, Employee1> m1=data.get(s);
		    	 
		    	 Set<String> keys1=m1.keySet();
		    	 System.out.println(keys1);
		    	  
		    	 Iterator<String> itr1=keys1.iterator();
		    	 while(itr1.hasNext())
		    	 {
		    		 String st1=itr1.next();
		    		 
		    		 Employee1 emp=m1.get(st1);
		    		 
		    		 System.out.println(emp.getEid());
		    		 System.out.println(emp.getEname());
		    		 System.out.println(emp.getEsalary());
		    	 }
		        
		
		       }
		System.out.println("*****for each loop*****");
		
		    for(String st1:keys)  
		    {
		    	System.out.println(st1);
		    	
		    	Map<String,Employee1> m=data.get(st1);
		    	
		    	Set<String> stt=m.keySet();
		    	
		    	
		    	for(String ss:stt)
		    	{
		    		Employee1 em=m.get(ss);
		    		System.out.println(em.getEid());
		    		System.out.println(em.getEname());
		    		System.out.println(em.getEsalary());
		    	}
		    	
		    	
		    	
		    }
		       
		       
		       
		       
		       
		       
		       
		       
		       
	}
}
	
