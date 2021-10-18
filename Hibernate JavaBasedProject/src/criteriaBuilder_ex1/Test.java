package criteriaBuilder_ex1;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		
		Department dpt=new Department();
		    
		     dpt.setDid(1);
		     dpt.setName("IT");
		     
		     Employee e1=new Employee(); 
		     e1.setEid(101);
		     e1.setName("Rahul");
		     e1.setAddr("pune");
		     e1.setSalary(45000.0);
		      e1.setDpt(dpt);
		     
             Employee e2=new Employee();
		     e2.setEid(102);
		     e2.setName("Ravi");
		     e2.setAddr("Nagpur");
		     e2.setSalary(35000.0);
		     
		     e2.setDpt(dpt);
		     
		     
		     Employee e3=new Employee();
		     e3.setEid(103);
		     e3.setName("Ramesh");
		     e3.setAddr("Mumbai");
		     e3.setSalary(25000.0);
		     
		     e3.setDpt(dpt);
		      
		     Employee e4=new Employee();
		     e4.setEid(104);
		     e4.setName("Ravi");
		     e4.setAddr("Nashik");
		     e4.setSalary(30000.0);
		     
		     e4.setDpt(dpt);
		      
		     
		     
		     
	
		     dpt.getSemp().add(e1);
		     dpt.getSemp().add(e2);
		     dpt.getSemp().add(e3);
		     dpt.getSemp().add(e4);
		     
	 Session session =HibernateUtil.getsessionFactory().openSession();
		     session.save(dpt);
		     session.beginTransaction().commit();
		     
		     
		     
		     
		     
		     
		     
		      

	}

}
