package com.yancy.support.service.impl;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.yancy.support.dao.AnalyticsDao;
import com.yancy.support.dao.DashboardDao;
import com.yancy.support.dao.ModuleDao;
import com.yancy.support.dao.ThreadsDao;
import com.yancy.support.dao.WeiboAnalyticsDao;
import com.yancy.support.dao.WeiboDashboardDao;
import com.yancy.support.dao.WeiboThreadDao;
import com.yancy.support.dao.dynamo.DynamoDBService;
import com.yancy.support.dao.solr.SolrService;
import com.yancy.support.pojo.Analytics;
import com.yancy.support.pojo.Dashboards;
import com.yancy.support.pojo.Modules;
import com.yancy.support.service.CheckModulesService;
import com.yancy.support.util.DateUtil;
import com.yancy.support.util.EmailUtil;
import com.yancy.support.vo.Message;

public class CheckModulesServiceImpl implements CheckModulesService {
	//out
	private static Logger logger = Logger.getLogger(CheckModulesService.class);
	
	private AnalyticsDao analyticsDao;
	private DashboardDao dashboardDao;
	private ModuleDao moduleDao;
	private ThreadsDao threadsDao;
	private WeiboAnalyticsDao weiboAnalyticsDao;
	private WeiboDashboardDao weiboDashboardDao;
	private WeiboThreadDao weiboThreadDao;
	
	//service
	//private DynamoDBService dynamoService;
	//private SolrService solrService;
	
	
	public void startCheckModules(String modulesNames,String email) throws Exception {
		StringBuffer messageStr=new StringBuffer();
		String[] modules=modulesNames.split(",");
		for(int i=0;i<modules.length;i++){
			try{
				
				Message message=new Message();
				Modules module=moduleDao.findByName(modules[i]);
				DynamoDBService dms=new DynamoDBService();
				int dynamoDbNum=dms.queryBuzzDistributionByDay(module, DateUtil.getTSDA(0)[0], DateUtil.getTSDA(0)[1], DateUtil.getTSDA(0)[2]);
				SolrService solrService=new SolrService();
				int solrNum=solrService.getSolrByDay(module.getExpression(), module.getSites(), DateUtil.getTSDA(1)[0], DateUtil.getTSDA(1)[1], DateUtil.getTSDA(1)[2]);
				if("brand".equals(module.getModuleType())){
					String scope=module.getScope();  Integer period=1;
					message.setModules(module);
					message.setThreads(threadsDao.findCountByScope(scope));
					message.setDashboardsList(dashboardDao.findByScope(scope,period));
					message.setAnalyticsList(analyticsDao.findByScope(module.getScope(), DateUtil.getTSDA(7)[1], DateUtil.getTSDA(7)[0], DateUtil.getTSDA(7)[2]));
					message.setSolrNum(solrNum);
					message.setDynamoDbNum(dynamoDbNum);
					if(checkModule(message,messageStr)){
						if(checkDashboard(message,messageStr)){
							if(checkAnalytics(message,messageStr)){
								checkAll(message,messageStr);
								printAll(message,messageStr);
							}
						}
					}
				}else if("weibo".equals(module.getModuleType())){
					//微博类型的判断待完善
					message.setModules(module);
					message.setSolrNum(solrNum);
					message.setDynamoDbNum(dynamoDbNum);
					if(checkModule(message,messageStr)){
						checkAll(message,messageStr);
					}
				}else{
					//其他类型的判断待完善
					message.setModules(module);
					message.setSolrNum(solrNum);
					message.setDynamoDbNum(dynamoDbNum);
					if(checkModule(message,messageStr)){
						checkAll(message,messageStr);
					}
				}
			}catch(Exception e){
				e.printStackTrace();
				messageStr.append("xxxxxxxxxxx   moduels的名字错误("+modules[i]+")，或发生一些其他异常"+"\r\n");
				messageStr.append("    异常信息为："+e.toString()+"\r\n");
				
			}
	
		}
		// 将信息写入 日志文件
		//logger.error(messageStr);
		//发送邮件
		EmailUtil.sendEmail(email, messageStr.toString());
	}
	
	public void startCheckAllModules() throws Exception {
		//目前所有的modules只檢查modules的狀態，做一些最基本的判斷。
		StringBuffer messageStr;
		List<Modules> list=moduleDao.findAllModules();
		for(Iterator<Modules> it=list.iterator();it.hasNext();){
			try{
				messageStr=new StringBuffer();
				Message message=new Message();
				Modules module=it.next();
				message.setModules(module);
			
				checkModule(message,messageStr);
				// 将信息写入 日志文件
				logger.error(messageStr);
				//发送邮件
				//EmailUtil.sendEmail("kyuanche@qq.com", messageStr.toString());
				
			}catch(Exception e){
				e.printStackTrace();
			}

		}
	}
	
