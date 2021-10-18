package com.mvc.dao;

import java.util.List;

import com.mvc.model.CustomerOrder;
import com.mvc.model.Product;


public interface HomeDao {
	
	public int saveData1(Product p);
	
	public int saveData2(CustomerOrder o);

	public List<Product>loginCheck(int id,String name);
	
//	public List<Admin>deleteRecord(int id);
//	
//	public Admin editRecord(int id);
//	
//	public List<Admin>updateRecord(Admin a);
}
