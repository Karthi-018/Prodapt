package com.arun.JPA;

import com.arun.JPA.dao.StudentDAO;
import com.arun.JPA.model.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO dao){
		return runner ->{
			System.out.println(dao.searchByName("shanmathy"));
		};
	}

}
