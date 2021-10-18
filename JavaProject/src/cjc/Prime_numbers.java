package cjc;

public class Prime_numbers {
	public static void main(String []args)
	{

	for(int i=2;i<100;i++)
	{
	int no=0;
	for(int j=2;j<i;j++)
	{
	if(i%j==0)
	{
	  no++;
	}
	}
	if (no==0)
	{
	System.out.println(i);
	}
	}
	}
}
