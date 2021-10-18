package setdatastructure;

import java.util.*;

public class A {

	public static void main(String[] args) {
		
		List<String>l=new ArrayList<>();
		         l.add("Abc");
                 l.add("ABC");
                 l.add("Abc");
                 l.add("ABC");
                 l.add("ABc");
                 l.add("Abc");
                 l.add("ABC");
                 
                 Set<String>s=new HashSet<>(l);
                    
                 System.out.println(s);

	}
}
