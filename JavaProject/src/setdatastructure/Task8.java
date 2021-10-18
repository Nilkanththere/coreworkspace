package setdatastructure;

import java.util.*;

public class Task8
{
public static void main(String args[])
{
List MH=new ArrayList();
      MH.add("Pune");
       MH.add("Mumbai");
		    
  List JH=new ArrayList();
      JH.add("Ranchi");
      JH.add("Ranchi");
		    
Set INDIA=new HashSet();
    INDIA.add(MH);
    INDIA.add(JH);



Iterator itr=INDIA.iterator();
while(itr.hasNext())
{
      List l1=(List)itr.next();

Iterator itr1=l1.iterator();
while(itr1.hasNext())
{		      
  String st=(String)itr1.next();
		    	
  System.out.println(st);
 }
		    	
}


}
}


