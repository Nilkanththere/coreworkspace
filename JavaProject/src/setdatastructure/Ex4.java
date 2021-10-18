package setdatastructure;

import java.util.*;

public class Ex4 {

	public static void main(String[] args) {
		
		List<Integer>l=new ArrayList<>();
		             l.add(4);
		             l.add(2);
		             l.add(5);
		             l.add(1);
		             l.add(3);
		             l.add(6);
		             
		   System.out.println(l);
		   
		   Set<Integer>s=new TreeSet<>(l);
		   
		   System.out.println(s);
		   

	}

}
