package com.example.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;

import com.example.bean.Caller;
import com.example.bean.Plan;

public class Planresultextractor  implements ResultSetExtractor<List<Plan>>{

	@Override
	public List<Plan> extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		
		List<Plan> planlist=new ArrayList<Plan>();
		
		while(rs.next()) {
		Plan plan=new Plan();
		plan.setPlanId((rs.getInt("planid")));
		plan.setPlanName(rs.getString("planname"));
		plan.setNationalRate(rs.getInt("nationalrate"));;
		plan.setLocalRate(rs.getInt("localrate"));; 
		planlist.add(plan);
		}
		
		System.out.println(planlist);
		return planlist;
	}


}
