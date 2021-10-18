package collection.practice;

import java.util.*;
import java.util.Map;

public class WorldMap {

	public static void main(String[] args) {


		
		List mh=new ArrayList();
		     mh.add("Pune");
		     mh.add("Mumbai");
		     
		 List jh=new ArrayList();
		      jh.add("bokaro");
		      jh.add("ranchi");
		      
		 Set india=new HashSet();
		     india.add(mh);
		     india.add(jh);
		     
		  Map World=new HashMap();
		  
		     World.put("India",india);
		     
		  Set k=World.keySet();
		  System.out.println(k);
		Iterator itr=k.iterator();
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			System.out.println(s);
			
			Set m=(Set)World.get(s);
			System.out.println(m);

		   
		    
			Iterator itr1=m.iterator();
			while(itr1.hasNext())
			{
				List l=(List)itr1.next();
				
				System.out.println(l);
				
				Iterator itr2=l.iterator();
				while(itr2.hasNext())
				{
					String ss=(String)itr2.next();
					
					System.out.println(ss);
				}
				
			}
			
			
			
		}
		  
		  
		  
		  
		  
		     
	}

}
