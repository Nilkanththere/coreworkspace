package coparator;

import java.util.Comparator;

public class Rollnosort implements Comparator<Student> {

	public int compare(Student stu1,Student stu2)
	{
		return stu1.getRollno()-stu2.getRollno();
	}
	
}
