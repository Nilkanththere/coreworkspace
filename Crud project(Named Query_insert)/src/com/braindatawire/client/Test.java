package com.braindatawire.client;

import java.util.Scanner;

import com.braindatawire.serviceI.ServiceI;
import com.braindatawire.serviceImpl.Operation;


public class Test {
	
	
	public static void main(String[] args) {
		
		ServiceI  s=new Operation();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("*****CRUD Hibernate Project*****");
			System.out.println("Enter 1.Insert Data");
			System.out.println("Enter 2.Update Data");
			System.out.println("Enter 3.Select Data");
			System.out.println("Enter 4.Delete Data");
			
		System.out.println("*****Select No. of Operation Perform*****");
		int no=sc.nextInt();
		
		switch(no)
		{
		case 1:
			s.insertData() ;
			break;
		case 2:
			s.updateData() ;
			break;
			
		case 3:
			s. selectData() ;
			break;
			
		case 4:
			s.deleteData() ;
			break;
			
			default:
				System.out.println("Enter valid Key");
}	}
	}
	}


