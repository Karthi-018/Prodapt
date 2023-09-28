package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Employee;
import java.util.List;


public interface DeptRepo extends CrudRepository<Employee, Integer>
{
	public List<Employee> findByDept(String dept);

}
