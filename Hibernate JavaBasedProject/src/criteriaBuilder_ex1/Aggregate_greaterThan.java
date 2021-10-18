package criteriaBuilder_ex1;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class Aggregate_greaterThan {

	public static void main(String[] args) {
Session session=HibernateUtil.getsessionFactory().openSession();
		
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Employee>query=cb.createQuery(Employee.class);
		Root<Employee>root=query.from(Employee.class);
		query.select(root).where(cb.greaterThan(root.get("salary"),20000));
		
		List<Employee>list=session.createQuery(query).getResultList();
		
		for(Employee em:list)
		{
			
			System.out.println(em.getSalary());
			
			
			
			
		}


	}

}
