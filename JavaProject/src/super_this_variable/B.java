package super_this_variable;

public class B extends A{

	  int z=30;
	  
	  
	 public void m2()
	 {
		 int y=10;
		 System.out.println(y);//10
		 
		 System.out.println(this.z);//30
		 System.out.println(super.x);//50
	 }
	
	public static void main(String[] args) {
		 
		  B b=new B();
		    b.m2();
		
		
	}

}
