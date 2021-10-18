package com.di.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
	
		
	ApplicationContext aps=new ClassPathXmlApplicationContext("bean.xml");
		
	     Student stu=(Student) aps.getBean("c");
	     
//	     List<String>list=stu.getMyList();
//	     
//	     for(String s:list)
//	     {
//	    	 System.out.println(s);
//	     }
//	     
//	     
//	     
//	     Set<String>set=stu.getMySet();
//	     
//	     for(String ss:set)
//	     {
//	    	 System.out.println(ss);
//	     }
//	     
//	     Map<String,String>m=stu.getMyMap();
//	     Set<String>keys=m.keySet();
//	     
//	     for(String sss:keys)
//	     {
//	    	 System.out.println(sss);
//	    	 
//	    	 String s=m.get(sss);
//	    	 System.out.println(s);
//	    	 
//	     }
//	     
//	     
	     System.out.println(stu);
	     

	}

}
