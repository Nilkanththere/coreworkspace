package exception;

public class Task7 {
	
public void m1()
{
	System.out.println("m1------Task7----start");
	
	Task7a t=new Task7a();
	
	try
	{
	       t.m2();
	}     
	catch(ArithmeticException e)
	{
		System.out.println(e.getMessage());
	}
	System.out.println("m1-----Task7-----end");
}

public static void main(String[] args){   
	
	System.out.println("main-----start");
	
	    Task7 t1=new Task7();
	          t1.m1();
    System.out.println("main------end");
}
}
