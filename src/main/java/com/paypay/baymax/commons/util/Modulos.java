package com.paypay.baymax.commons.util;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Modulos {

	public final static HashMap<String, String> ENTIDADES = new HashMap<>();
	public final static LinkedList<LinkedHashMap<String, String>> LIST_ENTIDADES = new LinkedList<>();
	public final static List<String> LIST_NO_ADUITED = new ArrayList<>();

	public final static HashMap<String, Type> DTBMap = new HashMap<>();

	static {

		/************************ CATALOGOS *******************************/

		ENTIDADES.put("TLabel", "Labels");
		ENTIDADES.put("LabelDTO", ENTIDADES.get("TLabel"));
		
		ENTIDADES.put("TSection", "Sections");
		ENTIDADES.put("SectionDTO", ENTIDADES.get("TSection"));
		/********************** LISTA DE CATALOGOS NO AUDITADOS ********************/
		
		/*
		LIST_NO_ADUITED.add("TCorreo");
		LIST_NO_ADUITED.add("GroupMembers");
		LIST_NO_ADUITED.add("GroupAuthorities");
		LIST_NO_ADUITED.add("Group_members");
		LIST_NO_ADUITED.add("Group_authorities");
		LIST_NO_ADUITED.add("TBitacora");
		*/
		/**********************
		 * LISTA DE ENTIDADES SIN NO AUDITADOS
		 ********************/

		Map<String, String> ENTIDADES_SORT = ENTIDADES.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.naturalOrder())).collect(Collectors.toMap(
						Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

		for (Entry<String, String> o : ENTIDADES_SORT.entrySet()) {
			LinkedHashMap<String, String> map = new LinkedHashMap<>();
			map.put("id", o.getKey());
			map.put("name", o.getValue());
			if (!o.getKey().contains("DTO"))
				if (!LIST_NO_ADUITED.contains(o.getKey()))
					LIST_ENTIDADES.add(map);
		}

	}

	/**
	 * 
	 * @param modulo
	 * @return
	 */
	public static String getClaveFromModulo(String modulo) {

		String clave = "id";

		switch (modulo) {
		default:
			clave = "id";
			break;
		case "Users":
			clave = "username";
			break;
		case "Groups":
		case "Group_authorities":
		case "Group_members":
			clave = "id";
			break;
		}

		return clave;
	}

}
