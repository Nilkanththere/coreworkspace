package stringMethodsTasks;
//reverse order
public class Task5 {

	public static void main(String[] args) {
		
		String ss=new String("Nilkanth");
		 
       String a=" ";
		for(int i=ss.length()-1;i>=0;i--)
		{
			//System.out.println(ss.charAt(i));
			a=a+ss.charAt(i);	
		}
		System.out.println(a);
		

	}

}
