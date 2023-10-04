package edu.training.springbootdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HRDept implements department {
	public void details(){
		System.out.println("HR");
		
	}
	public String toString()
	{
		return "hr";
	}

}
