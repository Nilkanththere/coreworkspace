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
public class Batch {

	@Id
	private int bid;
	private String bname;
	
	@ManyToMany(cascade=CascadeType.ALL)
     @JoinTable(name="Batch_faculty",joinColumns={@JoinColumn(name="bid")},inverseJoinColumns={@JoinColumn(name="fid")})
	
	   Set<Faculty>faculty=new HashSet<>();
	public Set<Faculty> getFaculty() {
		return faculty;
	}
	public void setFaculty(Set<Faculty> faculty) {
		this.faculty = faculty;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	
}
