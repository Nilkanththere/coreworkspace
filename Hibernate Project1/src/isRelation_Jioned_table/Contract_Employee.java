package isRelation_Jioned_table;

import javax.persistence.Entity;

@Entity
public class Contract_Employee extends Company{

	
	public float getPay_per_hour() {
		return pay_per_hour;
	}
	public void setPay_per_hour(float pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}
	public String getContract_duration() {
		return contract_duration;
	}
	public void setContract_duration(String contract_duration) {
		this.contract_duration = contract_duration;
	}
	private float pay_per_hour;
	private String contract_duration;
}
