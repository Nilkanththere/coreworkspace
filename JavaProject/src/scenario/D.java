package scenario;

import java.io.*;

public class D extends C{

	
	
	public void m1()throws ArithmeticException
	{
	     System.out.println("child m1 method");
	}
	
	
	
	
	
	
	
	
	
	
	
	public void m3()throws ArithmeticException
	{
		System.out.println("m1------C");
	}
	
	
	
	
	
	
	public void m4()throws ArithmeticException//nullpionter,array index etc,FileNotFoundException
	{
		System.out.println("m4----override");
	}
	
	
	public void m5()throws ClassNotFoundException
	{
		System.out.println("m1----override");
	}
	
	
	
	
	//scenario -3 Method  for Check Exception
	
	public void m6()throws ArithmeticException 
	{	
	
	}
	
	public void m7()throws ClassNotFoundException 
	{	
	
	}
	
	public void m8()throws ArithmeticException  
	{	
	
	}
	
	
	
	public void m9()throws ClassNotFoundException 
	{
		
	}
	
	//Scenario 4-   For Uncheck exception  constructor
	
	public D() throws Exception,ArithmeticException,ClassNotFoundException
	{
		System.out.println("m1------C");
	}
	
	public D(int i) throws Exception,Throwable,ArithmeticException
	{
		System.out.println("m1------C");
	}
	
	
	public D(String  i) throws Exception ,ArithmeticException
	{
		System.out.println("m1------C");
	}
	
	
	//For check Exception constructor 
	
	public D(int i,String s)throws FileNotFoundException 
	{
		
	}
	
	public D(int i,String s,int y)throws Exception 
	{
		
	}
	
	public D(int i,String s,int y,char o)throws Exception  ,IOException
	{
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
