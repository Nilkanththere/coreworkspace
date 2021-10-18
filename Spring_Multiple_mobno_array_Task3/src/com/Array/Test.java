package com.Array;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
	ApplicationContext acp=new ClassPathXmlApplicationContext("bean.xml");
		
	
	    Student stu=acp.getBean("stu",Student.class);
	    
	    System.out.println(stu.getRollno());
	    System.out.println(stu.getName());
	    
	    MobileNo[] mobno=stu.getMobno();
	    
	    for(int i=0;i<mobno.length;i++)
	    	
	    {
	    	System.out.println(mobno[i].getMobno());
	    }
	    	
	    	
	    
	    
	    
	}

}
