package com.paypay.baymax.commons.DTO.post;

import com.paypay.baymax.commons.DTO.generales.AuditDTO;

public class LabelDTO extends AuditDTO implements java.io.Serializable {

	private static final long serialVersionUID = -3784685020440358778L;
	private Long id;
	private String name;
	private boolean status;

	public LabelDTO() {
		super();
	}

	public LabelDTO(Long id, String name, boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
