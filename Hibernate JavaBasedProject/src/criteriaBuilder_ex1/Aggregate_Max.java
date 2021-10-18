package criteriaBuilder_ex1;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class Aggregate_Max {

	public static void main(String[] args) {
Session session=HibernateUtil.getsessionFactory().openSession();
		
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Double>query=cb.createQuery(Double.class);
		Root<Employee>root=query.from(Employee.class);
		query.multiselect(cb.max(root.get("salary")));
		
		List<Double>list=session.createQuery(query).getResultList();
		
		for(Double d:list)
		{
			System.out.println(d);
		}

	}

}
