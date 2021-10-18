package setdatastructure;

import java.util.*;

public class Task3 {

	public static void main(String[] args) {
		//[20, 34, 26, 10, 20, 45, 26, 48, 10, 45, 54, 89, 20]
		 
		List<Integer>l=new ArrayList<>();
		            l.add(20);
		            l.add(34);
		            l.add(26);
		            l.add(10);
		            l.add(20);
		            l.add(45);
		            l.add(10);
		            l.add(45);
		            l.add(54);
		            l.add(89);
		            l.add(20);
		            
		   Set<Integer>s=new LinkedHashSet<>(l);
		   System.out.println(s);
		               
		      
   
	}

}
