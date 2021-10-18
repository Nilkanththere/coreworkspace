package synchro1;

public class Test1 {
	
public static void main(String[] args) {
		
		Hello1 h=new Hello1();
		MyThread t1=new MyThread(h,"java");
		MyThread t2=new MyThread(h,"classes");
		
		t1.start();
		t2.start();
		
		
		Hello1 h1=new Hello1();
		MyThread t3=new MyThread(h1,"Nashik");
		MyThread t4=new MyThread(h1,"Nagpur");
		
		t3.start();
		t4.start();
		
		
		Hello1 h2=new Hello1();
		MyThread t5=new MyThread(h2,"Mumbai");
		MyThread t6=new MyThread(h2,"Hydrabad");
		
		t5.start();
		t6.start();
		
		
		
		
		
		
	}

}
