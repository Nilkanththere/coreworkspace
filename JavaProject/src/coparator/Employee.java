package coparator;

public class Employee implements Comparable<Employee> {

	
	private int eid;
	private String ename;
	private double esalary;
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
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	public int compareTo(Employee ex)
	{
		//return this.eid-ex.eid;
		return this.ename.compareTo(ex.ename);
		//return (int)(this.esalary-ex.esalary);
	}
}
