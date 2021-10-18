package collectionframework;

import java.util.*;

public class College1 {
	
	
public static void main(String[] args) {
		
		
		
	
	List s16=new ArrayList(); 
	Student4 stu1=new Student4();
	
	     stu1.setRollno(1236);
	     stu1.setName("ashish");
	     stu1.setAddr("Pune");
	     s16.add(stu1);
	     
	     
	    
	     List s15=new ArrayList();
	       
   Student4 stu2=new Student4();
        stu2.setRollno(123654);
        stu2.setName("shivraj");
        stu2.setAddr("Mumbai");
        
        List s14=new ArrayList();
   Student4 stu3=new Student4();
        stu3.setRollno(96371);
        stu3.setName("Rakesh");
        stu3.setAddr("Nagpur");
        
     List GPamravati=new ArrayList();
        
        GPamravati.add(s16);
        GPamravati.add(s15);
        GPamravati.add(s14);
        
        
          
        

        List s13=new ArrayList(); 
 Student4 stu4=new Student4();
		
	     stu4.setRollno(9874);
	     stu4.setName("Chetan");
	     stu4.setAddr("Mumbai");
	     s13.add(stu4);
	     
  List s123=new ArrayList(); 
  
  Student4 stu5=new Student4();
       stu5.setRollno(9999);
       stu5.setName("Raj");
       stu5.setAddr("Mumbai");
       s123.add(stu5);
       List s12=new ArrayList();
       
  Student4 stu6=new Student4();
       stu6.setRollno(6397);
       stu6.setName("Akash");
       stu6.setAddr("Nagpur");
       s12.add(stu6);
  List JDIET=new ArrayList();
       
       JDIET.add(s13);
       JDIET.add(s123);
       JDIET.add(s12);
       
    
       
       List s1=new ArrayList(); 
      Student4 stu7=new Student4();
		
	  stu7.setRollno(8888);
	  stu7.setName("Mukesh");
	  stu7.setAddr("Thane");
	  s1.add(stu7);
	  
	  List s2=new ArrayList();  
      Student4 stu8=new Student4();
      stu8.setRollno(7777);
      stu8.setName("Ajay");
      stu8.setAddr("Hyderabad");
          s2.add(stu8);
    List s3=new ArrayList();  
    Student4 stu9=new Student4();
      stu9.setRollno(8523);
      stu9.setName("Ankush");
      stu9.setAddr("Pune");
	 s3.add(stu9);
	
List BBNK=new ArrayList();
      
     BBNK.add(s1);
     BBNK.add(s2);
     BBNK.add(s3);
	
     
	
     List AmravatiUniversity=new ArrayList();
          AmravatiUniversity.add(GPamravati);
          AmravatiUniversity.add(JDIET); 
          AmravatiUniversity.add(BBNK);
	Iterator itr=AmravatiUniversity.iterator();
	   
	while(itr.hasNext())
	{
		  
		List l=(List)itr.next();
		  
		  Iterator it1=l.iterator();
		  
		  while(it1.hasNext())
		  {	 
			  List l1=(List)it1.next();

			  Iterator itr1=l1.iterator();

			  while(itr1.hasNext())
			  { 
				  
			  
		Student4 st=(Student4)itr.next();
			 
		System.out.println(st.getRollno());
		System.out.println(st.getName());
		System.out.println(st.getAddr());
	
			  }


			  }
}

}
}





