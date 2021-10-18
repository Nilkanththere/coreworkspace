package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class College1 {

	public static void main(String[] args) {
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			
			
			String sql="select * from College";
			
			 Statement smt=con.createStatement();
		     
		     ResultSet rs=smt.executeQuery(sql);
		     
		     while(rs.next())
		     {
		    	 System.out.println("College id="+rs.getInt(1));
		    	 System.out.println("College Name="+rs.getString(2));
		    	 System.out.println("College Address="+rs.getString(3));
		     }
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
	
			e.printStackTrace();
		}

	}

}
