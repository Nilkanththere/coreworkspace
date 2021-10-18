package coparator;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		
		Student s1=new Student();
		    
		        s1.setRollno(2);
		        s1.setName("ccc");
		        
		 Student s2=new Student();
			    
		        s2.setRollno(3);
		        s2.setName("bbb");
		        
		 Student s3=new Student();
			    
		        s3.setRollno(1);
		        s3.setName("aaa");
		        
		        
		   Set<Student>  sset=null;
		   
		   Scanner sc=new Scanner(System.in);
		   
		   System.out.println("-----select----\n"+
		                      "1.Roll No Sort\n"+
				              "2.Name Sort");
		   
		   
		   int ch=sc.nextInt();
		   
		   if(ch==1)
		   {
			   sset=new TreeSet<>(new Rollnosort());
			    
		   }
		   else if(ch==2)
		   {
			   sset=new TreeSet<>(new Namesort());
		   }
		   
		  sset.add(s1);
		  sset.add(s2);
		  sset.add(s3);
		   
		 for(Student stu:sset)
		 {
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
		 }
		   
		   
		   
	}

}
