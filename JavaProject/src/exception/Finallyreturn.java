package exception;

public class Finallyreturn {
	@SuppressWarnings("finally")
	public int m1()
	{
		
		int x=10;
		
	  try
	  {
		  System.out.println("try-----start");
		  return 10;
	  }
	  finally
	  {
		  x=20;
		  System.out.println("finally -----block");
		  return 20;
	  }
	}

	public static void main(String[] args) {
		System.out.println("main-----start");
		
		Finallyreturn t=new Finallyreturn();
		     int x=t.m1();
		     System.out.println(x);
	}
}
