package com.paypay.baymax.commons.DTO.security;

import com.paypay.baymax.commons.DTO.generales.AuditDTO;

public class Group_membersDTO extends AuditDTO implements java.io.Serializable {

	private static final long serialVersionUID = -6349821629132580022L;
	private Integer id;
	private GroupsDTO group_id;
	private String username;

	public Group_membersDTO() {
		super();
	}

	public Group_membersDTO(int id, String updateUsername) {
		super();
		this.id = id;
		super.setUpdateUsername(updateUsername);
	}

	public Group_membersDTO(Integer id, GroupsDTO group_id, String username) {
		super();
		this.id = id;
		this.group_id = group_id;
		this.username = username;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public GroupsDTO getGroup_id() {
		return group_id;
	}

	public void setGroup_id(GroupsDTO group_id) {
		this.group_id = group_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
