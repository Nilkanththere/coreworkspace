package cjc.com.practice;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
 
    Bank b=new Bank();
         b.setBid(1234);
         b.setBname("SBI");
		
		 
     Bank b2=new Bank();
         b2.setBid(96351);
         b2.setBname("BOI");
		
         AccountHolders ah=new AccountHolders();
             ah.setCid(101);
             ah.setCname("Ashish");
             ah.setCaddr("pune");
             
             
             
       AccountHolders ah1=new AccountHolders();
             ah1.setCid(102);
             ah1.setCname("Shivraj");
             ah1.setCaddr("Thane");
            
             
        AccountHolders ah2=new AccountHolders();
             ah2.setCid(103);
             ah2.setCname("Neel");
             ah2.setCaddr("Nagpur");
             
             
             
       AccountHolders ah3=new AccountHolders();
             ah2.setCid(104);
             ah2.setCname("Akshay");
             ah2.setCaddr("Nagpur");
            
              
         
             
             ah.getBck().add(b);
             ah1.getBck().add(b);
             
             ah2.getBck().add(b2);
             ah3.getBck().add(b2);
             
             
         b.getAchd().add(ah);
         b.getAchd().add(ah1);
         
         b2.getAchd().add(ah2);
         b2.getAchd().add(ah3);
         
        Session session=HibernateUtil.getsessionFactory().openSession();
        
            session.save(b);
            session.save(b2);
            session.save(ah);
            session.save(ah1);
            session.save(ah2);
            session.save(ah3);
            session.beginTransaction().commit();
             

	}

}
