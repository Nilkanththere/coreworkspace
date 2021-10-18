import java.util.Scanner;

public class Vowel {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(true)
	{
		System.out.println(" enter a for 1st vowel ");
		System.out.println(" enter b for 2nd vowel ");
		System.out.println(" enter c for 3rd vowel ");
		System.out.println(" enter d for 4th vowel ");
		System.out.println(" enter e for 5th vowel ");
		System.out.println(" enter f for exit ");
		System.out.println("enter charactor");
		char c=sc.next().charAt(0);
		
		switch (c) {
		case 'a':
			System.out.println("1st vowel a");
			break;
			case 'b':
				System.out.println("2st vowel e");
				break;
			case 'c':
				System.out.println("3st vowel i");
				break;
				case 'd':
					System.out.println("4st vowel o");
					break;
				case 'e':
					System.out.println("5st vowel u");
					break;
				case 'f':
					System.out.println("exit");
					System.exit(0);
					break;
		default:
			System.out.println("invalid characters");
			break;
			
		}
		
	}
}
	
}
