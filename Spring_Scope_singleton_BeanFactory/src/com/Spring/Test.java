package com.Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		
		Resource rs=new ClassPathResource("bean.xml");
		
		BeanFactory beanf=new XmlBeanFactory(rs);
		
		    Student stu=(Student) beanf.getBean("a");
           System.out.println(stu);
           
           
           Student stu1=(Student) beanf.getBean("a");
           System.out.println(stu1);
           
           Student stu2=(Student) beanf.getBean("a");
           System.out.println(stu2);
             
           
	}

}
