package cjc.com;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Employee em=session.get(Employee.class,2);

		em.setName("Shivraj");
        em.setAddr("Pusad");
        
        session.beginTransaction();
        
        session.update(em);
        session.getTransaction().commit();
        
		} 
	}


