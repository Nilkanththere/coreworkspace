package throwkeyword;

public class Test1 {

	public void m1(int age)
	{
		System.out.println("m1------start");
		
		if(age<0)
		{
			ArithmeticException e=new ArithmeticException("Age problem");
			throw e;
		}
		
		System.out.println("m1----end");
	}
	public static void main(String[] args) {
		
		System.out.println("main-----start");
		
		Test1 t= new Test1();
		
		try
		{
			t.m1(-5);
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch---block"+e.getMessage());
		}
	}
}
