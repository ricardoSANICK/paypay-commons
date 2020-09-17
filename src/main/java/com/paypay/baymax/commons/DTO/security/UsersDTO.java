package com.paypay.baymax.commons.DTO.security;

import com.paypay.baymax.commons.DTO.generales.AuditDTO;

public class UsersDTO extends AuditDTO implements java.io.Serializable {

	private static final long serialVersionUID = 5239468740333161389L;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String avatar;
	private String email;
	private String telephone;
	private String cellphone;
	private String groups;
	private boolean locked;
	private boolean enabled;

	public UsersDTO() {
		super();
	}

	public UsersDTO(String username) {
		super();
		this.username = username;
	}
	
	public UsersDTO(String username, String updateUsername) {
		super();
		this.username = username;
		super.setUpdateUsername(updateUsername);
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getGroups() {
		return groups;
	}

	public void setGroups(String groups) {
		this.groups = groups;
	}

	public boolean getLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
