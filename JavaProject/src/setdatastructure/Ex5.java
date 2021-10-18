package setdatastructure;

import java.util.*;

public class Ex5 {

	public static void main(String[] args) {
		
		List<Integer>l=new ArrayList<>();
                     l.add(5);
                     l.add(4);
                     l.add(6);
                     l.add(1);
                     l.add(2);
                     l.add(3);
                     l.add(2);
        System.out.println(l);
        
        System.out.println("Hashset-----duplicate Remove and order get Randomly");
        Set<Integer>l5=new HashSet<>(l);
        System.out.println(l5);
        
        
        System.out.println("LinkedHashset-----duplicate Remove and insertion order follow ");
        Set<Integer>l2=new LinkedHashSet(l);
        System.out.println(l2);
        
        System.out.println("Duplicate Remove and Sort Assending Order ");
        Set<Integer>l1=new TreeSet<>(l);
        System.out.println(l1);
        
        System.out.println("Collections duplicate Element present and Asending order");
        Collections.sort(l);
        System.out.println(l);
	}

}
