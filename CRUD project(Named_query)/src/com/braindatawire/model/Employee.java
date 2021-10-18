package com.braindatawire.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
@NamedQueries({
@NamedQuery(name="update_name",query="update Employee set name=:nm where eid=:id"),
@NamedQuery(name="update_addr",query="update Employee set addr=:adr where eid=:id"),
@NamedQuery(name="update_salary",query="update Employee set salary=:sal where eid=:id"),
@NamedQuery(name="update_phno",query="update Employee set phno=:ph where eid=:id"),
@NamedQuery(name="view_data",query="from Employee where eid=:id"),
@NamedQuery(name="delete_row",query="delete from Employee where eid=:id")})

@Entity
public class Employee {

	@Id
	private int eid;
	private String name;
	private String addr;
	private double salary;
	private long phno;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
}
