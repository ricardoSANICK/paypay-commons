package com.paypay.baymax.commons.util;

import java.io.UnsupportedEncodingException;
import java.text.CharacterIterator;
import java.text.ParseException;
import java.text.StringCharacterIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtileriasTexto
{
	public UtileriasTexto(){
		
	}
	
	//-------------------Convierte_texto_a_utf8-------------------//
	/*
	 * Funcion: Convertir texto a codificacion UFT-8
	 * */
	public static String convierteTextoaUtf8(String texto)
	{
		if (isUTF8(texto)) {
			return texto;
		}
		String resp = "";
		try
		{
			resp = new String(texto.getBytes("ISO-8859-1"), "UTF-8");
		}
		catch(java.io.UnsupportedEncodingException e)
		{
			resp = e.getMessage();
		}
		return resp;
	}
	
	
	/**
	 * Revisa si el encoding de la cadena es tipo utf-8.
	 * @param cadena Cadena a revisar si es utf-8
	 * @return True si la cadena no es nula y su encoding es utf-8, de lo contrario False.
	 */
	public static boolean isUTF8(String cadena) {
		try {
			String convertido = new String(cadena.getBytes("UTF-8"), "UTF-8");
			if (cadena.equals(convertido)) {
				return true;
			}
		} catch (UnsupportedEncodingException e) {
		} catch (Exception e) {}
		return false;
	}
	
	
	//-----------------QuitaAcentos-------------//
	/*
	 * Funcion: Reemplazar caracteres con acento por caracteres sin acento
	 * Eje: Recibe: áéíóúÁÉÍÓÚ >>>> Regresa: aeiouAEIOU
	 * */
	public static String quitaAcentos(String texto)
    {
        String resp = "";
        if(texto.length() > 0 && texto != null){
        	StringBuffer SB = new StringBuffer(texto.length());
            CharacterIterator CI = new StringCharacterIterator(texto);
            
            for (char CH = CI.first(); CH != CharacterIterator.DONE; CH = CI.next())
            {
                switch(CH)
                {
                    case 'á': SB.append("a"); break;
                    case 'é': SB.append("e"); break;
                    case 'í': SB.append("i"); break;
                    case 'ó': SB.append("o"); break;
                    case 'ú': SB.append("u"); break;
                    case 'Á': SB.append("A"); break;
                    case 'É': SB.append("E"); break;
                    case 'Í': SB.append("I"); break;
                    case 'Ó': SB.append("O"); break;
                    case 'Ú': SB.append("U"); break;
                    case '´': SB.append("");  break;
                    case 'ý': SB.append("y"); break;
                    case 'Ý': SB.append("Y"); break;
                    default : SB.append(CH);  break;
                    
                }
            }
            resp = SB.toString();
        }
        else{
        	resp = texto;
        }
        return resp;
    }
	
	//--------------quitaEspaciosBlanco------------//
	/*
	 * Funcion: Quitar espacios en blanco de un campo tipo texto
	 * Eje: Recibe: Hoy es lunes >>>> Regresa Hoyeslunes
	 * */
	public static String quitaEspaciosBlanco(String texto){
		String resp = "";
        if(texto.length() > 0 && texto != null){
        	StringBuffer SB = new StringBuffer(texto.length());
            CharacterIterator CI = new StringCharacterIterator(texto);
            for (char CH = CI.first(); CH != CharacterIterator.DONE; CH = CI.next()){
                switch(CH){
                    case ' ': SB.append(""); break;
                    default : SB.append(CH);  break;
                }
            }
            resp = SB.toString();
        }
        else{
        	resp = texto;
        }
        return resp;
	}
	
	//---------- hasSpecialChars  ---------------//
	
	/**
	 * Verifica si tiene caracteres especiales la cadena enviada.
	 * @example {@code UtileriasTexto.hasSpecialChars("username$&?")} Retorna {@code true}
	 * @param str cadena pudiendo contener caracteres especiales; nunca {@code null} 
	 * @return boolean
	 */
	public static boolean hasSpecialChars(String str)
	{
		String regex = "[\\\\!\"#$%&()*+,/:;<=>?@\\[\\]^{|}~]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		
		return matcher.find();
	}
	
	/**
	 * Verifica si el numero tiene decimales, de lo contrario regresa el numero sin decimales.
	 * @param float numero con o sin decimales;
	 * @return string
	 */
	public static String formatDecimaltoString(float decimal)
	{
	    if(decimal == (long) decimal)
	        return String.format("%d",(long)decimal);
	    else
	        return String.format("%s",decimal);
	}


	public static String formatCUIT (String cuil) {
		String cuilFormatted = "";
		cuilFormatted = cuil.length() == 8 ? "000" + cuil : cuil;
		cuilFormatted = cuil.length() == 9 ? "00" + cuil : cuilFormatted;
		try {
			cuilFormatted = formatString(cuilFormatted, "##-########-#");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return cuilFormatted;
	}

	public static String formatString(String string, String mask)
			throws java.text.ParseException {
		string = string.replaceAll("[^\\d]", "");
		javax.swing.text.MaskFormatter mf =
				new javax.swing.text.MaskFormatter(mask);
		mf.setValueContainsLiteralCharacters(false);
		return mf.valueToString(string);
	}
}