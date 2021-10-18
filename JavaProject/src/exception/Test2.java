package exception;

public class Test2 {

	
	public static void main(String[] args) {
		
		System.out.println("main -----start");
		C c=new C();
		try
		{
		  c.m6();
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("catch----block");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("main------end");
	}
}
