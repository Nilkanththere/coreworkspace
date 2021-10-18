package named_Query;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {
	
	public static void main(String[] args) {
		
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Query query=session.createNamedQuery("All_dept");
		
		List<Department>list=query.getResultList();
		
		for(Department d:list)
		{
			System.out.println(d.getDid());
			System.out.println(d.getName());
			System.out.println(d.getAddr());
		}
		
		
		
		Transaction tx=session.beginTransaction();
		query=session.createNamedQuery("update_name");
		query.setParameter("id",1);
		query.setParameter("nm","HR");
		
	    query.executeUpdate();
	    
	    System.out.println("Update data sucesfully");
	    tx.commit();
	    
	    
	  Transaction tx1=session.beginTransaction();
	  query=session.createNamedQuery("Select_data");
	  query.setParameter("id",2);
	  
	  Department dpt=(Department) query.getSingleResult();
	  
	  System.out.println(dpt.getDid());
	  System.out.println(dpt.getName());
	  System.out.println(dpt.getAddr());
	  tx1.commit();
	    
	  Transaction tx2=session.beginTransaction();
	  query=session.createNamedQuery("delete_data");
	  query.setParameter("id",1);
	  
	  
	    query.executeUpdate();
	    tx2.commit();
	    
	    
	    
	    
	    
		
	}
	
	}


