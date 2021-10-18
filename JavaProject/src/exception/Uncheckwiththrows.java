package exception;

import java.io.File;
import java.io.IOException;

public class Uncheckwiththrows {

	public void m1() throws IOException
	{
		File f1=new File("");//exception occurred
		     f1.mkdir();
		File f=new File(f1,"File exception.java");
		f.createNewFile();
		System.out.println(" file create sucesfully");
		
	}
	public void m2() throws IOException
	{
		m1();
	}
	public void m3() throws IOException
	{
		m2();
		
	}
	public static void main(String[] args) {
		 
		Uncheckwiththrows u=new Uncheckwiththrows();
		                  
		try
		{
			u.m3();
		}
		catch(IOException e)
		{
			System.out.println("catch ----block");
		}
	}
}
