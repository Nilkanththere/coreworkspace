package com.di.secondary_tostring_costom_M;

public class Employee {

	
	private int eid;
	private String name;
	private String addr;
	private Department dept;
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", addr=" + addr + ", dept=" + dept.getDid() +",dept="+dept.getDname()+  "]";
	}
	
	
	public void getdisplay()
	{
		System.out.println(this.eid);
		System.out.println(this.name);
		System.out.println(this.addr);
		System.out.println(dept.getDid());
		System.out.println(dept.getDname());
	}
	
	
	
	
	
}
