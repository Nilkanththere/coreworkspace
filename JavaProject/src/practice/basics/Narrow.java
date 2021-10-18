package practice.basics;

public class Narrow {
   
	static int s =10;
	public void m1(String s)
	{
		
		System.out.println("String m1");
	}
	
	public void m1(Object o)
	{
		System.out.println("Object m1");
	}
	
	
	public static void main(String[] args) {

    Narrow n=new Narrow();
           n.m1(null);
           n.m1((Object)null);
	}

}
