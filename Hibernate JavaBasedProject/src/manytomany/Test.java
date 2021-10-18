package manytomany;

import org.hibernate.Session;

public class Test {
public static void main(String[] args) {
	
      Course c1=new Course();
	  
	     c1.setCid(101);
	     c1.setName("Java");
	     
	     Course c2=new Course();
	     c2.setCid(102);
	     c2.setName("Python");
	     
	     
	     
	     Student stu=new Student();
	        stu.setRollno(2);
	        stu.setName("Pritam");
	        stu.setAddr("Nagpur");
	        
	        stu.getScourse().add(c1);
	        stu.getScourse().add(c2);
	        
	        Session session=HibernateUtil.getSessionFactory().openSession();
	       /* Student stu=session.get(Student.class,1);
	        
	        System.out.println(stu.getRollno());
	        System.out.println(stu.getName());
	        System.out.println(stu.getAddr());*/
	        
	        session.save(stu);
	        session.beginTransaction().commit();
	        
	        
}
}
