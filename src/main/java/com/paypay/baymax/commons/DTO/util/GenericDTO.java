package com.paypay.baymax.commons.DTO.util;

public class GenericDTO implements java.io.Serializable {

	private static final long serialVersionUID = -3060730117507062629L;
	private String nombre;
	private String descripcion;

	public GenericDTO() {
		super();
	}

	public GenericDTO(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
