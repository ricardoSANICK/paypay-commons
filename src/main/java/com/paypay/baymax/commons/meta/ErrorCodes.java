package com.paypay.baymax.commons.meta;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ErrorCodes {

	/************************** COMUNES *******************************/
	public static final String COMBOS = "1000";
	public static final String IMAGE_RESOURCES = "1001";
	public static final String FILE_RESOURCES = "1002";
	public static final String CORREO = "1003";
	public static final String HOME = "1004";
	public static final String FEEDS = "1005";

	/************************** SEGURIDAD *****************************/

	public static final String GROUPS = "2000";
	public static final String USERS = "2001";
	public static final String PERFIL_USUARIO = "2002";
	public static final String GROUP_MEMBERS = "2003";
	public static final String GROUP_AUTHORITIES = "2004";

	/************************** GENERALES *****************************/

	public static final String PARAMETROS = "2005";
	public static final String PLANTILLA_CORREO = "2006";
	public static final String COMUNICADO = "2010";

	/************************** BITACORAS ****************************/

	public static final String BITACORA = "2007";
	public static final String BITACORA_ARCHIVOS = "2008";
	public static final String AUDITORIA = "2009";

	/************************** CONSTANTS CONTROLLERS ****************************/

	public static final String ERROR_GET = "Error al intentar recuperar el registro ";
	public static final String ERROR_LIST = "Error al intentar obtener la lista ";
	public static final String ERROR_SAVE = "Error al intentar registrar ";
	public static final String ERROR_UPDATE = "Error al intentar actualizar ";
	public static final String ERROR_DISABLE = "Error al intentar desactivar ";
	public static final String ERROR_DELETE = "Error al intentar eliminar ";

	/**
	 * Mapa que se genera con los atributos de la clase para generar un diccionario
	 * de endpoints y mantener homologados los nombres entre componentes
	 * SIIA-CORE/SIIA-FRONT en los JSP
	 * 
	 * @return
	 */
	public static Map<String, Object> getAllErrorCodes() {
		Map<String, Object> errorcodes = new HashMap<String, Object>();
		for (Field field : ErrorCodes.class.getFields()) {
			try {
				errorcodes.put(field.getName(), field.get(null));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return errorcodes;
	}
}
