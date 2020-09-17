package com.paypay.baymax.commons.DTO.util;

public class OSRespDTO implements java.io.Serializable {

	private static final long serialVersionUID = 6207597813985113090L;
	private int clave;
	private String color;
	private String nombre;
	private String razonSocial;

	/**
	 * 
	 * @param clave
	 * @param color
	 * @param razonSocial
	 */
	public OSRespDTO(int clave, String color, String nombre, String razonSocial) {
		super();
		this.clave = clave;
		this.color = color;
		this.nombre = nombre;
		this.razonSocial = razonSocial;
	}

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

}
