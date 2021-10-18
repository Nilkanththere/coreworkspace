package statickeyword;

public class Studnet1 {
	int id;
	String name;
  final	static String cname="JDIET";

	public Studnet1(int id,String name)
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
		 // Studnet1.cname="JCOET";
		Studnet1 s=new Studnet1(10,"Ashish");
		        s.m1();
		 
	 Studnet1 s1=new Studnet1(11,"Shivraj");
		        s1.m1();
		        
		     
		        
	}

}
