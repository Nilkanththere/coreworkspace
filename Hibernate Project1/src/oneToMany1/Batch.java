package oneToMany1;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Batch {

	@Id
	private int bid;
	private int bno;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Faculty>fct=new HashSet<>();
	
	@OneToMany(cascade=CascadeType.ALL)
	private Set<BackupFaculty>fctb=new HashSet<>();

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public Set<Faculty> getFct() {
		return fct;
	}

	public void setFct(Set<Faculty> fct) {
		this.fct = fct;
	}

	public Set<BackupFaculty> getFctb() {
		return fctb;
	}

	public void setFctb(Set<BackupFaculty> fctb) {
		this.fctb = fctb;
	}
	
	
	
	
	
	
	
	
	
	
}
