package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.jdbc.Driver");

		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		
		String sql="select * from Student";
		Statement smt=con.createStatement();
		
		ResultSet rs=smt.executeQuery(sql);
		
		while(rs.next())
		{
			System.out.println("Student Rollmo="+rs.getInt(1));
			System.out.println("Student Name="+rs.getString(2));
			System.out.println("Student Address="+rs.getString(3));
		}
	}

}
