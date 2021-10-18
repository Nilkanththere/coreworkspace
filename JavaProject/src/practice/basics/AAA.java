package practice.basics;

public class AAA {

 String xyz;
	 int y;
	 
	 int a=10;
	 int b=20;
	
	 public AAA()
	 {
		 this("abc");
	   System.out.println("non para constrcutor");	 
	 }
	
	 public AAA(String a)
	 {
		 xyz=a;
		System.out.println("para constructor"); 
	 }
	
	 public AAA(int b)
	 {
		 y=b;
		System.out.println("para constructor"); 
	 }
	 
	
}
