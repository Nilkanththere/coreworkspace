package practice.basics;

public class B {
	
	int x=10;
	int y;
	static int z=100;
	
	static public void m1()
	{
		int d=200;
		System.out.println(d);
	}

	
	 protected  B()
	{
		System.out.println("protected Constrctor");
	}
	
	 
	
    	 static 
    	 {
    		 System.out.println("Static block");
    	 } 
    	 
    	 {System.out.println("non Static block");}
      
	public static void main(String[] args) {
		
		B b=new B();
	}
}
