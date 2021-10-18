package syncro2;

public class Test2 {

	
public static void main(String[] args) {
		
		Hello2 h=new Hello2();
		Hello2 h1=new Hello2();
		
		MyThread2 t1=new MyThread2(h,"java");
		MyThread2 t2=new MyThread2(h,"Classes");
		t1.start();
		t2.start();
		
		
		
		
		MyThread2 t3=new MyThread2(h1,"CJC");
		MyThread2 t4=new MyThread2(h1,"pune");
		
		t3.start();
		t4.start();
		
		
		
		
	}
}
