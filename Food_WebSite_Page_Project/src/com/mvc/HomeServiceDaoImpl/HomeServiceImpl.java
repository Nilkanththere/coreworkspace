package com.mvc.HomeServiceDaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.HomeServiceDao.HomeService;
import com.mvc.Homedao.HomeDao;
import com.mvc.model.Customer;
import com.mvc.model.Employee;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	HomeDao hd;

	@Override
	public int saveData(Employee emp) {

		return hd.saveData(emp);
	}

	@Override
	public int saveDatacstr(Customer cstr) {

		return hd.saveDatacstr(cstr);
	}

}
