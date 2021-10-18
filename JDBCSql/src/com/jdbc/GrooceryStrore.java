package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GrooceryStrore {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No.of Item Add into Table  ");
		int no=sc.nextInt();
		for(int i=0;i<no;i++)
		{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","root");
			
			System.out.println("Enter Item Id");
			int iid=sc.nextInt();
			System.out.println("Enter  Product Name");
			String iname=sc.next();
			System.out.println("Enter Mfd Date ");
			String idate=sc.next();
			System.out.println("Enter no.of Quantity");
			int qty=sc.nextInt();
			System.out.println("Enter Product price");
			double Rs=sc.nextDouble();
			
			
			String sql="create table Item(Item_id INT(5),name char(100),Mfd_Date char(100),Quantity INT(10),Price Double)";
             
			System.out.println("create table sucessfully");
			Statement smt=con.createStatement();
			
			smt.execute(sql);
			smt.close();
			con.close();
			
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
}