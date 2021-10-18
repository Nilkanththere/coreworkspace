package com.mvc.utility;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Initializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext sc) throws ServletException {
		
		AnnotationConfigWebApplicationContext acp=new AnnotationConfigWebApplicationContext();
		
		        acp.register(AppConfig.class);
		        acp.setServletContext(sc);
		        ServletRegistration.Dynamic sd=sc.addServlet("dispatcher", new DispatcherServlet(acp));
		        
		          sd.addMapping("/");
		
	}
	
	

}
