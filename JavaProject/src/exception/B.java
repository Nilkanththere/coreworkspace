package exception;

public class B {

	
	public void m4()
	{ 
		System.out.println("m4-----B---Start");
		A a=new A();
		  a.m3();
		  System.out.println("m4-----b-----End");  
	}
	public void m5()
	{
		System.out.println("m5-----B---Start");
		B b=new B();
		  b.m4();
	  System.out.println("m5-----b-----End");
	}
	
}
