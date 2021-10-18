package com.wcs.webapp.controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wcs.webapp.ServiceImpl.ServiceImpl;
import com.wcs.webapp.model.Employee;





@WebServlet(urlPatterns="/delete")
public class DeleteServlet extends HttpServlet {

	

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String unsername=request.getParameter("username");
		
		
		ServiceImpl serv=new ServiceImpl();
		
		       serv.deleteEmployee(unsername);
		   
		   List<Employee>list=serv.getAllEmployee();
		   
		request.setAttribute("data",list);
		
    RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
		    		
		   rd.forward(request, response);
		
		
		
		
		

		
		
	}
	
	
	
}
