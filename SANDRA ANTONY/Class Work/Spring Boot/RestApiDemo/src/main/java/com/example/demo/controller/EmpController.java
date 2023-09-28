package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.Employee;

@Controller
public class EmpController 
{
	@RequestMapping("/")
	@ResponseBody
	public String display()
	{
		return "HI welcome";
	}
	
	@RequestMapping
	@ResponseBody
	public Employee getEmployee()
	{
		Employee e = new Employee();
		e.setId(101);
		e.setName("Sandra");
		e.setSalary(8999);
		e.setDept("IT");
		
		return null;
	}

}
