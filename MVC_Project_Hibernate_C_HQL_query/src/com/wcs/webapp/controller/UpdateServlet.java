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


@WebServlet(urlPatterns="/update")
public class UpdateServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String uname=request.getParameter("username");
		String pass=request.getParameter("password");
		String nm=request.getParameter("name");
		String adr=request.getParameter("addr");
		String ph=request.getParameter("mobno");
		String gender=request.getParameter("gender");
		String dept=request.getParameter("dept");
		String desig=request.getParameter("desig");
		String salary=request.getParameter("salary");
		String eml=request.getParameter("email");
		
		
		
		Employee emp=new Employee();
		
		emp.setUsername(uname);
		emp.setPassword(pass);
		emp.setName(nm);
		emp.setAddr(adr);
		emp.setMobno(ph);
		emp.setGender(gender);
		emp.setDept(dept);
		emp.setDesig(desig);
		emp.setSalary(salary);
		emp.setEmail(eml);
		
		ServiceImpl serv=new ServiceImpl();
		
		Employee emp1=serv.updateEmployee(emp);
		List<Employee>list=serv.getAllEmployee();
	     
		
	     request.setAttribute("data", list);
		
		RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
		
		rd.forward(request, response);
	}
	
	
	
}
