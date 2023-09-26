package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.Employee;
import com.example.demo.repo.Employeerepo;
@Controller
public class EmployeeController {

	@Autowired
	Employeerepo repo;
	@Autowired
	Employee emp;
	@RequestMapping("/")
//	@ResponseBody
	public String homepage() {
		
//		emp.setEid(1);
//		emp.setEname("AAA");
//		emp.setDept("IT");
//		emp.setSalary(1000);
//		repo.save(emp);
		
		return "homepage.jsp";
	}
	@RequestMapping("/create")
	@ResponseBody
	public String create(Employee emp) {
	
	repo.save(emp);
	return "Employee details created";
}
	@RequestMapping("/view")
	@ResponseBody
	public String viewdetails() {
	
	
	return repo.findAll().toString();
}
	@RequestMapping("/search")
	@ResponseBody
	public String searchdetails(String dept) {
	
	
	return repo.findBydept(dept).toString();
}
	@RequestMapping("/searchid")
	@ResponseBody
	public String searchbyid(int eid) {
	
	
	return repo.findById(eid).toString();
}
}