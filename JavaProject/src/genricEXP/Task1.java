package genricEXP;

import java.util.*;

public class Task1 {

	public static void main(String[] args) {
		
		
		
		List<Double>l=new ArrayList<>();
		
                 l.add(123.53);
                 l.add(20.5);
                 l.add(10.5);
                 
                 
          Iterator<Double>itr=l.iterator();
               
          while(itr.hasNext())
          {
        	  double d=itr.next();
        	  System.out.println(d);
          }
                         
	}

}
