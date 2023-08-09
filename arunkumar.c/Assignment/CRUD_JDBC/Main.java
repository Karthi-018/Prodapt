package com.arunsh;

import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		int choice = 0;
		while(choice!=5) {
			System.out.println("1.CREATE");
			System.out.println("2.READ");
			System.out.println("3.UPDATE");
			System.out.println("4.DELETE");
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					createEmployee();
					break;
				case 2:
					readEmployee();
					break;
				case 3:
					updateEmployee();
					break;
				case 4:
					deleteEmployee();
					break;
				case 5:
					System.out.println("TATA BYEEE");
					break;
			}
		}
	}
	
	
	private static void deleteEmployee() throws Exception {
		System.out.println("Enter the employee id to delete : ");
		int id = sc.nextInt();
		Employee e = EmployeeDAO.findById(id);
		if(e!=null) {
			EmployeeDAO.deleteById(id);
		}
		else {
			throw new EmployeeNotFoundException("No employee with id "+id);
		}
	}


	private static void updateEmployee() throws Exception {
		System.out.println("Enter the id of employee to update : ");
		int id = sc.nextInt();
		Employee e = EmployeeDAO.findById(id);
		if(e!=null) {
			System.out.println("1.Update name : ");
			System.out.println("2.Update salary : ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter new name : ");
				e.setName(sc.next());
				break;
			case 2:
				System.out.println("Enter new salary : ");
				e.setSalary(sc.nextInt());
				break;
			}
			EmployeeDAO.save(e);
			
		}
		else {
			throw new EmployeeNotFoundException("No employee with id "+id);
		}
		
	}


	private static void readEmployee() throws Exception {
		System.out.println("1.Find Employee By ID");
		System.out.println("2.Find All ");
		int choice = sc.nextInt();
		switch(choice) {
			case 1: 
				System.out.println("Enter employee ID : ");
				int id = sc.nextInt();
				Employee e = EmployeeDAO.findById(id);
				if(e!=null) {
					System.out.println(e);
				}
				else {
					throw new EmployeeNotFoundException("No employee with id "+id);
				}
				
				break;
			case 2 :
				List<Employee> employeeList = EmployeeDAO.findAll();
				System.out.println(employeeList);
				break;
		}
	}
	private static void createEmployee() throws Exception {
		System.out.println("Enter id : ");
		int id = sc.nextInt();
		System.out.println("Enter name : ");
		String name = sc.next();
		System.out.println("Enter salary : ");
		int salary = sc.nextInt();
		Employee emp = new Employee(id,name,salary);
		EmployeeDAO.save(emp);
	}
	
	
}
