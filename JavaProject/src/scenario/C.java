package scenario;

import java.io.FileNotFoundException;
import java.io.IOException;

public class C {

	//Scenario-1 uncheck Exception
		public void m1()
		{
			System.out.println("m1------C");
		}
		
		//for check Exception
		
		public void m2()throws IOException//compulsory to write throws exception
		{
			System.out.println("m2------C");
		}
		
	//scenario -2	method calling with overriding unchecked Exception
		
		public void m3()
		{
			System.out.println("m13------C");
		}
		
		
		public void m4()throws Exception 
		{
			System.out.println("m13------C");
		}
		
		
		
		
		public void m5()throws ArithmeticException
		{
			System.out.println("m13------C");
		}
		
		
		
		
		
		
	
		//scenario -3 Method  for Check Exception
		
		public void m6()
		{	
		
		}
		
		public void m7()throws ArithmeticException
		{	
		
		}
	
		public void m8()throws IOException 
		{	
		
		}
		
		
		public void m9()throws Exception
		{
			
		}
		
		//Scenario 4-   For  Uncheck exception constructor
		
		public C() throws Exception 
		{
			System.out.println("m1------C");
		}
		
		public C(int i)  
		{
			System.out.println("m1------C");
		}
		
		
		public C(String  i)  throws ArithmeticException 
		{
			System.out.println("m1------C");
		}
		
		//For check Exception constructor 
		
		public C(int i,String s)throws IOException 
		{
			
		}
		
		public C(int i,String s,int y)throws IOException 
		{
			
		}
		
		public C(int i,String s,int y,char o)throws FileNotFoundException 
		{
			
		}
		
		
		
}
