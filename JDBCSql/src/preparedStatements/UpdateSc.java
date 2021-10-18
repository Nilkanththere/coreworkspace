package preparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class UpdateSc {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Which id row you want to Update");
		int id=sc.nextInt();
		System.out.println("Enter Name you want to Update ");
		String name=sc.next();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","root");
			
			String sql="update employee1 set ename=? where  empid=?";
			
			System.out.println(sql);
			
			PreparedStatement ps=con.prepareStatement(sql);
		    ps.setString(1, name);
			ps.setInt(2, id);
		    ps.execute();
		    ps.close();
		    con.close();
		
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
		
		
		
		
		
		

	}


