package com.wcs.webapp.Service;

import java.util.List;

import com.wcs.webapp.model.Employee;

public interface ServiceI {

	void saveEmployee(Employee emp);
	Employee updateEmployee(Employee emp);
	void deleteEmployee(String unsername);
   Employee editEmployee(String username);
   List<Employee>loginEmployee(String username,String password);
   List<Employee>getAllEmployee();
  
	
	
	
}
