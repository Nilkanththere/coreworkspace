package throwkeyword;

public class Test {

	public void m1()
	{
		System.out.println("m1----start");
		
		int a=10/0;
		System.out.println("m1---end");
		
	}
	
	public static void main(String[] args) {
		
		Test t=new Test();
		try
		{
			t.m1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch----bloc"+e.getMessage());
		}
		
	}
	
}
