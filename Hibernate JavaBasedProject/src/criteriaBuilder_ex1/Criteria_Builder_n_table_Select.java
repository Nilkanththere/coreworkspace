package criteriaBuilder_ex1;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class Criteria_Builder_n_table_Select {

	public static void main(String[] args) {
		Session session=HibernateUtil.getsessionFactory().openSession();
		
	      CriteriaBuilder builder=session.getCriteriaBuilder();
	      
	      CriteriaQuery<Object[]>cquery=builder.createQuery(Object[].class);
	      
	      Root<Employee>rootemp=cquery.from(Employee.class);
	      Root<Department>rootdpt=cquery.from(Department.class);
	      
cquery.multiselect(rootemp,rootdpt).where( builder.equal(rootemp.get("dpt"),
		rootdpt.get("did")));
	      
	      List<Object[]>list=session.createQuery(cquery).getResultList();
	      
	      for(Object[]obj:list)
	      {
	    	  Employee emp=(Employee)obj[0];
	    	  Department dpt=(Department) obj[1];
	    	  
	    	  System.out.println(emp.getEid());
	    	  System.out.println(emp.getName());
	    	  System.out.println(emp.getAddr());
	    	  System.out.println(dpt.getDid());
	    	  System.out.println(dpt.getName());
	      }
	}

}
