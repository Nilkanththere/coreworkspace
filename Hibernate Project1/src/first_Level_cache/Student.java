package first_Level_cache;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

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
	@Id
	private int rollno;
	private String name;
	private String addr;
}
