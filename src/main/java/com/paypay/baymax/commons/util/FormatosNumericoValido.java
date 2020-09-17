package com.paypay.baymax.commons.util;

public enum FormatosNumericoValido {
	
	FORMATO_MONTO_CORTO("$#,###,##0.00"), FORMATO_MONTO_LARGO("$#,###,###,##0.00"),
	FORMATO_DECIMALES_CORTO("$#,###,###,##0.000000"), FORMATO_DECIMALES_LARGO("$#,###,###,##0.00000000");
	
	private String descripcion;

	/**
	 * Constructor del Enum.
	 * @param descripcion
	 */
	private FormatosNumericoValido(String descripcion) {
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
