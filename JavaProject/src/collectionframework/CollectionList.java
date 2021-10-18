package collectionframework;

import java.util.*;

public class CollectionList {

	public static void main(String[] args) {
		
		
		List l=new ArrayList();
             l.add(5);
             l.add(30);
             l.add(30);
             l.add(15);
             l.add("abc");
             System.out.println(l);
             
             int x=(int)l.get(2);
             System.out.println(x);
             
             String s=(String)l.get(4);
             System.out.println(s);
	}

}
