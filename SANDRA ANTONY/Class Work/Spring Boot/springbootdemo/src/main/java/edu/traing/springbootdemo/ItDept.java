package edu.traing.springbootdemo;

import org.springframework.stereotype.Component;

@Component("it")
public class ItDept implements Department
{
	
	@Override
	public String department() 
	{
		return "IT Department";
	}
	
	@Override
	public String toString() 
	{
		return "IT Departement";
	}

}
