package com.mvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerOrder {

	
	@Id
	private int cid;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getBprice() {
		return bprice;
	}
	public void setBprice(String bprice) {
		this.bprice = bprice;
	}
	public String getBquantity() {
		return bquantity;
	}
	public void setBquantity(String bquantity) {
		this.bquantity = bquantity;
	}
	private String cname;
	private String bprice;
	private String bquantity;
	
}
