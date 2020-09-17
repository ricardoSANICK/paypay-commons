package com.paypay.baymax.commons.DTO.util;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class ResponseDTO {

	private MetaDTO meta;
	private Object results;

	public ResponseDTO() {
	}

	/**
	 * 
	 * @param meta
	 * @param results
	 */
	public ResponseDTO(MetaDTO meta, Object results) {
		super();
		this.meta = meta;
		this.results = results;
	}

	public MetaDTO getMeta() {
		return meta;
	}

	public void setMeta(MetaDTO meta) {
		this.meta = meta;
	}

	public Object getResults() {
		return results;
	}

	public void setResults(Object results) {
		this.results = results;
	}

}
