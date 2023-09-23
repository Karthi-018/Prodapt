package edu.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.training.entity.Employee;

@Controller
public class MyFrontController {
	
	@RequestMapping("/printname")
	public ModelAndView printUserName(String uname)
	{
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("uname", uname);
		mv.setViewName("display"); 
		
		return mv;
	}
	
	@RequestMapping("/empDetails")
	public ModelAndView employeeDetails(String eid,String ename,String salary,String dept)
	{
		ModelAndView mv = new ModelAndView("display");
		mv.addObject("eid", eid);
		mv.addObject("ename", ename);
		mv.addObject("salary", salary);
		mv.addObject("dept", dept);
		
		return mv;
	}
	
	@RequestMapping("/entityEmpDetails")
	public ModelAndView printEmployeeDetails(Employee emp)
	{
		ModelAndView mv = new ModelAndView("display");
		mv.addObject("e",emp);
		System.out.println(emp);
		return mv;
	}
	
	@RequestMapping("/second")
	public ModelAndView getSecond()
	{
		ModelAndView mv = new ModelAndView("secongpage");
		return mv;
	}
	
	
	

}
