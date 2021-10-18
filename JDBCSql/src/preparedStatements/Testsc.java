package preparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Testsc {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Insert No.of Student Data here");
		int stu=sc.nextInt();
		for(int i=0;i<stu;i++)
		{
		
		System.out.println("Enter Student Roll No");
		int rno=sc.nextInt();
		System.out.println("Enter Studen name");
		String name=sc.next();
		System.out.println("Enter Student Address");
		String addr=sc.next();
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			
			String sql="insert into student value(?,?,?)";
			System.out.println(sql);
			PreparedStatement ps=con.prepareStatement(sql);
			
			
			ps.setInt(1, rno);
			ps.setString(2,name);
			ps.setString(3, addr);
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
