package com.paypay.baymax.commons.DTO.security;

import java.util.Date;

import com.paypay.baymax.commons.DTO.generales.AuditDTO;

public class PasswordResetTokenDTO extends AuditDTO implements java.io.Serializable {

	private static final long serialVersionUID = 1475814373076501544L;
	private long id;
	private String token;
	private Date expiryDate;
	private UsersDTO username;

	public PasswordResetTokenDTO() {
		super();
	}

	public PasswordResetTokenDTO(long id, String usuarioModificacion) {
		super();
		this.id = id;
		this.setUpdateUsername(usuarioModificacion);
	}

	public PasswordResetTokenDTO(long id, String token, Date expiryDate, UsersDTO username) {
		super();
		this.id = id;
		this.token = token;
		this.expiryDate = expiryDate;
		this.username = username;
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

	public UsersDTO getUsername() {
		return username;
	}

	public void setUsername(UsersDTO username) {
		this.username = username;
	}

}
