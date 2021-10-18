package throwkeyword;

public class Test2 {

	public void m1(int age)throws AgeInvalidException 
	{
		System.out.println("m1----start");
		
		if(age<0)
		{
			AgeInvalidException e =new AgeInvalidException("Age problem");
			
			throw e;
		}
		System.out.println("m1----end");
	}
	
	public static void main(String[] args) {
		System.out.println("main----start");
		
		Test2 t=new Test2();
		
		try
		{
			t.m1(-5);
		}
		catch(AgeInvalidException e)
		{
			System.out.println("catch----block"+e.getMessage());
		}
		System.out.println("main ----end");
	}
	
}
