package isRelation_Table_per_class;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		
		
		Regular_Employee re=new Regular_Employee();
		  re.setEid(1);
		  re.setEname("Mukesh");
		  re.setSalary(30000.00f);
		  re.setBonus(3000);
		  
		  
		  Contract_Employee ce=new Contract_Employee();
		  
		      ce.setEid(2);
		      ce.setEname("Vikas");
		      ce.setPay_per_hour(800);
		      ce.setContract_duration("2 month");
		      
		      
		  Employee e=new Employee();
		          e.setEid(101);
		          e.setEname("Mukesh");
		   Employee e1=new Employee();
		          e1.setEid(102);
		          e1.setEname("Vikas");
		                 
		          
		          
		      
		    Session session=HibernateUtil.getSessionFactory().openSession();
		    
		    session.save(re);
		    session.save(ce);
		    session.save(e);
		    session.save(e1);
		    
		    session.beginTransaction().commit();
		      

	}

}
