package com.mvc.HomeServiceDao;

import java.util.List;

import com.mvc.model.Customer;
import com.mvc.model.Employee;

public interface HomeService {

	public int saveData(Employee emp);

	public int saveDatacstr(Customer cstr);
	
}
