package collectionframework;

import java.util.*;

public class Details {
	
	public  List setDetail()
	{
		List l=new ArrayList();
		Employee e=new Employee();
		         e.setEmid(1256);
		         e.setEmname("Ashish");
		         e.setEmdesig("Developer");
		         e.setEmsalary(25000);
		      
		      l.add(e);
	
	return l;
}
      public void getDetail()
      {
    	  Details d=new Details();
    	  List data=setDetail();
    	  
    	  Iterator itr=data.iterator();
    	  
    	  while(itr.hasNext())
    	  {
    		  Employee em=(Employee)itr.next();
    		  System.out.println(em.getEmid());
    		  System.out.println(em.getEmname());
    		  System.out.println(em.getEmdesig());
    		  System.out.println(em.getEmsalary());
    		  
    	  }
    	  
    	  
      }
      
	
}
