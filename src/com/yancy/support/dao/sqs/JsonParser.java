package com.yancy.support.dao.sqs;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;

public class JsonParser {

	private static ObjectMapper objectMapper = new ObjectMapper();
	
	static {
		objectMapper.configure(org.codehaus.jackson.JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
		objectMapper.configure(org.codehaus.jackson.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
		objectMapper.configure(org.codehaus.jackson.JsonParser.Feature.CANONICALIZE_FIELD_NAMES, true);
		objectMapper.configure(org.codehaus.jackson.JsonParser.Feature.ALLOW_COMMENTS, true);
		objectMapper.configure(org.codehaus.jackson.JsonParser.Feature.AUTO_CLOSE_SOURCE, true);
		objectMapper.configure(org.codehaus.jackson.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
		objectMapper.configure(org.codehaus.jackson.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
		objectMapper.configure(org.codehaus.jackson.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS,true);
		objectMapper.getSerializationConfig().setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
	}
	
	@SuppressWarnings("unchecked")
	public static Map<String,Object> json2Map(String str){
		try {
			str = str.replaceAll("\"\"", "null");
			return objectMapper.readValue(str, Map.class);
		} catch (Exception e) {
			return Collections.emptyMap();
		}
	}
	
	public static <T extends Object> String map2Json(Map<String,T> map){
		try {
			return objectMapper.writeValueAsString(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public static List<Object> json2List(String str){
		try {
			return objectMapper.readValue(str, List.class);
		} catch (Exception e) {
			return Collections.emptyList();
		}
	}
	
	public static String bean2Json(Object o){
		try {
			return objectMapper.writeValueAsString(o);
		} catch (Exception e) {
			return null;
		}
	}
	
}
