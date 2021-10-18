package super_this_method;

public class B extends A{

	public void m4()
	{
        
		System.out.println("Method-----m4");
	}
	
	public void m5()
	{ 
		super.m1(20);
		System.out.println("Method-----m5");
	}
	
	public void m6()
	{ 
          this.m4();
		System.out.println("Method-----m6");
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		  B b=new B();
		    b.m6();
		    b.m5();
	}       
	
	
}
