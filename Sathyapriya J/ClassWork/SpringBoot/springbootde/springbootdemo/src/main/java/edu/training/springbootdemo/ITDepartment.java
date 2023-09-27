package edu.training.springbootdemo;

import org.springframework.stereotype.Component;

@Component("it")
public class ITDepartment implements Department  {
	public String departmentName() {
		return "IT";
	
	}

}
