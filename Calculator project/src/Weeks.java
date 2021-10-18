import java.util.Scanner;

public class Weeks {
	
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner abc=new Scanner(System.in);
	System.out.println("january month 2021 calender");
	
	while(true)
	{	
		System.out.println("day in week");
		System.out.println("monday");
		System.out.println("Tuesday");
		System.out.println("wednessday");
		System.out.println("Thusday");
		System.out.println("Friday");
		System.out.println("Saturday");
		System.out.println("sunday");

	System.out.println("enter  week");
	
	int date=abc.nextInt();
	
	switch(date)
	{
	case 1:
		System.out.println("date-1,Friday");
		System.out.println("date-2,Saturday");
		break;
		
	case 2:
		System.out.println("date-3,Sunady");
		System.out.println("date-4,monday");
		System.out.println("date-5,Tuesday");
		System.out.println("date-6,Wednesday");
		System.out.println("date-7,Thusday");
		System.out.println("date-8,Friday");
		System.out.println("date-9,Saturday");
		break;
	case 3:
		System.out.println("date-10,Sunady");
		System.out.println("date-11,monday");
		System.out.println("date-12,Tuesday");
		System.out.println("date-13,Wednesday");
		System.out.println("date-14,Thusday");
		System.out.println("date-15,Friday");
		System.out.println("date-16,Saturday");
		break;
	
	case 4:
		System.out.println("date-17,Sunady");
		System.out.println("date-18,monday");
		System.out.println("date-18,Tuesday");
		System.out.println("date-19,Wednesday");
		System.out.println("date-20,Thusday");
		System.out.println("date-21,Friday");
		System.out.println("date-22,Saturday");
		break;
		
	case 5:
		System.out.println("date-31,Sunady");
		break;
		
	case 6:
		System.out.println("Exit");
		System.exit(0);
		
	default:
		System.out.println("invalid week");
	}
	
	
	
	}	
}
}
