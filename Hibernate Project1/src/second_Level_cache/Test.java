package second_Level_cache;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		
	
	Session session=HibernateUtil.getSessionFactory().openSession();
	
	
	
	Student stu=session.load(Student.class,1);
	
	System.out.println(stu.getRollno());
	System.out.println(stu.getName());
	System.out.println(stu.getAddr());
	
Student stu1=session.load(Student.class,1);
	
	System.out.println(stu1.getRollno());
	System.out.println(stu1.getName());
	System.out.println(stu1.getAddr());
	
	
Session session1=HibernateUtil.getSessionFactory().openSession();	

Student stu2=session1.load(Student.class,1);
	
	System.out.println(stu2.getRollno());
	System.out.println(stu2.getName());
	System.out.println(stu2.getAddr());
	
	
	
	

}
}