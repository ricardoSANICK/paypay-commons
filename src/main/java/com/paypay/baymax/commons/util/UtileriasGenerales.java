package com.paypay.baymax.commons.util;

import java.awt.Color;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import org.apache.commons.lang.StringUtils;
import org.hibernate.exception.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


public class UtileriasGenerales{

	static Logger log = LoggerFactory.getLogger(UtileriasGenerales.class);
	
//	private static final String EncriptPasword = "sha";
//	private static final String EncodingPasword = "UTF-8";
	public UtileriasGenerales(){
	}

	//---------------getHoraEntero------------------//
	/* Funcion: Regresar la hora actual en un valor entero.
	 * Eje. Convierte la hora 01:30:00  a  133000
	 * */
	public static int getHoraEntero(){
		int resp = 0;
		String resp_aux = "";
		Calendar obj_Calendar = Calendar.getInstance();
		if(obj_Calendar.get(Calendar.HOUR_OF_DAY) < 10){
			resp_aux = "0"+String.valueOf(obj_Calendar.get(Calendar.HOUR_OF_DAY));
		}else{
			resp_aux = String.valueOf(obj_Calendar.get(Calendar.HOUR_OF_DAY));
		}
		if(obj_Calendar.get(Calendar.MINUTE) < 10){
			resp_aux += "0"+String.valueOf(obj_Calendar.get(Calendar.MINUTE));
		}else{
			resp_aux += String.valueOf(obj_Calendar.get(Calendar.MINUTE));
		}
		if(obj_Calendar.get(Calendar.SECOND) < 10){
			resp_aux += "0"+String.valueOf(obj_Calendar.get(Calendar.SECOND));
		}else{
			resp_aux += String.valueOf(obj_Calendar.get(Calendar.SECOND));
		}
		resp = Integer.parseInt(resp_aux);
		return resp;
	}
	//---------------getHoraEntero------------------//
	/* Funcion: Regresar la hora actual en un valor entero.
	 * Eje. Convierte la hora 01:30:00  a  133000
	 * */
	public static int getHoraEntero(Date date){
		int resp = 0;
		String resp_aux = "";
		Calendar obj_Calendar = Calendar.getInstance();
		obj_Calendar.setTime(date);

		if(obj_Calendar.get(Calendar.HOUR_OF_DAY) < 10){
			resp_aux = "0"+String.valueOf(obj_Calendar.get(Calendar.HOUR_OF_DAY));
		}else{
			resp_aux = String.valueOf(obj_Calendar.get(Calendar.HOUR_OF_DAY));
		}
		if(obj_Calendar.get(Calendar.MINUTE) < 10){
			resp_aux += "0"+String.valueOf(obj_Calendar.get(Calendar.MINUTE));
		}else{
			resp_aux += String.valueOf(obj_Calendar.get(Calendar.MINUTE));
		}
		if(obj_Calendar.get(Calendar.SECOND) < 10){
			resp_aux += "0"+String.valueOf(obj_Calendar.get(Calendar.SECOND));
		}else{
			resp_aux += String.valueOf(obj_Calendar.get(Calendar.SECOND));
		}
		resp = Integer.parseInt(resp_aux);
		return resp;
	}
	//---------------getFechaEntero------------------//
	/* Funcion: Regresar la fecha actual en un valor entero.
	 * Eje. Convierte la hora 2014-01-01  a  20140101
	 * */
	public static int getFechaEntero(){
		int resp = 0;
		String resp_aux = "";
		Calendar obj_Calendar = Calendar.getInstance();
		
		//año
		resp_aux = String.valueOf(obj_Calendar.get(Calendar.YEAR));
		//mes 
		if(obj_Calendar.get(Calendar.MONTH)+1 < 10){
			resp_aux += "0"+String.valueOf(obj_Calendar.get(Calendar.MONTH)+1);
		}else{
			resp_aux += String.valueOf(obj_Calendar.get(Calendar.MONTH)+1);
		}
		//dia
		if(obj_Calendar.get(Calendar.DAY_OF_MONTH) < 10){
			resp_aux += "0"+String.valueOf(obj_Calendar.get(Calendar.DAY_OF_MONTH));
		}else{
			resp_aux += String.valueOf(obj_Calendar.get(Calendar.DAY_OF_MONTH));
		}
		resp = Integer.parseInt(resp_aux);
		return resp;
	}
	
