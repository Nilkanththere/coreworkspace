package com.constructor;

import java.util.Arrays;

public class Student {

	
	private int id;
	private String name;
	
	private String mobno[];

	public Student(int id, String name, String[] mobno) {
		super();
		this.id = id;
		this.name = name;
		this.mobno = mobno;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobno=" + Arrays.toString(mobno) + "]";
	}
}
