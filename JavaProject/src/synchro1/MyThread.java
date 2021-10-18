package synchro1;

public class MyThread extends Thread {
	
	Hello1 h;
	String msg;
	
	public MyThread(Hello1 h,String msg)
	{
		this.h=h;
		this.msg=msg;
	}
	
	public void run()
	{
		h.display(msg);
	}

}
