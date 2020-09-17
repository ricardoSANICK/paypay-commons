package com.paypay.baymax.commons.DTB.security;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class PasswordResetToken {

	private long id;
	private String token;
	private Date expiryDate;
	private UsersDTB username;

	public PasswordResetToken() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public UsersDTB getUsername() {
		return username;
	}

	public void setUsername(UsersDTB username) {
		this.username = username;
	}
}
