package preparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Fetchdata {

	
	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","root");
			
			String sql="select * from student";
			
			PreparedStatement ps=con.prepareStatement(sql);
			
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				System.out.println("Student Id:-"+rs.getInt(1));
				System.out.println("Student Name:-"+rs.getString(2));
				System.out.println("Student Address:-"+rs.getString(3));
				System.out.println();
			}
	
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
