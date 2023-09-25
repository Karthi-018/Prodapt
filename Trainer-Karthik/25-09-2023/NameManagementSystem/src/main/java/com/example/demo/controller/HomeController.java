package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.NameService;

@Controller
public class HomeController {
	
	@Autowired
	NameService service;
	
	@RequestMapping("/")
	public String home()
	{
		return "index.jsp";
	}
	
	@RequestMapping("/add")
	public String addName()
	{
		return "addemployee.jsp";
	}
	
	@RequestMapping("/addName")
	@ResponseBody
	public String creatingNameList(String uname)
	{
		service.addName(uname);
		return uname+" Added to Name List";
	}
	
	@RequestMapping("/view")
	public ModelAndView viewName()
	{
		ModelAndView mv = new ModelAndView("viewemployee.jsp");
		mv.addObject("eList", service.getNameList());
		return mv;
	}
	
	@RequestMapping("/search")
	public String searchName()
	{
		return "searchemployee.jsp";
	}
	
	@RequestMapping("/searchName")
	@ResponseBody
	public String searchNameFromList(String uname)
	{
		String name = service.getName(uname);
		
		return name;
	}
}
