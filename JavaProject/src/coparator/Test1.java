package coparator;

import java.util.*;



public class Test1 {

	public static void main(String[] args) {
		

		Set<Employee> t=new TreeSet<>();
                      
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
            
          t.add(e);
          t.add(e1);
          t.add(e2);
          
          
          
          Iterator<Employee>itr=t.iterator();
          while(itr.hasNext())
          {
        	  Employee emp=itr.next();
        	  System.out.println(emp.getEid());
          	  System.out.println(emp.getEname());
          	  System.out.println(emp.getEsalary());
          }
          
          
          System.out.println("********for each loop*******");
        for(Employee emp:t)
        {
        	System.out.println(emp.getEid());
        	System.out.println(emp.getEname());
        	System.out.println(emp.getEsalary());
        }
          
      
	}

}
