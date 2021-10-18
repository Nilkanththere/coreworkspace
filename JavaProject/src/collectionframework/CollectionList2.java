package collectionframework;

import java.util.Iterator;
import java.util.*;

public class CollectionList2 {

	public static void main(String[] args) {
		
		
		List l=new ArrayList();
		     l.add(7);
		     l.add(30);
		     l.add(15);
		     l.add(5);
		     
		     System.out.println(l);
		     
		     Iterator itr=l.iterator();
		     
		     while(itr.hasNext())
		     {
		    	 int x=(int)itr.next();
		    	 System.out.println(x);
		    	 
		     }
		     
	}
}
