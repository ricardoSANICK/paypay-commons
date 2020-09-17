package com.paypay.baymax.commons.DTO.pagination;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.paypay.baymax.commons.util.GsonBuild;

import org.apache.commons.io.IOUtils;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class DataTableRequest<T> {

	private String uniqueId;
	private String draw;
	private Integer start;
	private Integer length;
	private String search;
	private boolean regex;
	private List<DataTableColumnSpecs> columns;
	private DataTableColumnSpecs order;
	private boolean isGlobalSearch;
	private HashMap<String, String> filters;
	private HashMap<String, String> others;

	public DataTableRequest() {
		super();
	}

	public DataTableRequest(HttpServletRequest request) {
		prepareDataTableRequest(request);
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public boolean isRegex() {
		return regex;
	}

	public void setRegex(boolean regex) {
		this.regex = regex;
	}

	public List<DataTableColumnSpecs> getColumns() {
		return columns;
	}

	public void setColumns(List<DataTableColumnSpecs> columns) {
		this.columns = columns;
	}

	public DataTableColumnSpecs getOrder() {
		return order;
	}

	public void setOrder(DataTableColumnSpecs order) {
		this.order = order;
	}

	public String getDraw() {
		return draw;
	}

	public void setDraw(String draw) {
		this.draw = draw;
	}

	public boolean isGlobalSearch() {
		return isGlobalSearch;
	}

	public void setGlobalSearch(boolean isGlobalSearch) {
		this.isGlobalSearch = isGlobalSearch;
	}

	public HashMap<String, String> getFilters() {
		return filters;
	}

	public void setFilters(HashMap<String, String> filters) {
		this.filters = filters;
	}

	public HashMap<String, String> getOthers() {
		return others;
	}

	public void setOthers(HashMap<String, String> others) {
		this.others = others;
	}

	@SuppressWarnings("unchecked")
	private void prepareDataTableRequest(HttpServletRequest request) {

		Enumeration<String> parameterNames = request.getParameterNames();
		HashMap<String, Object> requestDatatable = null;
		List<HashMap<String, Object>> columns = new ArrayList<>();
		HashMap<String, Object> order = new HashMap<>();
		HashMap<String, Object> search = new HashMap<>();
		String requestString = "";

		Gson gson = new GsonBuild().getGsonDate();

		try {
			requestString = IOUtils.toString(request.getInputStream(), Charset.forName("UTF-8"));
			requestDatatable = gson.fromJson(requestString, new TypeToken<HashMap<String, Object>>() {
			}.getType());

			columns = gson.fromJson(gson.toJson(requestDatatable.get("columns")),
					new TypeToken<List<HashMap<String, Object>>>() {
					}.getType());
			order = requestDatatable.containsKey("order") ? gson.fromJson(gson.toJson(requestDatatable.get("order")),
					new TypeToken<HashMap<String, Object>>() {
					}.getType()) : null;
			search = requestDatatable.containsKey("search") ? gson.fromJson(gson.toJson(requestDatatable.get("search")),
					new TypeToken<HashMap<String, Object>>() {
					}.getType()) : null;

		} catch (IOException e) {
			e.printStackTrace();
		}

		if (requestDatatable != null && !requestDatatable.isEmpty()) {

			ObjectMapper mapper = new ObjectMapper();
			HashMap<String, String> map = new HashMap<String, String>();

			try {
				if (requestDatatable.containsKey("filters"))
					map = mapper.readValue(requestDatatable.get("filters").toString(),
							new TypeReference<HashMap<String, String>>() {
							});
			} catch (JsonParseException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

			this.setFilters(map);
			this.setStart(new BigDecimal(requestDatatable.get(PaginationCriteria.PAGE_NO).toString()).intValue());
			this.setLength(new BigDecimal(requestDatatable.get(PaginationCriteria.PAGE_SIZE).toString()).intValue());
			this.setUniqueId(null);
			this.setDraw(requestDatatable.get(PaginationCriteria.DRAW).toString());

			this.setSearch(search.containsKey("value") ? search.get("value").toString() : "");
			this.setRegex(search.containsKey("regex") ? Boolean.valueOf(search.get("regex").toString()) : false);

			final int sortableCol = order != null && order.containsKey("column")
					? new BigDecimal(order.get("column").toString()).intValue()
					: 0;
			DataTableColumnSpecs columnSpecsOrder = null;

			List<DataTableColumnSpecs> dataTableColumnSpecsList = new ArrayList<DataTableColumnSpecs>();

			if (!AppUtil.isObjectEmpty(this.getSearch())) {
				this.setGlobalSearch(true);
			}

			maxParamsToCheck = columns.size();

			for (HashMap<String, Object> column : columns) {
				HashMap<String, Object> searchFromColumn = gson.fromJson(gson.toJson(column.get("search")),
						new TypeToken<HashMap<String, Object>>() {
						}.getType());
				HashMap<String, Object> orderFromColumn = gson.fromJson(gson.toJson(column.get("order")),
						new TypeToken<HashMap<String, Object>>() {
						}.getType());

				DataTableColumnSpecs columnSpecs = new DataTableColumnSpecs();
				columnSpecs.setData(column.get("data").toString());
				columnSpecs.setName(column.get("name").toString());
				columnSpecs.setOrderable(Boolean.valueOf(column.get("orderable").toString()));

				columnSpecs.setRegex(Boolean.valueOf(searchFromColumn.get("regex").toString()));
				columnSpecs.setSearch(searchFromColumn != null && searchFromColumn.containsKey("value")
						? searchFromColumn.get("value").toString()
						: "");
				columnSpecs.setSearchable(Boolean.valueOf(column.get("searchable").toString()));

				if (orderFromColumn != null) {
					int sortableCol_ = 0;
					if (orderFromColumn.containsKey("column") && orderFromColumn.get("column") != null) {
						sortableCol_ = new BigDecimal(orderFromColumn.get("column").toString()).intValue();
					}
					String sortDir = orderFromColumn.get("dir").toString();

					if (sortableCol_ == sortableCol) {
						columnSpecs.setSortDir(sortDir);
					}
					columnSpecsOrder = columnSpecs;

				}

				dataTableColumnSpecsList.add(columnSpecs);

				if (!AppUtil.isObjectEmpty(columnSpecs.getSearch())) {
					this.setGlobalSearch(false);
				}
			}

			if (!AppUtil.isObjectEmpty(dataTableColumnSpecsList)) {
				this.setColumns(dataTableColumnSpecsList);
			}

			if (columnSpecsOrder != null) {
				this.setOrder(columnSpecsOrder);
			}
		}
	}

	public PaginationCriteria getPaginationRequest() {

		PaginationCriteria pagination = new PaginationCriteria();

		try {
			pagination.setPageNumber(this.getStart());
			pagination.setPageSize(this.getLength());
			pagination.setSearchHint(this.getSearch());

			SortBy sortBy = null;
			try {
				if (!AppUtil.isObjectEmpty(this.getOrder())) {
					sortBy = new SortBy();
					sortBy.addSort(this.getOrder().getData(), SortOrder.fromValue(this.getOrder().getSortDir()));
				}
			} catch (Exception e) {

			}

			FilterBy filterBy = new FilterBy();
			filterBy.setGlobalSearch(this.isGlobalSearch());
			for (DataTableColumnSpecs colSpec : this.getColumns()) {
				if (colSpec.isSearchable()) {
					if (!AppUtil.isObjectEmpty(this.getSearch()) || !AppUtil.isObjectEmpty(colSpec.getSearch())) {
						filterBy.addFilter(colSpec.getData(),
								(this.isGlobalSearch()) ? this.getSearch() : colSpec.getSearch());
					}
				}
			}

			pagination.setSortBy(sortBy);
			pagination.setFilterBy(filterBy);

			return pagination;
		} catch (Exception e) {
			return pagination;
		}
	}

	private int maxParamsToCheck = 0;

}
