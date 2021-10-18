package com.di.tostring.display;

public class Employee {
	
	
	
	private int eid;
	private String name;
	private String addr;
	private String salary;
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", addr=" + addr + ", salary=" + salary +  "]";
	}
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public void display()
	{
		System.out.println(this.eid);
		System.out.println(this.name);
		System.out.println(this.addr);
		System.out.println(this.salary);
		
		
		
		
	}
	
	
	

}
