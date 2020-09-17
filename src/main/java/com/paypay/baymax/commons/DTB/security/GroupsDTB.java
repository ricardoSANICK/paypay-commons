package com.paypay.baymax.commons.DTB.security;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class GroupsDTB {

	private String id;
	private String group_name;
	private String description;

	public GroupsDTB() {
		super();
	}

	public GroupsDTB(String id, String group_name, String description) {
		super();
		this.id = id;
		this.group_name = group_name;
		this.description = description;
	}

	public GroupsDTB(String id, String group_name) {
		this.id = id;
		this.group_name = group_name;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGroup_name() {
		return this.group_name;
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
