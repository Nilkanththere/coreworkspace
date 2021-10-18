package genricEXP;



import java.util.*;

public class IndiaList {

	
	public static void main(String[] args) {
		
		
		
		List<String> Mah=new ArrayList<String>();
		
		     Mah.add("Nagpur");
		     Mah.add("Mumbai");
		     Mah.add("Nashik");
		     
		 List<String> Guj=new ArrayList<String>() ;
		      Guj.add("Surat");
		      Guj.add("Gandhinagar");
		      Guj.add("Ahemdabad");
		    
		 List<String> Raj=new ArrayList<String>();
		      Raj.add("Jaipur");
		      Raj.add("Kota");
		      Raj.add("Jodhpur");
		      
		 List<String> MP=new ArrayList<String>();
		 
		   MP.add("Bhopal");
		   MP.add("Jabalpur");
		   MP.add("Raipur");
		   
	List<List<String>> india =new ArrayList<List<String>>();
	     india.add(Mah);
	     india.add(Guj);
	     india.add(Raj);
	     india.add(MP);
	     
	     
	   Iterator<List<String>> itr=india.iterator();
	    
	   while(itr.hasNext())
	   {
		   List l=itr.next();
		   
		   Iterator<String> itr1=l.iterator();
		   
		   String s=itr1.next();
		   
		   System.out.println(s);
		   
				   
	   }
	     
	     
	     
	     
		   
		   
		   
		   
	}
}
