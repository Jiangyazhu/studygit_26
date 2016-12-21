package com.yc.ccs.entity;

public class Admin {
	private Integer id;
	private String username;
	private String password;
	private String securityCode;
	private String partyName;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Admin(Integer id, String username, String password, String securityCode, String partyName) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.securityCode = securityCode;
		this.partyName = partyName;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public String getSecurityCode() {
		return securityCode;
	}
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
	public String getPartyName() {
		return partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}


	@Override
	public String toString() {
		return "Admin [id=" + id + ", username=" + username + ", password=" + password + ", securityCode="
				+ securityCode + ", partyName=" + partyName + "]";
	}
	
	
}
