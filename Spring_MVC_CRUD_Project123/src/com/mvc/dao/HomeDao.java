package com.mvc.dao;

import java.util.List;

import com.mvc.model.Student;

public interface HomeDao {
	
	public int saveData(Student s);

	public List<Student>loginCheck(String uname,String pass);
	
	public List<Student>deleteRecord(int id);
	
	public Student editRecord(int id);
	
	public List<Student>updateRecord(Student s);
}
