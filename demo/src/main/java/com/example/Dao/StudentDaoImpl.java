package com.example.Dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.bean.Caller;
import com.example.bean.Plan;
import com.example.bean.Student;
import com.example.mapper.CallerResultExtractor;
import com.example.mapper.Planresultextractor;
import com.example.mapper.StudentRowMapper;


@Repository("studentdao")
public class StudentDaoImpl implements StudentDao {

	
//	private JdbcTemplate jdbctemplate =new JdbcTemplate(DriverManagerDataSource("jdbc:mysql://localhost:3306/school", "root", "Mysqlroot"));
    private String url="jdbc:mysql://localhost:3306/school";
    private String username="root";
    private String password="Mysqlroot";
    DataSource data=new DriverManagerDataSource(url, username, password);
	private JdbcTemplate jdbctemplate=new JdbcTemplate(data);

	

	@Override
	public String inserStudent(List<Student> student) {
		// TODO Auto-generated method stub

		String sql = "INSERT INTO STUDENT VALUES(?,?,?)";
		
		ArrayList<Object[]> stuarr=new ArrayList<>();
		
		for (Student temp : student){
			Object[] arr = { temp.getRoll_no(), temp.getStudent_name(), temp.getStudent_address() };
			stuarr.add(arr);

		}

		jdbctemplate.batchUpdate(sql, stuarr);
		System.out.println("number of rows inserted");
		return "created";

	}
	
	

	@Override
	public List<Student> fetchstudent() {
		// TODO Auto-generated method stub
		
		String selectsql="SELECT * from STUDENT";
		
		return jdbctemplate.query(selectsql, new StudentRowMapper());
		
	}


	@Override
	public void deleteStudent(int roll_no) {
		// TODO Auto-generated method stub
		String sql="Delete from Student where roll_no=?";
		
		if(jdbctemplate.update(sql,roll_no)==1)
		{
			System.out.println("deleted record with id "+roll_no);
		}
		else
			System.out.println("roll bumber "+roll_no+ " does not exists in the system");
			
		
	}


	@Override
	public void updateStudent(int id, String name) {
		// TODO Auto-generated method stub
		
		String sql="Update Student set student_name=? where roll_no=?";
		if(jdbctemplate.update(sql,name,id)==1) {
			
			System.out.println("updated record with id "+id);
		}
		else
			System.out.println("roll bumber "+id+ " does not exists in the system");
		
		
	}



	@Override
	public List<Caller> Fetchcallerdetails(String name, LocalDate localDate) {
		// TODO Auto-generated method stub
		
		System.out.println("inside insert class");
		String sql="Select * from Callerdetails where callername=? and calledon=?";
		
		
		
		
		return jdbctemplate.query(sql, new CallerResultExtractor(),name,localDate);
	}


	@Override
	public List<Plan> Fetchplandetails() {
		// TODO Auto-generated method stub
		
		System.out.println("inside insert class");
		String sql="Select * from plan";
		
		return jdbctemplate.query(sql, new Planresultextractor());
	}
	
}
