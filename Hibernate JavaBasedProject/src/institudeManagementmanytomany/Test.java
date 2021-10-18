package institudeManagementmanytomany;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		
		
	Course c=new Course();
		
		c.setCid(101);
		c.setName("Java");
		
    Course c1=new Course();
		
		c1.setCid(102);
		c1.setName("Python");
			
		
		
	Faculty f=new Faculty();
		   f.setFid(1001);
		   f.setFname("Mahesh");
		   
    Faculty f1=new Faculty();
		   f1.setFid(1002);
		   f1.setFname("Sachin");
		   
    Batch b=new Batch();
		     b.setBid(10001);
		     b.setBname("Full Time");
    Batch b1=new Batch();
		     b1.setBid(10002);
		     b1.setBname("Regular");
	
		     
     Student s=new Student();
		     s.setId(1);
		     s.setName("Akash");
     Student s1=new Student();
		     s1.setId(2);
		     s1.setName("Rakesh");	
		     
	  f.getCourse().add(c);
	  f.getCourse().add(c1);
	  
	  b.getFaculty().add(f);
	  b.getFaculty().add(f1);
	  
	  s.getBatch().add(b);
	  s.getBatch().add(b1);
	  
	  
		   Session session =HibernateUtil.getsessionFactory().openSession();
   
		   session.save(s);
		   session.save(s1);
		   
		   
		  
		   session.beginTransaction().commit();
	}

}
