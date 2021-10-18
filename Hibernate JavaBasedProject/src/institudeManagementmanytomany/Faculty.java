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
public class Faculty {

	@Id
	private int fid;
	private String fname;
	@ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="Faculty_course",joinColumns={@JoinColumn(name="fid")},inverseJoinColumns={@JoinColumn(name="cid")})
      
	Set<Course>course=new HashSet<>();
	public Set<Course> getCourse() {
		return course;
	}
	public void setCourse(Set<Course> course) {
		this.course = course;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
}
