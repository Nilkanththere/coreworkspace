package setdatastructure;

import java.util.*;

public class Ex1 {

	public static void main(String[] args) {
		
		Set<Integer>s=new HashSet<>();
		            s.add(5);
		            s.add(3);
		            s.add(9);
		            s.add(3);
		            s.add(6);
		            s.add(1);
		            s.add(2);
		            
	System.out.println(s);
	
	Iterator<Integer>itr=s.iterator();
	
	while(itr.hasNext())
	{
		int x=itr.next();
		System.out.println(x);
	}

	System.out.println("for Each loop");
	for(int x:s)
	{
		System.out.println(x);
	}
	}

}
