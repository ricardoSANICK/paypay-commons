package com.paypay.baymax.commons.DTB.security;

import java.util.Date;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class UserPoliciesDTB {

	private long id;
	private int failedAttemps;
	private Date lastPasswordChange;
	private Date lastPasswordReset;
	private Date lastAccess;
	private Date lockDate;
	private UsersDTB username;

	public UserPoliciesDTB() {
		super();
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

	public UsersDTB getUsername() {
		return username;
	}

	public void setUsername(UsersDTB username) {
		this.username = username;
	}
}
