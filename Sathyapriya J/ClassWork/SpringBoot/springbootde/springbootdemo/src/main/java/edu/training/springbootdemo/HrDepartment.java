package edu.training.springbootdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component()
@Primary
public class HrDepartment implements Department {
	public String departmentName() {
		return "HR";
	
	}

}
