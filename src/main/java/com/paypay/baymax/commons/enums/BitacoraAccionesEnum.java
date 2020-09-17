package com.paypay.baymax.commons.enums;

public enum BitacoraAccionesEnum {

	GET("Acceso"), 
	SAVE("Registro"), 
	UPDATE("Actualización"), 
	DISABLE("Desactivación"), 
	ENABLE("Activación"),
	DELETE("Eliminación"), 
	RESET_PASSWORD("Reset de Password");

	private String descripcion;

	private BitacoraAccionesEnum(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getName() {
		return name();
	}

	public String getDescripcion() {
		return descripcion;
	}

}