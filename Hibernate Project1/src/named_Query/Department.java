package named_Query;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
@NamedQuery(name="All_dept",query="from Department"),
@NamedQuery(name="update_name",query="update Department set  name=:nm where did=:id"),
@NamedQuery(name="update_address",query="update Department set addr=:adr where did=:id"),
@NamedQuery(name="Select_data",query=" from Department where did=:id"),
@NamedQuery(name="delete_data",query="delete from Department where did=:id")	
})
@Entity
public class Department
{
	
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
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
	private int did;
	private String name;
	private String addr;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	

