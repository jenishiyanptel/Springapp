package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dao.StudentDaoImpl;
import com.example.bean.Student;

@RestController
@RequestMapping("/student")
public class CustomerController {

	@Autowired
	StudentDaoImpl studentimpl;
	
	@PostMapping
	public ResponseEntity<String> createstudent(@RequestBody List<Student> student) {
		String response=studentimpl.inserStudent(student);
		return ResponseEntity.ok(response);
	}
	@GetMapping(produces="application/json")
	public List<Student> fetchstudent() {
		System.out.println("customer is fetched sucessfully");
		return studentimpl.fetchstudent();
	}
	
	@DeleteMapping(value="/{id}")
	public int deletestudent(@PathVariable("id") int id) throws NoSuchCustomerException {
		System.out.println("inside delete");
		
		return studentimpl.deleteStudent(id);
	}
	
	@PutMapping(value="/{id}")
	public String updatestudent(@PathVariable("id") int id,@RequestBody String name) {
		studentimpl.updateStudent(id, name);
		
		return "customer updated successfully";
	}
	
}
