package com.paypay.baymax.commons.util;

public class HourFormatter {
	
	public static String hourToString(int hour){
		
		String 	newHour = "",
				strHour = "000000",
				originalHour = String.valueOf(hour);
		
		strHour = strHour.substring(0, 6 - originalHour.length());
		strHour += originalHour;
		newHour = strHour.substring(0, 2) + ":" + strHour.substring(2, 4) + ":" + strHour.substring(4);
		
		return newHour;

	}
}
