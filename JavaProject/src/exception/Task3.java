package exception;

public class Task3 {

	public void m2() throws ClassNotFoundException 
	{
		System.out.println("Task3------m2----start");
		Class.forName("Demo.java");
		System.out.println("Taks3------m2---end");
	}
}
