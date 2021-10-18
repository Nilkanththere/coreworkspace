package stringMethodsTasks;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		String ss=new String("  Core  java   Classes   ");
		String s1=new String("pune");
		
		    System.out.println(ss.length());
		    
//		   System.out.println(ss.concat(s1));
//		   System.out.println(ss.replace('C', 'D'));
		  // System.out.println(ss.compareTo(s1));
//		   System.out.println(ss.lastIndexOf('a',5));
//		   System.out.println(ss.equals(s1));
	//	   System.out.println(ss.contains(s1));
//		   System.out.println(ss.indexOf('j'));
		   //System.out.println(ss.indexOf("java"));
		   System.out.println(ss.hashCode());
		   System.out.println(s1.replace('p', 'D'));
		   System.out.println(ss.lastIndexOf('s'));
		   System.out.println(ss.toLowerCase());
		   System.out.println(ss.toUpperCase());
		   System.out.println(ss.trim());
		   System.out.println(ss.charAt(6));
		  
		   
		   
		   String [] s5=ss.split("");
		   for(int i=0;i<s5.length;i++)
		   {
		   System.out.println(s5[i]);
		   }
		   
		   System.out.println(ss.trim());
		   
		   
		   
	}

}
