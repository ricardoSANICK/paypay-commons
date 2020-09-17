package com.paypay.baymax.commons.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class GenericFormatter {

	public static String hourToString(int hour){
		
		String 	newHour = "",
				strHour = "000000",
				originalHour = String.valueOf(hour);
		
		strHour = strHour.substring(0, 6 - originalHour.length());
		strHour += originalHour;
		newHour = strHour.substring(0, 2) + ":" + strHour.substring(2, 4) + ":" + strHour.substring(4);
		
		return newHour;
	}
	
	public static String getDateWithFormat(Date fecha, FormatosFechaValidos formato)
	{
		String result = null;
		SimpleDateFormat sdf = new SimpleDateFormat(formato.getDescripcion());
		result = sdf.format(fecha);
		return result;
	}
	
	public static String getNumberWithFormat(BigDecimal monto, FormatosNumericoValido formato)
	{
		String result = null;
		DecimalFormat df = new DecimalFormat(formato.getDescripcion());
		result = df.format(monto);
		return result;
	}
}
