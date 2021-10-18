package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import cjc.A;

public class Task1 {

	public void m1()throws  FileNotFoundException 
	{
		System.out.println("m1----start");
		m2();
		System.out.println("m1-----end");
	}
	public void m2()throws  FileNotFoundException 
	{
		System.out.println("m2----start");
		m3();
		System.out.println("m2----end");
	}
	public void m3() throws FileNotFoundException
	{
		FileReader f=new FileReader("abc.txt");
		  
	}
	public static void main(String[] args)  {
	System.out.println("main-----start");	
		  Task1 a=new Task1();
		  
		  try
		  {
		  a.m1();
		  }
		  catch(FileNotFoundException e)
		  {
			  System.out.println("catch-----block");
		  }
		  System.out.println("main ----end");
	}
}
