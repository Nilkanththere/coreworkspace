package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CwithoutG {

	public static void main(String[] args) {

		Map  m=new HashMap();
		    
		     m.put(1,"abc");
		     m.put(2,"pqr");
		     m.put(3, "xyz");
		     
		      Set keys=m.keySet();
		      
		      System.out.println(keys);
		      
		     Iterator itr=keys.iterator();
		     while(itr.hasNext())
		     {
		    	 int x=(int)itr.next();
		    	 System.out.println(x);
		    	 
		    	 String s=(String)m.get(x);
		    	 System.out.println(s);
		     }

	}



	}


