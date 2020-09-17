package com.paypay.baymax.commons.enums;

import java.util.HashMap;
import java.util.Map;

import com.paypay.baymax.commons.util.UtileriasGenerales;

public enum GeneroEnum {

	MASCULINO("Masculino"), 
	FEMENINO("Femenino");

	private String descripcion;

	/**
	 * 
	 * @param descripcion
	 */
	private GeneroEnum(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name();
	}

	/**
	 * 
	 * @return
	 */
	public String getDescripcion() {
		return descripcion;
	}

	public static Map<String, Object> getGeneros() {
		Map<String, Object> codigos = new HashMap<String, Object>();
		for (GeneroEnum field : GeneroEnum.values()) {
			try {
				codigos.put(field.name(), field.getDescripcion());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return UtileriasGenerales.sortByKey(codigos);
	}
}