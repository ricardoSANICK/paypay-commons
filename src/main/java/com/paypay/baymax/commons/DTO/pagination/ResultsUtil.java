package com.paypay.baymax.commons.DTO.pagination;

import java.util.ArrayList;
import java.util.List;

public class ResultsUtil<T> {

	public DataTableResults<T> getDtResults(DataTableRequest<Object> dtReq, long recordsTotal, List<T> data) {
		DataTableResults<T> dtr = new DataTableResults<T>();
		dtr.setDraw(dtReq.getDraw());
		dtr.setData(data);
		dtr.setRecordsTotal(String.valueOf(recordsTotal));
		dtr.setRecordsFiltered(String.valueOf(recordsTotal));
		return dtr;
	}

	public static final DataTableResults<?> getDtResultsForException() {
		DataTableResults<?> dtr = new DataTableResults<>();
		dtr.setDraw("1");
		dtr.setData(new ArrayList<>());
		dtr.setRecordsTotal("0");
		dtr.setRecordsFiltered("0");
		return dtr;
	}

}
