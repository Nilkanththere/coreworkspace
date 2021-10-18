import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {
		
		List list=new ArrayList();
	     list.add(73.30f);
	     list.add(256.39d);
	     list.add(11);
        list.add(77L);	
        list.add(79.10);
        list.add(87D);
        list.add(58l);
        
        System.out.println(list);
        
        Iterator itr=list.iterator();
        while(itr.hasNext())
        {
       	 Object o=itr.next();
       if(o  instanceof Float)
       {
       	float f=(float)o;
       	System.out.println(f);
       }
       else if(o instanceof Double)
       {
       	double d=(double)o;
       	System.out.println(d);
       	
       }
       else if(o instanceof Integer)
       	
       {
       	int i=(int)o;
       	System.out.println(i);
       	
       }
       else if(o instanceof Long)
       {
       	long l=(long)o;
       	System.out.println(l);
       }
       else if(o instanceof Float)
       {
       	 float f1=(float)o;
       	 System.out.println(f1);
       }
       else if(o instanceof Double)
       {
       	double d1=(double)o;
       	System.out.println(d1);
       }
       
       else if(o instanceof Long)
       {
    	   long l1=(long)o;
    	   System.out.println(l1);
    	   
        }

}

	}

}
