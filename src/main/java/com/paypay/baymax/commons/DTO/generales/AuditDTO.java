package com.paypay.baymax.commons.DTO.generales;

import java.util.Date;

public class AuditDTO {

	private Date recordDate;
	private Date updateDate;
	private String recordUsername;
	private String updateUsername;

	public AuditDTO() {
		super();
	}

	public AuditDTO(Date recordDate, Date updateDate, String recordUsername, String updateUsername) {
		super();
		this.recordDate = recordDate;
		this.updateDate = updateDate;
		this.recordUsername = recordUsername;
		this.updateUsername = updateUsername;
	}

	public Date getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getRecordUsername() {
		return recordUsername;
	}

	public void setRecordUsername(String recordUsername) {
		this.recordUsername = recordUsername;
	}

	public String getUpdateUsername() {
		return updateUsername;
	}

	public void setUpdateUsername(String updateUsername) {
		this.updateUsername = updateUsername;
	}

}
