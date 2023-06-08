package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.Dao.StudentDaoImpl;
import com.rest.controller.CllerController;
import com.rest.controller.CustomerController;

@SpringBootApplication
@ComponentScan(basePackageClasses = { CustomerController.class, StudentDaoImpl.class, CllerController.class })

public class RestdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestdemoApplication.class, args);
	}

}
