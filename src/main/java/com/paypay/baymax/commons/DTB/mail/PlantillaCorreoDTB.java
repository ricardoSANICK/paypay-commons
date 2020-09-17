package com.paypay.baymax.commons.DTB.mail;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class PlantillaCorreoDTB {

	private String clave;
	private String descripcion;
	private boolean status;

	public PlantillaCorreoDTB() {
		super();
	}

	public PlantillaCorreoDTB(String clave) {
		super();
		this.clave = clave;
	}

	public PlantillaCorreoDTB(String clave, String descripcion, boolean status) {
		super();
		this.clave = clave;
		this.descripcion = descripcion;
		this.status = status;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
