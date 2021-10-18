package com.cjc.calculator.serviceImp;
import java.util.Scanner;
import com.cjc.calculator.service.Calculator;

public class Operation implements Calculator {
	Scanner sc=new Scanner(System.in);
	
	int y=sc.nextInt();
	public void add()
	{
		System.out.println("addition");
		System.out.println("enter first no");
		int x=sc.nextInt();
		System.out.println("enter second no");
	
		int y=sc.nextInt();
		int z=x+y;
		System.out.println("addition"+x+"+"+y+"="+z);
		
	}
	public void sub()
	{
		System.out.println("substraction");
		System.out.println("enter first no");
		int x=sc.nextInt();
		System.out.println("enter second no");
		int y=sc.nextInt();
		
		int z=x-y;
		System.out.println("substraction"+x+"-"+y+"="+z);
	
	}
	public void mul()
	{
		System.out.println("multiplication");
		System.out.println("enter first no");
		int x=sc.nextInt();
		System.out.println("enter second no");
		int y=sc.nextInt();
		
		int z=x*y;
		System.out.println("multiplication"+x+"*"+y+"="+z);
	}

	public void div()
	{
		System.out.println("Divisiom");
		System.out.println("enter first no");
		int x=sc.nextInt();
		System.out.println("enter second no");
		int y=sc.nextInt();
	
				int z=x/y;
		System.out.println("Division"+x+"/"+y+"="+z);
		
	}

}
