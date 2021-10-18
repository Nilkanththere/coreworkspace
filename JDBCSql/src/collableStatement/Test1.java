package collableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test1 {

	public static void main(String[] args) {
	
		
			
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","root");
				
				CallableStatement cs=con.prepareCall("{call insert_Data(?,?,?)}");
				
				cs.setInt(1,10005);
				cs.setString(2,"Nikhil");
				cs.setString(3,"Nashik");
				
				cs.execute();
				System.out.println("Insert Value");
				
				cs.close();
				con.close();
				
				
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
			
			
			

		}

	}


