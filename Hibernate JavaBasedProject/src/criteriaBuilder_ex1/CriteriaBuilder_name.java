package criteriaBuilder_ex1;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class CriteriaBuilder_name {

	public static void main(String[] args) {
		
		
		
		Session session=HibernateUtil.getsessionFactory().openSession();
		CriteriaBuilder builder =session.getCriteriaBuilder();
		
		CriteriaQuery<String>cquery=builder.createQuery(String.class);
		Root<Employee>root=cquery.from(Employee.class);
		
		 cquery.select(root.get("name"));

		 List<String>list=session.createQuery(cquery).getResultList();
		 
		
		for(String nm:list)
		{
			System.out.println(nm);
		}
		
		

	}

}
