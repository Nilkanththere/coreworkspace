package criteriaBuilder_ex1;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToMany;

@Entity
public class Department {
@OneToMany(cascade=CascadeType.ALL,mappedBy="dpt")
	
	Set<Employee>semp=new HashSet<>();
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

	public Set<Employee> getSemp() {
		return semp;
	}
	public void setSemp(Set<Employee> semp) {
		this.semp = semp;
	}
	@Id
	private int did;
	private String name;
	
	
}
