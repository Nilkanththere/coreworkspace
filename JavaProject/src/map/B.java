package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class B {

	public static void main(String[] args) {
		
		
		Map<String,String>m=new HashMap<>();
		                 m.put("aa","abc");
		                 m.put("bb", "pqr");
		                 m.put("cc", "xyz");
		                 
		            Set<String>keys=m.keySet();
		              
		            System.out.println(keys);
		            
		            for(String key:keys)
		            {
		            	
		            	System.out.println(key);
		            	
		            	String val=m.get(key);
		            	System.out.println(val);
		            }
		            System.out.println("**Iterator Use*****");
		            
		            Iterator itr=keys.iterator();
				       while(itr.hasNext())
				       {
				    	   String k=(String)itr.next();
				    	   System.out.println(k);
				    	   
				    	   String val=(String)m.get(k);
				    	   System.out.println(val);
				       }
		            
		            
		            
		            
		            
		            

	}

}
