package com.braindatawire.collegemanagement.client;

import java.util.Scanner;

import com.braindatawire.collegemanagement.service.Cjc;
import com.braindatawire.collegemanagement.serviceImpl.Karvenagar;

public class Test {

	public static void main(String[] args) {
	
		Cjc Institute =new Karvenagar();
		while(true)
		{
			
			Scanner s =new Scanner(System.in);
			System.out.println("============WelCom To CJC Institute==========");
			System.out.println(" press 1.Add corse   "+"   press 2.for view coure");
			System.out.println(" press 3.Add Faculty "+"   press 4.for view Faculty");
			System.out.println(" press 5.Add Batch   "+"   press 6.for view Batch");
			System.out.println(" press 7.Add Student "+"   press 8.for view Student");
			System.out.println(" press 9. For Exit");
			int q=s.nextInt();
			
			switch(q)
			{
			case 1:
				Institute.addCourse();
				  break;
			case 2:
		
				Institute.viewCourse();
			      break;
			case 3:
				Institute.addFaculty();
				break;
			case 4:
				Institute.viewfaculty();
				break;
			case 5:
				Institute.addBatch();
				break;
			case 6:
				Institute.viewbatch();
				break;
			case 7:
				Institute.addStudent();
				break;
				
			case 8:
				Institute.viewstudent();
				break;
			case 9:
				System.out.println("---------Thank you Visit -------");
				System.exit(0);
				
			default:
				System.out.println("Envalid Key");
				
				
			}
		}

	}

}
