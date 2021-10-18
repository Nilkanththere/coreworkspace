package collection.practice;

import java.util.*  ;



public class Map {

	public static void main(String[] args) {
	
		List l=new ArrayList();
		     l.add("Chandrapur");
		     l.add("Warora");
		     l.add("Bhadravati");
		     
		 List ds=new ArrayList();
		       ds.add(l);
		    
		      
		Set mh=new HashSet();
		    mh.add(ds);
		 
	  
		  
		
		  Iterator itr=mh.iterator();
		  while(itr.hasNext())
		  {
			  List s=(List)itr.next();
			  System.out.println(s);
			  
			  Iterator itr1=s.iterator();
			  while(itr1.hasNext())
			  {
				  List l1=(List)itr1.next();
				  
				  Iterator itr2=l1.iterator();
				  while(itr2.hasNext())
				  {
					  String ss=(String)itr2.next();
					  System.out.println(ss);
				  }
				  
			  }
		  }
		   
		    
		      

	}

}
