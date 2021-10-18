package com.mvc.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.model.CustomerOrder;
import com.mvc.model.Product;

import com.mvc.service.HomeService;

@Controller
public class HomeController {

	@Autowired
	HomeService hs;

	@RequestMapping("/")
	public String firstpage() {
		return "main";

	}


	@RequestMapping("salessingin") 
	public String reg()
	{
		return "register";
		
	}
	
	
	@RequestMapping("/reg")
	public String registerData(@ModelAttribute("pro") Product p) {
		int id =hs.saveData1(p);
		if (id > 0) {
			return "login";
		}

		else {
			return "register";
		}
	}
	
	

	@RequestMapping("/customerid") 
	public String order()
	{
		return "register1";
		
	}
	
	
	
	
	@RequestMapping("/reg1")
	public String registerData(@ModelAttribute("cst") CustomerOrder o) {
		int id =hs.saveData2(o);
		if (id > 0) {
			return "login";
		}

		else {
			return "register1";
		}
	}
	
	
	@RequestMapping("/log")
	public String logincheck(@RequestParam("id")int id,@RequestParam("name")String name,Model m)
	{
		List<Product>list=hs.loginCheck(id, name);
		
	    m.addAttribute("data",list);	
		
		return "success";
	}
	
	
	

}
