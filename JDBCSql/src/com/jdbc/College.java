package com.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class College {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter No.of Collegs Add To Table");
		
		int no=sc.nextInt();
		for(int i=0;i<=no;i++)
		{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			
  Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
  System.out.println("Connection Established");
       Statement smt=con.createStatement();
       System.out.println("Enter College Id");
       int a=sc.nextInt();
       System.out.println("Enter College Name");
       String  b=sc.next();
       System.out.println("Enter College Address ");
       String c=sc.next();
  
		
  
   smt.executeUpdate("insert into college value('"+a+"','"+b+"','"+c+"')");
   System.out.println("Values Inserted Sucsessfully");
   
     
       con.close();
      smt.close();
      
		}
		
		catch(ClassNotFoundException | SQLException e)
		{
			
			e.printStackTrace();

			}
		}
	}
}

