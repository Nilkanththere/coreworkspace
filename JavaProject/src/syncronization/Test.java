package syncronization;

import synchro1.Hello1;
import synchro1.MyThread;

public class Test {

	public static void main(String[] args) {
		
		Hello h=new Hello();
		Mythred t1=new Mythred(h,"java");
		Mythred t2=new Mythred(h,"classes");
		
		t1.start();
		t2.start();
		
		Hello1 h1=new Hello1();
		MyThread t3=new MyThread(h1,"Nashik");
		MyThread t4=new MyThread(h1,"Nagpur");
		
		t3.start();
		t4.start();
		
		
		Hello1 h2=new Hello1();
		MyThread t5=new MyThread(h2,"Mumbai");
		MyThread t6=new MyThread(h2,"Yavatmal");
		
		t5.start();
		t6.start();
		
		
		
		
		
	}
}
