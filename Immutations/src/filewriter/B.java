package filewriter;

public class B {

	
	public void m1()
	{
		System.out.println("m1----b");
	}
	
	public int m2()
	{
		int a=10;
		return 10;
	}
	
	public static void main(String[] args) {
		B b=new B();
		  b.m1();
		  b.m2();
		  System.out.println(b);
	}
}
