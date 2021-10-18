package coparator;

import java.util.Comparator;

public class Emsalary implements Comparator<Employee> {
	
	public int compare(Employee e1,Employee e2)
	{
		return  (int) (e1.getEsalary()-e2.getEsalary());
	}

	
	
}
