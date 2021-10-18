package setdatastructure;

import java.util.*;

public class College {
 
	public Set<Student1>m1()
	{
		 Set<Student1> fe=new HashSet<>();
		Student1 stu=new Student1();
		        stu.setRollno(123);
		        stu.setName("Akash");
		       
		        fe.add(stu);
		        
		  Student1 stu1=new Student1();
		          stu1.setRollno(963);
		          stu1.setName("Rakesh");
                 fe.add(stu1);
        
           return fe;      
	}
}
