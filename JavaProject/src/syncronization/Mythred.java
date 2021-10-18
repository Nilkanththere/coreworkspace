package syncronization;

public class Mythred extends Thread {

	Hello h;
	String msg;
	
	public Mythred(Hello h,String msg)
	{
		this.h=h;
		this.msg=msg;
	}
	
	public void run()
	{
		h.display(msg);
	}
}
