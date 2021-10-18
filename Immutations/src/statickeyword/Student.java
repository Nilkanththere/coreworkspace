package statickeyword;

public class Student {

	int id;
	String name;
	static String cname="JDIET";

	public Student(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	
	public void m1()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(cname);
	}
	
	public static void main(String[] args) {
		Student s=new Student(10,"Ashish");
		        s.m1();
		 
		Student s1=new Student(11,"Shivraj");
		        s1.m1();
		        
	}
	
	
	
}
