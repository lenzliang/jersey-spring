package com.mkyong.domain;
//V1.2
public class User {
	//primary key add 2016
	private int uid ;
	//username
	private String username;
	//role
	private Role role ;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
