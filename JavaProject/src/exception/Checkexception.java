package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Checkexception {

	
	public void m1()
	{
	
		
		File f=new File("abc.txt");
		
		FileReader fr=null;
		
		try
		{
			fr=new FileReader(f);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	
		try
		{
			fr.read();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		Checkexception c=new Checkexception();
		               c.m1();
	}
		
	}


