package synchro5;


public class Hello {

	public   void display(String msg)
	{
		//synchronized(this)//object level LOck
	   //synchronized(Hello.class)//class Level Lock
	   {
			System.out.println("[");
			
			
			System.out.println(msg);
			
			System.out.println("]");
		
		}
	   
}
}