package com.paypay.baymax.commons.DTO;

import java.util.Date;

public class BitacoraDTO {

	private int bitacora_id;
	private String fecha;
	private String hora;
	private String modulo;
	private String usuario_username;
	private String url;
	private String requestAddress;
	private boolean ajax;
	private String accion;

	// Para peticiones
	private boolean insertBitacora;
	private Date fechaInicio;
	private Date fechaFin;
	private String fechaInicioString;
	private String fechaFinString;

	public BitacoraDTO() {
	}

	public BitacoraDTO(boolean insertBitacora) {
		this.insertBitacora = insertBitacora;
	}

	public boolean isInsertBitacora() {
		return insertBitacora;
	}

	public void setInsertBitacora(boolean insertBitacora) {
		this.insertBitacora = insertBitacora;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getUsuario_username() {
		return usuario_username;
	}

	public void setUsuario_username(String usuario_username) {
		this.usuario_username = usuario_username;
	}

	public String getFechaInicioString() {
		return fechaInicioString;
	}

	public void setFechaInicioString(String fechaInicioString) {
		this.fechaInicioString = fechaInicioString;
	}

	public String getFechaFinString() {
		return fechaFinString;
	}

	public void setFechaFinString(String fechaFinString) {
		this.fechaFinString = fechaFinString;
	}

	public int getBitacora_id() {
		return bitacora_id;
	}

	public void setBitacora_id(int id) {
		this.bitacora_id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isAjax() {
		return ajax;
	}

	public void setAjax(boolean ajax) {
		this.ajax = ajax;
	}

	public String getRequestAddress() {
		return requestAddress;
	}

	public void setRequestAddress(String requestAddress) {
		this.requestAddress = requestAddress;
	}

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}
}
