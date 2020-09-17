package com.paypay.baymax.commons.DTO.security;

import com.paypay.baymax.commons.DTO.generales.AuditDTO;

public class PasswordHistoryDTO extends AuditDTO implements java.io.Serializable {

	private static final long serialVersionUID = 5756506935270057535L;
	private long id;
	private String password;
	private UsersDTO username;

	public PasswordHistoryDTO() {
		super();
	}

	public PasswordHistoryDTO(long id, String usuarioModificacion) {
		super();
		this.id = id;
		this.setUpdateUsername(usuarioModificacion);
	}

	public PasswordHistoryDTO(long id, String password, UsersDTO username) {
		super();
		this.id = id;
		this.password = password;
		this.username = username;
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

	public UsersDTO getUsername() {
		return username;
	}

	public void setUsername(UsersDTO username) {
		this.username = username;
	}

}