	public boolean checkModule(Message message,StringBuffer messageStr){
		messageStr.append("\r\n **********MODULE's name is "+message.getModules().getName()+"\r\n");
		messageStr.append("    module's type is "+message.getModules().getModuleType());
		//判断updated_time 是否是今天
		Timestamp time=message.getModules().getUpdatedTime();
		Date date=null;
		if(time!=null){
			date=new Date(time.getTime());
		} 
		Date nowDate=new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		if(sf.format(date).equals(sf.format(nowDate))){
			if(message.getModules().getStatus()==0){
				messageStr.append("    数据正常跑完！");
				messageStr.append("\r\n");
				return true;
			}else if(message.getModules().getStatus()==1){
				messageStr.append("    数据还正在跑！");
			}else{
				messageStr.append("    跑数据出错！,错误信息为：");
				message.getModules().getErrorLog();
				message.getModules().getErrorDate();
				message.getModules().getInstance();
				
				messageStr.append("   日期："+message.getModules().getErrorDate());
				messageStr.append("   机器："+message.getModules().getInstance());
				messageStr.append("   日志："+message.getModules().getErrorLog());
			}
		}else{
			//判断status
			if(message.getModules().getStatus()==0){
				messageStr.append("    在过去的时间("+message.getModules().getUpdatedTime()+") 数据没有跑！");
			}else if(message.getModules().getStatus()==1){
				messageStr.append("    在过去的时间("+message.getModules().getUpdatedTime()+") 数据还有跑完！");
			}else{
				messageStr.append("    在过去的时间("+message.getModules().getUpdatedTime()+") 跑数据出错！");
			}
		}
		messageStr.append("\r\n");
		return false;
	}
	
	/**
	 * brand类型
	 * */
	public boolean checkDashboard(Message message,StringBuffer messageStr){
		messageStr.append("dashboard表check： ");
		List<Dashboards> list=message.getDashboardsList();
		boolean a=list.get(0).getIncludeBuzz();
		boolean b=list.get(1).getIncludeBuzz();
		if((a==true&&b==false)||(a==false&&b==true)){
			messageStr.append("");
		}
		for(Iterator<Dashboards> it=list.iterator();it.hasNext();){
			Dashboards d=it.next();
			d.getIncludeBuzz();
		}
		if(list.size()<2){
			messageStr.append("    dashboard表只有"+list.size()+"条记录.");
			if(list.size()==1){
				messageStr.append("    该记录的include_buzz="+list.get(0).getIncludeBuzz()+".");
			}
			messageStr.append("\r\n");
			return false;
		}else{
			messageStr.append("\r\n");
			return true;
		}
	}
	public boolean checkAnalytics(Message message,StringBuffer messageStr){
		messageStr.append("    analytics表check： ");
		List<Analytics> list=message.getAnalyticsList();
		if(list.size()<7){
			messageStr.append("近7天的记录数少,他们的日期分别为： ");
			
			for(Iterator<Analytics> it=list.iterator();it.hasNext();){
				Analytics a=it.next();
				messageStr.append(a.getYear()+"-");
				messageStr.append(a.getMonth()+"-");
				messageStr.append(a.getDay()+"  ");
				messageStr.append(a.getIncludeBuzz()+"  ");
			}
			messageStr.append("\r\n");
			return false;
		}else{
			messageStr.append("\r\n");
			return true;
		}
	}
	public boolean checkThreads(Message message,StringBuffer messageStr){
		messageStr.append("thread表check： ");
		//threads 拿回来的数据应该与dashboard include_buzz=0 的数据相等
		List<Dashboards> list=message.getDashboardsList();
		for(Iterator<Dashboards> it=list.iterator();it.hasNext();){
			Dashboards dashboards=it.next();
			if(dashboards.getIncludeBuzz()==false){
				if(message.getThreads()==(long)dashboards.getThreads()){
					messageStr.append("与dashboard include_buzz=0 的数据相等  ");
					messageStr.append("\r\n");
					return true;
				}
			}
		}
		messageStr.append("与dashboard include_buzz=0 的数据不相等  ");
		messageStr.append("\r\n");
		return false;	
	}
	public void checkAll(Message message,StringBuffer messageStr){
	    messageStr.append("综合 check： ");
		//主要用于检测各表关联的信息以及solr dynamodb的数据
		messageStr.append("\r\n");
	}
	public void printAll(Message message,StringBuffer messageStr){
		messageStr.append("##########注：############## "+"\r\n");
		//显示所有信息（待完成）
		messageStr.append("查询详情请使用support manual check 功能！ "+"\r\n");
	}
	/**
	 * 其他类型
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public AnalyticsDao getAnalyticsDao() {
		return analyticsDao;
	}
	public void setAnalyticsDao(AnalyticsDao analyticsDao) {
		this.analyticsDao = analyticsDao;
	}
	public DashboardDao getDashboardDao() {
		return dashboardDao;
	}
	public void setDashboardDao(DashboardDao dashboardDao) {
		this.dashboardDao = dashboardDao;
	}
	public ModuleDao getModuleDao() {
		return moduleDao;
	}
	public void setModuleDao(ModuleDao moduleDao) {
		this.moduleDao = moduleDao;
	}
	public ThreadsDao getThreadsDao() {
		return threadsDao;
	}
	public void setThreadsDao(ThreadsDao threadsDao) {
		this.threadsDao = threadsDao;
	}
	public WeiboAnalyticsDao getWeiboAnalyticsDao() {
		return weiboAnalyticsDao;
	}
	public void setWeiboAnalyticsDao(WeiboAnalyticsDao weiboAnalyticsDao) {
		this.weiboAnalyticsDao = weiboAnalyticsDao;
	}
	public WeiboDashboardDao getWeiboDashboardDao() {
		return weiboDashboardDao;
	}
	public void setWeiboDashboardDao(WeiboDashboardDao weiboDashboardDao) {
		this.weiboDashboardDao = weiboDashboardDao;
	}
	public WeiboThreadDao getWeiboThreadDao() {
		return weiboThreadDao;
	}
	public void setWeiboThreadDao(WeiboThreadDao weiboThreadDao) {
		this.weiboThreadDao = weiboThreadDao;
	}
	
	
	

}
