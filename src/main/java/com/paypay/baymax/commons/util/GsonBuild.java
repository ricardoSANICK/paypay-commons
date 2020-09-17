package com.paypay.baymax.commons.util;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.LongSerializationPolicy;

public class GsonBuild {

	private final Gson gson;
	private final Gson gsonDate;

	public GsonBuild() {
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.serializeNulls();
		gsonBuilder.setLongSerializationPolicy( LongSerializationPolicy.STRING );
		gsonBuilder.registerTypeAdapter(Double.class, new DoubleSerializer());
		this.gson = gsonBuilder.create();
		
		GsonBuilder gsonBuilderDate = new GsonBuilder();
		gsonBuilderDate = gsonBuilderDate.serializeNulls();	
		gsonBuilderDate = gsonBuilderDate.setDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		gsonBuilderDate.setLongSerializationPolicy( LongSerializationPolicy.STRING );
		gsonBuilder.registerTypeAdapter(Double.class, new DoubleSerializer());
		this.gsonDate = gsonBuilderDate.create();
		
	}

	public Gson getGson() {
		return gson;
	}

	public Gson getGsonDate() {
		return gsonDate;
	}
	
	private static class DoubleSerializer implements JsonSerializer<Double> {
	    @Override
	    public JsonElement serialize(Double src, Type typeOfSrc, JsonSerializationContext context) {
	        return src == src.longValue() ? new JsonPrimitive(src.longValue()) : new JsonPrimitive(src);
	    }
	}

}
