package isRelation_Mapping_Single_table_Ex;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
	
		NagpurBranch ng=new NagpurBranch();
		   ng.setEid(101);
		   ng.setName("Ramesh");
		   ng.setAddr("pune");
		   ng.setSalary(30000.0);
		   ng.setDayshift("One Week");
		   
		   PuneBranch pb=new PuneBranch();
		    
		          pb.setEid(102);
		          pb.setName("Rakesh");
		          pb.setAddr("Nagpur");
		          pb.setSalary(35000.00);
		          pb.setNightshift("One Month");
		   
		          Session session=HibernateUtil.getSessionFactory().openSession();
		          session.save(ng);
		          session.save(pb);
		          
		          session.beginTransaction().commit();
		          
		        
		          
		          
		          
		 
	}

}
