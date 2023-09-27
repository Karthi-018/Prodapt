package springBoot.Demos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import springBoot.Demos.model.Employee;

@Service
public class EmployeeService {
	
	
	List<Employee> e = new ArrayList<>();
	
	
	public void createEmployee(Employee employee)
	{
		e.add(employee);
	}
	
	public List<Employee> getEmployees()
	{
		return e;
	}
	
	public Employee getEmployee(int id)
	{
		Employee searchResult = null;
		for(Employee emp:e)
		{
			if(emp.getEid() == id)
			{
				searchResult = emp;
			}
		}
		return searchResult;
	}

	public void updateEmployee(int id,int salary) {
		
		for(Employee emp:e)
		{
			if(emp.getEid() == id)
			{
				emp.setSalary(salary);
			}
		}
		
	}

	public void deleteEmployee(int eid) {
		
		for(Employee emp:e)
		{
			if(emp.getEid() == eid)
			{
				e.remove(emp);
			}
		}
		
	}
	

}
