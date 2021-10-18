package syncro2;
//Class level lock
public class Hello2 {
	public  static synchronized  void display(String msg)
	{
	
			System.out.println("[");
			
			
			System.out.println(msg);
			
			System.out.println("]");
		}
}
