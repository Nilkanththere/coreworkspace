package preparedStatements;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test {

public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","root");
			
			
			String sql="insert into student value(?,?,?)";
			
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setInt(1,1001);
			ps.setString(2,"Rahul");
			ps.setString(3,"Nagpur");
			
			ps.execute();
			
			System.out.println("Insert Value");
			
			ps.close();
			con.close();
			
			
			
			
			
			
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
