import java.util.Scanner;

import org.hibernate.Session;



public class Test {

	public static void main(String[] args) {
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No.of Employee insert Table");
		int no=sc.nextInt();
		for(int i=0;i<no;i++)
		{
		System.out.println("Eneter Employee Id");
		int id=sc.nextInt();
		System.out.println("Enter Employee name");
		String name=sc.next();
		System.out.println("Enter Employee Address");
		String addr=sc.next();
		
		Employee em =new Employee();
        em.setId(id);
        em.setName(name);
        em.setAddr(addr);

        session.save(em);
        session.beginTransaction().commit();
        
		} 
	}

}
