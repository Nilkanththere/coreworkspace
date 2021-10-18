package manytoone;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee {
    @Id
	private int id;
	private String  name;
	@OneToMany(cascade=CascadeType.ALL)
	Set<Department>dpt=new HashSet<>();
	public Set<Department> getDpt() {
		return dpt;
	}
	public void setDpt(Set<Department> dpt) {
		this.dpt = dpt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
