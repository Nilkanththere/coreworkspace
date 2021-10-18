package mthread;

public class TestM {

	public static void main(String[] args) {
	
		
		NumberM odd=new NumberM(1,100);
		
		odd.setName("odd");
		
		NumberM even=new NumberM(2,100);
		
		even.setName("even");
		
		odd.start();
		even.start();

	}

}
