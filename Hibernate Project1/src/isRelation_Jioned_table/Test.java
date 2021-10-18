package isRelation_Jioned_table;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		
		
		Regular_Employee re=new Regular_Employee();
		  re.setEid(1);
		  re.setEname("Rajesh");
		  re.setSalary(25000.00f);
		  re.setBonus(7000);
		  
		  
		  Contract_Employee ce=new Contract_Employee();
		  
		      ce.setEid(2);
		      ce.setEname("Sandip");
		      ce.setPay_per_hour(900);
		      ce.setContract_duration("1 Yr");
		      
		    Session session=HibernateUtil.getSessionFactory().openSession();
		    
		    session.save(re);
		    session.save(ce);
		    
		    session.beginTransaction().commit();
		      

	}

}
