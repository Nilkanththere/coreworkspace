package delete.query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Delete_sc {

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Which id row you want to delete");
		int id=sc.nextInt();
		
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","root");
				
				String sql="delete from EmployeeInfo where id="+id+"";
				
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


