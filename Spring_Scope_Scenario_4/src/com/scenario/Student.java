package com.scenario;

public class Student {

	
	private Address addr;
	
	public Student()
	{
	System.out.println("Student----Constructor");
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	
}
