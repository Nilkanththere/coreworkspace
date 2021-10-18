package com.Hibernate_Named_query;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
@NamedQuery(name="all_stu" ,query="from Student")
@Entity
public class Student {
	
	@Id
	private int rollno;
	private String name;
	private String addr;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
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
