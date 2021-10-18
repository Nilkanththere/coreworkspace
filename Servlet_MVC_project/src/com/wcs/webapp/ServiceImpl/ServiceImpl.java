package com.wcs.webapp.ServiceImpl;

import java.util.List;

import com.wcs.webapp.DaoI.DaoI;
import com.wcs.webapp.DaoImpl.DaoImpl;
import com.wcs.webapp.Service.ServiceI;
import com.wcs.webapp.model.Employee;

public class ServiceImpl implements ServiceI{

	
	  DaoI dao=new DaoImpl();
	@Override
	public void deleteEmployee(String username) {

		
		dao.deleteEmployee(username);
		
	}

	@Override
	public Employee editEmployee(String username) {

        Employee emp=dao.editEmployee(username);
		
		
		return emp;
	}

	
	@Override
	public void saveEmployee(Employee emp) {
		
		dao.saveEmployee(emp);
		
		
	}

	@Override
	public Employee updateEmployee(Employee emp) 
	{

            Employee emp1= dao.updateEmployee(emp);
            
            
			return emp1;
			
	}

	@Override
	public List<Employee> loginEmployee(String username, String password) {

       List<Employee>list=dao.loginEmployee(username, password);
		
		
		return list;
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		List<Employee>list=dao.getAllEmployee();
		
		  
		return list;
	}

}
