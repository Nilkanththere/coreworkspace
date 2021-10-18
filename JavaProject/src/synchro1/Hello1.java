package synchro1;
//with synchronized
public class Hello1 {
	public synchronized  void display(String msg)
	{
	
			System.out.println("[");
			
			
			System.out.println(msg);
			
			System.out.println("]");
		}
}
