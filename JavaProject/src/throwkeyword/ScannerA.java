package throwkeyword;

import java.util.Scanner;

public class ScannerA {

	
	
	public void div(int a,int b)throws ZeroInputException
	{
		
		if(b==0)
		{
			ZeroInputException e=new ZeroInputException("Not input value of b is Zero");
			throw e;
		
		
		}
		else
		{
			int z=a/b;
			System.out.println("division of a and b"+"="+z);
		}
		
	}
	
	
	
	public static void main(String[] args){ //throws ZeroInputException {
		
		Scanner s=new Scanner(System.in);
		  System.out.println("enter value of a");
		        int a=s.nextInt();
		   System.out.println("enter value of b");
		        int b=s.nextInt();
		        
		        ScannerA k=new ScannerA();
		             
		        try{
		              k.div(a, b);
		        }
		        
		        catch(ZeroInputException  e)
		        {
		        	System.out.println(e.getMessage());
		        }
		        
		        
		        System.out.println("main-----end");
		            
	}
}
