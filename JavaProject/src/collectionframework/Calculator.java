package collectionframework;

import java.util.*;

public class Calculator {

	
	public int add()
	{ 
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	public int sub()
	{
		int a=50;
		int b=10;
		int c=a-b;
		return c;
	}
	public int mul()
	{
		int a=5;
		int b=2;
		int c=a*b;
		return c;
	}
	public int div()
	{
		int a=50;
		int b=5;
		int c=a/b;
		return c;
	}
	
	public static void main(String[] args) {
		
		List l=new ArrayList();
		
		Calculator d=new Calculator();
		      int a1=d.add();
		      int a2=d.sub();
		      int a3=d.mul();
		      int a4=d.div();
		           
		     l.add(a1);
		     l.add(a2);
		     l.add(a3);
		     l.add(a4);
		     System.out.println(l);
		Iterator itr=l.iterator();     
		     
	while(itr.hasNext())
	{
		int x=(int)itr.next();
		System.out.println(x);
	}
		           
		  	           
	}
}
