package com.servlet.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.servlet.model.Student;

import DaoUtil.DaoUtil;
@WebServlet(urlPatterns="/log")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname=request.getParameter("t1");
		String pass=request.getParameter("t2");
		System.out.println(uname);
		System.out.println(pass);
		Connection con=DaoUtil.getConnection();
		
		List<Student>list=new ArrayList<Student>();
		
		
		try {
			Statement smt=con.createStatement();
			
			String sql="select * from student where username='"+uname+"'&& password='"+pass+"'";	
			ResultSet rs=smt.executeQuery(sql);
			
		while(rs.next())
		{
			Student stu=new Student();
			stu.setUsername(rs.getString(1));
			stu.setPassword(rs.getString(2));
			stu.setName(rs.getString(3));
			stu.setAddr(rs.getString(4));
			stu.setPhno(rs.getString(5));
			stu.setEmail(rs.getString(6));
			
			list.add(stu);
			
		}
			
		
		request.setAttribute("data",list);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
		
		rd.forward(request, response);
		
		
		
	}
	
	
	
	
}
