package setdatastructure;

import java.util.*;

public class Task2 {

	public static void main(String[] args) {
		
		
		List<Double>l=new ArrayList<>();
		  l.add(20.20);
          l.add(34.1);
          l.add(26.23);
          l.add(10d);
          l.add(20.20);
          l.add(45d);
          l.add(26.23);
          l.add(48d);
          l.add(10d);
          l.add(45d);
          l.add(54d);
          l.add(89d);
          l.add(20d);
    
          System.out.println(l);
          
          Set<Double>s=new LinkedHashSet<>(l);
          System.out.println(s);
	}

}
