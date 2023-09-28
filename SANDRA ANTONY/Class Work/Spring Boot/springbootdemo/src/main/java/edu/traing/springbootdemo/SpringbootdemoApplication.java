package edu.traing.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootdemoApplication 
{


	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(SpringbootdemoApplication.class, args);
		System.out.println("Eid \t Ename \t Salary \t Department");
		Employee e = context.getBean(Employee.class);
		e.setEid(101);
		e.seteName("Sandra");
		e.setSalary(5000);
		System.out.println(e.displayDetails()); 
		

		e.setEid(102);
		e.seteName("Aditya");
		e.setSalary(5000);
		System.out.println(e.displayDetails()); 		
	}

}
