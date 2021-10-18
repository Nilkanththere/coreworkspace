package isRelation_Mapping_Single_table_Ex;

import javax.persistence.Entity;

@Entity
public class PuneBranch extends TCSsolutions {
	
	
	private String nightshift;

	public String getNightshift() {
		return nightshift;
	}

	public void setNightshift(String nightshift) {
		this.nightshift = nightshift;
	}

	
}
