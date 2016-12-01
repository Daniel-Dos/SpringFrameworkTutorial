package com.tutorialspoint.springframework.transactionmanagement.programatictransactionmanagement;

import java.util.List;

import javax.sql.DataSource;

/**
 * @author daniel
 * Daniel-Dos
 * daniel.dias.analistati@gmail.com
 */
public interface StudentDAO {

	/**
	 * This is the method to be used to initialize
	 * database resources ie. connection.
	 */
	public void setDataSource(DataSource dataSource);

	/**
	 * This is the method to be used to create
	 * a record in the Student an Marks tables.
	 */
	public void create(String name,Integer age,Integer marks,Integer year);

	/**
	 * This is the method to be used to list down
	 * all the from the Student and Marks tables.
	 */
	public List<StudentMarks>listStudents();
}