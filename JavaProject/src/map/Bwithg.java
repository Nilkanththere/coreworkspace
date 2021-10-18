package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Bwithg {

	public static void main(String[] args) {
		Map<String,String> m=new HashMap<>();
        m.put("aa","abc");
        m.put("bb", "pqr");
        m.put("cc", "xyz");
        
   Set<String> keys=m.keySet();
     
   System.out.println(keys);
   
  Iterator<String> itr=keys.iterator();
  
   while(itr.hasNext())
   {
	   String s=itr.next();
	   System.out.println(s);
	   
	   String val=(String)m.get(s);
	   
	   System.out.println(val);
   }
   
  System.out.println("*****For Each Loop*****");
  
   for(String ss:keys)
   { 
	   System.out.println(ss);
	  String sss=m.get(ss);
	  
	  System.out.println(sss);
   }

	}

}
