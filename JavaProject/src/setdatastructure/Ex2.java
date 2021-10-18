package setdatastructure;

import java.util.*;

public class Ex2 {

	public static void main(String[] args) {
		
		Set<Integer>s=new LinkedHashSet<>();
		
		           s.add(5);
		           s.add(3);
		           s.add(1);
		           s.add(2);
		           s.add(4);
		           s.add(6);
		           
		System.out.println(s);
		
		for(int x:s)
		{
			System.out.println(x);
		}

	}

}
