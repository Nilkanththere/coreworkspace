package com.mvc.serviceImpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.dao.HomeDao;
import com.mvc.model.Student;
import com.mvc.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	HomeDao hd;
	
	@Override
	public int saveData1(Student s) {
		
		return hd.saveData1(s);
	}

	@Override
	public List<Student> loginCheck(String name, String mobno) {
		
		return hd.loginCheck(name, mobno);
	}

	@Override
	public Student editdata(int rollno) {
		
		return hd.editdata(rollno);
	}

	@Override
	public List<Student> updateRecord(Student s) {
	
		return hd.updateRecord(s);
	}

	@Override
	public List<Student> deletedata(int rollno) {
		
		return hd.deletedata(rollno);
	}

	@Override
	public List<Student> displayall() {
		
		return hd.displayall();
	}

	
	
	
	
	
	
	
	

	
}
