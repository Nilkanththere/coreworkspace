package collectionframework;

import java.util.*;

public class ListunderList {

	public static void main(String[] args) {
	
		List mh=new ArrayList();
		
		     mh.add("pune");
		     mh.add("mumbai");
		     
        List jh=new ArrayList();
             jh.add("Ranchi");
             jh.add("Bokaro");
             jh.add("jamshedpur");
             
        List india=new ArrayList();
             india.add(mh);
             india.add(jh);
             
             Iterator itr=india.iterator();
             
             System.out.println(india);
             
             while(itr.hasNext())
             {
            	 List l=(List)itr.next();
            	 System.out.println(l);
            	 
            	 Iterator itr1=l.iterator();
            	 
            	 while(itr1.hasNext())
            	 {
            		 String s=(String)itr1.next();
            		 System.out.println(s);
            	 }
             }
	}

}