	@SuppressWarnings("rawtypes")
	public Object EliminaEspacios(Object entidad,Class<?> clase)
	{
		HashMap<String, Object> setters = this.getSetters(clase);
		HashMap<String, Object> getters = this.getGetters(clase);
		if((!setters.isEmpty())&&(!getters.isEmpty()))
		{
			final Iterator<Entry<String, Object>> it = setters.entrySet().iterator();
			Entry<String, Object> entry= null;
			while (it.hasNext()) {
				entry= it.next();
				if(((Class)((Object[])entry.getValue())[0]).getName().equals(String.class.getName()))
				{
					try {
						Method metodoGeter = clase.getDeclaredMethod("get"+entry.getKey().substring(3, entry.getKey().length()));
						Method metodoSeter = clase.getMethod(entry.getKey(), String.class);
						metodoSeter.invoke(entidad, metodoGeter.invoke(entidad) == null?"":metodoGeter.invoke(entidad).toString().trim());
					} catch (IllegalAccessException e) {
						log.debug("IllegalAccessException " +e.getMessage());
					} catch (IllegalArgumentException e) {
						log.debug("IllegalArgumentException " +e.getMessage());
					} catch (InvocationTargetException e) {
						log.debug("InvocationTargetException " +e.getMessage());
					} catch (NoSuchMethodException e) {
						log.debug("NoSuchMethodException " +e.getMessage());
					} catch (SecurityException e) {
						log.debug("SecurityException " +e.getMessage());
					}catch(Exception e)
					{
						log.debug("Exception Causa: " +e.getCause()+" Mensaje: "+e.getMessage());
					}
				}
			}
		}
		return entidad;
	}

	protected HashMap<String, Object> getSetters(Class<?> clase){
		Method[] metodos = clase.getMethods();
		HashMap<String,Object> setters = new HashMap<String,Object>();
		for(Method metodo : metodos){
			if(isSetter(metodo))
			{
				setters.put(metodo.getName(), metodo.getParameterTypes());
			}
		}
		return setters;
	}

