package com.paypay.baymax.commons.DTB.security;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class Group_membersDTB {

	private String id;
	private GroupsDTB group_id;
	private String username;

	public Group_membersDTB() {
		super();
	}

	public Group_membersDTB(String id, GroupsDTB group_id, String username) {
		this.id = id;
		this.group_id = group_id;
		this.username = username;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public GroupsDTB getGroup_id() {
		return group_id;
	}

	public void setGroup_id(GroupsDTB group_id) {
		this.group_id = group_id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
