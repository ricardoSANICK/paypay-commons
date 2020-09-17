package com.paypay.baymax.commons.DTO.performance;

import com.paypay.baymax.commons.DTO.generales.AuditDTO;

public class ReviewDTO extends AuditDTO implements java.io.Serializable {

	private static final long serialVersionUID = -9060088196383911582L;
	private Long id;
	private String description;
	private String assigners;
	private boolean status;

	public ReviewDTO(Long id, String description, String assigners, boolean status) {
		super();
		this.id = id;
		this.description = description;
		this.assigners = assigners;
		this.status = status;
	}

	public ReviewDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAssigners() {
		return assigners;
	}

	public void setAssigners(String assigners) {
		this.assigners = assigners;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
