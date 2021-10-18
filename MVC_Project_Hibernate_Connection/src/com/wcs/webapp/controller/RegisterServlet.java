package com.wcs.webapp.controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.wcs.webapp.Service.ServiceI;
import com.wcs.webapp.ServiceImpl.ServiceImpl;
import com.wcs.webapp.model.Employee;


@WebServlet(urlPatterns="/reg")
public class RegisterServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	 String userid=request.getParameter("t1"); 
	  String password=request.getParameter("t2"); 
	  String name =request.getParameter("t3"); 
	  String address=request.getParameter("t4");
	  String mobno=request.getParameter("t5");
	  String gender=request.getParameter("t6");
	  String dpt=request.getParameter("t7");
	  String degi=request.getParameter("t8");
	  String salary=request.getParameter("t9");
	  String email=request.getParameter("t10"); 
	  
	  Employee emp=new Employee();
	  
	  emp.setUsername(userid);
	  emp.setPassword(password);
	  emp.setName(name);
	  emp.setAddr(address);
	  emp.setMobno(mobno);
	  emp.setGender(gender);
	  emp.setDept(dpt);
	  emp.setDesig(degi);
	  emp.setSalary(salary);
	  emp.setEmail(email);
	  
	  ServiceI serv=new ServiceImpl();
	  serv.saveEmployee(emp);
	 List<Employee>list=serv.getAllEmployee();
	     
	   request.setAttribute("data",list);
	RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
	rd.forward(request, response);
}

}
