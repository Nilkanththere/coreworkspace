package criteriaBuilder_ex1;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class Criteria_Builder_multiselect {

	public static void main(String[] args) {
	
		
		Session session=HibernateUtil.getsessionFactory().openSession();
		
      CriteriaBuilder builder=session.getCriteriaBuilder();
      
      CriteriaQuery<Object[]>cquery=builder.createQuery(Object[].class);
      
      Root<Employee>root=cquery.from(Employee.class);
      cquery.multiselect(root.get("name"),root.get("addr"));
      
      List<Object[]>list=session.createQuery(cquery).getResultList();
      
      for(Object[]obj:list)
      {
    	  System.out.println(obj[0]);
    	  System.out.println(obj[1]);
      }
	}

}
