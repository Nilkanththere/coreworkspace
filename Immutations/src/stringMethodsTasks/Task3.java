package stringMethodsTasks;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String ss=new String ("CJC Core java Classes");
		 int[] a=new int[ss.length()];
	
		 
		 char[]String1=ss.toCharArray();
		 for(int i=0;i<ss.length();i++)
		 {
			 a[i]=1;
			 for(int j=i+1;j<ss.length();j++)
			 {
				 
				 if(String1[i]==String1[j])
				 {
					 a[i]++;
					 
					 String1[j]='0';
				 }
				 
				 
			 }
		 }
		  
		for(int i=0;i<a.length;i++)
		{
			if(String1[i]!='0'&&String1[i]!='0')
			{
				System.out.println(String1[i]+ "-"+a[i]);
			}
				
				
		}
		
	}

}
