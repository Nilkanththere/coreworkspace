package throwkeyword;

import java.util.Scanner;

public class VotingClass {

	
	Scanner s=new Scanner(System.in);
	
	public void voting(int age)throws InvalidAgeException 
	{
		System.out.println("Enter Your Age");
		int a=s.nextInt();
		if(a<=age)
		{
			InvalidAgeException i=new InvalidAgeException("Not Eligible For Voting");
			throw i;
			
			//throw new InvalidAgeException("not Eligible for Voting");
		}
		else
		{
			System.out.println("Welcome Voting ");
		
		}
	}
	public static void main(String[] args) {
		
		System.out.println("main----start");
		 VotingClass v=new VotingClass();
		
		 try
		 {
			 v.voting(18);
			
		 }
		 catch(InvalidAgeException i)
		 {
			 System.out.println(i.getMessage());
			
		 }
		 System.out.println("main----end");
		
		 
	}
}
