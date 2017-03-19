package com.pp2.user;

public class DBUser implements java.io.Serializable {

	private int userId;
	private String username;

	public DBUser() {
	}

	public DBUser(int userId, String username) {
		this.userId = userId;
		this.username = username;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}