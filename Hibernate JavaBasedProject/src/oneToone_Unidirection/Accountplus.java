package oneToone_Unidirection;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Accountplus {

	@Id
	private int acid;
	private int ammount;
	
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
