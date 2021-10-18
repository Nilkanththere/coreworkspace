package com.mvc.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Customer {
	
	@Id
	private int cid;
	private String name;
	
	private String addr;
	private String mobno;
	private String email;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Bank bnk;


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
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


	public String getMobno() {
		return mobno;
	}


	public void setMobno(String mobno) {
		this.mobno = mobno;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Bank getBnk() {
		return bnk;
	}


	public void setBnk(Bank bnk) {
		this.bnk = bnk;
	}
	

}
