package manytoone;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
	
		
		Employee e=new Employee();
		         e.setId(12);
		         e.setName("Rakesh");
		         
		       
		 Department dpt=new Department();
		   
		    dpt.setName("IT");
		    
		    dpt.setEmp(e);
		    
		    Department dpt1=new Department();
			   
		    dpt1.setName("HR");
		    
		    dpt1.setEmp(e);
		    
		 
		    e.getDpt().add(dpt);
		    e.getDpt().add(dpt1);
		    
		  Session session =HibernateUtil.getSessionFactory().openSession();
		  
		  session.save(e);
		  
		  session.beginTransaction().commit();
		    
		    
		    
		    
	}

}
