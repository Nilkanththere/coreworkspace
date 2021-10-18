package com.cjc.calculator.client;
import java.util.Scanner;
import com.cjc.calculator.service.Calculator;
import com.cjc.calculator.serviceImp.Operation;


public class Test {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("press 1-addition");
		System.out.println("press 2-substraction");
		System.out.println("press 3-multiplication");
		System.out.println("press 4-divisiom");
		System.out.println("press 5-Exit");
		while(true)
		{			
		System.out.println("enter chioce number");
		   int no = sc.nextInt();
		 
		   Calculator o=new Operation();
	
		switch(no)
		{
		
		case 1:
			o.add();
			break;
			
		case 2:
			o.sub();
			break;
			
		case 3:
			o.mul();
			break;
			
		case 4:
			o.div();
			break;
			
		case 5:
			System.out.println("exit");
			System.exit(0);
			break;
			
		default :
			System.out.println("invalid");
			break;
				
		}
	}

	}
	}
