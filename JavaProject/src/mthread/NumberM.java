package mthread;

public class NumberM extends Thread {

	
	int st,end;
	
	public NumberM(int st,int end)
	{
		this.st=st;
		this.end=end;
		
	}
	@Override
	public void run()
	{
		for(int i=st;i<end;i++)
		{
	System.out.println(i+""+currentThread().getName());
			i++;
			try
			{
				sleep(500);
				
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
					
					
		}
	}
}
