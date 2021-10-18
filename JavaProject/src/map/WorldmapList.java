package map;

import java.util.*;

public class WorldmapList {

	public static void main(String[] args) {
		
		List MH=new ArrayList();
		
             MH.add("pune");
             MH.add("Mumbai");
             
         List MP=new ArrayList();
              MP.add("Bhopal");
              MP.add("Indore");
              
          Map India=new HashMap();
              India.put("Maharashtra", MH);
              India.put("Madhyapradesh", MP);

               
          List state1=new ArrayList();
               state1.add("city1");
               state1.add("city2");
               
          List  state2=new ArrayList();
                state2.add("city1");
                state2.add("city2");
                
                
           Map Japan=new HashMap();
               Japan.put("osaka", state1);
               Japan.put("kyoto", state2);
               
               
           Map World=new HashMap();
               World.put("country 1", India);
               World.put("country 2", Japan);
               
           
           Set keys=World.keySet();
           System.out.println(keys);
          
          
           Iterator itr=keys.iterator();
           while(itr.hasNext())
           {
        	   String s=(String)itr.next();
        	   System.out.println(s);
        	   
        	   Map m=(Map)World.get(s);
        	   //System.out.println(m);
        	   
        	   Set keys1=m.keySet();
        	   //System.out.println(keys1);
        	   
        	   Iterator itr1=keys1.iterator();
        	   while(itr1.hasNext())
        	   {
        		   String s1=(String)itr1.next();
            	   System.out.println(s1);
            	   
            	   List list=(List)m.get(s1);
            	  // System.out.println(list);
            	   
            	   Iterator itr2=list.iterator();
        		   while(itr2.hasNext())
        		   {
        		    String st=(String)itr2.next();
        			   System.out.println(st);
        		   }
        	  
        	   }
        	
           }          
	}

}
