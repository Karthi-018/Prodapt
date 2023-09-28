package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Employee;
import com.example.demo.repo.DeptRepo;
@Controller
public class HomeController 
{
	@Autowired
	private Employee employee;
	
	@Autowired
	private DeptRepo repo;
	
	
	@RequestMapping("/")
	public String home()
	{
		return "menu.jsp";
	}
	
	
	@RequestMapping("/add")
	@ResponseBody
	public String addName(Employee employee)
	{
		repo.save(employee);
		return  "Added to mySql";
	}
	
	
	@RequestMapping("/search")
	@ResponseBody
	public String search(String dept)
	{
		return repo.findByDept(dept).toString();
	}
	
	
	@RequestMapping("/view")
	public ModelAndView viewEmployee()
	{
		List<Employee> eList = (ArrayList<Employee>)repo.findAll();
		ModelAndView mv = new ModelAndView("display.jsp");
	    mv.addObject("employee",eList);
		return mv;
	}
	
	@RequestMapping("/delete")
	public ModelAndView DeleteEmployee()
	{
		List<Employee> eList = (ArrayList<Employee>)repo.findAll();
		ModelAndView mv = new ModelAndView("display.jsp");
	    mv.addObject("employee",eList);
		return mv;
	}
	
	
	
	
	

}
