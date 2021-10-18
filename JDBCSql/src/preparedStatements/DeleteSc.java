package preparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteSc {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. of row you want to Delete");
		int id=sc.nextInt();
		for(int i=0;i<id;i++)
		{
		System.out.println("Enter id you want to delete");
		int id1=sc.nextInt();
		

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","root");
			
			String sql="delete  from employee1  where  empid=?";
			
			System.out.println(sql);
			
			PreparedStatement ps=con.prepareStatement(sql);
		
			ps.setInt(1,id1);
		   ps.execute();
		   ps.close();
		   con.close();
		
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}
}

