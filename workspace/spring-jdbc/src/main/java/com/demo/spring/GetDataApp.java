package com.demo.spring;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;

public class GetDataApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Insert_stmt="insert into emp(empno,name,address,salary) values(?,?,?,?)";
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		JdbcTemplate jt=(JdbcTemplate)ctx.getBean("jdbctemplate");
		
	List<Emp> empList=jt.query("select * from emp", new RowMapper<Emp>() {

		@Override
		public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			return new Emp(rs.getInt("EMPNO"),
					rs.getString("NAME"),
					rs.getString("ADDRESS"),
					rs.getDouble("SALARY"));
		}
	});
	for(Emp e:empList) {
	System.out.println(e.getId()+" "+e.getName()+" "+e.getCity()+" "+e.getSalary());			
	
	}
	
}
}
