package com.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Student Add in Table");
		int no=sc.nextInt();
		for(int i=0;i<no;i++)
		{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
		
			
				System.out.println("Enter Student Roll No");
				int rno=sc.nextInt();
				System.out.println("Enter Student Name");
				String sname=sc.next();
				System.out.println("Enter Student Address");
				String addr=sc.next();
			
			String sql="insert into Student value("+rno+",'"+sname+"','"+addr+"')";

			System.out.println(sql);
			Statement smt=con.createStatement();
			smt.execute(sql);
	
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
