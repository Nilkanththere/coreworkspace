package exception;

public class Task5 {

	
	public void m2() throws ClassNotFoundException
	{
		System.out.println("Task5-----start");
		Class.forName("xyz.txt");
		System.out.println("Task5------end");
	}
}
