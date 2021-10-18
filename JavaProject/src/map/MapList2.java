package map;


import java.util.*;

public class MapList2 {

	public static void main(String[] args) {
	
		List<String> mh=new ArrayList<>();
	     mh.add("pune");
	     mh.add("Mumbai");
	     
	 List<String> jh=new ArrayList<>();
	      jh.add("Ranchi");
	      jh.add("Bokaro");
	      
	Map<String,List<String>> india=new HashMap<>();
	    india.put("Maharashtra",mh);
	    india.put("Jharkhand", jh);
	    
	 Set<String> keys=india.keySet();
	 
	 System.out.println(keys);
	 
	 for(String key:keys)
	 {
		 System.out.println(key);
		 
		 List<String>list=india.get(key);
		 
		 for(String city:list)
		 {
			 System.out.println(city);
		 }
	 }
	 
System.out.println("********");
	Iterator<String>itr=keys.iterator();
	 while(itr.hasNext())
	 {
		 String list=itr.next();
		 
		 System.out.println(list);
		 
	   	 List<String>l1=india.get(list);
	 
	   Iterator<String> itr1=l1.iterator();
	   while(itr1.hasNext())
	   {
		   String lt=itr1.next();
		   System.out.println(lt);
	   }
	 }

	}

}
