package collectionframework;

import java.util.*;

public class Details1 {

	
	public List setDetails()
	{
		  
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter No.of employee  details set");
		   int no=s.nextInt();
		   List l=new ArrayList();
		for(int i=0;i<no;i++)
		{
			
			System.out.println("Enter employee Id"+i);
			int a=s.nextInt();
			System.out.println("Enter employee Name"+i);
			String b=s.next();
			System.out.println("Enter employee Designation"+i);
			String c=s.next();
			System.out.println("Enter employee Salary"+i);
			double d=s.nextDouble();
			
			Employee1 e=new Employee1();
			         e.setEmpid(a);
			         e.setEmpname(b);
			         e.setEmpdesig(c);
			         e.setEmpsalary(d);
			         
			   l.add(e);
		}
		return l;
	}


	 public void getDetails()
	 {
		 
		   List data=setDetails();
		   
		   Iterator itr=data.iterator();
		   
		   while(itr.hasNext())
		   {
			   Employee1 em=(Employee1)itr.next();
			   System.out.println(em.getEmpid());
			   System.out.println(em.getEmpname());
			   System.out.println(em.getEmpdesig());
			   System.out.println(em.getEmpsalary());
			   
			   
		 
	 }
			         
			         
			         
	 }			         
			         
			         
		}
	
	

