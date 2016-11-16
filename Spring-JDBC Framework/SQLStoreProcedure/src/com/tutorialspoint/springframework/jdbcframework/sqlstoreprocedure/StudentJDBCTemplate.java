package com.tutorialspoint.springframework.jdbcframework.sqlstoreprocedure;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

/**
 * @author daniel
 * Daniel-Dos
 * daniel.dias.analistati@gmail.com
 */
public class StudentJDBCTemplate implements StudentDAO {

	private DataSource dataSource;
	private SimpleJdbcCall jdbcCall;
	private JdbcTemplate jdbcTemplateObject;

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcCall = new SimpleJdbcCall(dataSource).
				withProcedureName("getRecord");
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public void create(String name, Integer age) {
		String SQL = "insert into Student (nome, idade) values(?,?)";
		
		jdbcTemplateObject.update(SQL,name,age);
		System.out.println("Created Record Name = " + name + " Age = " + age);
		return;
	}

	@Override
	public Student getStudent(Integer id) {
		SqlParameterSource in = new MapSqlParameterSource().
				addValue("in_id", id);
		Map<String,Object> out = jdbcCall.execute(in);
		
		Student student = new Student();
		student.setId(id);
		student.setName((String) out.get("OUT_NOME"));
		student.setAge( (Number) out.get("OUT_IDADE"));

		return student;
	}

	@Override
	public List<Student> listStudents() {
		String SQL = "select * from Student";
		List<Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
		return students;
	}
}