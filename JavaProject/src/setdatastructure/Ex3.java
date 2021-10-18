package setdatastructure;

import java.util.*;

public class Ex3 {

	public static void main(String[] args) {
		
		List<String>l=new ArrayList<>();
		            l.add("aaa");
		            l.add("ddd");
		            l.add("ccc");
		            l.add("eee");
		            l.add("bbb");
		            l.add("ccc");
		            
       System.out.println(l);
       
       Set<String>s=new TreeSet<>(l);
       
       System.out.println(s);
       
      
       
	}

}
