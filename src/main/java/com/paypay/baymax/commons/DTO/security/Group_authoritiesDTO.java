package com.paypay.baymax.commons.DTO.security;

import com.paypay.baymax.commons.DTO.generales.AuditDTO;

public class Group_authoritiesDTO extends AuditDTO implements java.io.Serializable {

	private static final long serialVersionUID = 8620849658639719580L;
	private Integer id;
	private GroupsDTO group_id;
	private String authority;

	public Group_authoritiesDTO() {
		super();
	}

	public Group_authoritiesDTO(Integer id, GroupsDTO group_id, String authority) {
		super();
		this.id = id;
		this.group_id = group_id;
		this.authority = authority;
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

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

}
