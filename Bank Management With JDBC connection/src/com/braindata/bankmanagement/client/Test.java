package com.braindata.bankmanagement.client;

import java.util.Scanner;

import com.braindata.bankmanagement.service.Rbi;
import com.braindata.bankmanagement.serviceImpl.Sbi;

public class Test {

	public static void main(String[] args)   {
		 
		Rbi bank =new Sbi(); 
		    
		

		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			
			System.out.println("-----WELCOME TO XYZ BANK------");
			System.out.println("press 1 for createAccount");
			System.out.println("press 2 for displayAllDetails");
			System.out.println("press 3 for deposieMoney");
			System.out.println("press 4 for withdrawal");
			System.out.println("press 5 for balanceCheck");
			System.out.println("press 6 for exit");
		
		
		     int no=sc.nextInt();
		     
		switch(no)
		
		{ 
		case 1:
		    bank.createAccount();
			break;
			
		case 2:
				bank.displayAllDetails();
				
			break;
		case 3:
			
			bank.deposieMoney();
			break;
		case 4:
		
			bank.withdrawal();
			break;
		case 5:
			
			bank.balanceCheck();
			break;
		case 6:
			System.out.println("exit");
			System.out.println("---------Thank you Visit Again-------");
			System.exit(0);
			
		default :
			System.out.println("invalid valid key ");
		
		}
		
	}
	}
		
}
