package com.servlet.session;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(urlPatterns="/first")
public class FirstServlet extends HttpServlet{

	
	
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		System.out.println("First----Servlet");
		
		
		String uname=request.getParameter("t1");
		
		HttpSession session =request.getSession();
		
		System.out.println(session);
		if(!session.isNew())
		{
			session.invalidate();
			session=request.getSession();
		}
		
		session.setAttribute("fd", uname);
		
		
		RequestDispatcher rd=request.getRequestDispatcher("second.jsp");
		
		rd.forward(request, response);
		
	} 
}
