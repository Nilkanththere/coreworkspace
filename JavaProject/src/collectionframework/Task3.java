package collectionframework;

import java.util.*;
public class Task3

{
public static void main(String args[])
{

      List l=new ArrayList();
       
           l.add(11f);
           l.add(14.4f);
           l.add(12.5f);
           l.add(13.5f);
           l.add(15f);
           l.add(17f);

    Iterator itr=l.iterator();

while(itr.hasNext())
{
float x=(float)itr.next();
System.out.println(x);
}
}
}