package com.mkyong.domain;
//pull test ---------->
public class Role {
	//primary key
	private int rid ;
	//用户名
	private String rolename;
	//rid
	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	
	
	
}
