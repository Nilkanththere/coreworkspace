package com.cjc;

public class Loan {

	public static void main(String args[])
	{
		
		Financer f1=new Financer("Ashish","Wabhitkar",40000);
		Financer f2=new Financer("Nilkanth","there",40000);
		
		System.out.println(f1.name);
		System.out.println(f1.surename);
		System.out.println(f1.amount);
		
		System.out.println(f2.name);
		System.out.println(f2.surename);
		System.out.println(f2.amount);
		
		
		
	}
}
