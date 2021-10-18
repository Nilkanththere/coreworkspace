
public class C {

	public static void main(String[] args) {
		
		String s=new String("CompleteJavaClasses");
		String s3=new String("      complete    java    classes     ");
		String s1=new String("pqr");
		String s2=s1.concat(s3);
		System.out.println(s2);
		System.out.println(s.charAt(5));
		System.out.println(s.contains("Java"));
		System.out.println(s.equalsIgnoreCase(s));
		System.out.println(s.indexOf('C'));
		System.out.println(s.lastIndexOf('s'));
		System.out.println(s.length());
		System.out.println(s.isEmpty());
		
		System.out.println(s.replace('C','D'));
		System.out.println(s3.replace("complete","python"));
	    String[] s5=s3.split("  ");
	    for(int i=0;i<s5.length;i++)
	    {
	    	System.out.println(s5[i]);
	    }
	    System.out.println(s.substring(0,12));
	    System.out.println(s.toLowerCase());
	    System.out.println(s.toUpperCase());
	    System.out.println(s3.trim());
		
		
		
	}
}
