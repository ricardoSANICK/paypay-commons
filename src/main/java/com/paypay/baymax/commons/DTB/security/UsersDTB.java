package com.paypay.baymax.commons.DTB.security;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class UsersDTB {

	private String username;
	private String nombre;
	private boolean enabled;
	private String foto_miniatura;

	public UsersDTB() {
		super();
	}

	public UsersDTB(String username) {
		super();
		this.username = username;
	}

	public UsersDTB(String username, String nombre, boolean enabled, String foto_miniatura) {
		super();
		this.username = username;
		this.nombre = nombre;
		this.enabled = enabled;
		this.foto_miniatura = foto_miniatura;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getFoto_miniatura() {
		return foto_miniatura;
	}

	public void setFoto_miniatura(String foto_miniatura) {
		this.foto_miniatura = foto_miniatura;
	}

}
