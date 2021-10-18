package isinheritanceSingle_Table;


	import java.util.HashMap;
	import java.util.Map;

	import org.hibernate.SessionFactory;
	import org.hibernate.boot.Metadata;
	import org.hibernate.boot.MetadataSources;
	import org.hibernate.boot.registry.StandardServiceRegistry;
	import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
	import org.hibernate.cfg.Environment;

	public class HibernateUtil {

		private static StandardServiceRegistry registry;
		private static SessionFactory sessionFactory;
		
		public static SessionFactory getSessionFactory()
		{
			if(sessionFactory==null)
			{
				Map<String,Object>m=new HashMap<>();
				
			m.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
			m.put(Environment.URL,"jdbc:mysql://localhost:3306/inheritance_single");
			m.put(Environment.USER,"root");
			m.put(Environment.PASS,"root");
			m.put(Environment.DIALECT,"org.hibernate.dialect.MySQL5Dialect");
			m.put(Environment.HBM2DDL_AUTO,"update");
			m.put(Environment.SHOW_SQL,"true");
			
			registry=new StandardServiceRegistryBuilder().applySettings(m).build();
			
			MetadataSources   mds=new MetadataSources(registry);
		    
		    mds.addAnnotatedClass(Karvenagar.class);
		    mds.addAnnotatedClass(Akurdi.class);
		    
		    Metadata md=mds.getMetadataBuilder().build();
		    
		    sessionFactory=md.getSessionFactoryBuilder().build();
		    
			}
			return sessionFactory;
			
			}
		}

