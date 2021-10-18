package com.wcs.webapp.HiberI;

import java.util.List;

import com.wcs.webapp.model.Employee;

public interface HiberI {

	
	
	void saveEmployee(Employee emp);
	Employee updateEmployee(Employee emp);
	void deleteEmployee(String username);
   Employee editEmployee(String username);
   List<Employee>loginEmployee(String username,String password);
   List<Employee>getAllEmployee();
  
	
	
}
