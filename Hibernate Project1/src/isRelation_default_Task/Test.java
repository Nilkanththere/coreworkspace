package isRelation_default_Task;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		
		
		Regular_Employee re=new Regular_Employee();
		  re.setEid(1);
		  re.setEname("Rakesh");
		  re.setSalary(35000.10f);
		  re.setBonus(5000);
		  
		  
		  Contract_Employee ce=new Contract_Employee();
		  
		      ce.setEid(2);
		      ce.setEname("Ashish");
		      ce.setPay_per_hour(700);
		      ce.setContract_duration("2 Week");
		      
		    Session session=HibernateUtil.getSessionFactory().openSession();
		    
		    session.save(re);
		    session.save(ce);
		    
		    session.beginTransaction().commit();
		      

	}

}
