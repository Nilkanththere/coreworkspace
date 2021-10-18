
public class Test  {
	public void getData()
	{
	
	     		Student s1=new Student();
	            Student s2 =s1.setStuData();
		System.out.println(s2.id);
		System.out.println(s2.name);
	}
	public static void main(String[] args) {
		 
		 Test t=new Test();
		      t.getData();
	}
	
	

}
