package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Repo.Repo;
import com.example.demo.entity.Employee;

@org.springframework.stereotype.Service
public class Service {
	@Autowired
	Repo er;
	
	public void create(Employee e)
	{
		er.save(e);
	}
	public List<Employee> getemployees()
	{
		List<Employee> emplist=(List<Employee>)er.findAll();
		return emplist;
	}
	
	public Employee getemployee(int eid)
	{
		return er.findById(eid).get();
	}
	
	public void delete(int eid)
	{
		er.deleteById(eid);;
	}

}
