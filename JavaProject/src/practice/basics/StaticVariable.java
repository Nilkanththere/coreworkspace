package practice.basics;

public class StaticVariable {
      final int rollno;//Globe constant 
     String name;//instance variable
     static String college="GPS";//static variable
     
     
     
     StaticVariable( int rollno,String name)//Parameterize constructor 
     { 
    	 this.rollno=rollno;
    	 this.name=name;
    	 
     }
     
     public void display()
     {
    	 
    	 String s="Welcome";//local variable
    	 
    	 System.out.println("Rollno:" +rollno+" Name:" +name+ "College:" +college);//concate tpye
     }
     
     
     public static void main(String[] args) {
		
	
     StaticVariable st=new  StaticVariable (10,"Akshay");//constructor object
     StaticVariable st1=new  StaticVariable (11,"Rakesh");
     StaticVariable st2=new  StaticVariable (12,"Neel");
     
           st.display();
           st1.display();
           st2.display();
     
     }
	
	
	
	
}
