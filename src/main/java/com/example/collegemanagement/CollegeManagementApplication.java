package com.example.collegemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.example.collegemangement.controller","com.example.collegemanagement.serviceimpl"})
@EnableJpaRepositories(basePackages = "com.example.collegemanagement.repository")
@EntityScan(basePackages = "com.example.collegemanagement.model")
public class CollegeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollegeManagementApplication.class, args);
	}

}
