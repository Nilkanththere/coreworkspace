package oneToone_Unidirection;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		
		
		Account acno=new Account();
		
		acno.setAcno(103);
		acno.setName("Rakesh");
		acno.setAddr("Pune");
		
		Accountplus acp=new Accountplus();
		   acp.setAcid(2);
		   acp.setAmmount(30000);
		   
		   acno.setAcp(acp);
		   Session session =HibernateUtil.getsessionFactory().openSession();
   
		   session.save(acno);
		   session.beginTransaction().commit();
	}

}
