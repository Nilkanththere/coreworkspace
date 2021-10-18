package map;


import java.util.*;

public class MapList {

	public static void main(String[] args) {
		
		
		List<String> mh=new ArrayList<>();
		     mh.add("Nagpur");
		     mh.add("Mumbai");
		     
		 List<String> jh=new ArrayList<>();
		      jh.add("Ranchi");
		      jh.add("Bokaro");
		      
		Map<String,List<String>> india=new HashMap<>();
		    india.put("Maharashtra",mh);
		    india.put("Jharkhand", jh);
		    
		 Set<String> k=india.keySet();
		 
		 System.out.println(k);
		 
		 
		Iterator<String> itr=k.iterator();
		while(itr.hasNext())
		{
			String st=(String)itr.next();
			System.out.println(st);
		
			List list=india.get(st);
			
		Iterator<String> itr1=list.iterator();
		while(itr1.hasNext())
				{
				String s=itr1.next();
				System.out.println(s);
				
				
	
			}
		}
		 
		 System.out.println("********FOr Each Loop*******");
		    
		 for(String ss:k)
		 {
			 System.out.println(ss);
			List<String> sss=india.get(ss);
			//System.out.println(sss);
			for(String s4:sss)
			{
				System.out.println(s4);
			}
		 }
		    
		    
		
		
		 

	}

	}

