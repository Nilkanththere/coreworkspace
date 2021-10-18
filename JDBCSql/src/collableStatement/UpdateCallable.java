package collableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateCallable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","root");
			
		String sql="update set  student  where idStudent=?";
				
	    CallableStatement  cs=con.prepareCall(sql);
			
	    
	       cs.setInt(1,102);
	       cs.setString(2,"Ravi");
	       cs.setString(3, "Chandrapur");
			cs.executeUpdate();
			
			System.out.println("Value Deleted ");
			
			
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

	}


