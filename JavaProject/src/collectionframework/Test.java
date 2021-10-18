package collectionframework;


import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		Student s1=new Student();
		        s1.setRollno(123);
		        s1.setName("abc");
		        
		        Student s2=new Student();
		           s2.setRollno(456);
		           s2.setName("xyz");
		           
		    List liststu=new ArrayList();
		            
		         liststu.add(s1);
		        liststu.add(s2);
		                
		    Iterator itr=liststu.iterator();//0-123  1-abc 2-456 3-xyz
		                
		        while(itr.hasNext())
		                {
		         Student stu=(Student)itr.next();
		         System.out.println(stu.getRollno());
		         System.out.println(stu.getName());
     }
	}
}