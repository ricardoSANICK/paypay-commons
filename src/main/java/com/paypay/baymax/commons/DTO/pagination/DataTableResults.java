package com.paypay.baymax.commons.DTO.pagination;

import java.util.List;

import com.google.gson.Gson;

public class DataTableResults<T> {

	private String draw;
	private String recordsFiltered;
	private String recordsTotal;
	List<T> data;

	public String getJson() {
		return new Gson().toJson(this);
	}

	public String getDraw() {
		return draw;
	}

	public void setDraw(String draw) {
		this.draw = draw;
	}

	public String getRecordsFiltered() {
		return recordsFiltered;
	}

	public void setRecordsFiltered(String recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}

	public String getRecordsTotal() {
		return recordsTotal;
	}

	public void setRecordsTotal(String recordsTotal) {
		this.recordsTotal = recordsTotal;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

}
