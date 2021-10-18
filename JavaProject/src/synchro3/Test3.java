package synchro3;

public class Test3 {

public static void main(String[] args) {
		
		Hello3 h=new Hello3();
		Hello3 h1=new Hello3();
		
		MyThread3 t1=new MyThread3(h,"java");
		MyThread3 t2=new MyThread3(h,"Classes");
		t1.start();
		t2.start();
		
		
		
		
		MyThread3 t3=new MyThread3(h1,"CJC");
		MyThread3 t4=new MyThread3(h1,"pune");
		
		t3.start();
		t4.start();
		
		
		
		
	}
}
