package oneToMany;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		
		/*Doctor doct=new Doctor();
		    
		     doct.setDid(1);
		     doct.setName("Dr.ortho");
		     
		     Patient p1=new Patient(); 
		     p1.setPid(123);
		     p1.setName("Rahul");
		     p1.setAddr("pune");
		     p1.setDoc(doct);
		      
		     
		     Patient p2=new Patient(); 
		     p2.setPid(12342);
		     p2.setName("Ashish");
		     p2.setAddr("Nagpur");
		     p2.setDoc(doct);
		      
		     doct.getPat().add(p1);
		     doct.getPat().add(p2);*/
		     
	 Session session =HibernateUtil.getSessionFactory().openSession();
		    // session.save(doct);
		     //session.beginTransaction().commit();
		     
              /*Patient p=session.get(Patient.class,123);
              System.out.println(p.getPid());
              System.out.println(p.getName());
              System.out.println(p.getAddr());
              System.out.println(p.getDoc().getDid());
              System.out.println(p.getDoc().getName());*/
	 
	 Doctor dr=session.load(Doctor.class,1);
	 System.out.println(dr.getName());
	 System.out.println(dr.getPat().size());
	 
	 
	 
	
	 
	 
	 
	 
	 
	 
	 
	 
	
	 
	 
		     
		     
		  
	}

}
