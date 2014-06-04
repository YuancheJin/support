package com.yancy.support.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.amazonaws.services.dynamodb.datamodeling.PaginatedQueryList;
import com.yancy.support.dao.AnalyticsDao;
import com.yancy.support.dao.ModuleDao;
import com.yancy.support.dao.dynamo.DynamoModel;
import com.yancy.support.dao.dynamo.WeiboBuzzVolume;
import com.yancy.support.dao.solr.SolrService;
import com.yancy.support.pojo.Analytics;
import com.yancy.support.pojo.Modules;
import com.yancy.support.service.CheckDataByMonthService;
import com.yancy.support.util.DateUtil;
import com.yancy.support.util.GmailUtil;

public class CheckDataByMonthServiceImpl implements CheckDataByMonthService {
	private AnalyticsDao analyticsDao;
	private ModuleDao moduleDao;
	public  void startCheckDataByMonth(String userEmails,String mails,int year,int month,int day) throws Exception {
		// dynamodb
		//DynamoDBService dms = new DynamoDBService();
		// solr
		SolrService solrService = new SolrService();
		StringBuffer messageStr = new StringBuffer();

		
		
		//String userEmails = "bellyarmor@wildfire.asia,retailer@wildfire.asia";
		String[] userEmailArr = userEmails.split(",");
		for (int i = 0; i < userEmailArr.length; i++) {
			try {
				messageStr.append("\r\n\r\n##########用户名为：  " + userEmailArr[i]
						+ "\r\n");
				System.out.println("\r\n##########用户名为：  " + userEmailArr[i]);
				List<Modules> moduleList = moduleDao
						.findJoinByEmail(userEmailArr[i]);
				for (Modules module : moduleList) {
					if (module.getEnable()) {
						// analytics 目前只检查12 月和1月份的
						messageStr.append("\r\n\r\n==========module为: " + module.getName()+" :\r\n ");
						System.out.println("module为：  " + module.getName());
						for (int j = 1; j <= day; j++) {
							List<Analytics> analyticsList = analyticsDao
									.findByScopeMonth(module.getScope(), 12, 2013, j);
							if(analyticsList.size()<2){
								messageStr.append(year+"-"+month+"-"+j+"缺少analytics数据   ");
							}
							//System.out.println("analyticsList size is "+analyticsList.size());

							Modules parentModule=moduleDao.findByScope(module.getParent());
							
							int solrNum=0;
							if(parentModule==null){
								solrNum = solrService.getSolrByDay(module
										.getExpression(), null,module.getSites(),
										year, month, j);
								
							}else{
								solrNum = solrService.getSolrByDay(module
										.getExpression(), parentModule.getExpression(),module.getSites(),
										year, month, j);
							}
							
							
							for (Analytics d : analyticsList) {
								int threads = d.getThreads();
								if (module.getOnlynum() && d.getIncludeBuzz()) {
									int dynamoDbNum = getDynamoByDay(module
											.getBuzzKeyword(), 2013, 12,j);
									messageStr
											.append(year+"-"+month+"-"+j+"(onlynum=1)solr/dynamoDbNum/threads :"
													+ solrNum
													+ "/"
													+ dynamoDbNum
													+ "/"
													+ threads+"  ");
									System.out.println(year+"-"+month+"-"+j+"  when onlynum=1,solr/dynamoDbNum/analytics :"
													+ solrNum
													+ "/"
													+ dynamoDbNum
													+ "/"
													+ threads);
								} else if ((!module.getOnlynum())
										&& (!d.getIncludeBuzz())) {
									messageStr
											.append(year+"-"+month+"-"+j+"(onlynum=0)solr/threads :"
													+ solrNum + "/" + threads+"  ");
									System.out.println(j+"号 when onlynum=0,solr/threads :"
													+ solrNum + "/" + threads);
								}
							}
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		try {
			// String
			// fileName="/var/log/tomcat7/dailychecklog-"+DateUtil.getTSDA(0)[0]+"-"+DateUtil.getTSDA(0)[1]+"-"+DateUtil.getTSDA(0)[2]+".txt";
			String fileName = "monthchecklog-" + DateUtil.getTSDA(0)[0] + "-"
					+ DateUtil.getTSDA(0)[1] + "-" + DateUtil.getTSDA(0)[2]
					+ ".txt";
			File file = new File(fileName);
			if (file.exists()) {
				file.delete();
			}
			file.createNewFile();
			System.out.println(file.getCanonicalPath());
			PrintWriter bp = new PrintWriter(new OutputStreamWriter(
					new FileOutputStream(fileName)));
			bp.write(messageStr.toString());
			bp.flush();
			bp.close();
			new GmailUtil().startSent(mails, file
					.getAbsolutePath(),"modules 历史数据查询结果("+year+"-"+month+")");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Integer getDynamoByDay(String buzzKeyword, int year,
			int month, int day) {
		int sum = 0;
		try {

			Calendar cal = getCalTime(year, month, day);
			Map<Long, WeiboBuzzVolume> buzzDistribution = new HashMap<Long, WeiboBuzzVolume>();
			if (buzzKeyword != null && !"".equals(buzzKeyword)) {
				String startRangeKey = String.valueOf(cal.getTimeInMillis());
				String endRangeKey = String.valueOf(cal.getTimeInMillis());
				PaginatedQueryList<WeiboBuzzVolume> query = DynamoModel.query(
						WeiboBuzzVolume.class, buzzKeyword, startRangeKey,
						endRangeKey);
				for (Iterator<WeiboBuzzVolume> iterator = query.iterator(); iterator
						.hasNext();) {
					WeiboBuzzVolume weiboBuzzVolume = (WeiboBuzzVolume) iterator
							.next();
					buzzDistribution.put(weiboBuzzVolume.getTimestamp(),
							weiboBuzzVolume);
				}
			}
			for (WeiboBuzzVolume wbv : buzzDistribution.values()) {
				wbv.getVolumeDup();
				wbv.getVolumeNoDup();
				sum += wbv.getVolumeDup();
			}
			System.out.println("dynomdb is "+sum);
			return sum;
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
			return -1;
		}
	}

	/**
	 *get Calendar by int[](year,month,day)
	 */
	public static Calendar getCalTime(int year, int month, int day)
			throws java.text.ParseException {
		try {
			String str = year + "-" + month + "-" + day;
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date date = format.parse(str);
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			return cal;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 *get solr's data (int[]) by some days ago
	 */
	public static int[] getTSDA(Integer dayAgo) {
		try {
			Calendar calendar = Calendar.getInstance();
			calendar.add(Calendar.DATE, -dayAgo);// 得到当前一天（如果前一天就-1）
			calendar.add(Calendar.MONTH, 0);// 得到月
			Date date = calendar.getTime();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String time1 = sdf.format(date);
			String[] dateAr = time1.split("-");
			int[] n = new int[dateAr.length];
			for (int i = 0; i < dateAr.length; i++) {
				n[i] = Integer.parseInt(dateAr[i]);
			}
			return n;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public void setAnalyticsDao(AnalyticsDao analyticsDao) {
		this.analyticsDao = analyticsDao;
	}

	public void setModuleDao(ModuleDao moduleDao) {
		this.moduleDao = moduleDao;
	}
	
}
