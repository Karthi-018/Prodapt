package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service
public class EmpService {
List<Employee> emplist=new ArrayList<Employee>();

	

	public String add(Employee emp) {

		 emplist.add(emp);

		 System.out.println(emplist);
		return "product added";	

	}

	public List<Employee> view(){

		return emplist;
	}
	

}
