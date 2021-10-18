package delete.query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete_Query {

	public static void main(String[] args) {
	
	
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","root");
				
				
				
				
				String sql="delete from employee where empid=123";
				System.out.println(sql);
				Statement smt=con.createStatement();
			
			smt.execute(sql);
			
			smt.close();
			con.close();
				
				
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		

	}
		
	
		
		
		
		

}
