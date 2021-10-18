package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No.of Employee Add into Table  ");
		int no=sc.nextInt();
		for(int i=0;i<no;i++)
		{
		Class.forName("com.mysql.jdbc.Driver");
		 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "root");
		
		System.out.println("Enter Employee Id");
		int eid=sc.nextInt();
		System.out.println("Enter  Employee Name");
		String ename=sc.next();
		System.out.println("Enter Employee Address ");
		String eaddr=sc.next();
		
		//String sql="create table Employee1(empid INT(5),ename char(100),eaddress char(200),CONSTRAINT PK PRIMARY KEY(empid))";
		String sql="insert into Employee1 value("+eid+",'"+ename+"','"+eaddr+"')";
		System.out.println(sql);
		Statement smt=con.createStatement();
		
        System.out.println("insert value sucessfully");
		smt.execute(sql);
		smt.close();
		con.close();
	}

}
}
