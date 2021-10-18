package e;

public class Count {

	public static void main(String[] args) {
		
		int x=153;
		int y=x;
		int z=0;

		while(y>0)
		{
		  int j=y%10;
		  z=z+(j*j*j);
		  y=y/10;
		}
		 

		if(z==x)
		{
		System.out.println("armstrong no");
		}

		else
		{
		System.out.println("not armstrong no");
		}
		}
		
		

	}


