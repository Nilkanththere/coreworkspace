package coparator;

import java.util.Set;
import java.util.TreeSet;

public class Demo {
public static void main(String[] args) {
	
	TreeSet<String> t=new TreeSet<>(new Mycomaparator());
	   
	    t.add("A");
	    t.add("Z");
	    t.add("B");
	    t.add("A");
	    
	    System.out.println(t);
	 
	for(String st:t)
	{
		System.out.println(st);
	}
	        
	    
	    
}
}
