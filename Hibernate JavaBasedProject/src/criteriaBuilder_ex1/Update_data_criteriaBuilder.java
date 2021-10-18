package criteriaBuilder_ex1;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Update_data_criteriaBuilder {

	public static void main(String[] args) {
		
	Session session=HibernateUtil.getsessionFactory().openSession();
	CriteriaBuilder builder=session.getCriteriaBuilder();
	Transaction tx=session.beginTransaction();
	CriteriaUpdate<Employee>update=builder.createCriteriaUpdate(Employee.class);
	Root<Employee>root=update.from(Employee.class);
	
	update.set(root.get("name"), "Manish");
	update.set("addr","Thane");
	update.where(builder.equal(root.get("eid"),101));
	session.createQuery(update).executeUpdate();
	tx.commit();
	
	
		
		
		
		
	}

}
