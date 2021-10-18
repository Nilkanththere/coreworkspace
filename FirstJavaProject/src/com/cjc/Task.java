package com.cjc;

public class Task {

	public void sum()
	{
	float x=10.25f;
	float y=30.25f;
	
	float z=x+y;
	System.out.println(z);
	}
	
	public void sub()
	{
	int x=230;
	long y=50;
	
	long z=x-y;
	System.out.println(z);
	}
	public void mul()
	{
	double x=2.12;
	float y=10.2f;
	
	double z=x*y;
	System.out.println(z);
	}
	public void div()
	{
	long x=10;
	long y=30;
	
	float z=x/y;
	System.out.println(z);
	}
	
	public static void main(String args[])
	{
		
		Task l=new Task();
		l.sum();
		l.sub();
		l.mul();
		l.div();
		
		
		
		
	
	
	
	
	
	
	
		
	}
	
	
	
	
	
}
