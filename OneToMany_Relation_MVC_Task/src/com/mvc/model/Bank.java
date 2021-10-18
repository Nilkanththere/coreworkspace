package com.mvc.model;

import java.util.HashSet;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToMany;
@Entity
public class Bank {
	
	@Id
	private int ifsc;
	private String name;
	private String addr;
	
	
	
	public int getIfsc() {
		return ifsc;
	}



	public void setIfsc(int ifsc) {
		this.ifsc = ifsc;
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



	public Set<Customer> getCstr() {
		return cstr;
	}



	public void setCstr(Set<Customer> cstr) {
		this.cstr = cstr;
	}



	@OneToMany(cascade=CascadeType.ALL,mappedBy="bnk")
	Set<Customer>cstr=new HashSet<>();


	
}
