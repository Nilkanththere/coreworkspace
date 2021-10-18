package genricEXP;


import java.util.*;

public class University {

	public static void main(String[] args) {
	
	
		College c=new College();
		  List<Student1>l=c.m1();
		        
		        Iterator<Student1>itr=l.iterator();
				
				while(itr.hasNext())
				{
					
					
					Student1 st=itr.next();
				
					System.out.println(st.getRollno());
					
					System.out.println(st.getName());
					
				}
		  //for each loop
		  
		  /*for(Student1 stu:l)
		  {
			  System.out.println(stu.getRollno());
			  System.out.println(stu.getName());
		  }*/
				}	

	}


