package cjc;

public class A6 {
public static void main(String[] args) {
	
	A a=null;
	System.out.println("main-----Start");
	
	try
	{
		System.out.println("try----Start");
		System.out.println(a.toString());
		System.out.println("try----end");
		
	}
	catch(NullPointerException e)
	{
		System.out.println("catch block");
	}
	System.out.println("main---end");
	
}

}
