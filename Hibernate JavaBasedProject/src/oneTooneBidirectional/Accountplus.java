package oneTooneBidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Accountplus {

	@Id
	private int acid;
	private int ammount;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="AC_no")
	private Account acno;
	
	public Account getAcno() {
		return acno;
	}
	public void setAcno(Account acno) {
		this.acno = acno;
	}
	public int getAcid() {
		return acid;
	}
	public void setAcid(int acid) {
		this.acid = acid;
	}
	public int getAmmount() {
		return ammount;
	}
	public void setAmmount(int ammount) {
		this.ammount = ammount;
	}
}
