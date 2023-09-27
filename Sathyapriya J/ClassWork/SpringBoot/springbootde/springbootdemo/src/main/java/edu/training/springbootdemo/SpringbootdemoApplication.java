package edu.training.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootdemoApplication.class, args);
		Employee e = context.getBean(Employee.class);
		e.setEid(101);
		e.setEname("Sathya");
		e.setEsalary(100000);
		Department department = context.getBean(Department.class);
		e.setDepartment(department);
		System.out.println(e);

		e.setEid(102);
		e.setEname("Priya");
		e.setEsalary(100000);
		department = context.getBean("it",Department.class);
		e.setDepartment(department);
		System.out.println(e);
	}

}
