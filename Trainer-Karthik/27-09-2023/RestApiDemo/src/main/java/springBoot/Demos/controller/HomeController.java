package springBoot.Demos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;
import springBoot.Demos.model.Employee;
import springBoot.Demos.service.EmployeeService;

@RestController
public class HomeController {
	
	@Autowired
	EmployeeService eService;

	@RequestMapping("/")
	@ResponseBody
	public String displayMsg()
	{
		return "Hi Welcome to REST Api";
	}
	
	
	@GetMapping("/employee/{eid}")
	@ResponseBody
	public Employee getEmployee(@PathVariable("eid") int eid)
	{
		Employee e=	eService.getEmployee(eid);
		return e;
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/employee")
	@ResponseBody
	public List<Employee> getEmployees()
	{
		return eService.getEmployees();
	}
	
	@PostMapping("/employee")
	@ResponseBody
	public Employee crearteEmployee(@RequestBody Employee e)
	{
		eService.createEmployee(e);
		return eService.getEmployee(e.getEid());
	}
	
	@PutMapping("/employee/{eid}/{salary}")
	@ResponseBody
	public Employee updateEmployee(@PathVariable("eid") int eid,@PathVariable("salary") int salary)
	{
		eService.updateEmployee(eid,salary);
		return eService.getEmployee(eid);
	}
	
	@DeleteMapping("/employee/{eid}")
	@ResponseBody
	public Employee deleteEmployee(@PathVariable("eid") int eid)
	{
		Employee e = eService.getEmployee(eid);
		eService.deleteEmployee(eid);
		return e;
	}
	
	
	
}
