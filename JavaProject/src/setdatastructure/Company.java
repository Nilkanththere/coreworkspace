package setdatastructure;

import java.util.*;

public class Company {

	public List<Set<Employee>>designation()
	{
		
		List<Set<Employee>>team=new ArrayList<>();
		
		  Set<Employee> developer=new HashSet<>();
		   Employee e=new Employee();
		         e.setEid(888);
		         e.setEname("Rakesh");
		         e.setEsalary(35000.00);
		      
		     developer.add(e);
		     
		   Employee e1=new Employee();
		            e1.setEid(456);
		            e1.setEname("Pavan");
		            e1.setEsalary(45000.00);
		      developer.add(e1); 
		     
		      Set<Employee> Tester=new HashSet<>();
		      Employee e2=new Employee();
		               e2.setEid(359);
		               e2.setEname("Nikhil");
		               e2.setEsalary(48000.00);
		               
		        Tester.add(e2);
		        
		        Employee e3=new Employee();
		                 e3.setEid(753);
		                 e3.setEname("Nitin");
		                 e3.setEsalary(40000.00);
		                 
		                 Tester.add(e3);
		                 
		   
		   team.add(developer);
		   team.add(Tester);
		   
		   return team;
		   
	}
	public static void main(String[] args) {
		
		    Company c=new Company();
		 List<Set<Employee>>data=c.designation();
		 
		 Iterator<Set<Employee>>itr=data.iterator();
		  while(itr.hasNext())
		  {
			  Set<Employee> em=itr.next();
			  
			  Iterator<Employee>itr1=em.iterator();
			  while(itr1.hasNext())
			  {
				  Employee emp=itr1.next();
				  System.out.println(emp.getEid());
				  System.out.println(emp.getEname());
				  System.out.println(emp.getEsalary());
				  
			  }
			  
			          
		  }
		  
		  
		  System.out.println("*******For Each Loop****");
		  for(Set<Employee>emp1:data)
		  {
			  for(Employee emp2:emp1)
			  {
				  System.out.println(emp2.getEid());
				  System.out.println(emp2.getEname());
				  System.out.println(emp2.getEsalary());
			  }
		  }
		    
		 
	}
}
