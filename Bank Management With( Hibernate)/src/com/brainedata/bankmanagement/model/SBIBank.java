package com.brainedata.bankmanagement.model;


import java.util.ArrayList;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class SBIBank {
    @Id
    
    @Column(name="IFSC_Code")
    private String ifsccode;
    @OneToMany(cascade=CascadeType.ALL,mappedBy="sbi")
    
  private List<Account>l=new ArrayList<>();
    
	
	
	public List<Account> getL() {
		return l;
	}
	public void setL(List<Account> l) {
		this.l = l;
	}
	public String getIfsccode() {
		return ifsccode;
	}
	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}
}
