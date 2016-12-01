package com.tutorialspoint.springframework.transactionmanager.declarativetransactionmanagement;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author daniel
 * Daniel-Dos
 * daniel.dias.analistati@gmail.com
 */
public class StudentJDBCTemplate implements StudentDAO {

	private JdbcTemplate jdbcTemplatObject;

	@Override
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplatObject = new JdbcTemplate(dataSource);
	}

	@Override
	public void create(String name, Integer age, Integer marks, Integer year) {

		try {
			String SQL1 = "insert into Student (nome,idade) values(?,?)";
			jdbcTemplatObject.update(SQL1,name,age);

			// Get the latest student id to be used in Marks table
			String SQL2 = "select max(id) from Student";
			int sid = jdbcTemplatObject.queryForObject(SQL2, Integer.class);

			String SQL3 = "insert into Marks(sid,marks,year) values (?,?,?)";
			jdbcTemplatObject.update(SQL3,sid,marks,year);

			System.out.println("Create Name = " + name + ", Age = " + age);
			// to simulate the exepction
			throw new RuntimeException("simulate Erro condition.");
		} catch(DataAccessException e) {
			System.out.println("Erro in creating record, rolling back");
			throw e;
		}
	}

	@Override
	public List<StudentMarks> listStudent() {
		String SQL = "select * from Student, Marks where Student.id=Marks.sid";

		List<StudentMarks> studentMarks = jdbcTemplatObject.query(SQL, new StudentMarksMapper());
		return studentMarks;
	}
}