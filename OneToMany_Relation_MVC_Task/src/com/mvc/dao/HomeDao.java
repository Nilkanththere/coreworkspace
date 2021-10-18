package com.mvc.dao;

import java.util.List;

import com.mvc.model.Bank;



public interface HomeDao {
	
	public int saveData1(Bank s);
	
	public List<Bank>loginCheck(String name,String mobno);


	public Bank editdata(int rollno);


	public List<Bank>updateRecord(Bank s);


	public List<Bank> deletedata(int rollno);

	public List<Bank>displayall();
	
	
}
