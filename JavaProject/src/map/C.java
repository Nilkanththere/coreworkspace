package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class C {

	public static void main(String[] args) {

		Map<Integer,String> m=new HashMap<>();
		    
		     m.put(1,"abc");
		     m.put(2,"pqr");
		     m.put(3, "xyz");
		     
		      Set<Integer> keys=m.keySet();
		      
		      System.out.println(keys);
		      
		      for(int k1:keys)
		      {
		    	  System.out.println(k1);
		        
		    	  String val=m.get(k1);
		    	  
		    	  System.out.println(val);
		      
		      }
		      
		      Iterator itr=keys.iterator();
		       while(itr.hasNext())
		       {
		    	   
		       }
		      
		      
		      

	}

}
