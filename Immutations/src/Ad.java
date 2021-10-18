
public class Ad {

	public int m1()
	{
		System.out.println("m1-----start");
	
		if(true)
		{
			return 10;
		}
		System.out.println("Hello");
		return 20;
		
	}
	public static void main(String[] args) {

		System.out.println("main-----Start");
		
		Ad t=new Ad();
		int x=t.m1();
		System.out.println(x);
	}
}
