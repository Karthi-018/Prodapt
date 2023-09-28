package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Employee;

@SpringBootApplication
public class RestJpademoApplication {

	public static void main(String[] args) 
	{
		
		SpringApplication.run(RestJpademoApplication.class, args);
		Employee e = new Employee();
		
	}

}
