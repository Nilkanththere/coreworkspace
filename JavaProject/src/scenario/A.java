package scenario;

import java.io.FileNotFoundException;
import java.io.IOException;

public class A {

	public void m1()throws ArithmeticException 
	{
	System.out.println("m1----start");
	    
	     int x=20/0;
	 System.out.println(x);
	 System.out.println("m1-----end");
	}

	public void m3()
	{
	System.out.println("m3-----start");
	int a=10/0;
	System.out.println(a);
	System.out.println("m3------end");
	}

	public void m5()throws ArithmeticException
	{
	System.out.println("m5------Start");
	int s=50/0;
	System.out.println(s);
	System.out.println("m5--------end");
	}

	public void m7()throws Exception
	{
	System.out.println("m7------Start");
	int k=5/0;
	System.out.println(k);
	System.out.println("m7-------end");
	}
	
	
	
	
	
	
	
	public void m9()throws ArithmeticException
	{
	System.out.println("m9-----start");
	int h=30/0;
	System.out.println(h);
	System.out.println("m9--------end");
	}
	
	public void m10()
	{
		System.out.println("m10------------");
	}
	


   public void  show()throws FileNotFoundException
   {
	   System.out.println("show method parent class");
	   
	   
   }



}

