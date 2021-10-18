package genricEXP;

import java.util.*;

public class Details {

	public List<Employee> setDetails()
	{
		List<Employee>al=new ArrayList();
		
		Employee e=new Employee();
		         e.setEmpid(12345);
		         e.setName("shiv");
		         e.setEmpdesig("Developer");
		         e.setEmpsalary(25000.00);
		         
	    Employee e1=new Employee();
	             e1.setEmpid(9874);
	             e1.setName("Ashish");
	             e1.setEmpdesig("Tester");
	             e1.setEmpsalary(30000.00);
	             
	       
	       al.add(e);
	       al.add(e1);	         
	
	return al;
	
	}
	
	public List<Employee> getDetails()
	{
		  List<Employee>al2=new ArrayList();
		  List<Employee>data=setDetails();
		  
		Iterator<Employee>itr=data.iterator();
		
		while(itr.hasNext())
		{
			Employee em=itr.next();
			
			System.out.println(em.getEmpid());
			System.out.println(em.getName());
			System.out.println(em.getEmpdesig());
			System.out.println(em.getEmpsalary());
			
			al2.add(em);
		}
		return al2;
		
		
	}
}
