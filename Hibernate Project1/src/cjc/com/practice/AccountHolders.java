package cjc.com.practice;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class AccountHolders {

	@Id
	private int cid;
	private String cname;
	private String caddr;
	
	
	//private Bank bk;

//	 public Bank getBk() {
//		return bk;
//	}
//
//	public void setBk(Bank bk) {
//		this.bk = bk;
//	}

	public Set<Bank> getBck() {
		return bck;
	}

	public void setBck(Set<Bank> bck) {
		this.bck = bck;
	}
	@ManyToMany(cascade=CascadeType.ALL)
	Set<Bank>bck=new HashSet<>();
	
	
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

	public String getCaddr() {
		return caddr;
	}

	public void setCaddr(String caddr) {
		this.caddr = caddr;
	}


	
	
}
