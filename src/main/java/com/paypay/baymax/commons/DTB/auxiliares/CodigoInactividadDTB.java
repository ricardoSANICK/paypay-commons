package com.paypay.baymax.commons.DTB.auxiliares;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class CodigoInactividadDTB {

	private int clave;
	private String nombre;
	private boolean status;

	public CodigoInactividadDTB() {
	}

	public CodigoInactividadDTB(int clave, String nombre, boolean status) {
		super();
		this.clave = clave;
		this.nombre = nombre;
		this.status = status;
	}

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
