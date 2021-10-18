import java.util.*;

public class Task {

	public static void main(String[] args) {
		
		
		List list=new ArrayList();
		     list.add(34);
		     list.add("abc");
		     list.add('m');
             list.add("xyz");	
             list.add(45);
             list.add('A');
             
             System.out.println(list);
             
             Iterator itr=list.iterator();
             while(itr.hasNext())
             {
            	 Object o=itr.next();
            if(o  instanceof Integer)
            {
            	int i=(int)o;
            	System.out.println(i);
            }
            else if(o instanceof String)
            {
            	String s=(String)o;
            	System.out.println(s);
            	
            }
            else if(o instanceof Character)
            	
            {
            	char c=(char)o;
            	System.out.println(c);
            	
            }
            else if(o instanceof String)
            {
            	String s1=(String)o;
            	System.out.println(s1);
            }
            else if(o instanceof Integer )
            {
            	 int i1=(int)0;
            	 System.out.println(i1);
            }
            else if(o instanceof Character)
            {
            	char c1=(char)o;
            	System.out.println(c1);
            }
             }

	}

}
