package com.paypay.baymax.commons.util;


/**
 * Representa el listado de formatos posibles para fechas.
 * 
 * @author NXN
 * 
 */
public enum FormatosFechaValidos {

	FULL_ymd1("yyyy-MM-dd HH:mm:ss"), MEDIUM_ymd1("yyyy-MM-dd"), SHORT_ymd1("yy-MMM-dd"), 
	FULL_ymd2("yyyy/MM/dd HH:mm:ss"), MEDIUM_ymd2("yyyy/MM/dd"), SHORT_ymd2("yy/MMM/dd"), 
	FULL_dmy1("dd-MM-yyyy HH:mm:ss"), MEDIUM_dmy1("dd-MM-yyyy"), SHORT_dmy1("dd-MMM-yy"),
	FULL_dmy2("dd/MM/yyyy HH:mm:ss"), MEDIUM_dmy2("dd/MM/yyyy"), SHORT_dmy2("dd/MMM/yy")
	, CALCULADORA_ymd("yyyyMMdd"), BITACORA_ymd("yyy-MM-dd")
	, FULL_DATE("yyyy-MM-dd HH:mm:ss .SSS");
	

	private String descripcion;

	/**
	 * Constructor del Enum.
	 * @param descripcion
	 */
	private FormatosFechaValidos(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Recupera el nombre de la constante.
	 * @return String clave del valor del Enum.
	 */
	public String getClave() {
		return name();
	}

	/**
	 * Recupera la descripción asociada a la constante.
	 * @return String descripción de la clave del valor del Enum.
	 */
	public String getDescripcion() {
		return descripcion;
	}

}
