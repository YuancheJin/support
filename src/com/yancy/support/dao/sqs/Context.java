package com.yancy.support.dao.sqs;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;


public class Context {

	private final static Map<String,String> context = new HashMap<String,String>();
	
	static{
		Properties prop = new Properties();
		InputStream in = Context.class.getResourceAsStream("/context.properties");
		try {
			prop.load(in);
			for (Entry<Object, Object> entry : prop.entrySet()) {
				context.put(entry.getKey().toString(), entry.getValue().toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean isTest(){
		return "test".equals(context.get("environment"));
	}

}
