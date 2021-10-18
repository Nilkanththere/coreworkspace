package synchro5;

import syncro2.Hello2;
import syncro2.MyThread2;

public class Test {

public static void main(String[] args) {
		
		
		
		Hello h=new Hello();
		MyThread t1=new MyThread(h,"java");
		MyThread t2=new MyThread(h,"Classes");
		t1.start();
		t2.start();
		
		
		
		Hello h1=new Hello();
		MyThread t3=new MyThread(h1,"CJC");
		MyThread t4=new MyThread(h1,"pune");
		
		t3.start();
		t4.start();
		
		
		
		
	}
}
