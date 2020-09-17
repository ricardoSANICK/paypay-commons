package com.paypay.baymax.commons.DTO.mail;

import java.util.Date;

public class CorreoDTO {

	private String id;
	private String origen;
	private Date fechaEnvio;
	private String tipo;
	private String de;
	private String para;
	private String cc;
	private String cco;
	private String asunto;
	private String cuerpo;
	private String adjunto;
	private String estatus;
	private Date fechaEstatus;
	private int horaEstatus;
	private String error;
	private int nIntentosError;
	private Date fechaalta;

	public CorreoDTO() {
		super();
	}

	/**
	 * 
	 * @param id
	 */
	public CorreoDTO(String id) {
		super();
		this.id = id;
	}

	/**
	 * 
	 * @param id
	 * @param origen
	 * @param fechaEnvio
	 * @param tipo
	 * @param de
	 * @param para
	 * @param cc
	 * @param cco
	 * @param asunto
	 * @param cuerpo
	 * @param adjunto
	 * @param nombreAdjunto
	 * @param adjuntoBlob
	 * @param nombreAdjuntoBlob
	 * @param estatus
	 * @param fechaEstatus
	 * @param horaEstatus
	 * @param error
	 * @param nIntentosError
	 * @param fechaalta
	 */
	public CorreoDTO(String id, String origen, Date fechaEnvio, String tipo, String de, String para, String cc,
			String cco, String asunto, String cuerpo, String adjunto, String estatus, Date fechaEstatus,
			int horaEstatus, String error, int nIntentosError, Date fechaalta) {
		super();
		this.id = id;
		this.origen = origen;
		this.fechaEnvio = fechaEnvio;
		this.tipo = tipo;
		this.de = de;
		this.para = para;
		this.cc = cc;
		this.cco = cco;
		this.asunto = asunto;
		this.cuerpo = cuerpo;
		this.adjunto = adjunto;
		this.estatus = estatus;
		this.fechaEstatus = fechaEstatus;
		this.horaEstatus = horaEstatus;
		this.error = error;
		this.nIntentosError = nIntentosError;
		this.fechaalta = fechaalta;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public Date getFechaEnvio() {
		return fechaEnvio;
	}

	public void setFechaEnvio(Date fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
	}

	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getCco() {
		return cco;
	}

	public void setCco(String cco) {
		this.cco = cco;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public String getAdjunto() {
		return adjunto;
	}

	public void setAdjunto(String adjunto) {
		this.adjunto = adjunto;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public Date getFechaEstatus() {
		return fechaEstatus;
	}

	public void setFechaEstatus(Date fechaEstatus) {
		this.fechaEstatus = fechaEstatus;
	}

	public int getHoraEstatus() {
		return horaEstatus;
	}

	public void setHoraEstatus(int horaEstatus) {
		this.horaEstatus = horaEstatus;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public int getnIntentosError() {
		return nIntentosError;
	}

	public void setnIntentosError(int nIntentosError) {
		this.nIntentosError = nIntentosError;
	}

	public Date getFechaalta() {
		return fechaalta;
	}

	public void setFechaalta(Date fechaalta) {
		this.fechaalta = fechaalta;
	}

}
