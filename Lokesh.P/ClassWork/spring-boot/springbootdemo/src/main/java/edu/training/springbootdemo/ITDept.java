package edu.training.springbootdemo;

import org.springframework.stereotype.Component;

@Component
public class ITDept implements department{
	public void details()
	{
		System.out.println("IT department");
	}
	public String toString()
	{
		return "IT";
	}

}
