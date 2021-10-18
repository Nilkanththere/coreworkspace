package collectionframework;

import java.util.*;

public class JNUniversity {

	public static void main(String[] args) {
		
		
		
		
		 List<Comparable> s1=new ArrayList<Comparable>();
		       
		      s1.add(12365);
		      s1.add("Ashish");
		      s1.add("pune");
		      
		      s1.add(963);
		      s1.add("Ak");
		      s1.add("pune");
		      
		      s1.add(5555);
		      s1.add("Ash");
		      s1.add("pune");
		      
		 List<Comparable> s2=new ArrayList<Comparable>();
		      s2.add(56321);
		      s2.add("shiv");
		      s2.add("Mumbai");
		      
		      s2.add(8888);
		      s2.add("rock");
		      s2.add("Mumbai");

		      s2.add(9999);
		      s2.add("loki");
		      s2.add("Mumbai");

		   
		  List<Comparable> s3=new ArrayList<Comparable>();
		       s3.add(56314);
		       s3.add("Rakesh");
		       s3.add("Thane");
		       
		       s3.add(8547);
		       s3.add("Rash");
		       s3.add("Thane");
		       
		       s3.add(63247899);
		       s3.add("Ruh");
		       s3.add("pune");
		       
		       
		   List<List<Comparable>> YCC=new ArrayList<List<Comparable>>();
		        YCC.add(s1);
		        
		   List<List<Comparable>> JDD=new ArrayList<List<Comparable>>();
		        JDD.add(s2);
		        
		   List<List<Comparable>> NBK=new ArrayList<List<Comparable>>();
		   
		        NBK.add(s3);
		        
		        
		List<List<List<Comparable>>> SGBAU= new ArrayList<List<List<Comparable>>>();
		      SGBAU.add(YCC);
		      SGBAU.add(JDD);
		      SGBAU.add(NBK);
		      
		      System.out.println(SGBAU);
		      
		      Iterator<List<List<Comparable>>> itr =SGBAU.iterator();
		        
		      while(itr.hasNext())
			  {
				  List l=itr.next();
				  System.out.println(l);
				  Iterator itr1=l.iterator();
				  
				  while(itr1.hasNext())
				  {
					  List l1=(List)itr1.next();
					  System.out.println(l1);
					  Iterator itr2=l1.iterator();
					
					  while(itr2.hasNext())
					  {
			 
		    	   List<List<Comparable>> x=itr.next();
		    	   System.out.println(x);
		    	   
		    	   List<List<Comparable>> y=itr.next();
		    	   System.out.println(y);
		    	   
		    	   List<List<Comparable>> z=itr.next();
		    	   System.out.println(z);
		       }
		    	   }
		        
		    	   }  
	}

}
