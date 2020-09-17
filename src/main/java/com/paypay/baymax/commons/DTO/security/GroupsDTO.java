package com.paypay.baymax.commons.DTO.security;

import com.paypay.baymax.commons.DTO.generales.AuditDTO;

public class GroupsDTO extends AuditDTO implements java.io.Serializable {

	private static final long serialVersionUID = 3219331400986194682L;
	private Long id;
	private String group_name;
	private String description;

	public GroupsDTO() {
		super();
	}

	public GroupsDTO(Long id, String updateUsername) {
		super();
		this.id = id;
		super.setUpdateUsername(updateUsername);
	}

	public GroupsDTO(Long id, String group_name, String description) {
		super();
		this.id = id;
		this.group_name = group_name;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
