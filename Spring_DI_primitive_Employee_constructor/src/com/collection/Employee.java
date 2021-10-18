package com.collection;

public class Employee {

	
	
	private int eid;
	private String name;
	private String addr;
	public Employee(int eid, String name, String addr) {
		super();
		this.eid = eid;
		this.name = name;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", addr=" + addr + "]";
	}
	
}
