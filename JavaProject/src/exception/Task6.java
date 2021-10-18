package exception;

public class Task6 {

	public void m1()
	{
		System.out.println("m1-----Task6------start");
		Task6a t=new Task6a();
		       t.m2();
		       
		       System.out.println("m1----Task6-----End");
	}
	public static void main(String[] args) {
		System.out.println("main-----start");
		Task6 t1=new Task6();
		try
		{
			t1.m1();
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("main-----end");
	}
}
