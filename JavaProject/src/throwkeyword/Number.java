package throwkeyword;

public class Number {

	public void getNumber(int i)throws ZeroInputException 
	{
		System.out.println("getNumber-----start");
	
		if(i==0)
		{
			ZeroInputException z=new ZeroInputException("Zero Input Number");
			 
			throw z;
		}
		System.out.println("getNumber ----end");
	}
}
	