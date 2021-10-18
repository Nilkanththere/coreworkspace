package oneTooneBidirectional;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		
		
		Account acno=new Account();
		
		acno.setAcno(102);
		acno.setName("PQR");
		acno.setAddr("Akurdi");
		
		Accountplus acp=new Accountplus();
		   acp.setAcid(1);
		   acp.setAmmount(20000);
		   
		   acp.setAcno(acno);
		   acno.setAcp(acp);
		   Session session =HibernateUtil.getsessionFactory().openSession();
   
		   session.save(acno);
		   session.save(acp);
		   session.beginTransaction().commit();
	}

}
