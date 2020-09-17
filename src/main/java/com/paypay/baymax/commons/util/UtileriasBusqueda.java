package com.paypay.baymax.commons.util;

import java.util.Arrays;
import java.util.List;

public class UtileriasBusqueda {

	public static boolean validarCampos(List<String> lstValoresCorrectos, String strCampos) {
		boolean blnRespuesta = false;
		int intContador = 0;
		try {
			List<String> lstValoresComparar = Arrays.asList(strCampos.split("\\,"));

			for (String strComparar : lstValoresComparar) {
				for (String strCorrectos : lstValoresCorrectos) {
					if (strComparar.equals(strCorrectos)) {
						intContador ++;
					}
				}
			}
			if (intContador  == lstValoresComparar.size()) {
				blnRespuesta = true;
			}
		} catch (Exception e) {
		}
		return blnRespuesta;
	}

}
