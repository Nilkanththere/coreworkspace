package setdatastructure;
import java.util.*;
public class Task8gen {
	
	public static void main(String args[])
	{
	List<String> MH=new ArrayList<>();
	      MH.add("Pune");
	       MH.add("Mumbai");
			    
	  List<String> JH=new ArrayList<>();
	      JH.add("Ranchi");
	      JH.add("Ranchi");
			    
	Set<List<String>> INDIA=new HashSet<>();
	    INDIA.add(MH);
	    INDIA.add(JH);



	Iterator<List<String>> itr=INDIA.iterator();
	     while(itr.hasNext())
	{
	      List l1=itr.next();

	Iterator<String> itr1=l1.iterator();
	while(itr1.hasNext())
	{		      
	  String st=itr1.next();
			    	
	  System.out.println(st);
	 }
			    	
	}


	}
	}














