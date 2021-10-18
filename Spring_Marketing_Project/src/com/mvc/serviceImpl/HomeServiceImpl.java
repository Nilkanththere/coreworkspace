package com.mvc.serviceImpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.dao.HomeDao;
import com.mvc.model.CustomerOrder;
import com.mvc.model.Product;

import com.mvc.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	HomeDao hd;
	
	@Override
	public int saveData1(Product p) {
		
		return hd.saveData1(p);
	}
	
	
	@Override
	public int saveData2(CustomerOrder o) {
		
		return hd.saveData2(o);
	}


	@Override
	public List<Product> loginCheck(int id, String name) {
		
		return hd.loginCheck(id, name);
	}
	
	
	
	
	
	
	

	
}
