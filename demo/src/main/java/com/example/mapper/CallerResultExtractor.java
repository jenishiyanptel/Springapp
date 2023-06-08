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

public class CallerResultExtractor  implements ResultSetExtractor<List<Caller>>{

	@Override
	public List<Caller> extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		
		List<Caller> callerlist=new ArrayList<Caller>();
		
		while(rs.next()) {
		Caller caller=new Caller();
		caller.setCallerid(rs.getInt("callerid"));
		caller.setCallernumber(rs.getString("callernumber"));
	    caller.setCallername(rs.getString("callername"));
		caller.setCalledon(rs.getDate("calledon").toString()); 
		callerlist.add(caller);
		}
		
		System.out.println(callerlist);
		return callerlist;
	}


}
