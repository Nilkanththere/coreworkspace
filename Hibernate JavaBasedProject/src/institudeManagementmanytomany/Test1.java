package institudeManagementmanytomany;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;

public class Test1 {

	public static void main(String[] args) {
		
		Session session=HibernateUtil.getsessionFactory().openSession();
		
		Course cs=session.get(Course.class,101);
		System.out.println(cs.getCid());
		System.out.println(cs.getName());
		
		Faculty f=session.get(Faculty.class,1001);
		System.out.println(f.getFid());
		System.out.println(f.getFname());
		
		Set<Course>c=f.getCourse();
		Iterator<Course>itr=c.iterator();
		while(itr.hasNext())
		{
			Course css=itr.next();
			System.out.println(css.getCid());
			System.out.println(css.getName());
		}
		
		Batch b=session.get(Batch.class,10001);
		System.out.println(b.getBid());
		System.out.println(b.getBname());
		
		Set<Faculty>ff=b.getFaculty();
		Iterator<Faculty>itr1=ff.iterator();
		while(itr1.hasNext())
		{
			Faculty fs=itr1.next();
			System.out.println(fs.getFid());
			System.out.println(fs.getFname());
			
			
			Set<Course>c1=fs.getCourse();
			Iterator<Course>itr2=c1.iterator();
			while(itr2.hasNext())
			{
				Course crs=itr2.next();
				System.out.println(crs.getCid());
				System.out.println(crs.getName());
			}
		}
		
		Student stu=session.get(Student.class,1);
		System.out.println(stu.getId());
		System.out.println(stu.getName());
		

	}

}
