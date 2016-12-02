package com.tutorialspoint.springframework.restful;

/**
 * @author daniel
 * Daniel-Dos 
 * daniel.dias.analistati@gmail.com
 */
public class Country {

	private int id;
	private String countryName;

	public Country(int id, String countryName) {
		super();
		this.setId(id);
		this.setCountryName(countryName);
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}