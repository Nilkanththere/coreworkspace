package collectionframework;

import java.util.*;


public class AmravatiUniversity {
	
	
public void m1()
{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("******Enter no.of Student Details data here******");
	    int no=sc.nextInt();
	    
	    List student1=new ArrayList();
	    
	    for(int i=0;i<=no;i++)
	    {
	    	System.out.println("Enter student Rollno"+i);
	    	int a=sc.nextInt();
	    	System.out.println("Enter student Name"+i);
	    	String b=sc.next();
	    	System.out.println("Enter Student Address"+i);
	    	String c=sc.next();
	    	
	    	
	    	Student4 stu1=new Student4();
	    	         stu1.setRollno(a);
	    	         stu1.setName(b);
	    	         stu1.setAddr(c);
	    	         
	    	   student1.add(stu1);
	    	   
	    	   
	    	   
	    	 List College =new ArrayList();
	    	  
	    	      College.add(student1);
	    	      
	    	 List University=new ArrayList();
	    	      
	    	       University.add(College);
	    	   
	    	   
	    	  Iterator itr=University.iterator();
	    	        
	    	  while(itr.hasNext())
	    	  {
	    		  List l=(List)itr.next();
	    		  
	    		  Iterator itr1=l.iterator();
	    		  
	    		  while(itr1.hasNext())
	    		  {
	    			  List l1=(List)itr1.next();
	    			  
	    			  Iterator itr2=l1.iterator();
		    			
	    			  while(itr2.hasNext())
	    			  {
	    				  Student4 st=(Student4)itr2.next();
	    				  
	    				  System.out.println("student Rollno="+st.getRollno());
	    				  System.out.println("student Name ="+st.getName());
	    				  System.out.println("Student Address="+st.getAddr());
	    				  
	    				  
	    			  }
	    					  
	    		  }
	    	  }
	    	   
	    	   
	    	   
	    	         
	    	         
	    	         
	    }
	    
}
    public static void main(String[] args) {
	
	      AmravatiUniversity am=new AmravatiUniversity();
	                         am.m1();
}
}

	
	
	
	
	
	
	
	

	
		         
		         

	


