package scenario;

import java.io.FileNotFoundException;
import java.io.IOException;

public class B  extends A{
	public void m1()throws  ArithmeticException 
	{
	  System.out.println("m1-----@override----start");
	  int x=20/0;
	  System.out.println(x);
	// e.printStackTrace();
	System.out.println("m1-----@override----end");
	}


	public void m3()
	{
	  System.out.println("m3-----@override----start");
	  int a=10/0;
	  System.out.println(a);
	 // e.printStackTrace();
	  System.out.println("m3-----@override----end");
	}

	public void m5()throws ArithmeticException 
	{
	  System.out.println("m5-----@override----start");
	   int s=50/0;
	   System.out.println(s);
	   //e.printStackTrace();
	   System.out.println("m5-----@override----end");
	}

	public void m7()throws ArithmeticException 
	{
	System.out.println("m7-----@override----start");
	   int k=5/0;
	   System.out.println(k);
	   //e.printStackTrace();
	   System.out.println("m7-----@override----end");

	}

	public void m9()throws Exception 
	{
	System.out.println("m9-----@override----start");
	   int h=30/0;
	   System.out.println(h);
	  // e.printStackTrace();
	   System.out.println("m9-----@override----end");

	}

	
	public void m10()throws ArithmeticException 
	{
		System.out.println("m10---");
	}
	
	
	
	
	
	
	public void show()throws IOException
	{
		System.out.println("override parent class method");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	     public static void main(String args[]) 
	     {
	    	 System.out.println("main-----start");
	        B b=new B();
	        
	          b.m1();
	          b.m3();
	          try {
				b.m10();
			} catch (ArithmeticException  e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	         // b.m5();
	         // b.m7();
	          //b.m9();
	          System.out.println("main----end");
	}
	      
	}




