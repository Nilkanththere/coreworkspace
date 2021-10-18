package com.wcs.webapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;
@NamedQueries({
@NamedQuery(name="view_data",query="from Employee "),
@NamedQuery(name="update",query="update Employee set password=:pass,name=:nm,addr=:adr,mobno=:mb,gender=:gen,dept=:dpt,desig=:des,salary=:sal,email=:eml where username=:uname"),


@NamedQuery(name="delete_row",query="delete from Employee where username=:uname")
})


@Entity
public class Employee {
	
	@Id
	private String username;
	private String password;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String addr;
	private String mobno;
	private String gender;
	private String dept;
	private String desig;
	private String email;
   
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	private String salary;
	
}
