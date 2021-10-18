package collectionframework;

import java.util.*;

public class IndiaList {

	
	public static void main(String[] args) {
		
		
		
		List Mah=new ArrayList();
		
		     Mah.add("Nagpur");
		     Mah.add("Mumbai");
		     Mah.add("Nashik");
		     
		 List Guj=new ArrayList() ;
		      Guj.add("Surat");
		      Guj.add("Gandhinagar");
		      Guj.add("Ahemdabad");
		    
		 List Raj=new ArrayList();
		      Raj.add("Jaipur");
		      Raj.add("Kota");
		      Raj.add("Jodhpur");
		      
		 List MP=new ArrayList();
		 
		   MP.add("Bhopal");
		   MP.add("Jabalpur");
		   MP.add("Raipur");
		   
	List india =new ArrayList();
	     india.add(Mah);
	     india.add(Guj);
	     india.add(Raj);
	     india.add(MP);
	     
	     
	   Iterator itr=india.iterator();
	    
	   while(itr.hasNext())
	   {
		   List l=(List)itr.next();
		   
		   Iterator itr1=l.iterator();
		   
		   while(itr1.hasNext())
		   {
		   String s=(String)itr1.next();
		   
		   System.out.println(s);
		   
				   
	   }
	     
	     
	   }  
	     
		   
		   
		   
		   
	}
}
