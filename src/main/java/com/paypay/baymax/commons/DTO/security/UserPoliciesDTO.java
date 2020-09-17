package com.paypay.baymax.commons.DTO.security;

import java.util.Date;

import com.paypay.baymax.commons.DTO.generales.AuditDTO;

public class UserPoliciesDTO extends AuditDTO implements java.io.Serializable {

	private static final long serialVersionUID = 5512332585109242617L;
	private long id;
	private int failedAttemps;
	private Date lastPasswordChange;
	private Date lastPasswordReset;
	private Date lastAccess;
	private Date lockDate;
	private UsersDTO username;

	public UserPoliciesDTO() {
		super();
	}

	public UserPoliciesDTO(long id) {
		super();
		this.id = id;
	}

	public UserPoliciesDTO(long id, String usuarioModificacion) {
		super();
		this.id = id;
		this.setUpdateUsername(usuarioModificacion);
	}

	public UserPoliciesDTO(long id, int failedAttemps, Date lastPasswordChange, Date lastPasswordReset, Date lastAccess,
			Date lockDate, UsersDTO username) {
		super();
		this.id = id;
		this.failedAttemps = failedAttemps;
		this.lastPasswordChange = lastPasswordChange;
		this.lastPasswordReset = lastPasswordReset;
		this.lastAccess = lastAccess;
		this.lockDate = lockDate;
		this.username = username;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getFailedAttemps() {
		return failedAttemps;
	}

	public void setFailedAttemps(int failedAttemps) {
		this.failedAttemps = failedAttemps;
	}

	public Date getLastPasswordChange() {
		return lastPasswordChange;
	}

	public void setLastPasswordChange(Date lastPasswordChange) {
		this.lastPasswordChange = lastPasswordChange;
	}

	public Date getLastPasswordReset() {
		return lastPasswordReset;
	}

	public void setLastPasswordReset(Date lastPasswordReset) {
		this.lastPasswordReset = lastPasswordReset;
	}

	public Date getLastAccess() {
		return lastAccess;
	}

	public void setLastAccess(Date lastAccess) {
		this.lastAccess = lastAccess;
	}

	public Date getLockDate() {
		return lockDate;
	}

	public void setLockDate(Date lockDate) {
		this.lockDate = lockDate;
	}

	public UsersDTO getUsername() {
		return username;
	}

	public void setUsername(UsersDTO username) {
		this.username = username;
	}

}
