package synchro3;

public class MyThread3 extends Thread {

	Hello3 h;
	String msg;
	
	public MyThread3(Hello3 h,String msg)
	{
		this.h=h;
		this.msg=msg;
	}
	
	public void run()
	{
		h.display(msg, h);
	}

	
}
