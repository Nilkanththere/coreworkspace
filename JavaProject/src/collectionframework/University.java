package collectionframework;


import java.util.*;

public class University {

	public static void main(String[] args) {
		
      
		    
            College c=new College();
            List data=c.m1();
                 
            Iterator itr =data.iterator();
                  
              while(itr.hasNext())
                  {
            Student3 stu=(Student3)itr.next();
            System.out.println(stu.getRollno());
            System.out.println(stu.getName());
                  }
	}

}

