package exception;



public class Task2 {

	public void m1() throws ClassNotFoundException
	{
		System.out.println("m1----A3----Start");
		
		Task3 t=new Task3();
		      t.m2();
		  System.out.println("m1--------A3----end");
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main -----start");
		  
	Task2 t1=new Task2();
	    t1.m1();
	    
	    System.out.println("main -----end");
	   
	}
}
