package practice.basics;

public class Demo {

    public int m1()
    {
    	
    	System.out.println("method m1");
    	
    	
    	return 20;
  	
    }
    
    public double m2()
    {
    	System.out.println("method m2");
    	
    	return 10.9652f;
    }
    
    
	public static void main(String[] args) {
		
		
		   Demo d=new Demo();
		       Object x=d.m1();//widening implicite jvm 
		       System.out.println(x);
		       
		     float y=(float)d.m2();//narrow 
		   System.out.println(y);
		   
		
	}
	
	
	
}
