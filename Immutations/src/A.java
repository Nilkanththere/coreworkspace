
public class A {
	public static void main(String[] args) {
		
		String s=new String("cjc");
		String s1=new String("cjc");
		String s2="cjc";
		String s3=new String("java");
		String s4=new String("classes");
		String s5="classes";
		String s6=new String ("java");
		
		System.out.println(s==s1);
		System.out.println(s==s3);
		System.out.println(s==s6);
		System.out.println(s1==s3);
		System.out.println(s3==s6);
		System.out.println(s5==s2);
		
		System.out.println(s.equals(s1));
		System.out.println(s2.equals(s2));
		System.out.println(s.equals(s3));
		System.out.println(s.equals(s4));
		System.out.println(s4.equals(s5));
		System.out.println(s3.equals(s6));
		
		
		
		
	}

}
