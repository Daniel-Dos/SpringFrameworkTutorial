package com.tutorialspoint.mvc;

/**
 * @author daniel
 * github:Daniel-Dos
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
public class User {

	private String username;
	private String password;
	private String address;
	private boolean receivePaper;
	private String[] favoriteFramework;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isReceivePaper() {
		return receivePaper;
	}

	public void setReceivePaper(boolean receivePaper) {
		this.receivePaper = receivePaper;
	}

	public String[] getFavoriteFramework() {
		return favoriteFramework;
	}

	public void setFavoriteFramework(String[] favoriteFramework) {
		this.favoriteFramework = favoriteFramework;
	}
}