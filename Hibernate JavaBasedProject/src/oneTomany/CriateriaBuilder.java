package oneTomany;



import java.util.List;
import java.util.Set;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class CriateriaBuilder {

	public static void main(String[] args) {
		
		
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		CriteriaBuilder builder=session.getCriteriaBuilder();
		CriteriaQuery<Employee>cquery=builder.createQuery(Employee.class);
		
		Root<Employee>root=cquery.from(Employee.class);
		
		
		     cquery.select(root);
		     List<Employee>list=session.createQuery(cquery).getResultList();
		     
		     for(Employee em:list)
		     {
		    	 System.out.println(em.getEmpid());
		    	 System.out.println(em.getName());
		    	 System.out.println(em.getDesignation());
		         System.out.println(em.getDept().getDid());
		         System.out.println(em.getDept().getName());
		     }
		     
		

	}

}
