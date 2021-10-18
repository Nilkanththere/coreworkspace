package joinmthred;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		MyRunnable mr=new MyRunnable();
		
		  Thread t=new Thread(mr);
		  
		  for(int i=0;i<5;i++)
		  {
			  System.out.println("main Start---");
			  
			  
			  t.start();
			  
			  t.join();
			  
			  for(int i1=0;i<5;i++)
			  {
				  System.out.println("main ----End");
			  }
		  }
		
		

	}

}
