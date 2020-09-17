package com.paypay.baymax.commons.DTO.security;

public class PerfilUsuarioDTO {

	private String username;
	private String avatar;
	private String multiListObrasSocialesFiltro;
	private String updateUsername;

	public PerfilUsuarioDTO() {
		super();
	}

	public PerfilUsuarioDTO(String username) {
		super();
		this.username = username;
	}

	public PerfilUsuarioDTO(String username, String avatar, String multiListObrasSocialesFiltro,
			String updateUsername) {
		super();
		this.username = username;
		this.avatar = avatar;
		this.multiListObrasSocialesFiltro = multiListObrasSocialesFiltro;
		this.updateUsername = updateUsername;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getMultiListObrasSocialesFiltro() {
		return multiListObrasSocialesFiltro;
	}

	public void setMultiListObrasSocialesFiltro(String multiListObrasSocialesFiltro) {
		this.multiListObrasSocialesFiltro = multiListObrasSocialesFiltro;
	}

	public String getUpdateUsername() {
		return updateUsername;
	}

	public void setUpdateUsername(String updateUsername) {
		this.updateUsername = updateUsername;
	}

}
