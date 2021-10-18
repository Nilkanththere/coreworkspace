package exception;

public class Finallytryreturn {
	public int m1()
	{
		
		int x=10;
		
	  try
	  {
		  System.out.println("try-----start");
		  return x;
	  }
	  finally
	  {
		 
		  System.out.println("finally -----block");
		  
	  }
	}

	public static void main(String[] args) {
		System.out.println("main-----start");
		
		Finallytryreturn t=new Finallytryreturn();
		     int x=t.m1();
		     System.out.println(x);
	}
}
