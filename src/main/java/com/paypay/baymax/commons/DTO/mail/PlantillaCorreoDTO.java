package com.paypay.baymax.commons.DTO.mail;

import java.util.HashMap;
import java.util.List;

import com.paypay.baymax.commons.DTO.generales.AuditDTO;

public class PlantillaCorreoDTO extends AuditDTO implements java.io.Serializable {

	private static final long serialVersionUID = 7132951958779985884L;

	// Columnas ........................................

	private String clave;
	private String descripcion;
	private String remitente;

	private String multiListPerfilesDestinatarios;

	private String destinatariosOpcionales;
	private String cc;
	private String cco;
	private String asunto;
	private String cuerpo;
	private List<ImagesDTO> imagenes;

	private boolean status;

	private Long version;

	private HashMap<String, String> mapValues;

	// Constructores ...................................

	public PlantillaCorreoDTO() {
		super();
	}

	/**
	 * 
	 * @param clave
	 * @param updateUsername
	 */
	public PlantillaCorreoDTO(String clave, String updateUsername) {
		super();
		this.clave = clave;
		super.setUpdateUsername(updateUsername);
	}

	/**
	 * 
	 * @param clave
	 * @param descripcion
	 * @param remitente
	 * @param multiListPerfilesDestinatarios
	 * @param destinatariosOpcionales
	 * @param cc
	 * @param cco
	 * @param asunto
	 * @param cuerpo
	 * @param status
	 * @param mapValues
	 */
	public PlantillaCorreoDTO(String clave, String descripcion, String remitente, String multiListPerfilesDestinatarios,
			String destinatariosOpcionales, String cc, String cco, String asunto, String cuerpo,
			List<ImagesDTO> imagenes, boolean status, HashMap<String, String> mapValues) {
		super();
		this.clave = clave;
		this.descripcion = descripcion;
		this.remitente = remitente;
		this.multiListPerfilesDestinatarios = multiListPerfilesDestinatarios;
		this.destinatariosOpcionales = destinatariosOpcionales;
		this.cc = cc;
		this.cco = cco;
		this.asunto = asunto;
		this.cuerpo = cuerpo;
		this.imagenes = imagenes;
		this.status = status;
		this.mapValues = mapValues;
	}

	// Beans ...........................................

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

	public String getRemitente() {
		return remitente;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	public String getMultiListPerfilesDestinatarios() {
		return multiListPerfilesDestinatarios;
	}

	public void setMultiListPerfilesDestinatarios(String setMultiListPerfilesDestinatarios) {
		this.multiListPerfilesDestinatarios = setMultiListPerfilesDestinatarios;
	}

	public String getDestinatariosOpcionales() {
		return destinatariosOpcionales;
	}

	public void setDestinatariosOpcionales(String destinatariosOpcionales) {
		this.destinatariosOpcionales = destinatariosOpcionales;
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

	public List<ImagesDTO> getImagenes() {
		return imagenes;
	}

	public void setImagenes(List<ImagesDTO> imagenes) {
		this.imagenes = imagenes;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public HashMap<String, String> getMapValues() {
		return mapValues;
	}

	public void setMapValues(HashMap<String, String> mapValues) {
		this.mapValues = mapValues;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

}
