package com.paypay.baymax.commons.DTO.mail;

public class ImagesDTO implements java.io.Serializable {

	private static final long serialVersionUID = -210068594434015852L;
	private String id;
	private String base64;

	public ImagesDTO() {
		super();
	}

	public ImagesDTO(String id, String base64) {
		super();
		this.id = id;
		this.base64 = base64;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBase64() {
		return base64;
	}

	public void setBase64(String base64) {
		this.base64 = base64;
	}
}
