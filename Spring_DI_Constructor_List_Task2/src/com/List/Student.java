package com.List;

import java.util.List;

public class Student {

	private int id;
	private String name;
	
	private List mobno;

	public Student(int id, String name, List mobno) {
		super();
		this.id = id;
		this.name = name;
		this.mobno = mobno;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobno=" + mobno + "]";
	}
	
	
}
