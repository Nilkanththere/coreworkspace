package exception;

import java.io.IOException;
import java.nio.charset.MalformedInputException;

public class Uncheckedexception2k {

	public void m1()
	{
		System.out.println("m1----Uncheck");
		
		Demouncheckexp d=new Demouncheckexp();
	
		try
		{
			d.m2();
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("catch----block");
			System.out.println("m1-----end");
		}
	}
	public static void main(String args[])throws IOException 
	{
		System.out.println("main------start");
		
		 Uncheckedexception2k u=new  Uncheckedexception2k();
		       u.m1();
		       System.out.println("main END");
		
	}
	}
	

