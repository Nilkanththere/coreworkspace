package preparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Updated {

	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","root");
			
           String sql="update student set name=?,address=? where idStudent=?";
			
			PreparedStatement ps=con.prepareStatement(sql);
			
			
			ps.setString(1,"Rakesh");
			ps.setString(2,"Nagpur");
			ps.setInt(3,123);
            ps.executeUpdate();
			
			System.out.println("Update Value");
			
			ps.close();
			con.close();
			
			
			
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		

	}

}
