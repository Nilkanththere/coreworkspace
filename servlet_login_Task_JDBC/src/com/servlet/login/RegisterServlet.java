package com.servlet.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.model.Student;

import DaoUtil.DaoUtil;
@WebServlet(urlPatterns="/reg")
public class RegisterServlet extends HttpServlet  {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname=request.getParameter("t1");
		String pass=request.getParameter("t2");
		String name=request.getParameter("t3");
		String adr=request.getParameter("t4");
		String phno=request.getParameter("t5");
		String email=request.getParameter("t6");
		
		Student stu=new Student();
		stu.setUsername(uname);
		stu.setPassword(pass);
		stu.setName(name);
		stu.setAddr(adr);
		stu.setPhno(phno);
		
		stu.setEmail(email);
		
		
		Connection con=DaoUtil.getConnection();
		
		String sql="insert into student value(?,?,?,?,?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			
			System.out.println("Insert data succesfully ");
			ps.setString(1,uname);
	        ps.setString(2,pass);
	        ps.setString(3,name);
	        ps.setString(4,adr);
	        ps.setString(5,phno);
	        ps.setString(6,email); 
			  
			
			ps.executeUpdate();
			ps.close();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher rd=request.getRequestDispatcher("login.html");
		
		rd.forward(request, response);
		
		
	}
	
	
	

}
