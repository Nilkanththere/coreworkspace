package jdbc.updteQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update_query {

	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","root");
			
			Statement smt=con.createStatement();
			
			
			String sql="update employee set ename='Rakesh' where  empid=123";
			System.out.println(sql);
			smt.execute(sql);
			smt.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
