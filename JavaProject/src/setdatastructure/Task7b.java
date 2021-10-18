package setdatastructure;


import java.util.*;


public class Task7b {

	public static void main(String[] args) {
		
		Set<String> MH=new HashSet<String>();
		    MH.add("Pune");
		    MH.add("Mumbai");
		    
		    
		Set<String> JH=new HashSet<String>();
		    JH.add("Ranchi");
		    JH.add("Ranchi");
		    
	    Set<Set<String>> INDIA=new HashSet<Set<String>>();
		    INDIA.add(MH);
		    INDIA.add(JH);
		    
		    System.out.println(INDIA);
		    
		    Iterator<Set<String>> itr=INDIA.iterator();
		       
		    while(itr.hasNext())
		    {
		    	Set s=itr.next();
		    	
		    	Iterator<String> itr1=s.iterator();
		    	
		    while(itr1.hasNext())
		    {
		    	String st=itr1.next();
		    	
		    	System.out.println(st);
		    }
		    	
		    }
		    for(Set<String>s1:INDIA)
		    {
		    	for(String st:s1)
		    	{
		    		System.out.println(st);
		    	}
		    }
	}

}