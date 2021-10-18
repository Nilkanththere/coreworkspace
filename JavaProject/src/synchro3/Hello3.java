package synchro3;
//Object  level Lock
public class Hello3 {

	public synchronized  void display(String msg,Hello3 h)
	{
	
			System.out.println("[");
			
			
			System.out.println(msg);
			
			System.out.println("]");
		}
}
