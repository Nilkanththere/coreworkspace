package com.brainedata.bankmanagement.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Account {
    @Id
    @Column(name="ACC_NO")
	private String accNo;
    @Column(name="Name")
	private String name;
    @Column(name="Mob_NO")
	private String mobNo;
    @Column(name="Adhar_NO")
	private String adharNo;
    @Column(name="Gender")
	private String gender;
    @Column(name="Age")
	private int age;
    @Column(name="Balance")
	private double  balance;
	
    @ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="IFSC_code")
	private SBIBank sbi;
	
	public SBIBank getSbi() {
		return sbi;
	}
	public void setSbi(SBIBank sbi) {
		this.sbi = sbi;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
