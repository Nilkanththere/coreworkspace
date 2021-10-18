package com.mvc.service;




import java.util.List;

import com.mvc.model.Student;


public interface HomeService {

	
public int saveData1(Student s);
	
public List<Student>loginCheck(String name,String mobno);


public Student editdata(int rollno);


public List<Student>updateRecord(Student s);


public List<Student> deletedata(int rollno);

public List<Student>displayall();
}
