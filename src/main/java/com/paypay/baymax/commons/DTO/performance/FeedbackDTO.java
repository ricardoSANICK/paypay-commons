package com.paypay.baymax.commons.DTO.performance;

import com.paypay.baymax.commons.DTO.catalog.EmployeeDTO;
import com.paypay.baymax.commons.DTO.generales.AuditDTO;

public class FeedbackDTO extends AuditDTO implements java.io.Serializable {

	private static final long serialVersionUID = -1901525087235392608L;
	private Long id;
	private String description;
	private EmployeeDTO assigner;
	private EmployeeDTO assigned;
	private ReviewDTO review;
	private boolean status;

	public FeedbackDTO(Long id, String description, EmployeeDTO assigner, EmployeeDTO assigned, ReviewDTO review, boolean status) {
		super();
		this.id = id;
		this.description = description;
		this.assigner = assigner;
		this.assigned = assigned;
		this.review = review;
		this.status = status;
	}

	public FeedbackDTO() {
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

	public EmployeeDTO getAssigner() {
		return assigner;
	}

	public void setAssigner(EmployeeDTO assigner) {
		this.assigner = assigner;
	}

	public EmployeeDTO getAssigned() {
		return assigned;
	}

	public void setAssigned(EmployeeDTO assigned) {
		this.assigned = assigned;
	}

	public ReviewDTO getReview() {
		return review;
	}

	public void setReview(ReviewDTO review) {
		this.review = review;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
