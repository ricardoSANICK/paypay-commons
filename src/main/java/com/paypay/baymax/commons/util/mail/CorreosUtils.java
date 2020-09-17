package com.paypay.baymax.commons.util.mail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.paypay.baymax.commons.DTO.mail.PlantillaCorreoDTO;

public class CorreosUtils {

	static Logger log = LoggerFactory.getLogger(CorreosUtils.class);

	/**
	 *
	 * @param otrosCorreos Otros correos -> Abogados Internos, Abogados Externos,
	 *                     Areas, Responsable, Autorizador, Usuario nuevo, otros
	 *                     hardcode
	 * @throws Exception
	 */
	public PlantillaCorreoDTO procesarPlantilla(PlantillaCorreoDTO plantilla, ArrayList<String> otrosCorreos) {

		if (plantilla != null) {
			log.debug("Procesando plantilla con clave: " + plantilla.getClave());
			log.debug("Estatus de la plantilla: " + plantilla.getStatus());
			if (plantilla.getStatus()) {
				StringBuilder destinatarios = new StringBuilder().append("");

				// [1] - Carga los destinatarios opcionales de la plantilla

				if (StringUtils.isNotBlank(plantilla.getDestinatariosOpcionales())) {
					String opt = plantilla.getDestinatariosOpcionales();

					if (!opt.substring(opt.length() - 1, opt.length()).contains(";")) {
						destinatarios.append(plantilla.getDestinatariosOpcionales() + ";");
					} else {
						destinatarios.append(plantilla.getDestinatariosOpcionales().trim());
					}
				}

				// [2] - Valida si deben cargar correos adicionales

				if (CollectionUtils.isNotEmpty(otrosCorreos)) {
					for (String otros : otrosCorreos) {
						if (!destinatarios.toString().contains(otros)) {
							if (!otros.substring(otros.length() - 1, otros.length()).contains(";")) {
								otros = otros + ";";
							}
							destinatarios.append(otros);
						}
					}
				}

				plantilla.setCuerpo(procesarCuerpo(plantilla.getCuerpo(), plantilla.getMapValues()));
				plantilla.setDestinatariosOpcionales(destinatarios.toString());

			}
		}

		return plantilla;
	}

	/**
	 * Procesar cuerpo del correo
	 * 
	 * @param cuerpo
	 * @param mapValues
	 * @return
	 */
	private String procesarCuerpo(String cuerpo, HashMap<String, String> mapValues) {
		String strCuerpo = cuerpo;

		for (Map.Entry<String, String> entry : mapValues.entrySet()) {
			strCuerpo = strCuerpo.replaceAll(entry.getKey(), entry.getValue());
		}

		return strCuerpo;
	}

}
