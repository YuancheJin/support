package com.yancy.support.dao.solr;


public interface Indexable {
	
	SolrMapping getSolrMapping();
	
	String getId();
	
	String getType();

}
