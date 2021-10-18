package stringBuffermethods;

public class A {

	public static void main(String[] args) {
		
		
		StringBuffer sb=new StringBuffer("CJC Core Classes");
		
		sb.append("Complte");
		System.out.println(sb);
		
		sb.append(123.23);
		System.out.println(sb);
		sb.delete(0, 3);
		System.out.println(sb);
		
		sb.charAt(5);
		System.out.println(sb);
		
		System.out.println(sb.capacity());
	
		sb.insert(0, "abc");
		System.out.println(sb);
		
		sb.lastIndexOf("Classes");
		System.out.println(sb);
		//System.out.println(sb.reverse());
		System.out.println(sb.indexOf("Core"));
		System.out.println(sb.codePointAt(3));
		System.out.println(sb.hashCode());
		
		
		
	}
}