	protected HashMap<String,Object> getGetters(Class<?> clase){
		Method[] metodos = clase.getMethods();
		HashMap<String,Object> getters = new HashMap<String,Object>();
		for(Method metodo : metodos){
			if(isGetter(metodo))
			{
				getters.put(metodo.getName(), metodo.getParameterTypes());
			}
		}
		return getters;
	}
	
	
	//---------------encryptPassword------------------//
	/* Funcion: Regresar la una cadena encriptada.
	*/
	public static String encryptPassword(String password)
	{
	    String encryptKey = "";
	    
	    PasswordEncoder pe = new BCryptPasswordEncoder();

	    try
	    {	
	    	encryptKey = pe.encode(password);
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    
	    return encryptKey;
	}
	
	protected static String byteToHex(final byte[] hash)
	{
	    Formatter formatter = new Formatter();
	    for (byte b : hash)
	    {
	        formatter.format("%02x", b);
	    }
	    String result = formatter.toString();
	    formatter.close();
	    return result;
	}
	
	protected boolean isGetter(Method method){
		if(!method.getName().startsWith("get"))      return false;
		if(method.getParameterTypes().length != 0)   return false;  
		if(void.class.equals(method.getReturnType())) return false;
		return true;
	}

	protected boolean isSetter(Method method){
		if(!method.getName().startsWith("set")) return false;
		if(method.getParameterTypes().length != 1) return false;
		return true;
	}
	
	/**
	 * 
	 * @param importe BigDecimal Cantidad a formatear
	 * @param pattern String Formato deseado para mostrar cantidad en moneda.
	 * @return String
	 */
	public static String getImporteFormateado(BigDecimal importe, String pattern){
		if(importe == null){ importe = new BigDecimal(0.0); }
		DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols();
		otherSymbols.setDecimalSeparator('.');
		otherSymbols.setGroupingSeparator(','); 
		DecimalFormat formatter = new DecimalFormat(pattern,otherSymbols);
		return formatter.format(importe);
	}
	
	
	/**
	 * @param params Parametros a sumar.
	 * @return BigDecimal Suma de los parametros.
	 */
	public static BigDecimal sumar(BigDecimal... params) {
		BigDecimal suma = BigDecimal.ZERO;
  		for (BigDecimal param: params){
  			if (param == null){
  				param = BigDecimal.ZERO;
  			}
  			suma = suma.add(param);
  		}
  		return suma;
  	}
	
	
	/**
	 * @param Parametros a restar.
	 * @return BigDecimal Resta de los parametros.
	 */
	public static BigDecimal restar(BigDecimal minuendo, BigDecimal sustraendo) {
		BigDecimal resta = BigDecimal.ZERO;
		if (minuendo == null){
			minuendo = BigDecimal.ZERO;
		}
		if (sustraendo == null){
			sustraendo = BigDecimal.ZERO;
		}
  		resta = minuendo.subtract(sustraendo);
  		return resta;
  	}
		
	/**
	 * Obtiene la diferencia de días entre dos fechas.<br>
	 * El tipo de valor (positivo/negativo) se da dependiendo de cual de las dos fechas sea mayor a la otra.
	 * @return Diferencia de dias entre las dos fechas.
	 * @throws Exception Lanza excepción si alguno de los parámetros es nulo.
	 */
	public static int date_sub_Date(java.util.Date fechaI, java.util.Date fechaF) throws Exception {
		if (fechaI == null || fechaF == null) {
			throw new Exception("Error: Los parámetros no pueden ser nulos.");
		}
		long millisecondsI = fechaI.getTime();
	    long millisecondsF = fechaF.getTime();
	    long diaI = millisecondsI/86400000; //86400000 = 24 * 60 * 60 * 1000
	    long diaF = millisecondsF/86400000;
	    double diferencia = diaF - diaI; 
	    int redondeo = (int) Math.round(diferencia);
		return redondeo;
	}
		
	/**
	 * Obtiene el formato de una fecha entregada como cadena.
	 * @param fecha
	 * @return Formato de la fecha.
	 */
	public static String getFormatToDate(String fecha) {
		String formato = null;
		String separador = null;
		if (fecha.indexOf("-")>0){
			separador = "-";
		}
		else if (fecha.indexOf("/")>0){
			separador = "/";
		}
		
		for (FormatosFechaValidos formatoFecha : FormatosFechaValidos.values()){
			formato = formatoFecha.getDescripcion();
			if (formato.length()==fecha.length() && formato.indexOf(separador)>0 && formato.indexOf(separador)==fecha.indexOf(separador)){
				return formato;
			}
		}
		return null;
	}
	
	public static String RestablecerPorcentajePorCadenaParaURLs(String cadena){
		if(StringUtils.isNotBlank(cadena)) {
			cadena = cadena.replaceAll("489765134865porcentaje1321687561968", "%");
		}
		else {
			cadena = "";
		}
	
		return cadena;
	}
	
	
	public static String getMonthStringFromMonthInt(int month, String language){
		String strMonth = "";
		
		switch(month)
		{
			case 1:
				strMonth = language.equals("ES") ? "Enero" : "January";
				break;
			case 2:
				strMonth = language.equals("ES") ? "Febrero" : "February";
				break;
			case 3:
				strMonth = language.equals("ES") ? "Marzo" : "March";
				break;
			case 4:
				strMonth = language.equals("ES") ? "Abril" : "April";
				break;
			case 5:
				strMonth = language.equals("ES") ? "Mayo" : "May";
				break;
			case 6:
				strMonth = language.equals("ES") ? "Junio" : "June";
				break;
			case 7:
				strMonth = language.equals("ES") ? "Julio" : "July";
				break;
			case 8:
				strMonth = language.equals("ES") ? "Agosto" : "August";
				break;
			case 9:
				strMonth = language.equals("ES") ? "Septiembre" : "September";
				break;
			case 10:
				strMonth = language.equals("ES") ? "Octubre" : "October";
				break;
			case 11:
				strMonth = language.equals("ES") ? "Noviembre" : "November";
				break;
			case 12:
				strMonth = language.equals("ES") ? "Diciembre" : "December";
				break;
		}
		
		
		return strMonth;
	}
	
	public static String formatBigDecimal(String format, BigDecimal bigDecimal ){
		String res= "";
		DecimalFormat df = new DecimalFormat(format);
		
		if(bigDecimal != null){
			res = df.format(bigDecimal);
		}else{
			res= df.format(0.00);
		}
		
		return res;
	}
	
	/**
	 * 
	 * @param colorStr e.g. "#FFFFFF"
	 * @return 
	 */
	public static Color hex2Rgb(String colorStr) {
	    return new Color(
	            Integer.valueOf( colorStr.substring( 1, 3 ), 16 ),
	            Integer.valueOf( colorStr.substring( 3, 5 ), 16 ),
	            Integer.valueOf( colorStr.substring( 5, 7 ), 16 ) );
	}
	
	/**
	 * 
	 * @param
	 * @return
	 */
	public static String getRestrictionName(Exception e){
		String message = "ERROR";
		try 
		{
			
			message = getRestrictionName(e.getMessage());
			if(message.compareTo("ERROR") == 0 && (!message.contains("UK") || !message.contains("PK") ))
			{
				message = getRestrictionName(e.getLocalizedMessage());
				if(message.compareTo("ERROR") == 0 && (!message.contains("UK") || !message.contains("PK") ))
				{
					message = getRestrictionName(e.getCause().getMessage());
					if(message.compareTo("ERROR") == 0 && (!message.contains("UK") || !message.contains("PK") ))
					{
						message = getRestrictionName(e.getCause().getLocalizedMessage());
						if(message.compareTo("ERROR") == 0 && (!message.contains("UK") || !message.contains("PK") ))
						{
							message = "ERROR";
						}
					}
				}
			}
			
			return message;
		} 
		catch(Exception ex)
		{
			return "ERROR";
		}
    }
	/**
	 *
	 * @return
	 */
	public static String getRestrictionName(DataIntegrityViolationException e){
		String message = "ERROR";
		try 
		{			
			message = getRestrictionName(e.getMessage());
			if(message.compareTo("ERROR") == 0 && (!message.contains("UK") || !message.contains("PK") ))
			{
				message = getRestrictionName(e.getLocalizedMessage());
				if(message.compareTo("ERROR") == 0 && (!message.contains("UK") || !message.contains("PK") ))
				{
					message = getRestrictionName(e.getCause().getMessage());
					if(message.compareTo("ERROR") == 0 && (!message.contains("UK") || !message.contains("PK") ))
					{
						message = getRestrictionName(e.getCause().getLocalizedMessage());
						if(message.compareTo("ERROR") == 0 && (!message.contains("UK") || !message.contains("PK") ))
						{
							message = getRestrictionName(e.getMostSpecificCause().getMessage());
							if(message.compareTo("ERROR") == 0 && (!message.contains("UK") || !message.contains("PK") ))
							{
								message = getRestrictionName(e.getMostSpecificCause().getLocalizedMessage());
								if(message.compareTo("ERROR") == 0 && (!message.contains("UK") || !message.contains("PK") ))
								{
									message = "ERROR";
								}
							}
							
						}
					}
				}
			}
			
			return message;
		} 
		catch(Exception ex)
		{
			return "ERROR";
		}
    }
	/**
	 *
	 * @return
	 */
	public static String getRestrictionName(ConstraintViolationException e){
		String message = "ERROR";
		try 
		{
			message = getRestrictionName(e.getMessage());
			if(message.compareTo("ERROR") == 0 && (!message.contains("UK") || !message.contains("PK") ))
			{
				message = getRestrictionName(e.getLocalizedMessage());
				if(message.compareTo("ERROR") == 0 && (!message.contains("UK") || !message.contains("PK") ))
				{
					message = getRestrictionName(e.getCause().getMessage());
					if(message.compareTo("ERROR") == 0 && (!message.contains("UK") || !message.contains("PK") ))
					{
						message = getRestrictionName(e.getCause().getLocalizedMessage());
						if(message.compareTo("ERROR") == 0 && (!message.contains("UK") || !message.contains("PK") ))
						{
							message = getRestrictionName(e.getSQLException().getMessage());
							if(message.compareTo("ERROR") == 0 && (!message.contains("UK") || !message.contains("PK") ))
							{
								message = getRestrictionName(e.getSQLException().getLocalizedMessage());
								if(message.compareTo("ERROR") == 0 && (!message.contains("UK") || !message.contains("PK") ))
								{
									message = "ERROR";
								}
							}
							
						}
					}
				}
			}
			return message;
		} 
		catch(Exception ex)
		{
			return "ERROR";
		}
    }
	
	/**
	 * 
	 * @param message
	 * @return
	 */
	public static String getRestrictionName(String message){
		try 
		{
	    	int startPosition = message.indexOf("'") + 1;
	    	int endPosition	= message.indexOf("'", startPosition);
	    	String messageResponse = message.substring(startPosition, endPosition);
	    	return messageResponse;
		} 
		catch(Exception ex)
		{
			return "ERROR";
		}
    }
	
	/**
	 * 
	 * @param Object
	 * @return String
	 */
	public static Map<String, Object> sortByKey(Map<String, Object> unsortMap)
	{
		Map<String, Object> result = unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		return result;
	}
	
}