package setdatastructure;

import java.util.*;

public class Task7 {

	public static void main(String[] args) {
		
		Set MH=new HashSet();
		    MH.add("Pune");
		    MH.add("Mumbai");
		    
		    
		Set JH=new HashSet();
		    JH.add("Ranchi");
		    JH.add("Bokaro");
		    JH.add("Ranchi");
		    
	    Set INDIA=new HashSet();
		    INDIA.add(MH);
		    INDIA.add(JH);
		    
		    System.out.println(INDIA);
		    Iterator itr=INDIA.iterator();
		       
		    while(itr.hasNext())
		    {
		    	Set s=(Set)itr.next();
		    	
		    	Iterator itr1=s.iterator();
		    	
		    while(itr1.hasNext())
		    {
		    	String st=(String)itr1.next();
		    	
		    	System.out.println(st);
		    }
		    	
		    }
	}

}
