package com.paypay.baymax.commons.DTB.security;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class PasswordHistoryDTB {

	private long id;
	private String password;
	private UsersDTB username;

	public PasswordHistoryDTB() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UsersDTB getUsername() {
		return username;
	}

	public void setUsername(UsersDTB username) {
		this.username = username;
	}

}