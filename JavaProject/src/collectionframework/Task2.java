package collectionframework;

import java.util.*;

public class Task2 {

	public static void main(String[] args) {
		
		List s=new ArrayList();
		     
		     s.add("abs");
		     s.add("pqr");
		     s.add("xyz");
		     s.add("qpe");
		     s.add("qoen");
		     System.out.println(s);
		     Iterator itr=s.iterator();
		     
		     while(itr.hasNext())
		     {
		    	 String x=(String)itr.next();
		    	 System.out.println(x);
		     }

	}

}
