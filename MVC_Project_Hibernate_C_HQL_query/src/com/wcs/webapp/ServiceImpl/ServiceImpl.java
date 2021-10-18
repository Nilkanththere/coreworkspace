package com.wcs.webapp.ServiceImpl;

import java.util.List;


import com.wcs.webapp.HiberI.HiberI;
import com.wcs.webapp.HiberImpl.HiberImpl;
import com.wcs.webapp.Service.ServiceI;
import com.wcs.webapp.model.Employee;

public class ServiceImpl implements ServiceI{

	
	  HiberI hib=new HiberImpl();
	@Override
	public void deleteEmployee(String username) {

		
		hib.deleteEmployee(username);
		
	}

	@Override
	public Employee editEmployee(String username) {

        Employee emp=hib.editEmployee(username);
		
		
		return emp;
	}

	
	@Override
	public void saveEmployee(Employee emp) {
		
		hib.saveEmployee(emp);
		
		
	}

	@Override
	public Employee updateEmployee(Employee emp) 
	{

            Employee emp1= hib.updateEmployee(emp);
            
            
			return emp1;
			
	}

	@Override
	public List<Employee> loginEmployee(String username, String password) {

       List<Employee>list=hib.loginEmployee(username, password);
		
		
		return list;
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		List<Employee>list=hib.getAllEmployee();
		
		  
		return list;
	}

}
