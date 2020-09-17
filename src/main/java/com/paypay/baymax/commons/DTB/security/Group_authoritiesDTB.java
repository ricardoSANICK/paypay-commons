package com.paypay.baymax.commons.DTB.security;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class Group_authoritiesDTB {

	private Integer id;
	private GroupsDTB group_id;
	private String authority;
	private String estatus;

	public Group_authoritiesDTB() {
		super();
	}

	public Group_authoritiesDTB(Integer id, GroupsDTB group_id, String authority) {
		this.id = id;
		this.group_id = group_id;
		this.authority = authority;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public GroupsDTB getGroup_id() {
		return this.group_id;
	}

	public void setGroup_id(GroupsDTB group_id) {
		this.group_id = group_id;
	}

	public String getAuthority() {
		return this.authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getEstatus() {
		return this.estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
}
