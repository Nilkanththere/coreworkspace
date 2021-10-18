package com.braindatawire.institutemanagementsystem.model;

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
public class Faculty {
@Id
@Column(name="Faculty_Id")
	private int fid;
@Column(name="Faculty_Name")
	private String fname;

@ManyToMany(cascade=CascadeType.ALL)
@JoinTable(name="Faculty_Course",joinColumns={@JoinColumn(name="fid")},inverseJoinColumns={@JoinColumn(name="cid")})
	
Set<Course>course=new HashSet<>();
	public int getFid() {
	return fid;
}
public void setFid(int fid) {
	this.fid = fid;
}

	public Set<Course> getCourse() {
	return course;
}
public void setCourse(Set<Course> course) {
	this.course = course;
}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
}
