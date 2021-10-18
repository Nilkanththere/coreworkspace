package oneTooneBidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Account {

@Id
private int acno;
private String name;
private String addr;

@OneToOne(cascade=CascadeType.ALL)


private Accountplus acp;

public Accountplus getAcp() {
	return acp;
}
public void setAcp(Accountplus acp) {
	this.acp = acp;
}
public int getAcno() {
	return acno;
}
public void setAcno(int acno) {
	this.acno = acno;
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
