package com.paypay.baymax.commons.util;

import java.util.Date;

import org.joda.time.DateTime;

public class DateUtils {

	/**
	 * 
	 * @param dateFromFilter
	 * @return
	 */
	public static String[] getDateFromFilterd(String dateFromFilter) {
		dateFromFilter = dateFromFilter.replaceAll("\\(", "");
		dateFromFilter = dateFromFilter.replaceAll("\\)", "");
		return dateFromFilter.split("\\|");
	}
	
	/**
	 * 
	 * @param rango
	 * @return
	 */
	public static Date getSp_aDate(String rango) {
		DateTime sp_a = null;
		sp_a = new DateTime(rango.trim());
		sp_a = sp_a.minusMillis(sp_a.getMillisOfDay());
		return new Date(sp_a.toDate().getTime());
	}
	
	public static Date transformSP_aDate(DateTime sp_a) {
		sp_a = sp_a.minusMillis(sp_a.getMillisOfDay());
		return new Date(sp_a.toDate().getTime());
	}
	
	/**
	 * 
	 * @param rango
	 * @return
	 */
	public static Date getSp_bDate(String rango) {
		DateTime sp_b = null;
		sp_b = new DateTime(rango.trim());
		sp_b = sp_b.minusMillis(sp_b.getMillisOfDay());
		sp_b = sp_b.withTime(23, 59, 59, 59);
		return new Date(sp_b.toDate().getTime());
	}
	
	public static Date transformSP_bDate(DateTime sp_b) {
		sp_b = sp_b.minusMillis(sp_b.getMillisOfDay());
		sp_b = sp_b.withTime(23, 59, 59, 59);
		return new Date(sp_b.toDate().getTime());
	}
}
