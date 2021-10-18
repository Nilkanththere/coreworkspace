package com.Hibernate_Name_queries;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
@NamedQueries({
//@NamedQuery(name="all_stu",query="from Student"),
//@NamedQuery(name="one_stu",query="from Student where rollno=:rno")})
@NamedQuery(name="update_name",query="update Student set name=:nm where rollno=:rno"),
@NamedQuery(name="update_addr",query="update Student set addr=:adr where rollno=:rno"),
@NamedQuery(name="delete_row",query="delete from Student where rollno=:rno")})
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
