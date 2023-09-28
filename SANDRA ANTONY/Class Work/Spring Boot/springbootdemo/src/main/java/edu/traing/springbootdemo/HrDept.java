package edu.traing.springbootdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("hr")
@Primary
public class HrDept implements Department
{
	
	@Override
	public String department() 
	{
		return "HR Departement";
	}

	@Override
	public String toString() 
	{
		return "HR Departement";
	}
	
	

}
