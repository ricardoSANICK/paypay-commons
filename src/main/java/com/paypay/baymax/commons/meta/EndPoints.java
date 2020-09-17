package com.paypay.baymax.commons.meta;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public interface EndPoints {

	/************************** LOGIN *******************************/

	String LOGIN = "/login";
	String LOGOUT = "/logout";
	String CHANGE_PASSWORD = "/changePassword";
	String REQUEST_RESET_PASSWORD = "/requestResetPassword";
	String API_RESET_PASSWORD = "/resetPassword";
	String RESET_PASSWORD = "/resetPassword";

	String HOME = "/home";
	String FEEDS = "/feeds";

	/************************** SEGURIDAD *****************************/

	String GROUPS = "/groups";
	String USERS = "/users";
	String PERFIL_USUARIO = "/perfilUsuario";
	String GROUP_MEMBERS = "/groupMembers";
	String GROUP_AUTHORITIES = "/groupAuthorities";

	/************************** COMUNES *******************************/

	String COMBOS = "/combo";
	String IMAGE_RESOURCES = "/imageResources";
	String FILE_RESOURCES = "/fileResources";
	String CORREO = "/correo";

	/************************** GENERALES *****************************/

	String PARAMETROS = "/parametros";
	String PLANTILLA_CORREO = "/plantillaCorreo";

	/************************** BITACORAS ****************************/

	String BITACORA = "/bitacora";
	String BITACORA_ARCHIVOS = "/bitacoraArchivos";
	String AUDITORIA = "/revision";
	String REPORTEAUDITORIA = "/reporteRevision";
	
	/************************** MAIN ****************************/
	String EMPLOYEES = "/employee";
	String REVIEWS = "/review";
	String FEEDBACKS = "/feedback";
	

	/**
	 * 
	 * @return
	 */
	public static Map<String, Object> getAllEndPoints() {
		Map<String, Object> endpoints = new HashMap<String, Object>();
		for (Field field : EndPoints.class.getFields()) {
			try {
				endpoints.put(field.getName(), field.get(null));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return endpoints;
	}

}
