package map;

import java.util.*;


	public class College1{	
	
public Map<String, List<Student1>> m1()
{
	Map<String, List<Student1>> eng=new HashMap<>();
	
	List<Student1> fe=new ArrayList<>();
	    
	Student1 s=new Student1();
    s.setRollno(9637);
    s.setName("Nikhil");
    
	Student1 s1=new Student1();
	        s1.setRollno(123);
	        s1.setName("Ashish");
	        
	  fe.add(s);
	  fe.add(s1);
	  
	  List<Student1> se=new ArrayList<>();
	  Student1 s2=new Student1();
	          s2.setRollno(635);
	          s2.setName("Pavan");
	     
	  Student1 s3=new Student1();
	          s3.setRollno(512);
	          s3.setName("Akash");
	           
	     se.add(s2);
	     se.add(s3);
	    
eng.put("Student1",fe);
eng.put("Student2",se);

return eng;

}
public static void main(String[] args) {
	
	College1 c=new College1();
Map<String, List<Student1>> data=c.m1();
	   Set<String>keys=data.keySet();
	   System.out.println(keys);
	   
System.out.println("*****Iterator Use*****");   
	 Iterator<String>itr=keys.iterator(); 
	   
	 while(itr.hasNext())
	 {
		 String i=itr.next();
		 System.out.println(i);
		 
		 List list=(List)data.get(i);
	
		 
		 Iterator<Student1> itr1=list.iterator();
		 while(itr1.hasNext())
		 {
			 Student1 stu=itr1.next();
			 
			 System.out.println(stu.getRollno());
			 System.out.println(stu.getName());
		 }
	 }
	   
	 System.out.println("******For each Loop****");
	   for(String key:keys)
	   {
		System.out.println(key);
		
		List<Student1>list=data.get(key);
		
		for(Student1 stu:list)
		{
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
		}
		   
	   }
}
	}
		 
	   
	   
	    

