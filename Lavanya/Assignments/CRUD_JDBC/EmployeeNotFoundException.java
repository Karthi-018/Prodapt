package edu.prodapt.demos;

public class EmployeeNotFoundException extends Exception{
	EmployeeNotFoundException(){
		System.out.println("Employee id is not found");
	}

}
