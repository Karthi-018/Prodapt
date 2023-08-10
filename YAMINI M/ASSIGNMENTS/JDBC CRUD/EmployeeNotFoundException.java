package edu.prodapt.crud;

public class EmployeeNotFoundException extends Exception {

	EmployeeNotFoundException(int id)
	{
		super(id +" not found in the list");
	}

}
