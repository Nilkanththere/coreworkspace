package customException;

public class Test {

	
	
		
		
		public void m1(int age) {
			
			
		
		
		if (age>60)
		{
			throw new TooyoungException("you are Too young For this");
			
			
		}
		else if(age<18)
		{
			throw new TooOldException("You are Too Old For This");
		}
		
		else
		{
			System.out.println("Thanks for Registration");
		}
		
		}
		
		public static void main(String[] args){
			
			
			
			Test t=new Test();
			     t.m1(50);
			
		
	}

}
