package com.mvc.Controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.mvc.service.HomeService;

@Controller
public class HomeController {

	@Autowired
	HomeService hs;

	
	
	@RequestMapping("/")
	public String firstpage()
	{
		return "login";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

//	@RequestMapping("/reg")
//	public String registerData(@ModelAttribute("pro")Student s) {
//		int id =hs.saveData1(s);
//		if (id > 0) {
//			return "login";
//		}
//
//		else {
//			return "register";
//		}
//	}
//	
//	
//	
//	@RequestMapping("/log")
//	public String loginCheck(@RequestParam("name")String name,@RequestParam("mobno")String mobno,Model m)
//	{
//		
//		List<Student>slist=hs.loginCheck(name,mobno);
//		System.out.println(slist);
//		m.addAttribute("data",slist);
//		
//		return "success";
//	}
//	
//	
//	@RequestMapping("/edit")
//	public String edit(@RequestParam("rollno")int rollno,Model m)
//	{
//		 Student stu=hs.editdata(rollno);
//		 m.addAttribute("s",stu);
//		 
//		return "update";
//		 
//		 
//		 
//	}
//
//	@RequestMapping("/update")
//	public String update(@ModelAttribute("rollno")Student s,Model m)
//	{
//		
//		List<Student> slist=hs.updateRecord(s);
//		
//		m.addAttribute("data",slist);
//		return "success";
//		
//		
//	}
//	
//	@RequestMapping("/delt")
//	public String delt(@RequestParam("rollno")int rollno,Model m)
//	{
//		List<Student>slist=hs.deletedata(rollno);
//		
//		m.addAttribute("data",slist);
//		
//		return "success";
//	}
//	

	
	
	
	
	
	
	

}
