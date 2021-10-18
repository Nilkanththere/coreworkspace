package com.wcs.webapp.controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.wcs.webapp.ServiceImpl.ServiceImpl;
import com.wcs.webapp.model.Employee;


@WebServlet(urlPatterns="/edit")
public class Edit extends HttpServlet{

	
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usernm=request.getParameter("username");
		
		ServiceImpl serv=new ServiceImpl();
		
		Employee emp=serv.editEmployee(usernm);
		
		request.setAttribute("data",emp);
		
RequestDispatcher rd=request.getRequestDispatcher("edit.jsp");
		
		rd.forward(request, response);
		
	}
	
	
	
}
