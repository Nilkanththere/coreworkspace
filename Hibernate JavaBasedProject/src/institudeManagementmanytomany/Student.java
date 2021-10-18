package institudeManagementmanytomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;


@Entity
public class Student {
    @Id
	private int id;
	
	private String name;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Student_batch",joinColumns={@JoinColumn(name="id")},inverseJoinColumns={@JoinColumn(name="bid")})
	
	Set<Batch>batch=new HashSet<>();
	public Set<Batch> getBatch() {
		return batch;
	}
	public void setBatch(Set<Batch> batch) {
		this.batch = batch;
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
