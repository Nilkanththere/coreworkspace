package institudeManagementProject;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		
		
	/*Course c=new Course();
		
		c.setCid(1001);
		c.setName("Java");
		
		Faculty f=new Faculty();
		   f.setFid(1002);
		   f.setFname("Mahesh");
		   f.setC(c);
		   
		 Batch b=new Batch();
		     b.setBid(1003);
		     b.setBname("Full Time");
		     b.setF(f); 
		     
		  Student s=new Student();
		     s.setId(1004);
		     s.setName("Akash");
		     s.setB(b);*/
		   Session session =HibernateUtil.getsessionFactory().openSession();
   
		  // session.save(s);
		   
		   Student s=session.get(Student.class,1004);
		   System.out.println("Student Id="+s.getId());
		   System.out.println("Student Name="+s.getName());
		   System.out.println("Batch Id="+s.getB().getBid());
		   System.out.println("Batch Name="+s.getB().getBname());
		   System.out.println("Faculty Id="+s.getB().getF().getFid());
		   System.out.println("Faculty Name="+s.getB().getF().getFname());
		   System.out.println("Course Id="+s.getB().getF().getC().getCid());
		   System.out.println("Course Name"+s.getB().getF().getC().getName());
		   
		   session.beginTransaction().commit();
	}

}
