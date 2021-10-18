package map;

import java.util.*;

public class College {

	public Map m1()
	{
		Map eng=new HashMap();
		
		List fe=new ArrayList();
		    
		Student s=new Student();
        s.setRollno(9637);
        s.setName("Nikhil");
        
		Student s1=new Student();
		        s1.setRollno(123);
		        s1.setName("Ashish");
		        
		  fe.add(s1);
		  fe.add(s);
		  List se=new ArrayList();
		  Student s2=new Student();
		          s2.setRollno(635);
		          s2.setName("Pavan");
		     
		  Student s3=new Student();
		          s3.setRollno(512);
		          s3.setName("Akash");
		           
		     se.add(s2);
		     se.add(s3);
		    
	eng.put("Student",fe);
	eng.put("Student1",se);
	
	return eng;
	
	}
	public static void main(String[] args) {
		
		College c=new College();
		   Map data=c.m1();
		   Set keys=data.keySet();
		   
		 Iterator itr=keys.iterator(); 
		   
		 while(itr.hasNext())
		 {
			 String i=(String)itr.next();
			 System.out.println(i);
			 
			 List list=(List)data.get(i);
			 System.out.println(list);
			 Iterator itr1=list.iterator();
			 while(itr1.hasNext())
			 {
				 Student stu=(Student)itr1.next();
				 
				 System.out.println(stu.getRollno());
				 System.out.println(stu.getName());
			 }
			 
			 
		   
		   
		   
	}
		     
		     
		     
		     
		     
		     
		     
	}
}
