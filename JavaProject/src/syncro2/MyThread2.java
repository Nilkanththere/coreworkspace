package syncro2;

public class MyThread2 extends Thread {

	Hello2 h;
	String msg;
	
	public MyThread2(Hello2 h,String msg)
	{
		this.h=h;
		this.msg=msg;
	}
	
	public void run()
	{
		h.display(msg);
	}

	
}
