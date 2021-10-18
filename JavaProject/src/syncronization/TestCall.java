package syncronization;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCall {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	
		MyCallable odd=new MyCallable(1,10);
		
		MyCallable even =new MyCallable(2,10);
		
		ExecutorService executor=Executors.newFixedThreadPool(1);
		
		 Future<Integer>fr1=executor.submit(odd);
		 Future<Integer>fr2=executor.submit(even);
		 
		 System.out.println(fr1.get());
		 System.out.println(fr2.get());
		 

	}

}
