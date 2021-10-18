package exception;

public class Student {

	int id;
	String name;
	
	public Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return  "id"+"="+id+"name"+"="+name;
	
	}
	
	
	public static void main(String[] args) {
		
		Student stu=new Student(10,"abc");
		Student stu1=new Student(10,"pqr");
		//String s =(String)stu.toString();
		//System.out.println(stu.id);
		//System.out.println(stu.name);
		
		System.out.println(stu.toString());
		System.out.println(stu1.toString());
	}
}
