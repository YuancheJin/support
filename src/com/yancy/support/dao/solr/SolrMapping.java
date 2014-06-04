package com.yancy.support.dao.solr;

import java.util.HashMap;
import java.util.Map;

public class SolrMapping {

	private String[] textFields;
	
	
	public SolrMapping(String[] textFields) {
		super();
		this.textFields = textFields;
		otherFields = new HashMap<String,String>();
	}

	private Map<String,String> otherFields;

	public String[] getTextFields() {
		return textFields;
	}

	public Map<String, String> getOtherFields() {
		return otherFields;
	}
	
	public void addField(String fieldName,String indexName){
		otherFields.put(fieldName, indexName);
	}
}
