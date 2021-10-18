package com.braindata.bankmanagement.serviceImpl;

import java.util.*;
import java.util.Scanner;

import com.braindata.bankmanagement.service.Rbi1;
import com.brainedata.bankmanagement.model.Account1;

public  class Sbi1 implements Rbi1{
	Account1 a=new Account1();
 
	
	Scanner s=new Scanner(System.in);
	public void createAccount()
	{ 
			
	    	
	    		Scanner s=new Scanner(System.in);
	    		
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
	    		   Scanner s1=new Scanner(System.in);
	    	    System.out.println("enter account No");
	    	    String k=s1.next();
	    	     boolean p=k.matches("[0-9]{1,16}");
	    	     if(p==true)
	    	    {
	    	     a.setAccNo(k);
	    	     break;
	    	    }
	    	     else
	    	    {
	    	    System.out.println("Enter Valid Account Number");
	    	    }
	    	    		       
	    	   }
	    	  while(true)
	    	   {
	    		  Scanner s2=new Scanner(System.in);
	    	    		  System.out.println("Enter name");
	    	    		  String b=s2.next();
	    	    		  boolean p=b.matches("[A-Za-z]{1,9}");
	    	    		  if(p==true)
	    	    		  {
	    	    		       a.setName(b);
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
	    	    		   String c=s.next();
	    	    		   boolean p=c.matches("[7,8,9]{1}[0-9]{9}");
	    	    		   if(p==true)
	    	    		   {
	    	    		      a.setMobNo(c);
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
	    	    		    String d=s.next();
	    	    		   boolean p=d.matches("[1-9]{1}[0-9]{11}");
	    	    		   if(p==true)
	    	    		   {
	    	    		    a.setAdharNo(d);
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
	    	    		    String e=s.next();
	    	    		    boolean p=e.matches("[M,m]{1}[A,a]{1}[L,l]{1}[E,e]{1}");
	    	    		    boolean p1=e.matches("[F,f]{1}[E,e]{1}[M,m]{1}[A,a]{1}[L,l]{1}[E,e]{1}");
	    	    		    if(p==true ||p1==true)
	    	    		    {
	    	    		    a.setGender(e);
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
	    	    		 Scanner s3=new Scanner(System.in);
	    	    		  System.out.println("enter Age");
	    	    		    int age=s3.nextInt();
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
	    	    		  
	    	    			  
	    	    		  catch(InputMismatchException i)
	    	    		  {
	    	    			  System.out.println("Enter valid Age");
	    	    		  }
	    	    		  }
	    	    		  
	    	    		  System.out.println("Balance"+amount);
	    	    	 System.out.println(" Create Account succesfully ");
	    	    	 
	    	    }


    
	    	    	
	    	    	
	    	    	    
	    	    	    
	  
public void displayAllDetails()
{ 
	Scanner s=new Scanner(System.in);
	      
	      while(true)
	      {
	    	  System.out.println("enter Account Number");
		      String  k1=s.next();
		       String ss=a.getAccNo();
	    if(ss.equals(k1))
	    {
	       String a2=a.getAccNo();
	
	 System.out.println("Account No="+a.getAccNo());
   	 System.out.println("Name="+a.getName());
   	 System.out.println("Mobile No="+a.getMobNo());
   	 System.out.println("Adhar No="+a.getAdharNo());
   	 System.out.println("Age="+a.getGender());
   	 System.out.println("Gender="+a.getAge());
   	 System.out.println("Balace Amount="+a.getBalance());
   	 System.out.println("-------------------------------");
   	break;
	    }
	      else
	      {
	    	  System.out.println("Invalid Account Number");
	      }
	    }
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
   

    


	      

	 

public void deposieMoney()
{
	
	
	while(true)
	{
	System.out.println("Enter diposite Amount ");
	double w=s.nextDouble();
	
	if(w>=500)
	{
	  double l=a.getBalance();
     System.out.println("old balance="+l);
	   double p1=l+w;
    System.out.println("new Blance="+p1);
	System.out.println("Deposited amount succesfully");
	    a.setBalance(p1);
	    break;
	}
	else
	{
		System.out.println("Enter amount above Rs-500");
	}
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
	     
	    
	         
	   

	
	


public void withdrawal()
{
while(true)
{
	System.out.println("Enter Withdrawal Amount");
	double amt=s.nextDouble();

	
	
	if(amt>=500&&amt<=25000)
	{	
	double p1=a.getBalance();
    double d=p1-amt;
        if(d>500)
       System.out.println("Currunt Balanace"+d);
       System.out.println("Amount withdra succesfully");
	    a.setBalance(d);
	    break;
	
	     }
       else
     	{
   	System.out.println("Maintain Rs -500 required for account Running");
   	  System.out.println("---------------------------------");
   	  withdrawal(); 
     	}
}
	      while(true)
	    	  
	      {
	  		System.out.println("please enter 1 for Receipt");
	  		System.out.println("please enter 2 for continue");

	  	    
	  	     String ax=s.next();
	  	     boolean p=ax.matches("[1-2]{1}");
	  	    if(p==true)
	  	    {
	  	   while(true)
	  	   {
	  	     switch(ax)
	  	     {
	  	     case "a":
	  	    	 System.out.println("please Take Your Receipt");
	  	    	 break;
	  	     case "b":
	  	    	 System.out.println("Thank you for save Earth");
	  	    	 break;
	  	     }
	  	    break;
	     	}
	  	   break;
        	}
	      
	        
	 else
	        {
	    	System.out.println("Amount widrawal Limit per Day is 25000");
	   
	        }
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
