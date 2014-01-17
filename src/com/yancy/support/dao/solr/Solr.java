package com.yancy.support.dao.solr;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.junit.Test;



public class Solr {


	
	private static volatile HttpSolrServer[] readServers;
	
	private static volatile HttpSolrServer writeServer;
	
	public enum SolrConnection{
		READ,WRITE
	}

	@Test
	public static HttpSolrServer getConnection(SolrConnection c) {
		if(c.equals(SolrConnection.READ)){
			if (readServers == null || readServers.length < 1) {
				synchronized(Solr.class){
					if(readServers == null || readServers.length < 1){
						Properties prop = new Properties();
						InputStream in = Solr.class.getResourceAsStream("/solr.properties");
						try {
							prop.load(in);
							String[] urls = prop.getProperty("readUrl").split(";");
							//System.out.println("urls= "+Arrays.toString(urls));
							readServers = new HttpSolrServer[urls.length];
							for (int i = 0; i < urls.length; i++) {
								HttpSolrServer readServer = new HttpSolrServer(urls[i]);
								readServer.setConnectionTimeout(Integer.valueOf(prop
										.getProperty("connectionTimeout")));
								readServer.setDefaultMaxConnectionsPerHost(Integer.valueOf(prop
										.getProperty("defaultMaxConnectionsPerHost")));
								readServer.setMaxRetries(Integer.valueOf(prop
										.getProperty("maxRetries")));
								readServer.setMaxTotalConnections(Integer.valueOf(prop
										.getProperty("maxTotalConnections")));
								readServers[i] = readServer;
							}
							
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
			int index = (int)(System.currentTimeMillis()%readServers.length);
			return readServers[index];
		}else if(c.equals(SolrConnection.WRITE)){
			if (writeServer == null) {
				synchronized(Solr.class){
					if(writeServer == null){
						Properties prop = new Properties();
						InputStream in = Solr.class.getResourceAsStream("/solr.properties");
						try {
							prop.load(in);
							writeServer = new HttpSolrServer(prop.getProperty("writeUrl"));
							writeServer.setConnectionTimeout(Integer.valueOf(prop
									.getProperty("connectionTimeout")));
							writeServer.setDefaultMaxConnectionsPerHost(Integer.valueOf(prop
									.getProperty("defaultMaxConnectionsPerHost")));
							writeServer.setMaxRetries(Integer.valueOf(prop
									.getProperty("maxRetries")));
							writeServer.setMaxTotalConnections(Integer.valueOf(prop
									.getProperty("maxTotalConnections")));
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
			return writeServer;
		}
		return null;
		
	}
	
//	public static void indexWithCommit(List<? extends Indexable> list){
//		List<SolrInputDocument> docs = new ArrayList<SolrInputDocument>();
//		try {
//			for (Indexable e : list) {
//				SolrInputDocument doc = new SolrInputDocument();
//				doc.addField("id", e.getClass().getSimpleName()+" "+e.getId());
//				doc.addField("type", e.getType());
//				doc.addField("index_time_dts", DateUtils.timestamp2SolrDate(System.currentTimeMillis()));
//				SolrMapping mapping = e.getSolrMapping();
//				for (String fieldName : mapping.getTextFields()) {
//					try {
//						String getMethodName = "get"+StringUtils.upcaseFirstChar(fieldName);
//						Method m = e.getClass().getMethod(getMethodName);
//						doc.addField(fieldName+"_text", m.invoke(e));
//					} catch (Exception e1) {
//						e1.printStackTrace();
//					}
//				}
//				for (Map.Entry<String, String> kv : mapping.getOtherFields().entrySet()) {
//					try {
//						String getMethodName = "get"+StringUtils.upcaseFirstChar(kv.getKey());
//						Method m = e.getClass().getMethod(getMethodName);
//						Object o = m.invoke(e);
//						if(kv.getValue().contains("_dts")){
//							doc.addField(kv.getValue(), DateUtils.timestamp2SolrDate(DateUtils.cnStr2Date(o.toString()).getTimeInMillis()));
//						}else{
//							doc.addField(kv.getValue(), o);
//						}
//					} catch (Exception e1) {
//						e1.printStackTrace();
//					}
//					
//				}
//				docs.add(doc);
//			}
//			if(docs.size() > 0){
//				getConnection(SolrConnection.WRITE).add(docs);
//			}
//		} catch (SolrServerException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	
}
