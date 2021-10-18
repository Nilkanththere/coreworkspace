package cjc.com.practice;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Bank {
	
	@Id
	private int bid;
	private String bname;
	
	
//	private AccountHolders ach;
//	public AccountHolders getAch() {
//		return ach;
//	}
//
//	public void setAch(AccountHolders ach) {
//		this.ach = ach;
//	}

	@ManyToMany(cascade=CascadeType.ALL)
	Set<AccountHolders>achd=new HashSet<>();
	
	public int getBid() {
		return bid;
	}

	public Set<AccountHolders> getAchd() {
		return achd;
	}

	public void setAchd(Set<AccountHolders> achd) {
		this.achd = achd;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}


	
	
	
}
