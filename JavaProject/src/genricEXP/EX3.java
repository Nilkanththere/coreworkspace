package genricEXP;

import java.util.*;

public class EX3 {

	public static void main(String[] args) {
		
		List<String>mh=new ArrayList<>();
		      
		   mh.add("Pune");
		   mh.add("Mumbai");
		   
		List<String>jh=new ArrayList<>();
		     jh.add("Ranchi");
		     jh.add("Bokaro");
		     
		List<List<String>>india=new ArrayList<>();
		     india.add(mh);
		     india.add(jh);
		     
	for(List<String>l:india)
	{
		for(String city:l)
		{
			System.out.println(city);
		}
	}
		     
		     
	}

}
