package com.spring.lazyloding;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		
		Resource rs=new ClassPathResource("bean.xml");
		
		BeanFactory beanf=new XmlBeanFactory(rs);
		
		  Student stu=beanf.getBean("sp",Student.class);
		  System.out.println(stu);
		

	}

}
