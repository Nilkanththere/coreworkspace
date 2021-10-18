package com.hibernatepro;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Corse {
    @Id
	private int cid;
    private String Cname;
    
    @ManyToMany(cascade=CascadeType.ALL)
    
    Set<Student1>stu=new HashSet<>();
	public Set<Student1> getStu() {
		return stu;
	}
	public void setStu(Set<Student1> stu) {
		this.stu = stu;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
    
    
    
}
