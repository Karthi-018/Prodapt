package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Employee;
import com.example.demo.service.EmpService;

@Controller
public class MyController {
	@Autowired
	Employee emp;
	@RequestMapping("/")
	public String home()
	{
		return "index.jsp";
	}
	
	@Autowired
	EmpService es;
	@RequestMapping("/add")
	public ModelAndView add(int eid,String ename,int salary,String dept)

	{

		ModelAndView mv=new ModelAndView("index.jsp");

		emp.setEid(eid);

		emp.setEname(ename);

		emp.setSalary(salary);

		emp.setDept(dept);

		String o=es.add(emp);

		mv.addObject("o",o);

		return mv;

	}

	

	@RequestMapping("/view")
	public ModelAndView view() {

		ModelAndView mv=new ModelAndView("display.jsp");

		List<Employee> elist = es.view();

		return mv.addObject("elist",elist);

		

	}

	
//	@RequestMapping("/name1")
//	public ModelAndView display(String name)
//	{
//		ModelAndView mv =new ModelAndView("display.jsp");
//		mv.addObject("name",name);
//		mv.addObject("emp",emp);
//		return mv;
//	
//	}
	
	

}
