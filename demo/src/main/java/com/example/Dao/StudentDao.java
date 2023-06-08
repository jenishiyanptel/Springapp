package com.example.Dao;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.example.bean.Caller;
import com.example.bean.Plan;
import com.example.bean.Student;

public interface StudentDao {
	
	public String inserStudent(List<Student> student);
	public List<Student> fetchstudent();
	public void deleteStudent(int id);
	public void updateStudent(int id,String name);
	public List<Caller> Fetchcallerdetails(String name,LocalDate localDate);
	public List<Plan> Fetchplandetails();

}
