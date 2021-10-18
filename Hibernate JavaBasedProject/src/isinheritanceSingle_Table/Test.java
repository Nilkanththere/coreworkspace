package isinheritanceSingle_Table;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {

		Karvenagar kng=new Karvenagar();
		
		kng.setId(1);
		kng.setSname("Nikhil");
		kng.setCname("Java");
		kng.setRegularbatch("B127");
		
		Akurdi akd=new Akurdi();
		  akd.setId(2);
		  akd.setSname("Mahesh");
		  akd.setCname("Python");
		  akd.setWeekendbatch("B20");
		    
		 Session session=HibernateUtil.getSessionFactory().openSession();
		  
		  session.save(kng);
		  session.save(akd);
		  
		  session.beginTransaction().commit();
		  

	}

}
