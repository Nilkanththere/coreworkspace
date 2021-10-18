package exception;

public class A {
	
	public void m1()
	{
		System.out.println("m1-----A---Start");
		int a=10/0;
		System.out.println("m1-----A-----End");
	}
	public void m2()
	{
		System.out.println("m2-----A---Start");
		m1();
		System.out.println("m2-----A-----End");
	}
	public void m3()
	{
		System.out.println("m3-----A---Start");
		m2();
		System.out.println("m3-----A-----End");
	}
}
