package com.paypay.baymax.commons.DTO.security;

import java.util.Date;
import java.util.List;

public class SAUDTO extends UsersDTO implements java.io.Serializable {

	private static final long serialVersionUID = -5483382909870243596L;
	private long id;
	private Integer failedAttemps;
	private Date lastPasswordChange;
	private Date lastPasswordReset;
	private Date lastAccess;
	private Date lockDate;
	private List<PasswordHistoryDTO> passwordHistoryDTOList;
	private List<String> roles;

	public SAUDTO() {
	}

	public SAUDTO(long id, Integer failedAttemps, Date lastPasswordChange, Date lastPasswordReset, Date lastAccess,
			Date lockDate, List<PasswordHistoryDTO> passwordHistoryDTOList, List<String> roles) {
		this.id = id;
		this.failedAttemps = failedAttemps;
		this.lastPasswordChange = lastPasswordChange;
		this.lastPasswordReset = lastPasswordReset;
		this.lastAccess = lastAccess;
		this.lockDate = lockDate;
		this.passwordHistoryDTOList = passwordHistoryDTOList;
		this.roles = roles;
	}

	public SAUDTO(String username, long id, Integer failedAttemps, Date lastPasswordChange, Date lastPasswordReset,
			Date lastAccess, Date lockDate, List<PasswordHistoryDTO> passwordHistoryDTOList, List<String> roles) {
		super(username);
		this.id = id;
		this.failedAttemps = failedAttemps;
		this.lastPasswordChange = lastPasswordChange;
		this.lastPasswordReset = lastPasswordReset;
		this.lastAccess = lastAccess;
		this.lockDate = lockDate;
		this.passwordHistoryDTOList = passwordHistoryDTOList;
		this.roles = roles;
	}

	public SAUDTO(String username, String updateUsername, long id, Integer failedAttemps, Date lastPasswordChange,
			Date lastPasswordReset, Date lastAccess, Date lockDate, List<PasswordHistoryDTO> passwordHistoryDTOList,
			List<String> roles) {
		super(username, updateUsername);
		this.id = id;
		this.failedAttemps = failedAttemps;
		this.lastPasswordChange = lastPasswordChange;
		this.lastPasswordReset = lastPasswordReset;
		this.lastAccess = lastAccess;
		this.lockDate = lockDate;
		this.passwordHistoryDTOList = passwordHistoryDTOList;
		this.roles = roles;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getFailedAttemps() {
		return failedAttemps;
	}

	public void setFailedAttemps(Integer failedAttemps) {
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

	public List<PasswordHistoryDTO> getPasswordHistoryDTOList() {
		return passwordHistoryDTOList;
	}

	public void setPasswordHistoryDTOList(List<PasswordHistoryDTO> passwordHistoryDTOList) {
		this.passwordHistoryDTOList = passwordHistoryDTOList;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

}
