package exception;

public class Task8 {

	public void m1()
	{
		System.out.println("Task8-----m1----Start");
		
		Task8a t=new Task8a();
		       t.m2();
		       
		 System.out.println("Task8------m1---End");
	}
	public static void main(String[] args) {
		
		System.out.println("Main-----Start");
		
		Task8 t1=new Task8();
		
		try{
		      t1.m1();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Main-----End");
	}
}
