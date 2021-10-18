package isRelation_default_Task;


import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public class Employee {
@Id
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	private int eid;
	private String ename;
	
}
