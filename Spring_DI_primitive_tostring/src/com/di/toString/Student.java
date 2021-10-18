package com.di.toString;

public class Student {

	
	private int rollno;
	private String name;
	private String addr;
	

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}



	public void setName(String name) {
		this.name = name;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", addr=" + addr +  "]";
	}
	
	
	
	
	
}
