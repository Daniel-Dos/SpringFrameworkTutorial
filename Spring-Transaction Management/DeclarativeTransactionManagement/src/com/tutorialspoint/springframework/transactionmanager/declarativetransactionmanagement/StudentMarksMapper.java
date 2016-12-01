package com.tutorialspoint.springframework.transactionmanager.declarativetransactionmanagement;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * @author daniel
 * Daniel-Dos
 * daniel.dias.analistati@gmail.com
 */
public class StudentMarksMapper implements RowMapper<StudentMarks> {

	@Override
	public StudentMarks mapRow(ResultSet rs, int rowNum) throws SQLException {

		StudentMarks studentMarks = new StudentMarks();
		studentMarks.setId(rs.getInt("id"));
		studentMarks.setName(rs.getString("nome"));
		studentMarks.setAge(rs.getInt("idade"));
		studentMarks.setSid(rs.getInt("sid"));
		studentMarks.setMarks(rs.getInt("marks"));
		studentMarks.setYear(rs.getInt("year"));
		return studentMarks;
	}
}