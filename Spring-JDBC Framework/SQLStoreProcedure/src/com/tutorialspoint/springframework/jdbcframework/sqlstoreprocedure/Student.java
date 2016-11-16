package com.tutorialspoint.springframework.jdbcframework.sqlstoreprocedure;

/**
 * @author daniel Daniel-Dos daniel.dias.analistati@gmail.com
 */
public class Student {

	private Number age;
	private String name;
	private Integer id;

	public void setAge(Number age) {
		this.age = age;
	}

	public Number getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}
}