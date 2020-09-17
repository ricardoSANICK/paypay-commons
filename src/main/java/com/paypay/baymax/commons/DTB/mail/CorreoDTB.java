package com.paypay.baymax.commons.DTB.mail;

import java.util.Date;

public class CorreoDTB {

	private int id;
	private String de;
	private String para;
	private String cc;
	private String cco;
	private String asunto;
	private Date fechaalta;
	private Date fechaEnvio;
	private String estatus;

	public CorreoDTB() {
		super();
	}

	public CorreoDTB(int id) {
		super();
		this.id = id;
	}

	public CorreoDTB(int id, String de, String para, String cc, String cco, String asunto, Date fechaalta,
			Date fechaEnvio, String estatus) {
		super();
		this.id = id;
		this.de = de;
		this.para = para;
		this.cc = cc;
		this.cco = cco;
		this.asunto = asunto;
		this.fechaalta = fechaalta;
		this.fechaEnvio = fechaEnvio;
		this.estatus = estatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Date getFechaalta() {
		return fechaalta;
	}

	public void setFechaalta(Date fechaalta) {
		this.fechaalta = fechaalta;
	}

	public Date getFechaEnvio() {
		return fechaEnvio;
	}

	public void setFechaEnvio(Date fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

}
