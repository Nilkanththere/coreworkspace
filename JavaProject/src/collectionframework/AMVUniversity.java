package collectionframework;



import java.util.*;

public class AMVUniversity {

	
	public void m1()
	{
		
		
		List student1=new ArrayList();
	    
		Student4 stu1=new Student4();
		
	     stu1.setRollno(1236);
	     stu1.setName("ashish");
	     stu1.setAddr("Pune");
	     
	     Student4 stu2=new Student4();
	        stu2.setRollno(123654);
	        stu2.setName("shivraj");
	        stu2.setAddr("Mumbai");
	        
	     Student4 stu3=new Student4();
	        stu3.setRollno(96371);
	        stu3.setName("Rakesh");
	        stu3.setAddr("Nagpur");
	        
	        List student2=new ArrayList();
	     Student4 stu4=new Student4();
			
		    stu4.setRollno(9874);
		    stu4.setName("Chetan");
		    stu4.setAddr("Mumbai");
		    
		 Student4 stu5=new Student4();
		    stu5.setRollno(9999);
		    stu5.setName("Raj");
		    stu5.setAddr("Mumbai");
	      
		    
		 Student4 stu6=new Student4();
		     stu6.setRollno(6397);
		     stu6.setName("Akash");
		     stu6.setAddr("Nagpur"); 
		     
	     List student3=new ArrayList();
		 Student4 stu7=new Student4();
				
		     stu7.setRollno(8888);
			 stu7.setName("Mukesh");
			 stu7.setAddr("Thane");
			 
		 Student4 stu8=new Student4();
		     stu8.setRollno(7777);
		     stu8.setName("Ajay");
		     stu8.setAddr("Hyderabad"); 
		     
		  Student4 stu9=new Student4();
		     stu9.setRollno(8523);
		     stu9.setName("Ankush");
		     stu9.setAddr("Pune");  
		     
		  student1.add(stu1);    
		  student1.add(stu2);    
		  student1.add(stu3); 
		
		  student2.add(stu4);    
		  student2.add(stu5);    
		  student2.add(stu6); 
		  
		  student3.add(stu7);    
		  student3.add(stu8);    
		  student3.add(stu9);    
		
		  
		  List GPamravati =new ArrayList();
    	  
	      GPamravati.add(student1);
	      
	      
	      List JDIET =new ArrayList();
	         
	         JDIET.add(student2);
	         
	       List BBNK =new ArrayList();
	             
	             BBNK.add(student3);
	      
	 List University=new ArrayList();
	      
	       University.add(GPamravati);
	       University.add(JDIET);
	       University.add(BBNK);
	       
	 
	   
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
				 
				  System.out.println("Student Roll no="+st.getRollno());
				  System.out.println("Student Name ="+st.getName());
				  System.out.println("Student Address="+st.getAddr());
				  
				  
			  }
					  
		  }
	  }
	   
	 
	}
	public static void main(String[] args) {
		    
		AMVUniversity am=new AMVUniversity();
		            am.m1();
	}
	
	
}
