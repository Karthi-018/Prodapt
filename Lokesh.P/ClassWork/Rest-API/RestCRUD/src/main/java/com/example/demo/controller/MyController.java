package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.Service;

@RestController
public class MyController {
	@Autowired
	Service ser;
	
	
	
	@PostMapping("/employee")
	@ResponseBody
	public String create(@RequestBody Employee emp)
	{
		ser.create(emp);
		return "Employee Created";
		
	}
	@GetMapping("/employee")
	@ResponseBody
	public List<Employee> getemployees()
	{
		List<Employee> emplist=ser.getemployees();
		return emplist;
	}
	@GetMapping("/employee/{eid}")
	@ResponseBody
	public Employee getemployee(@PathVariable int eid)
	{
		Employee emplist=ser.getemployee(eid);
		return emplist;
	}
	@DeleteMapping("/employee/{eid}")
	public String delete(@PathVariable("eid") int eid)
	{
		ser.delete(eid);
		return "Employee deleted";
	}
}
