package coparator;

import java.util.Comparator;

public class EmnameSort  implements Comparator<Employee>{
	
	
	public int compare(Employee e1,Employee e2)
	{
		return e1.getEname().compareTo(e2.getEname());
	}

}
