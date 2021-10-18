package criteriaBuilder_ex1;



import java.util.List;
import java.util.Set;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class CriateriaBuilder {

	public static void main(String[] args) {
		
		
		
		Session session=HibernateUtil.getsessionFactory().openSession();
		
		CriteriaBuilder builder=session.getCriteriaBuilder();
		CriteriaQuery<Employee>cquery=builder.createQuery(Employee.class);
		
		Root<Employee>root=cquery.from(Employee.class);
		
		
		     cquery.select(root);
		     List<Employee>list=session.createQuery(cquery).getResultList();
		     
		     for(Employee em:list)
		     {
		    	System.out.println(em.getEid());
		    	System.out.println(em.getName());
		    	System.out.println(em.getAddr());
		    	System.out.println(em.getDpt().getDid());
		    	System.out.println(em.getDpt().getName());
		     }
		     
		

	}

}
