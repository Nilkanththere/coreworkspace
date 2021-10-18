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
     public class Batch {
    @Id
      @Column(name="Batch_Id")
	  private int bid;
    @Column(name="Batch_Name")
	  private String bname;
    
   
	public Set<Faculty> getFaculty() {
		return faculty;
	}
	public void setFaculty(Set<Faculty> faculty) {
		this.faculty = faculty;
	}
	@ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="Batch_faculty",joinColumns={@JoinColumn(name="bid")},inverseJoinColumns={@JoinColumn(name="fid")})
     
    Set<Faculty>faculty=new HashSet<>();
	 
	  
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
