package genricEXP;

import java.util.*;

public class EX1 {

	public static void main(String[] args) {
		
		
		List<Integer>l=new ArrayList();
		 
		 l.add(5);
		 l.add(20);
		 l.add(20);
		 
		 Iterator<Integer>itr=l.iterator();
		 
		 while(itr.hasNext())
		 {
			 int x=itr.next();
			 System.out.println(x);
		 }
		 
	}

}
