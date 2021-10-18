package first_Level_cache;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		
	
	Session session=HibernateUtil.getSessionFactory().openSession();
	
	/*Student stu=new Student();
	         stu.setRollno(1);
	         stu.setName("Amit");
	         stu.setAddr("pune");
	         
	  session.save(stu);
	  session.beginTransaction().commit();*/
	
	Student stu=session.load(Student.class,1);
	
	System.out.println(stu.getRollno());
	System.out.println(stu.getName());
	System.out.println(stu.getAddr());
	
	
Session session1=HibernateUtil.getSessionFactory().openSession();	
Student stu1=session1.load(Student.class,1);
	
	System.out.println(stu1.getRollno());
	System.out.println(stu1.getName());
	System.out.println(stu1.getAddr());
	
	
	
	

}
}