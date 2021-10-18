package com.calculator;

import java.util.Scanner;

public class Calculator {

	
	
	
	Scanner sc=new Scanner(System.in);
	
	public void add()
	{
		
		
		System.out.println("Enter First Number ");
		
		int x=sc.nextInt();
		System.out.println("Enter second Number ");
		int y=sc.nextInt();
		
		int z=x+y;
		System.out.println("Result="+z);
	}
	
	public void sub()
	{
		System.out.println("Enter First Number ");
		
		int x=sc.nextInt();
		System.out.println("Enter second Number ");
		int y=sc.nextInt();
		
		int z=x-y;
		System.out.println("Result="+z);
	}
	
	public void mul()
	{
		System.out.println("Enter First Number ");
		
		int x=sc.nextInt();
		System.out.println("Enter second Number ");
		int y=sc.nextInt();
		
		int z=x*y;
		System.out.println("Result="+z);
	}
	public void div()
	{
		System.out.println("Enter First Number ");
		
		int x=sc.nextInt();
		System.out.println("Enter second Number ");
		int y=sc.nextInt();
		
		int z=x/y;
		System.out.println("Result="+z);
	}
}
