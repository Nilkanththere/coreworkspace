package cjc;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> list=new ArrayList();
		           
		          list.add("Bhivraj");
		          list.add("Ashish");
		          list.add("Nell");
		          list.add("Rakesh");
		          
		      	ArrayList<Integer> list1=new ArrayList();
		           
		          list1.add(6);
		          list1.add(4);
		          list1.add(1);
		          list1.add(9);   
		          list1.add(3);   
		          list1.add(3);   
		          
		    System.out.println("before Sort"+list1);
		    
		    
		    Collections.sort(list1,Collections.reverseOrder());
		    
		    System.out.println("After reverseOrder "+list1);
		    
		    Collections.reverse(list1);
		    
		    
		    
		    System.out.println("After reverse"+list1);
		
		
              Collections.sort(list1);
		   
		    System.out.println("After sort"+list1);
		
		
 System.out.println("before Sort"+list);
		    
		    
		    Collections.sort(list,Collections.reverseOrder());
		    
		    System.out.println("After reverseOrder "+list);
		    
		    Collections.reverse(list);
		    
		    
		    
		    System.out.println("After reverse"+list);
		
		
              Collections.sort(list);
		   
		    System.out.println("After sort"+list);
		
		
		
		
	}

}
