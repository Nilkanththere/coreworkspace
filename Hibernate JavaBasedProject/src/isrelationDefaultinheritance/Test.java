package isrelationDefaultinheritance;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {

		Karvenagar kng=new Karvenagar();
		
		kng.setId(1);
		kng.setSname("Amit");
		kng.setCname("Java");
		kng.setRegularbatch("B132");
		
		Akurdi akd=new Akurdi();
		  akd.setId(2);
		  akd.setSname("Rakesh");
		  akd.setCname("Python");
		  akd.setWeekendbatch("B22");
		  
		 Session session=HibernateUtil.getSessionFactory().openSession();
		  
		  session.save(kng);
		  session.save(akd);
		  
		  session.beginTransaction().commit();
		  

	}

}
