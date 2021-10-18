package statickeyword;

public class C extends B{

	public static void m3()
	{
		m2();//inherite 
		System.out.println("m3----c");
	}
	
	
	public static void main(String[] args) {
		B b=new B();
		   b.m1();
		  
		   C c=new C();
		   c.m3();
	}
}
