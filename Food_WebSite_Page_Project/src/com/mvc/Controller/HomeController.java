package com.mvc.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import com.mvc.HomeServiceDao.HomeService;
import com.mvc.model.Customer;
import com.mvc.model.Employee;




@Controller
public class HomeController {

	@Autowired
	HomeService hs;
	
	
	@RequestMapping("/")
	public String main()
	{
		
		return "index";
	}
	
	
	
	@RequestMapping("/singup")
	public String register()
	{
		
		return "register";
		
	}
	@RequestMapping("/singin")
	public String login()
	{
		return "register1";
		
	}
	
	
	@RequestMapping("/reg")
	public String savedata(@ModelAttribute("emp")Employee emp)
	{
		    
		    int id =hs.saveData(emp);
			if (id > 0) {
				return "index";
			}

			else {
				return "register";
			}
	}
	
	
	@RequestMapping("/reg1")
	public String savedatacustomer(@ModelAttribute("cstr")Customer cstr)
	{
		    
		    int id =hs.saveDatacstr(cstr);
			if (id > 0) {
				return "index";
			}

			else {
				return "register";
			}
	}
	
	
	
	
	
}
