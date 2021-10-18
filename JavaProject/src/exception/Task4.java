package exception;

public class Task4 {

	public void m1() throws ClassNotFoundException
	{
		System.out.println("m1------Task4----Start");
		
		Task5 t=new Task5();
		     t.m2();
		     
		     System.out.println("m1-----Task4----end");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main----start");
		
		Task4 t1=new Task4();
		     try {
				t1.m1();
			} catch (ClassNotFoundException e) {
				
				System.out.println("Exception occurred");
				System.out.println(e.getMessage());
			}
		     System.out.println("main----end");
	}
}
