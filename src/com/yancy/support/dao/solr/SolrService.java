package com.yancy.support.dao.solr;

import java.util.Calendar;

import junit.framework.TestCase;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.junit.Test;

import com.yancy.support.dao.ModuleDao;
import com.yancy.support.dao.solr.Solr.SolrConnection;

public class SolrService extends TestCase {
	private static Calendar start = null;
	private static Calendar end = null;
	
	//solr
	//private ModuleDao moduleDao=null;
	public static void main(String[] args){
		
		//getSolrByDay("",String parentException,String sites,int year,int month,int day)
	}
	
	public Integer getSolrByDay(String exception,String parentException,String sites,int year,int month,int day){
			//System.out.println("exception: "+exception);
			SolrQuery solrQuery = new SolrQuery();
			String time=year+"-"+month+"-"+day;
			String startTimeString = time+"T00:00:00.000Z";
			String endTimeString = time+"T23:59:59.999Z";
			//System.out.println(startTimeString);
			//System.out.println(endTimeString);
			StringBuffer sBuffer = new StringBuffer();
			if(parentException==null){
				sBuffer.append("(body_text:").append(exception)
				.append(") AND ");
				sBuffer.append("date_dts:[\"")
				.append(startTimeString).append("\" TO \"")
				.append(endTimeString).append("\"] ");
			}else{
				sBuffer.append("(body_text:").append("("+exception)
				//这里加上父类的表达式
				.append("AND "+parentException+")")
				//修改完毕
				.append(") AND ");
				sBuffer.append("date_dts:[\"")
				.append(startTimeString).append("\" TO \"")
				.append(endTimeString).append("\"] ");
			}
			
			System.out.println("exception is   "+sBuffer.toString());
			
			if(sites=="null"||sites==""||"".equals(sites)||sites==null){
				
			}else{
				sBuffer.append("AND (short_site_id_is:").append(sites)
				.append(")");
			}
			solrQuery.setQuery(sBuffer.toString());
			try {
				System.out.println("solrQuery is "+solrQuery);
				QueryResponse qr = Solr.getConnection(SolrConnection.READ).query(solrQuery);
				String str1=(String) qr.getResponse().getVal(1).toString();
				//System.out.println(qr);
				str1=str1.split(",")[0].split("=")[1];
				return Integer.parseInt(str1);
			} catch (SolrServerException e) {
				e.printStackTrace();
				return 0;
			}
	    }

//	public static void main(String[] args) {
//		// new SolrService().getSolr("(\"快客便利店\")", "42", 2014,1, 9);
//	}

	@Test
	public void test() {
		end = DateUtils.getMidNight();
		start = DateUtils.getNDaysAgo(end, 90);
		// module = Module.loadByScope("retailer");
		SolrQuery solrQuery = new SolrQuery();

		String startTimeString = "2013-11-18T00:00:00.000Z";
		String endTimeString = "2013-11-18T23:59:59.999Z";
		StringBuffer sBuffer = new StringBuffer();
		String str = "(\"Audi\" OR \"奥迪\") AND NOT (\"迪奥\") AND NOT (\"奥利奥\")";
		//str+="AND (((\"Audi\" OR \"奥迪\") AND NOT (\"迪奥\") AND NOT (\"奥利奥\")) OR (\"别克\" OR \"Buick\") OR (\"凯迪拉克\" OR \"Cadillac\") OR (\"雪佛兰\" OR \"Chevrolet\") OR (\"菲亚特\" OR \"Fiat\")) ";
		sBuffer.append("(body_text:").append(str).append(") AND ");
		if (null != start) {
			startTimeString = DateUtils.cal2SolrDate(start);
		}
		if (null != end) {
			endTimeString = DateUtils.cal2SolrDate1MillisBefore(end);
		}
		sBuffer.append("date_dts:[\"").append(startTimeString).append(
				"\" TO \"").append(endTimeString).append("\"] ");
		solrQuery.setQuery(sBuffer.toString());
		try {
			QueryResponse qr = Solr.getConnection(SolrConnection.READ).query(
					solrQuery);
			System.out.println(qr);
			String str1 = (String) qr.getResponse().getVal(1).toString();
			System.out.println(str1.split(",")[0].split("=")[1]);

		} catch (SolrServerException e) {
			e.printStackTrace();
		}

	}

//	 public static void main(String[] args){
//	 new SolrService().test();
//	 int n=new SolrService().getSolrByDay("(\"Audi\" OR \"奥迪\") AND NOT (\"迪奥\") AND NOT (\"奥利奥\")", 
//			 "", 2014, 1, 10);
//	 System.out.println(n);
//	// int year=2014;
//	// int month=1;
//	// int day=6;
//	// String str=year+"-"+month+"-"+day;
//	// System.out.println(str);
//	 }

}
