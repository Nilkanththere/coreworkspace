package com.cjc;

public class Test1 {

	public static void main(String args[])
	{
		
		Address a=new Address();
		        a.cityname="pune";
		        a.areaname="karvenagr";
		        
		        Stu s1=new Stu();
		        s1.rollno=1;
		        s1.name="xyz";
		        s1.addr=a;
		        System.out.println(s1.rollno);
		        System.out.println(s1.name);
		        System.out.println(s1.addr.cityname);
		        System.out.println(s1.addr.areaname);
	}
}
