package com.spring.task5;

import java.util.Scanner;

public class Calculator {

	
	
	
	Scanner sc=new Scanner(System.in);
	
	public void square()
	{
		
		
		System.out.println("Enter  Number ");
		
		int x=sc.nextInt();
		
		
		int z=x*x;
		
		System.out.println("Result="+z);
	}
	
	public void cube()
	{
		System.out.println("Enter  Number ");
		
		int x=sc.nextInt();
		
		
		int z=x*x*x;
		
		System.out.println("Result="+z);
	}
	
	
}
