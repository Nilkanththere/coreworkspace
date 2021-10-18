package com.cjc;

public class Calculator {
	
	int a=100;
	int b=50;
	
	public void sum()
	{
		int c=a+b;
	
	 System.out.println(c);
}
	
	public void sub()
	{
		
		int c=a-b;
		
		System.out.println(c);
		
	}	
		public void mul()
		{
			
			int c=a*b;
			
			System.out.println(c);
		}
		
		public void div()
		{
			
			int c=a/b;
		
			System.out.println(c);
		}
		
		public static void main(String args[])
		{
			
			Calculator x=new Calculator();
			    
			
			x.sum();
			x.sub();
			x.mul();
			x.div();
			
			
			
		}
		
		
	
		
		
	}
        
	 


