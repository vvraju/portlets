/**
 * 
 */
package com.ifli.rapid.services.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;

/**
 * @author Prasad Khode
 * 
 */
public class JsonHelper {

	private static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();

	public static String toJson(Object data) {
		return gson.toJson(data);
	}

	public static <T> T fromJson(String data, Class<T> type) {
		return gson.fromJson(data, type);
	}

	public static <T> T fromJson(String json, Type typeOfT) {
		return gson.fromJson(json, typeOfT);
	}
}
