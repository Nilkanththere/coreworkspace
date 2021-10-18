package oneToMany;





import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Doctor {
  
	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Patient> getPat() {
		return pat;
	}

	public void setPat(Set<Patient> pat) {
		this.pat = pat;
	}
	 @Id
	private int did;
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Patient>pat=new HashSet<>();

}
