package genricEXP;

import java.util.*;

public class Test {

	
	public List<Student>m1()
	{
	
	
	List<Student>l=new ArrayList<>();
	
	
	 Student s1=new Student();
	          s1.setRollno(123);
	          s1.setName("abc");
	          
	 Student s2=new Student();
	         s2.setRollno(5931);
	         s2.setName("xyz");
	         
	         l.add(s1);
	         l.add(s2);
	         
	         return l;
	}
	public static void main(String[] args) {
		
		Test t=new Test();
		
		List<Student>l=t.m1();
		
		for(Student stu:l)
		{
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
			
			
			
		}
	}
}
	 
	      

