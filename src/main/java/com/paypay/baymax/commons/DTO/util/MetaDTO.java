package com.paypay.baymax.commons.DTO.util;

import java.util.HashMap;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class MetaDTO {

	private int id;
	private String code;
	private String type;
	private String message;
	private String detail;
	private HashMap<String, String> validate;

	public MetaDTO() {
		super();
	}

	/**
	 * 
	 * @param id
	 * @param code
	 */
	public MetaDTO(int id, String code) {
		super();
		this.id = id;
		this.code = code;
	}

	/**
	 * 
	 * @param id
	 * @param code
	 * @param message
	 */
	public MetaDTO(int id, String code, String message) {
		super();
		this.id = id;
		this.code = code;
		this.message = message;
	}

	/**
	 * 
	 * @param id
	 * @param code
	 * @param type
	 * @param message
	 * @param detail
	 */
	public MetaDTO(int id, String code, String type, String message, String detail) {
		super();
		this.id = id;
		this.code = code;
		this.type = type;
		this.message = message;
		this.detail = detail;
	}

	/**
	 * 
	 * @param id
	 * @param code
	 * @param type
	 * @param message
	 * @param detail
	 * @param validate
	 */
	public MetaDTO(int id, String code, String type, String message, String detail, HashMap<String, String> validate) {
		super();
		this.id = id;
		this.code = code;
		this.type = type;
		this.message = message;
		this.detail = detail;
		this.validate = validate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public HashMap<String, String> getValidate() {
		return validate;
	}

	public void setValidate(HashMap<String, String> validate) {
		this.validate = validate;
	}

}
