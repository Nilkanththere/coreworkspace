import java.util.*;


public class Collectionmethods {

	public static void main(String[] args) {
		
		
		
		
		List l=new ArrayList();
        l.add(12);
        l.add(10);
        l.add(20);
        l.add(20);
        l.add(15);
   System.out.println(l);

   System.out.println(l.get(0));
  System.out.println(l.get(1));
  
  System.out.println("Remove");
 // l.remove(2);
 // l.removeAll(l);
  
  
  System.out.println("Index");
  System.out.println(l.indexOf(12));
  System.out.println(l.indexOf(10));
  
  System.out.println(l.lastIndexOf(20));
  

  List l1= new ArrayList();
    l1.add("aaa");
    l1.add("bbb");
    l1.addAll(l);
  System.out.println(l1);
  
  System.out.println("contains");
  System.out.println(l1.contains("aaa"));
  System.out.println(l1.containsAll(l1));
  
  System.out.println("Set");
  System.out.println(l1.set(1, "xyz"));
  
  System.out.println("To String ");
  System.out.println(l1.toString());
  
  System.out.println("Size");
  System.out.println(l1.size());
  
  
  List l2=new ArrayList();
       l2.add("abc");
       l2.add("pqr");
       l2.add("xyz");
       l2.add("abc");

    System.out.println(l2);   
       
       
       

	}

}
