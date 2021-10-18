package genricEXP;

import java.util.*;

public class College {

	
	public List<Student1> m1()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter No of Student ");
		int a=s.nextInt();
		List<Student1>l=new ArrayList<>();
		
		for(int i=0;i<a;i++)
		{
			System.out.println("enter student Roll no="+i);
			int x=s.nextInt();
			System.out.println("enter student Name="+i);
			String y=s.next();
			
			Student1 s1=new Student1();
			        s1.setRollno(x);
			        s1.setName(y);
			 
			l.add(s1);
			
			
		
		}
			return l;
		}
           
			
			
			
		}


