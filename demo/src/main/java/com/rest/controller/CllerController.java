package com.rest.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dao.StudentDaoImpl;
import com.example.bean.Caller;

@RestController
@RequestMapping("/Caller")
public class CllerController {
	
	@Autowired
	StudentDaoImpl studentdaoimpl;
	
	@GetMapping
	public List<Caller> fetchcallerdetails(@RequestParam("calledBy") String name,@RequestParam("calledOn") String calledon) {
		
		System.out.println("Inside Rest controller");
		
		return studentdaoimpl.Fetchcallerdetails(name, LocalDate.parse(calledon,DateTimeFormatter.ofPattern("yyyy-MM-dd")));
	}
	
	
}
