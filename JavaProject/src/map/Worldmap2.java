package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.*;

public class Worldmap2 {
public static void main(String[] args) {
		
		List<String> MH=new ArrayList<>();
		
             MH.add("pune");
             MH.add("Mumbai");
             
         List<String> MP=new ArrayList<String>();
              MP.add("Bhopal");
              MP.add("Indore");
              
          Map<String, List<String>> India=new HashMap<String, List<String>>();
              India.put("Maharashtra", MH);
              India.put("Madhyapradesh", MP);

               
          List<String> state1=new ArrayList<String>();
               state1.add("city1");
               state1.add("city2");
               
          List<String>  state2=new ArrayList<String>();
                state2.add("city1");
                state2.add("city2");
                
                
           Map<String, List<String>> Japan=new HashMap<String, List<String>>();
               Japan.put("osaka", state1);
               Japan.put("kyoto", state2);
               
               
           Map<String, Map<String, List<String>>> World=new HashMap<String, Map<String, List<String>>>();
               World.put("India", India);
               World.put("Japan", Japan);
               
           
           Set<String> keys=World.keySet();
           System.out.println(keys);
          
          
           Iterator<String> itr=keys.iterator();
           while(itr.hasNext())
           {
        	   String s=itr.next();
        	   System.out.println(s);
        	   
        Map<String,List<String>>m=World.get(s);
        	   //System.out.println(m);
        	   
        	   Set keys1=m.keySet();
        	   System.out.println(keys1);
        	   
        	   Iterator<String>itr1=keys1.iterator();
        	   while(itr1.hasNext())
        	   {
        		   String s5=itr1.next();
            	   
            	   List list=m.get(s5);
            	   System.out.println(list);
            	   Iterator<String> itr2=list.iterator();
            	   while(itr2.hasNext())
            	   {
            		   String ss=itr2.next();
            		   System.out.println(ss);
            	   }
            	   
            	   
            	   
        		   }
        	  
        	   }
        	
           }          
	}




