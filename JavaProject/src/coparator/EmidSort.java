package coparator;

import java.util.*;

public class EmidSort implements Comparator<Employee> {
	
	public int compare(Employee e1,Employee e2)
	{
		return e1.getEid()-e2.getEid();
	}
	

	
	
}
