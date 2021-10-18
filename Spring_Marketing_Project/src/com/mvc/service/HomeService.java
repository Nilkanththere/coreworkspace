package com.mvc.service;

import java.util.List;

import com.mvc.model.CustomerOrder;
import com.mvc.model.Product;


public interface HomeService {

	
public int saveData1(Product p);
	
	public int saveData2(CustomerOrder o);

	public List<Product>loginCheck(int id,String name);
}
