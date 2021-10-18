import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InstanceEx {

	public static void main(String[] args) {
		
		
		
		List l=new ArrayList();
		     l.add("abc");
		     l.add("pqr");
		     l.add(10);
		     l.add(20);
		     
		 System.out.println(l);
		 
		 
		 Iterator itr=l.iterator();
		 while(itr.hasNext())
		 {
			 Object o=itr.next();
			 
			 if(o instanceof String )
			 {
				 String s=(String)o;
				 
				 System.out.println(s);
			 }
			 else if(o instanceof Integer)
			 {
				 int i=(int)o;
				 System.out.println(i);
			 }
		 }

	}

}
