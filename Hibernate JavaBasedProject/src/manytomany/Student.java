package manytomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Student {

	@Id
	private int rollno;
	private String name;
	
	private String addr;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Student_course",joinColumns={@JoinColumn(name="rollno")},inverseJoinColumns={@JoinColumn(name="cid")})
	
	Set<Course>scourse=new HashSet<>();

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Set<Course> getScourse() {
		return scourse;
	}

	public void setScourse(Set<Course> scourse) {
		this.scourse = scourse;
	}
	
}
