package genricEXP;

import java.util.*;

public class WorldList2 {

	public static void main(String[] args) {
		  
		 List<String> MH= new ArrayList<String>();
		      MH.add("Nagpur");
		      MH.add("Nashik");
		      
		  List<String> JH=new ArrayList<String>();
		       JH.add("Bokaro");
		       JH.add("Ranchi");
		       
		 List<List<String>> India=new  ArrayList<List<String>>();
		      India.add(MH);
		      India.add(JH);
		      
		   List<String> california=new ArrayList<String>();
		         california.add("Los angeles");
		         california.add("San francisco");
		   
		   List<String> Texas=new ArrayList<String>();
		        Texas.add("Houston");
		        Texas.add("Austin");
		        
		  
		  List<List<String>> USA =new ArrayList<List<String>>();
		       USA.add(california);
		       USA.add(Texas);
		    
		       List<List<List<String>>> World=new ArrayList<List<List<String>>>();
		            World.add(India);
		            World.add(USA);
		       
		       
		  Iterator<List<List<String>>> itr=World.iterator();
		         
		  while(itr.hasNext())
		  {
			  List l=itr.next();
			  
			  Iterator<List<String>> itr1=l.iterator();
			  
			  while(itr1.hasNext())
			  {
				  List l2=itr1.next();
				  
				  Iterator<String> itr2=l2.iterator();
				  
				  while(itr2.hasNext())
				  {
					  String st=itr2.next();
					  
					  System.out.println(st);
				  }
				  
				  
				  
				  
			  }
			  
		  }
		  
   System.out.println("******For Each Loop******");
	for(List<List<String>>data:World)
	{
		for(List<String>data1:data)
		{
			for(String data2:data1)
			{
				System.out.println(data2);
			}
		}
	}
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		            
		          

	}

}
