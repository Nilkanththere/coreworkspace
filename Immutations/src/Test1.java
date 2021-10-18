
public class Test1 {
public int m1()
{
	
	int x=10;
	
  try
  {
	  System.out.println("try-----start");
	  return x;
  }
  finally
  {
	  x=20;
	  System.out.println("finally -----block");
	  return x;
  }
}

public static void main(String[] args) {
	System.out.println("main-----start");
	
	Test1 t=new Test1();
	     int x=t.m1();
	     System.out.println(x);
}
}
