package throwkeyword;

public class TestN {

	public static void main(String[] args) {
		
		System.out.println("main------start");
		
		Number n=new Number();
		
		try{
		     n.getNumber(0);
		}
		
		catch(ZeroInputException k)
		{
			System.out.println(k.getMessage());
		}
		System.out.println("main-------end");
	}
}
