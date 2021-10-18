package oneToMany1;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		
		  Batch b=new Batch();
		        b.setBid(101);
		        b.setBno(132);
		
		
		Faculty f=new Faculty();
		        f.setFid(1);
		        f.setName("vishal Sir");
		        f.setBatch(b);
		        
	    Faculty f1=new Faculty();
		         f1.setFid(2);
		         f1.setName("vijay Sir");
		         f1.setBatch(b);       
		
		BackupFaculty buf=new BackupFaculty();        
		        
		          buf.setFfid(3);
		          buf.setFname("Ajay sir");
		          buf.setBatch(b);
	    BackupFaculty buf1=new BackupFaculty();        
			        
		          buf1.setFfid(4);
		          buf1.setFname("Akshay sir");     
		          buf1.setBatch(b);
		          b.getFct().add(f);
		          b.getFct().add(f1);
		        
		          b.getFctb().add(buf);
		          b.getFctb().add(buf1);
		          
   Session session=HibernateUtil.getSessionFactory().openSession();
   
         session.save(b);
         
         
         
         
         session.beginTransaction().commit();
		          
		          
		          
		     
		
	}

}
