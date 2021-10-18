package map;

import java.util.*;

  public class WorldMapset {
	  public static void main(String[] args) {
		
	
	  List<String> MH=new ArrayList<String>();
	  
         MH.add("pune");
         MH.add("Mumbai");
     List<String> MP=new ArrayList<String>();
          MP.add("Bhopal");
          MP.add("Indore");
      
    Set<List<String>> India=new HashSet<List<String>>();
        India.add(MH);
        India.add(MP);

       
   List<String> state1=new ArrayList<String>();
        state1.add("city1");
        state1.add("city2");
       
   List<String>  state2=new ArrayList<String>();
         state2.add("city3");
         state2.add("city4");
        
    Set<List<String>> Japan=new HashSet<List<String>>();
        Japan.add(state1);
        Japan.add(state2);
        
      Map<String, Set<List<String>>> World =new HashMap<String, Set<List<String>>>();
          World.put("India",India);
          World.put("Japan", Japan);
      
          
       Set<String> keys=World.keySet();
       System.out.println(keys);
       
       Iterator<String> itr=keys.iterator();
       while(itr.hasNext())
       {
    	   String st=itr.next();
    	   System.out.println(st);
    	 
    	   
    	       Set stt1=World.get(st);
    	      // System.out.println(stt1);
    	    Iterator<List<String>> it1=stt1.iterator();
    	    while(it1.hasNext())
    	    {
    	    	List s1=(List)it1.next();
    	    	//System.out.println(s1);
    
    	    	Iterator<String> itr2=s1.iterator();
    	    	while(itr2.hasNext())
    	    	{
    	    		String stt=itr2.next();
    	    		System.out.println(stt);
    	    	}
    	    	
    	    }
    	    
       }
       
       //Set<String>keys1=World.keySet();
      // System.out.println(keys1);
      System.out.println("****For Ech Loop*******");
       for(String key:keys)
       {
    	   System.out.println(key);
    	 Set<List<String>>m=World.get(key);
    	 //System.out.println(m);
    	 for(List<String>l:m)
    	 {
    		 //System.out.println(l);
    		 for(String s:l)
    		 {
    			 System.out.println(s);
    		 }
    	 }
    	   
       }
          
          
          
          
          
          
          
          
          
          
          
    
	  }      
}
