package com.paypay.baymax.commons.util;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

public class MensajesServer {
	
	public String getMensajeCode(ApplicationContext appContext, Locale idioma, String codigoError){
		String mensajeRespuesta = null;
		ReloadableResourceBundleMessageSource messageSource = null;
		if(codigoError == null || codigoError.isEmpty()){
			codigoError = DefinicionesComunes.CODIGO_OK;
		}
		messageSource = (ReloadableResourceBundleMessageSource)appContext.getBean("messageSource");
		mensajeRespuesta = messageSource.getMessage(codigoError, null, LocaleContextHolder.getLocale());
		return mensajeRespuesta;
	}

}
