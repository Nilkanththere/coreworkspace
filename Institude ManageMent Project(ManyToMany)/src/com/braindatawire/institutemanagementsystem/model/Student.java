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
public class Student {

	@Id
	@Column(name="Student_ID")
	private int sid;
	@Column(name="Student_Name")
	private String sname;

	@ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="Student_batch",joinColumns={@JoinColumn(name="sid")},inverseJoinColumns={@JoinColumn(name="bid")})
	Set<Batch>batch=new HashSet<>();
	
	public Set<Batch> getBatch() {
		return batch;
	}
	public void setBatch(Set<Batch> batch) {
		this.batch = batch;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
}
