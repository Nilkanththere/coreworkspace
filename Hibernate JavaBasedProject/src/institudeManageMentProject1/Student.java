package institudeManageMentProject1;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Student {
    @Id
	private int id;
	private String name;
	@ManyToOne(cascade=CascadeType.ALL)
	private Batch b;
	
	
	public Batch getB() {
		return b;
	}
	public void setB(Batch b) {
		this.b = b;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
