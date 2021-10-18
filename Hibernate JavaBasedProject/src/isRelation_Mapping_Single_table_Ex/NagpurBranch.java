package isRelation_Mapping_Single_table_Ex;

import javax.persistence.Entity;

@Entity
public class NagpurBranch extends TCSsolutions {
	
   private String dayshift;

public String getDayshift() {
	return dayshift;
}

public void setDayshift(String dayshift) {
	this.dayshift = dayshift;
}
	
	
	
}
