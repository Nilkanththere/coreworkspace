package collectionframework;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		
		List liststu=new ArrayList();
		
		Student1 s1=new Student1();
		         s1.setRollno(11222);
		         s1.setName("Shiv");
		  liststu.add(s1);
		  
		  s1=new Student1();
		  s1.setRollno(25631);
		  s1.setName("ashish");
		  liststu.add(s1);
		  
		  Iterator itr=liststu.iterator();
		  
			while(itr.hasNext()) 
			{
				Student1 stu=(Student1)itr.next();
				System.out.println(stu.getRollno());
				System.out.println(stu.getName());
			}
		  
		  
	}
}
