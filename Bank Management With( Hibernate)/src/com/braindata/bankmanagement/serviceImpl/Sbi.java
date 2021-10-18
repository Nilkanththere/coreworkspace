package com.braindata.bankmanagement.serviceImpl;





import java.util.InputMismatchException;
import java.util.Scanner;

import org.hibernate.Session;

import com.braindata.bankmanagement.service.Rbi;
import com.braindatawire.bankmanagement.config.HibernateUtil;
import com.brainedata.bankmanagement.model.Account;
import com.brainedata.bankmanagement.model.SBIBank;

	public class Sbi implements Rbi {
	
		Account a=new Account();
Session session =HibernateUtil.getSessionFactory().openSession();
		Scanner s=new Scanner(System.in);
		public void createAccount()
		{    	
		   	   
			SBIBank sbi=new SBIBank();
			
			sbi.setIfsccode("SBI0001756");
			
	  // System.out.println("Enter No.Of Accont Create At A Time");
	    //int no=s.nextInt();
	    //for(int i=0;i<no;i++)
	    //{
	    	
        System.out.println("Enter amount  for creating account above Rs-500/-");
		   double amount=s.nextDouble();
		   while(true)
		{	    
		  if(amount>=500)
	    {
		 a.setBalance(amount);
		 break;
		 }
		 else
	   	 {
	   	 System.out.println("Enter valid Amount ");
	   	 System.out.println("-------------------------------");
	   	    	
	   	 createAccount();
	   	 }
		 }
		 while(true)
		 {
		 
		  System.out.println("enter account No");
		  String accno=s.next();
		  boolean p=accno.matches("[0-9]{1,16}");
		  if(p==true)
		  {
		   a.setAccNo(accno);
		  break;
		  }
		  else
		  {
		  System.out.println("Enter Valid Account Number");
		  }
		    	    		       
		  }
		  while(true)
		  {
		 
		  System.out.println("Enter name");
		  String name=s.next();
		  boolean p=name.matches("[A-Za-z]{1,9}");
		  if(p==true)
		  {
		  a.setName(name);
		  break;
		  }
		  else
		  {
		  System.out.println("Enter valid Name");
		  }
		  }
		  while(true)
		  {
		    	    	    		
		  System.out.println("Enter mobile NO");
		  String mobno=s.next();
		  boolean p=mobno.matches("[7,8,9]{1}[0-9]{9}");
		  if(p==true)
		  {
		  a.setMobNo(mobno);
		  break;
		   }
		  else
		 {
		 System.out.println("Enter valid Mobile Number");
		   }
		   }
		    	    	    	
		  while(true)
		  {
		  System.out.println("enter Adhar No");
		  String adhar=s.next();
		  boolean p=adhar.matches("[1-9]{1}[0-9]{11}");
		  if(p==true)
		  {
		  a.setAdharNo(adhar);
		  break;
		  }
		  else
		  {
		  System.out.println("Enter Valid Adhar Number");
		  }
		  }
		  while(true)
		  {
		  System.out.println("enter Gender");
		  String gen=s.next();
		  boolean p=gen.matches("[M,m]{1}[A,a]{1}[L,l]{1}[E,e]{1}");
		  boolean p1=gen.matches("[F,f]{1}[E,e]{1}[M,m]{1}[A,a]{1}[L,l]{1}[E,e]{1}");
		  if(p==true ||p1==true)
		  {
		  a.setGender(gen);
		  break;
		  }
		  else
		  {
		  System.out.println("Enter Valid Gender");
		  }
		  }
		  while(true)
		  {
		  try
		  {
		  
		  System.out.println("enter Age");
		  int age=s.nextInt();
		  if(age>0 && age<101)
		  {
		  a.setAge(age);
		  break;
		  }
		    	    		   
		  else
		 {
	     System.out.println("Enter age Between 1 to 100 "); 	
		 }
		 }  
		    	    		  
		    	    			  
		catch(InputMismatchException e)
		{
		System.out.println("Enter valid Age");
		 }
		 }
		    	    		  
		System.out.println("Balance:-"+amount);
	  
	  
		a.setSbi(sbi);
		sbi.getL().add(a);
		//}
 
		session.save(a);
		
	   
	  
	      session.beginTransaction().commit();
	    }
		
	
	public void displayAllDetails()
	{ 
	Session session =HibernateUtil.getSessionFactory().openSession();
		
		System.out.println("enter Account Number");
	    String  acno=s.next();
	      
		Account ac=session.get(Account.class,acno);
	
			
			 System.out.println("Account No="+ac.getAccNo());
		   	 System.out.println("Name="+ac.getName());
		   	 System.out.println("Mobile No="+ac.getMobNo());
		   	 System.out.println("Adhar No="+ac.getAdharNo());
		   	 System.out.println("Age="+ac.getAge());
		   	 System.out.println("Gender="+ac.getGender());
		   	 System.out.println("Balace Amount="+ac.getBalance());
		   	 System.out.println("SBI IFSC_code="+ac.getSbi().getIfsccode());
		   	 System.out.println("-------------------------------");
		 
			   
			
		   	while(true)
		   	{
		 
			      System.out.println("Plese Enter 1 for Confirm");
			      System.out.println("Plese Enter 2 for Edit Information");  
			      int ad=s.nextInt();
			 
			      switch(ad)
			      
			      {
			      
			     case 1:
			    	  System.out.println(" Create Account succesfully ");
			       
			          break;
			      
			     case 2:
			     
			     System.out.println(" Re-enter Details ");
			     System.out.println("enter account No");
				       String k=s.next();
				       a.setAccNo(k);
				       
				  System.out.println("Enter name");
				  String b=s.next();
				   a.setName(b);
				       
				  System.out.println("Enter mobile NO");
				   String c=s.next();
				      a.setMobNo(c);
				      
				  System.out.println("enter Adhar No");
				    String d=s.next();
				    a.setAdharNo(d);
				    
				  System.out.println("enter Gender");
				    String e=s.next();
				    a.setGender(e);
				    
				  System.out.println("enter Age");
				    int f=s.nextInt();
				    a.setAge(f);
				    
			 System.out.println(" Create Account succesfully ");
			  	    
			      
			 		 break;
			      }
			      break;
			      
			      } 

			 
			    
		while(true)
		{
			System.out.println("please enter 1 for Receipt");
			System.out.println("please enter 2 for continue");

		    
		     int ax=s.nextInt();
		     switch(ax)
		     {
		     case 1:
		    	 System.out.println("please Take Your Receipt");
		    	 break;
		     case 2:
		    	 System.out.println("Thank you for save Earth");
		    	 break;
		     }
		     break;
		     }  
   
		 }

	@Override
	public void deposieMoney() {
  Session session =HibernateUtil.getSessionFactory().openSession();
		System.out.println("enter Account Number");
	    String  Acno=s.next();
	     double bal=0; 
	     
	     Account ac=session.get(Account.class,Acno);
	          
	     bal=ac.getBalance();
	     
	     if(Acno==ac.getAccNo())
	     {
	    	 System.out.println("Enter diposite Amount ");
	 		double w=s.nextDouble();
	 		
	 		if(w>=500)
	 		{
	 		      bal=w+bal;
	 	     System.out.println("old balance="+ac.getBalance());
	 		  
	 		System.out.println("Deposited amount succesfully");
	 		System.out.println("current Balance="+bal);
	 		    ac.setBalance(bal);
	 		    
	 		    
	 		    session.update(ac);
	 		    session.beginTransaction().commit();
	 		} 
	     }
	     else{
	    	 System.out.println("Please Enter Valid Account Number");
	     }

		
	}

	@Override
	public void withdrawal() {
		 Session session =HibernateUtil.getSessionFactory().openSession();
			System.out.println("enter Account Number");
		    String  Acno=s.next();
		     double bal=0; 
		     
		     Account ac=session.get(Account.class,Acno);
		          
		     bal=ac.getBalance();
		     
		     if(Acno==ac.getAccNo())
		     {
		    	 System.out.println("Enter Widrawal Amount ");
		    	
		 		double w=s.nextDouble();
		 		
		 		if(w>=500)
		 		{
		 		      bal=bal-w;
		 	     System.out.println("old balance="+ac.getBalance());
		 		  
		 		System.out.println("Deposited amount succesfully");
		 		System.out.println("current Balance ="+bal);
		 		    ac.setBalance(bal);
		 		    
		 		    
		 		    session.update(ac);
		 		    session.beginTransaction().commit();
		 		} 
		     }
		     else{
		    	 System.out.println("Please Enter Valid Account Number");
		     }

	}

	@Override
	public void balanceCheck() {
		 Session session =HibernateUtil.getSessionFactory().openSession();
			System.out.println("enter Account Number");
		    String  Acno=s.next();
		     double bal=0; 
		     
		     Account ac=session.get(Account.class,Acno);
		          
		     bal=ac.getBalance();
		     
		     if(Acno==ac.getAccNo())
		     {
		    	 System.out.println("Account Balance="+ac.getBalance());
		
		
	         }
	   
		     else{
		    	 System.out.println("Please Enter Valid Account Number");
		     }

	
	
	
	}
}
