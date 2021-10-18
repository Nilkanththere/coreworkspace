package setdatastructure;

import java.util.*;

public class University {

	public static void main(String[] args) {
		
		College c=new College();
		Set<Student1>data=c.m1();
         
		 Iterator<Student1> itr=data.iterator();
		 while(itr.hasNext())
		 {
			 Student1 st=itr.next();
			 System.out.println(st.getRollno());
			 System.out.println(st.getName());
		 }
	}

}
