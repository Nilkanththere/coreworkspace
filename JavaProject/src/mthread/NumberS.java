package mthread;

public class NumberS {

	int st;
	int end;
	
	public NumberS(int st,int end)
	{
		this.st=st;
		this.end=end;
	}
	
	public void display()
	{
		for(int i=st;i<end;i++)
		{
			System.out.println(i);
			i=i+1;
		}
	}
}
