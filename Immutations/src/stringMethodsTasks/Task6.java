package stringMethodsTasks;

public class Task6 {

	public static void main(String[] args) {
		
		
		String ss=new String("Cjc Complte Java Classes");
		
		String s=" ",sm=" ",lg=" ";
		String []s1=new String[100];
		int l=0;
		
		String s2=ss+" ";
		
		for(int i=0;i<ss.length();i++)
		{
			if(ss.charAt(i)!=' ')
			{
				s=s+ss.charAt(i);
			}
			else
			{
				s1[l]=s;
				
				l++;
				s=" ";
			}
		}
		sm=lg=s1[0];
		
		for(int j=0;j<l;j++)
		{
			
			if(sm.length()>s1[j].length())
				
				sm=s1[j];
			
			if(lg.length()<s1[j].length())
				lg=s1[j];
		}
		
		
		System.out.println("Smallest word:"+sm);
		System.out.println("Largest Word:"+lg);
	}
}
