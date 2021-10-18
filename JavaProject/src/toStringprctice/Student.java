package toStringprctice;

public class Student {

	int sid;
	String name;
	String addr;
	public Student(int sid,String name,String addr)
	{
		this.sid=sid;
		this.name=name;
		this.addr=addr;
		
	}
	public String toString()
	{
		return sid+" "+name+" "+addr;
		
		
	}
	public static void main(String[] args) {
		
		Student stu=new Student(1,"xyz","pune");
		
//		System.out.println(stu.sid);
//		System.out.println(stu.name);
//		System.out.println(stu.addr);

		 System.out.println(stu.toString());
		
	}
	
}
