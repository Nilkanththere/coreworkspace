package com.mvc.utility;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


import com.mvc.model.CustomerOrder;

import com.mvc.model.Product;



@EnableWebMvc
@ComponentScan("com.mvc")
@Configuration
public class AppConfig {
	
	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		
		InternalResourceViewResolver irvr=new InternalResourceViewResolver();
		irvr.setSuffix(".jsp");
		return irvr;
		
	}
	@Bean
	public DriverManagerDataSource driverManager()
	{
		
		DriverManagerDataSource dvr=new DriverManagerDataSource();
		
		dvr.setDriverClassName("com.mysql.jdbc.Driver");
		dvr.setUrl("jdbc:mysql://localhost:3306/marketing");
		dvr.setUsername("root");
		dvr.setPassword("root");
		return dvr;
	}
	
	@Bean
	public LocalSessionFactoryBean localSession()
	{
		LocalSessionFactoryBean sf=new LocalSessionFactoryBean();
		
		sf.setDataSource(driverManager());
		
		
		Properties p=new Properties();
		p.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
		
		p.setProperty("hibernate.hbm2ddl.auto","update");
	
		sf.setHibernateProperties(p);
		sf.setAnnotatedClasses(Product.class,CustomerOrder.class);
		
		return sf;
	}
	
	
	
	
	
}
