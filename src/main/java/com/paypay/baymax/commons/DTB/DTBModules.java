package com.paypay.baymax.commons.DTB;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypay.baymax.commons.DTB.auxiliares.CodigoInactividadDTB;
import com.paypay.baymax.commons.DTB.mail.PlantillaCorreoDTB;
import com.paypay.baymax.commons.DTB.security.Group_authoritiesDTB;
import com.paypay.baymax.commons.DTB.security.Group_membersDTB;
import com.paypay.baymax.commons.DTB.security.GroupsDTB;
import com.paypay.baymax.commons.DTB.security.UsersDTB;
import com.paypay.baymax.commons.DTO.security.GroupsDTO;
import com.paypay.baymax.commons.util.Modulos;

public class DTBModules {

	public static final HashMap<String, List<String>> DTBModule = new HashMap<>();
	public static final List<Class<?>> DTBList = new ArrayList<>();
	public static final Map<String, Class<?>> DTBMap = new HashMap<>();

	public static final HashMap<String, HashMap<String, List<String>>> includedMethods = new HashMap<String, HashMap<String, List<String>>>();

	static {
		HashMap<String, List<String>> emptyMap = new HashMap<String, List<String>>();
		HashMap<String, List<String>> includeMethods = new HashMap<>();
		HashMap<String, List<String>> GroupsDTBMap = new HashMap<String, List<String>>();

		GroupsDTBMap.put(GroupsDTO.class.getSimpleName(), Arrays.asList("id", "group_name"));

		/********************** CATALOGOS SEGURIDAD *******************************/
		DTBList.add(GroupsDTB.class);
		DTBList.add(UsersDTB.class);
		DTBList.add(Group_membersDTB.class);
		DTBList.add(Group_authoritiesDTB.class);

		/********************** CATALOGOS GENERALES *******************************/
		// DTBList.add(ComunicadoDTB.class);
		DTBList.add(PlantillaCorreoDTB.class);

		/********************** CATALOGOS AUXILIARES *******************************/
		DTBList.add(CodigoInactividadDTB.class);

		for (Class<?> clazz : DTBList) {
			String simpleName = clazz.getSimpleName();

			includeMethods = new HashMap<>();
			switch (simpleName) {
			case "Group_membersDTB":
			case "Group_authoritiesDTB":
				includeMethods.put(GroupsDTB.class.getSimpleName(), Arrays.asList("id", "group_name"));
				includedMethods.put(clazz.getSimpleName(), includeMethods);
				break;
			default:
				includedMethods.put(clazz.getSimpleName(), emptyMap);
				break;
			}

			DTBMap.put(simpleName, clazz);

		}

	}

	public static void main(String... strings) {
//		includedMethods.forEach((k,v) -> System.out.println("k: " + k + "\t | v: " + v ));
	}

	public static boolean checkDTBRelation(Field field) {
		return DTBMap.containsKey(field.getType().getSimpleName());
	}

	public static boolean checkDTBRelation(String field) {
		return DTBMap.containsKey(field);
	}

	public static Class<?> getDTBRelation(Field field) {
		if (checkDTBRelation(field)) {
			return (Class<?>) DTBMap.get(field.getType().getSimpleName());
		}
		return null;
	}

	public static Class<?> getDTBRelation(String field) {
		if (checkDTBRelation(field)) {
			return (Class<?>) DTBMap.get(field);
		}
		return null;
	}

	public static String parseEntityName(Field field) {

		String entityName = null;
		Class<?> clazz = getDTBRelation(field);

		if (clazz != null) {
			String clazzName = clazz.getSimpleName();

			if (clazzName.compareTo(GroupsDTB.class.getSimpleName()) != 0
					&& clazzName.compareTo(UsersDTB.class.getSimpleName()) != 0
					&& clazzName.compareTo(Group_membersDTB.class.getSimpleName()) != 0
					&& clazzName.compareTo(Group_authoritiesDTB.class.getSimpleName()) != 0) {
				entityName = "T" + clazz.getSimpleName().replaceAll("DTB", "");
			} else {
				entityName = clazz.getSimpleName().replaceAll("DTB", "");
			}

		}
		return entityName;
	}

	public static String getFKFieldName(Field field) {

		String fkFieldName = null;
		Class<?> clazz = getDTBRelation(field);

		if (clazz != null) {
			String clazzName = clazz.getSimpleName();

			if (clazzName.compareTo(GroupsDTB.class.getSimpleName()) != 0
					&& clazzName.compareTo(UsersDTB.class.getSimpleName()) != 0
					&& clazzName.compareTo(Group_membersDTB.class.getSimpleName()) != 0
					&& clazzName.compareTo(Group_authoritiesDTB.class.getSimpleName()) != 0) {
				fkFieldName = "FK_" + field.getName();
			} else {
				fkFieldName = field.getName();
			}

		}
		return fkFieldName;
	}

	public static String getPKFieldName(Field field) {
		String pkFieldName = null;
		Class<?> clazz = getDTBRelation(field);

		if (clazz != null) {
			String clazzName = clazz.getSimpleName();
			pkFieldName = Modulos.getClaveFromModulo(clazzName);
		}

		return pkFieldName;
	}
}