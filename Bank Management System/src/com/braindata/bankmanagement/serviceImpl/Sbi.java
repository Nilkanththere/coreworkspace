package com.braindata.bankmanagement.serviceImpl;

import java.util.Scanner;

import com.braindata.bankmanagement.service.Rbi;
import com.brainedata.bankmanagement.model.Account;

public  class Sbi implements Rbi{
	Account a=new Account();
 
	Scanner s=new Scanner(System.in);
    
	public void createAccount()
	{ 
		int u=500;
		System.out.println("Enter amount  for creating account above Rs-500/-");
	    int amount=s.nextInt();
	    if(amount>=u)
	    {
	    		    
		System.out.println("enter account No");
		       int k=s.nextInt();
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
		  a.setBalance(amount);
		    
	 System.out.println(" Create Account succesfully ");
	    }
	    
	    
    	
	 else
	 {
		System.out.println("Enter valid Amount ");
		System.out.println("-------------------------------");
	
		createAccount();
	 }
	
	}


		

public void displayAllDetails()
{ 
	System.out.println("enter Account Number");
	      double k1=s.nextInt();
	      int a2=a.getAccNo();
	 
	      if(a2==k1) 
	
	 {
	 System.out.println("Account No="+a.getAccNo());
   	 System.out.println("Name="+a.getName());
   	 System.out.println("Mobile No="+a.getMobNo());
   	 System.out.println("Adhar No="+a.getAdharNo());
   	 System.out.println("Age="+a.getGender());
   	 System.out.println("Gender="+a.getAge());
   	 System.out.println("Balace Amount="+a.getBalance());
   	 System.out.println("-------------------------------");
	 //}
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
		       int k=s.nextInt();
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
   
else
	{
		System.out.println("Invalid Account Number");
	}
    System.out.println("-------------------");
}



	 

public void deposieMoney()
{
	int q=500;
	System.out.println("Enter diposite Amount ");
	int w=s.nextInt();
	if(w>=q)
	{
	  double l=a.getBalance();
     System.out.println("old balance"+l);
	  double p=l+w;
    System.out.println("new Blance="+p);
	System.out.println("Deposited amount succesfully");
	    a.setBalance(p);
	
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
	    else
	    {
	    	System.out.println("Enter amount above Rs-500");
	    }
	
	System.out.println("-------------------------------");
     }


public void withdrawal()
{

	System.out.println("Enter Withdrawal Amount");
	int amt=s.nextInt();
	if(amt>=500&&amt<=25000)
	{	
	double t1=a.getBalance();
	     double h=t1-amt;
	      if(h>=500)
	  
	     {
       System.out.println("Currunt Balanace"+h);
       System.out.println("Amount withdra succesfully");
	    a.setBalance(h);
	
	     }
       else
     	{
   	System.out.println("Maintain Rs -500 required for account Running");
   	  System.out.println("---------------------------------");
   	  withdrawal(); 
  
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
	        }
	 else
	        {
	    	System.out.println("Amount widrawal Limit per Day is 25000");
	   
	        }

	        }
    public void balanceCheck()
            {
    System.out.println("current Available balance ");
	     double t=a.getBalance();
	     System.out.println(t);
	 System.out.println("-------------------------------");   
	    	 
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




}
