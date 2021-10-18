package criteriaBuilder_ex1;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Delete_data_criteriaBuilder {

	public static void main(String[] args) {
		Session session=HibernateUtil.getsessionFactory().openSession();
		CriteriaBuilder builder=session.getCriteriaBuilder();
		Transaction tx=session.beginTransaction();
		CriteriaDelete<Employee>delete=builder.createCriteriaDelete(Employee.class);
		Root<Employee>root=delete.from(Employee.class);
		delete.where(builder.equal(root.get("eid"),102));
		
		session.createQuery(delete).executeUpdate();
		tx.commit();
		
	}

}
