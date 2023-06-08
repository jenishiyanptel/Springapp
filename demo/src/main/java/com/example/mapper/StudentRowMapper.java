package com.example.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;

import com.example.bean.Student;

public class StudentRowMapper implements org.springframework.jdbc.core.RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student newstudent=new Student();
		newstudent.setRoll_no(rs.getInt("roll_no"));
		newstudent.setStudent_name(rs.getString("student_name"));
		newstudent.setStudent_address(rs.getString("student_address"));
		return newstudent;
	}

	
}
