package institudeManageMentProject1;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Faculty {

	@Id
	@Column(name="Faculty_Id")
	private int fid;
	@Column(name="Faculty_Name")
	private String fname;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Course_Id")
      private Course c;
	
	public Course getC() {
		return c;
	}
	public void setC(Course c) {
		this.c = c;
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
