package genricEXP;

import java.util.*;

public class WorldList {

	public static void main(String[] args) {
		  
		 List MH= new ArrayList();
		      MH.add("Nagpur");
		      MH.add("Nashik");
		      
		  List JH=new ArrayList();
		       JH.add("Bokaro");
		       JH.add("Ranchi");
		       
		 List India=new  ArrayList();
		      India.add(MH);
		      India.add(JH);
		      
		   List california=new ArrayList();
		         california.add("Los angeles");
		         california.add("San francisco");
		   
		   List Texas=new ArrayList();
		        Texas.add("Houston");
		        Texas.add("Austin");
		        
		  
		  List USA =new ArrayList();
		       USA.add(california);
		       USA.add(Texas);
		    
		       List World=new ArrayList();
		            World.add(India);
		            World.add(USA);
		       
		       
		 /* Iterator itr=World.iterator();
		         
		  while(itr.hasNext())
		  {
			  List l=(List)itr.next();
			  
			  Iterator itr1=l.iterator();
			  
			  while(itr1.hasNext())
			  {
				  List l2=(List)itr1.next();
				  
				  Iterator itr2=l2.iterator();
				  
				  while(itr2.hasNext())
				  {
					  String st=(String)itr2.next();
					  
					  System.out.println(st);
				  }
				  
				  
				  
				  
			  }
			  
		  }*/
		            
		 
		            

	}

}
