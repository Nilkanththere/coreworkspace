package oneTomany;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		
		Department dpt=new Department();
		    
		     dpt.setDid(1);
		     dpt.setName("IT");
		     
		     Employee e1=new Employee(); 
		     e1.setEmpid(101);
		     e1.setName("Rahul");
		     e1.setDesignation("Developer");
		      e1.setDept(dpt);
		     
             Employee e2=new Employee();
		     e2.setEmpid(102);
		     e2.setName("Ravi");
		     e2.setDesignation("Tester");
		     
		     e2.setDept(dpt);
		     
		     dpt.getSemp().add(e1);
		     dpt.getSemp().add(e2);
	 Session session =HibernateUtil.getSessionFactory().openSession();
		     session.save(dpt);
		     session.beginTransaction().commit();
		     
		     
		     
		     
		     
		     
		     
		      

	}

}
