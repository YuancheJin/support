//package com.yancy.support.service.impl;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.OutputStreamWriter;
//import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.Timestamp;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;
//import java.util.TreeMap;
//
//import com.yancy.support.dao.AnalyticsDao;
//import com.yancy.support.dao.DailyThreadsDao;
//import com.yancy.support.dao.DashboardDao;
//import com.yancy.support.dao.ModuleDao;
//import com.yancy.support.dao.ThreadsDao;
//import com.yancy.support.dao.WeiboAnalyticsDao;
//import com.yancy.support.dao.WeiboDashboardDao;
//import com.yancy.support.dao.WeiboThreadDao;
//import com.yancy.support.dao.dynamo.DynamoDBService;
//import com.yancy.support.dao.jdbc.JDBC;
//import com.yancy.support.dao.solr.SolrService;
//import com.yancy.support.pojo.Analytics;
//import com.yancy.support.pojo.Dashboards;
//import com.yancy.support.pojo.Modules;
//import com.yancy.support.service.CheckModulesService;
//import com.yancy.support.util.DateUtil;
//import com.yancy.support.util.GetHtmlUtil;
//import com.yancy.support.util.GmailUtil;
//import com.yancy.support.vo.Message;
//
//public class Copy_2_of_CheckModulesServiceImpl implements CheckModulesService {
//
//	//private static Logger logger = Logger.getLogger(CheckModulesService.class);
//	private AnalyticsDao analyticsDao;
//	private DashboardDao dashboardDao;
//	private ModuleDao moduleDao;
//	private ThreadsDao threadsDao;
//	private WeiboAnalyticsDao weiboAnalyticsDao;
//	private WeiboDashboardDao weiboDashboardDao;
//	private WeiboThreadDao weiboThreadDao;
//	private DailyThreadsDao dailyThreadsDao;
//
//	public final static String BREAK = "<br>";
//	
//	//重跑一个module
//	public void reRunErrorModules(String modules) throws Exception{
//		//startCheckModulesByUserName(modules, null);
//	}
//	public void startCheckModulesByUserName(String userEmails, String email,String scope_)
//			throws Exception {
//		
//		if(scope_==null||"".equals(scope_)){
//			JDBC.delete(JDBC.getConnectionSupport(), "delete from t_historical_data");
//		}else{
//			JDBC.delete(JDBC.getConnectionSupport(), "delete from t_historical_data where scope='"+scope_+"'");
//		}
//		
//		//结果信息
//		StringBuffer baseMessage=new StringBuffer();
//		// 分类信息
//		Map<String, StringBuffer> messageMap = new TreeMap<String, StringBuffer>();
//		// 详细信息
//		StringBuffer messageStr = new StringBuffer();
//		String[] userEmailArr = userEmails.split(",");
//		System.out.println("userEmailArr is "+Arrays.toString(userEmailArr));
//		//String[] sendMail=email.split(",");
//		int sum=0;
//		for (int i = 0; i < userEmailArr.length; i++) {
//			try {
//				messageStr.append(BREAK+"<font color='#660033'>用户名为</font>：  <font color='#9900FF'>" + userEmailArr[i]
//						+ "</font>"+ BREAK);
//				baseMessage.append(BREAK+"<font color='#9900FF'>"+userEmailArr[i]+ "</font>  :   ");
//				List<Modules> moduleList = moduleDao
//						.findJoinByEmail(userEmailArr[i]);
//				sum+=moduleList.size();
//				if(moduleList==null||moduleList.size()==0){
//					moduleList=new ArrayList<Modules>();
//					moduleList.add(moduleDao.findByScope(scope_));
//				}
//				//brand module的topic在industry module没出现(industry的topic少于10的情况下)
//				//把 intr 的module 找出来
//				
////				String[] strIntr=userEmailArr[i].split("@");
////				Modules moduleIntr=moduleDao.findByScope(strIntr[0]);
////				String[]  topicSet=dailyThreadsDao.findTopicFromDailyThreads(moduleIntr.getScope());
////				
////				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@  TOPIC IS "+Arrays.toString(topicSet));
//				
//				
//				
//				
//				
//				for (Modules module : moduleList) {
//					Message message = new Message();
//					message.setUserEmail(userEmailArr[i]);
//					if(module.getEnable()){
//						
//						DynamoDBService dms = new DynamoDBService();
//						int dynamoDbNum = dms.queryBuzzDistributionByDay(module,
//								DateUtil.getTSDA(1)[0], DateUtil.getTSDA(1)[1],
//								DateUtil.getTSDA(1)[2]);
//						SolrService solrService = new SolrService();
//						Modules parentModule=moduleDao.findByScope(module.getParent());
//						
//						int solrNum=0;
//						if(parentModule==null){
//							solrNum=solrService.getSolrByDay(module.getExpression(),null,module.getSites(), DateUtil.getTSDA(1)[0], DateUtil.getTSDA(1)[1], DateUtil.getTSDA(1)[2]);
//						}else{
//							solrNum=solrService.getSolrByDay(module.getExpression(),parentModule.getExpression(),module.getSites(), DateUtil.getTSDA(1)[0], DateUtil.getTSDA(1)[1], DateUtil.getTSDA(1)[2]);
//						}
//						if (module.getOnlynum() == true
//								&& (solrNum == -1 || dynamoDbNum == -1)) {
//							messageStr.append("connect solr or dynamodb error !");
//
//						} else if (module.getOnlynum() == false && (solrNum == -1)) {
//							messageStr.append("connect solr  error !");
//
//						} else {
//							if ("weibo".equals(module.getModuleType())) {
//								// 微博类型的判断待完善
//								message.setModules(module);
//								message.setSolrNum(solrNum);
//								message.setDynamoDbNum(dynamoDbNum);
//								if (checkModule(message, messageStr, messageMap)) {
//									//checkAll(message, messageStr, messageMap);
//								}else{
//									baseMessage.append("   <font color='#FF0000'>"+message.getModules().getName()+"</font>");
//								}
//							} else if("brand".equals(module.getModuleType())) {
//								System.out.println("##########brand modle######################");
//
//							
//								
//								
//								
//								// 其他类型的判断待完善
//								String scope = module.getScope();
//								Integer period = 1;
//								message.setModules(module);
//								message.setThreads(threadsDao
//										.findCountByScope(scope));
//								message.setDashboardsList(dashboardDao.findByScope(
//										scope, period));
//								message.setAnalyticsList(analyticsDao.findByScope(
//										module.getScope(), DateUtil.getTSDA(7)[1],
//										DateUtil.getTSDA(7)[0],
//										DateUtil.getTSDA(7)[2]));
//								message.setSolrNum(solrNum);
//								message.setDynamoDbNum(dynamoDbNum);
//								
////								if (checkModule(message, messageStr, messageMap)) {
//								System.out.println("########## module check over######################");
//								boolean b1=false,b2=false,b3=false,b4=false,b5=false,bn=false;
//								//b1=checkThreads(message, messageStr,messageMap);
//								b1=checkModule(message, messageStr, messageMap);
//								
//								
//								
//								//临时测试
//								b5=checkTopic(message,messageStr,messageMap);
//								
//								
//								
//								if(!b1){
//									baseMessage.append("   <font color='#FF0000'>"+message.getModules().getName()+"</font>");
//								}else{
//									// 啊  
//									b2=checkDashboard(message, messageStr,messageMap);
//									b3=checkAnalytics(message, messageStr,messageMap);
////									if(b2&&b3){
////										b4=checkDashboardAnalytics(message, messageStr,messageMap);
////										if(b4){
////											//b5=checkTopic(message,messageStr,messageMap);
////										}
////									}
//									b4=checkDashboardAnalytics(message, messageStr,messageMap);
//								}
//								
//								//b4=checkAll(message, messageStr,messageMap);
//								//printAll(message, messageStr,messageMap);
//								//查看是否已存在当天该module的错误记录
//								
////								System.out.println("#############################################################");
////								ResultSet rs=JDBC.query(JDBC.getConnectionSupport(), "select * from t_historical_data where scope='"+message.getModules().getScope()+"' and checkdate='"+DateFormat.getDateInstance().format(new Date())+"'");
////								int recheck=0;
////								if(rs.next()){ //如果有数据
////									recheck=rs.getInt("recheck");  //拿到重跑的次数
////									bn=true;
////								}
////								System.out.println("recheck = "+recheck);
//								if(b1&&b2&&b3&&b4&&b5){
////									if(bn){ //数据已经正确,且有错误记录则更新,记录数据已经正确. 病记录下检查的次数.
////										//JDBC.delete(JDBC.getConnectionSupport(), "delete from t_historical_data where scope='"+message.getModules().getScope()+"' and checkdate='"+DateFormat.getDateInstance().format(new Date())+"'");
////										JDBC.update(JDBC.getConnectionSupport(), "update t_historical_data set ok=1,recheck="+(++recheck)+",checkdate='"+DateFormat.getDateInstance().format(new Date())+"' where scope='"+message.getModules().getScope()+"'");
////									}
//								}else{
//
//									baseMessage.append("   <font color='#FF0000'>"+message.getModules().getName()+"</font>");
//									
//									if(bn){ //如果有数据
//										//更新
//										//JDBC.update(JDBC.getConnectionSupport(), "update t_historical_data set rerun=1 where scope='"+message.getModules().getScope()+"' and checkdate='"+DateFormat.getDateInstance().format(new Date())+"'");
////										JDBC.delete(JDBC.getConnectionSupport(), "delete from t_historical_data where scope='"+message.getModules().getScope()+"'");
//										
////										JDBC.insert(JDBC.getConnectionSupport(), "insert into t_historical_data (date,onlynum,threadNum,solrNum,dynamoNum,scope,name,type,parent,status,rerun,ok,errormessage,checkdate,recheck,error_type_id)"
////												+ "value('"+message.getModules().getUpdatedTime()+"',"+message.getModules().getOnlynum()+","+message.getThreads()+","+message.getSolrNum()+","+message.getDynamoDbNum()
////												+",'"+message.getModules().getScope()+"','"+message.getModules().getName()+"','"+message.getModules().getModuleType()  // 时间格式为   2006-4-16
////												+"','"+message.getModules().getParent()+"',"+message.getModules().getStatus()+",0,0,'"+message.getErrorMessage()+"','"+DateFormat.getDateInstance().format(new Date())+"',"+(++recheck)+",'"+message.getErrorType()+"')");
//									}else{
//										
//										java.util.Date currentDate = new java.util.Date(); 
//										java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat(  
//												 "yyyy-MM-dd HH:mm:ss"); 
//										String date = dateFormat.format(currentDate);
//										
//										JDBC.insert(JDBC.getConnectionSupport(), "insert into t_historical_data (date,onlynum,threadNum,solrNum,dynamoNum,scope,name,type,parent,status,rerun,ok,errormessage,checkdate,recheck,error_type_id,year,month,day)"
//												+ "value('"+message.getModules().getUpdatedTime()+"',"+message.getModules().getOnlynum()+","+message.getThreads()+","+message.getSolrNum()+","+message.getDynamoDbNum()
//												+",'"+message.getModules().getScope()+"','"+message.getModules().getName()+"','"+message.getModules().getModuleType()  // 时间格式为   2006-4-16
//												+"','"+message.getModules().getParent()+"',"+message.getModules().getStatus()+",0,0,'"+message.getErrorMessage()+"','"+date+"',0,'"+message.getErrorType()+"',"+DateUtil.getTSDA(1)[0]+","+DateUtil.getTSDA(1)[1]+","+DateUtil.getTSDA(1)[2]+")");
//									}
//								}
//							}
//						}
//					}else{
//						//myPrint("<font color='#6666FF'>已经被关闭的module:</font>"+BREAK, messageMap, message);
//
//					}
//
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//				messageStr.append("xxxxxxxxxxx   用户邮箱为(" + userEmailArr[i]
//						+ ")的用户发生一些其他异常" + BREAK);
//				messageStr.append("    异常信息为：" + e.toString() + BREAK);
//			}
//		}
//		
//		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@sum = " +sum);
//		if(email!=null&&!"".equals(email)){
//			StringBuffer str=new StringBuffer().append(GetHtmlUtil.getOneHtml("http://localhost:8888/support/part1.html"));
//			str.append(baseMessage);
//			str.append(GetHtmlUtil.getOneHtml("http://localhost:8888/support/part2.html"));
//			
//			Iterator<Entry<String, StringBuffer>> it = messageMap.entrySet()
//					.iterator();
//			while (it.hasNext()) {
//				Map.Entry entry = (Map.Entry) it.next();
//				Object key = entry.getKey();
//				Object value = entry.getValue();
//				if(value.toString().length()>=3){
//					str.append(key+" "+value+BREAK+BREAK);
//				}
//			}
//			str.append(GetHtmlUtil.getOneHtml("http://localhost:8888/support/part3.html"));
//			str.append(messageStr);
//			str.append(GetHtmlUtil.getOneHtml("http://localhost:8888/support/part4.html"));
//		
//			try{
//				//linux  windows 切换路径
//	    	    String fileName="/var/log/tomcat7/dailychecklog-"+DateUtil.getTSDA(0)[0]+"-"+DateUtil.getTSDA(0)[1]+"-"+DateUtil.getTSDA(0)[2]+".html";
//			//	String fileName="dailychecklog-"+DateUtil.getTSDA(0)[0]+"-"+DateUtil.getTSDA(0)[1]+"-"+DateUtil.getTSDA(0)[2]+".html";
//	    		File file = new File(fileName);
//	    		if (file.exists()) {
//	    			file.delete();
//	    		}
//	    		file.createNewFile();
//	    		//System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+file.getAbsolutePath());
//	    		//System.out.println(file.getCanonicalPath());
//	    		PrintWriter bp = new PrintWriter(new OutputStreamWriter(
//	    				new FileOutputStream(fileName),"UTF-8"));
//	    		String str1=str.toString();
//	    		bp.write(str1);
//	    		//bp.write("<h1>wadaodajwodjp哈哈哈wdjpwj</h1>");
//	    		System.out.println("@@@@@@@@@@"+file.getAbsolutePath());
//	    		bp.flush();
//	    		bp.close();
//	    		//new GmailUtil().startSent(email,file.getAbsolutePath(),"<h1> 这是邮件的标题 </h1>");
//	    		//new GmailUtil().startSent(email,fileName,"hi all！\r\n查询详情请使用support manual check 功能 (http://115.29.171.153:8888/support/datacheck/login.jsp)\r\n日志文件在附件中请查看。\r\n谢谢！");
//	    		System.out.println(email);
//	    		try{
//	    			new GmailUtil().startSent(email,fileName,"hi all！\r\n日志文件在附件中请查看。\r\n谢谢！");
//	    		}catch(Exception e){
//	    			
//	    		}
//	    		
//	    		//new MySendMail().startSent(email,fileName);
//	    	}catch(Exception e){
//	    		e.printStackTrace();
//	    	}
//		}else{
//			
//			//当email==null
//		}
//		
//		
//
//	}
//
//	public void myPrint(String key, Map<String, StringBuffer> messageMap,
//			Message message) {
//		if (messageMap.get(key) == null) {
//			messageMap.put(key, new StringBuffer());
//		}
//		//message.addErrorMessage(key+" ");
//		//message.setErrorMessage(key+" ");  //之后会统计 并写入到数据库中
//		messageMap.put(key, messageMap.get(key).append(
//				"<font color='#9900FF'>"+message.getUserEmail() + "</font>/" + "<font color='#FF0000'>"+message.getModules().getName()
//						+ "</font>      "));
//	}
//
//	
//	public boolean checkTopic(Message message,StringBuffer messageStr,Map<String, StringBuffer> messageMap){
//		boolean result=false;
//		messageStr.append("Topic check： "+BREAK);
//		try{
//			
//
//			String[]  topicSet=dailyThreadsDao.findTopicFromDailyThreads(message.getModules().getParent());
//			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@  TOPIC IS "+Arrays.toString(topicSet));
//			
//			
//			
//			String[] brandTopicSet=dailyThreadsDao.findTopicFromDailyThreads(message.getModules().getScope());
//			System.out.println("######@@@@@@@@@@@@@@@@@@@  brand TOPIC IS "+Arrays.toString(brandTopicSet));
//			
//			//新修改,只判断当topic<=10时的情况
//			if(brandTopicSet.length>0&&brandTopicSet.length<=10){
//				for(int k=0;k<brandTopicSet.length;k++){
//					boolean topicBoolean =false;
//					
//					for(int l=0;l<topicSet.length;l++){
//						if(brandTopicSet[k].equals(topicSet[l])){
//							topicBoolean=true;
//						}
//					}
//					if(!topicBoolean){
//						message.addErrorMessage("topic在industry module没出现");
//						message.addErrorType("23");
//						myPrint("<font color='#6666FF'>"+"brand module的topic在industry module没出现</font>"+BREAK, messageMap, message);
//						messageStr.append("<font color='#339999'>brand module的topic在industry module没出现</font>");
//						messageStr.append(BREAK);
//						result=false;
//						break;
//					}else{
//						result=true;
//					}
//				}
//				
//			}else{
//				result=true;
//			}
//			
//			
//			System.out.println("TOPIC RESULT IS :"+result);
//			
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//		
//		if (result) {
//			System.out.println(result);
//			messageStr.append("<font color='#339999'>ok</font>"+BREAK);
//		} else {
//			messageStr.append(BREAK);
//		}
//		return result;
//		
//	}
//	public boolean checkModule(Message message, StringBuffer messageStr,
//			Map<String, StringBuffer> messageMap) {
//		messageStr.append(BREAK+"<font color='#6666FF'> MODULE's name is "
//				+ message.getModules().getName());
//		messageStr.append("    module's type is "
//				+ message.getModules().getModuleType() +"</font>"+ BREAK);
//		// 判断updated_time 是否是今天
//		Timestamp time = message.getModules().getUpdatedTime();
//		Date date = null;
//		if (time != null) {
//			date = new Date(time.getTime()+28800000); //8h=28800000毫秒 ！！！！！！！！！！！！！！！！！！
//			
//		}
//		Date nowDate = new Date();
//		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
//		if(time==null){
//			message.addErrorMessage("update_time为空 ");
//			message.addErrorType("1");
//			myPrint("<font color='#6666FF'>"+"update_time为空:</font>"+BREAK, messageMap, message);
//			messageStr.append("<font color='#339999'>update_time为空！</font>");
//			messageStr.append(BREAK);
//			return false;
//		}
//		if (sf.format(date).equals(sf.format(nowDate))) {
//			if (message.getModules().getStatus() == 0) {
//
//				messageStr.append("<font color='#339999'>通过offline-task验证！</font>");
//				messageStr.append(BREAK);
//				return true;
//			} else if (message.getModules().getStatus() == 1) {
//				message.addErrorMessage("数据正在跑 ");
//				message.addErrorType("2");
//				myPrint("<font color='#6666FF'>"+"数据正在跑:</font>"+BREAK, messageMap, message);
//				messageStr.append("<font color='#FF0000'>数据正在跑！</font>");
//				messageStr.append(BREAK);
//				return false;
//			} else {
//				message.addErrorMessage("跑数据出错 ");
//				message.addErrorType("3");
//				myPrint("<font color='#6666FF'>跑数据出错:</font>"+BREAK, messageMap, message);
//				messageStr.append("<font color='#FF0000'>跑数据出错！,错误信息为：");
//				message.getModules().getErrorLog();
//				message.getModules().getErrorDate();
//				message.getModules().getInstance();
//
//				messageStr.append("日期：" + message.getModules().getErrorDate());
//				messageStr.append(" 机器：" + message.getModules().getInstance());
//				messageStr.append(" 日志：" + message.getModules().getErrorLog());
//				messageStr.append("</font>"+BREAK);
//				return false;
//			}
//		} else {
//			// 判断status
//			if (message.getModules().getStatus() == 0) {
//				message.addErrorMessage("在过去的时间数据没有跑 ");
//				message.addErrorType("4");
//				myPrint("<font color='#6666FF'>在过去的时间数据没有跑:</font>"+BREAK, messageMap, message);
//				messageStr.append("<font color='#FF0000'>在过去的时间("
//						+ message.getModules().getUpdatedTime() + ") 数据没有跑！</font>");
//				messageStr.append(BREAK);
//				return false;
//			} else if (message.getModules().getStatus() == 1) {
//				message.addErrorMessage("在过去的时间数据没有跑完 ");
//				message.addErrorType("5");
//				myPrint("<font color='#6666FF'>在过去的时间数据没有跑完:</font>"+BREAK, messageMap, message);
//				messageStr.append("<font color='#FF0000'>在过去的时间("
//						+ message.getModules().getUpdatedTime() + ") 数据没有跑完！</font>");
//				messageStr.append(BREAK);
//				return false;
//			} else {
//				message.addErrorMessage("在过去的时间跑数据出错 ");
//				message.addErrorType("6");
//				myPrint("<font color='#6666FF'>在过去的时间跑数据出错:</font>"+BREAK, messageMap, message);
//				messageStr.append("<font color='#FF0000'>在过去的时间("
//						+ message.getModules().getUpdatedTime() + ") 跑数据出错！</font>");
//				messageStr.append(BREAK);
//				return false;
//			}
//		}
//		
//
//	}
//	/**
//	 * brand类型
//	 * */
//	public boolean checkDashboard(Message message, StringBuffer messageStr,
//			Map<String, StringBuffer> messageMap) {
//		boolean result = true;
//		messageStr.append("dashboard表check： "+BREAK);
//		List<Dashboards> ds = message.getDashboardsList();
//
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		
//		
//		//啊 + 检查sov  sov
//		boolean bool=false; boolean boolSov=false;
//		for(Dashboards d:ds){
//			if("1".equals(d.getPeriod())){
//				bool=true;
//			}
//			if(d.getSov()==null){
//				message.addErrorMessage("SOV为null");
//				message.addErrorType("24");
//				myPrint(
//						"<font color='#6666FF'>SOV为null:</font> "+BREAK,
//						messageMap, message);
//				messageStr.append("<font color='#FF0000'>SOV为null")
//					.append(" </font>");
//				boolSov=true;
//				result = false;
//			}else{
//				 if(d.getSov()<1){
//						boolSov=true;
//					}
//			}
//			
//		}
//		if(!bool){
//			
//			message.addErrorMessage("Overview的post数字没有更新");
//			message.addErrorType("19");
//			myPrint(
//					"<font color='#6666FF'>Overview的post数字没有更新:</font> "+BREAK,
//					messageMap, message);
//			messageStr.append("<font color='#FF0000'>Overview的post数字没有更新")
//				.append(" </font>");
//			
//			result = false;
//			
//		}
//		else if(!boolSov){
//			
//			message.addErrorMessage("SOV超过100%");
//			message.addErrorType("22");
//			myPrint(
//					"<font color='#6666FF'>SOV超过100%:</font> "+BREAK,
//					messageMap, message);
//			messageStr.append("<font color='#FF0000'>SOV超过100%")
//				.append(" </font>");
//			
//			result = false;
//		}
//		else{
//			
//			for (Dashboards d : ds) {
//
//				// 判断onlynum include_buzz => threads solr 开始
//				if ("1".equals(d.getPeriod())
//						&& message.getModules().getOnlynum() == d.getIncludeBuzz()) {
//					
//					if (!d.getIncludeBuzz()) {
//						if (d.getThreads() < (message.getSolrNum() - ValidatorTool
//								.getDataSection(message.getSolrNum()))
//								|| d.getThreads() > (message.getSolrNum() + ValidatorTool
//										.getDataSection(message.getSolrNum()))) {
//							message.addErrorMessage("Overview显示数据量偏少(抓微博数字) ");
//							message.addErrorType("7");
//							myPrint(
//									"<font color='#6666FF'>Overview显示数据量偏少(抓微博数字):</font> "+BREAK,
//									messageMap, message);
//							messageStr.append("<font color='#FF0000'>#invalid solr  threads  number[")
//									.append(message.getSolrNum() + " ").append(
//											d.getThreads()).append("] for ")
//									.append(message.getModules().getScope())
//									.append(" in ").append(
//											" period=" + d.getPeriod()).append(
//											" include_buzz=" + d.getIncludeBuzz())
//									.append(" where threads!~solr's data</font>");
//
//							result = false;
//						}
//						if(d.getThreads() < (checkAverageChange(message) - ValidatorTool
//								.getDataSection(checkAverageChange(message)))
//								|| d.getThreads() > (checkAverageChange(message) + ValidatorTool
//										.getDataSection(checkAverageChange(message)))){
//							System.out.println("++++++++++++++++++++++d.getThreads()"+d.getThreads());
//							System.out.println("++++++++++++++++++++++checkAverageChange(message)"+checkAverageChange(message));
//							message.addErrorMessage("Overview变化过高/低于平均值 ");
//							message.addErrorType("17");
//							myPrint(
//									"<font color='#6666FF'>Overview变化过高/低于平均值 :</font> "+BREAK,
//									messageMap, message);
//							result = false;	
//						}
//					} else {
//						int sum = message.getSolrNum() + message.getDynamoDbNum();
//						if (d.getThreads() < (sum - ValidatorTool
//								.getDataSection(sum))
//								|| d.getThreads() > (sum + ValidatorTool
//										.getDataSection(sum))) {
//							message.addErrorMessage("Overview显示数据量偏少 ");
//							message.addErrorType("8");
//							myPrint(
//									"<font color='#6666FF'>Overview显示数据量偏少:</font> "+BREAK,
//									messageMap, message);
//							messageStr.append(
//									"<font color='#FF0000'>#invalid solr+dynamodb  threads  number[")
//									.append(
//											(message.getSolrNum() + message
//													.getDynamoDbNum())
//													+ " ").append(d.getThreads())
//									.append("] for ").append(
//											message.getModules().getScope())
//									.append(" in ").append(
//											" period=" + d.getPeriod()).append(
//											" include_buzz=" + d.getIncludeBuzz())
//									.append(
//											" solr=" + message.getSolrNum()
//													+ " dynamodb="
//													+ message.getDynamoDbNum())
//									.append(" where threads!~solr's data</font>");
//							result = false;
//						}
//						if(d.getThreads() < (checkAverageChange(message) - ValidatorTool
//								.getDataSection(checkAverageChange(message)))
//								|| d.getThreads() > (checkAverageChange(message) + ValidatorTool
//										.getDataSection(checkAverageChange(message)))){
//							System.out.println("++++++++++++++++++++++d.getThreads()"+d.getThreads());
//							System.out.println("++++++++++++++++++++++checkAverageChange(message)"+checkAverageChange(message));
//							message.addErrorMessage("Overview有嫌疑的数据变化 ");
//							message.addErrorType("17");
//							myPrint(
//									"<font color='#6666FF'>Overview有嫌疑的数据变化 :</font> "+BREAK,
//									messageMap, message);
//							result = false;	
//						}
//					}
//				}
//				// 判断onlynum include_buzz => threads solr 结束
//				if (map.get(d.getPeriod()) == null) {
//					map.put(d.getPeriod(), 1);
//				} else {
//					map.put(d.getPeriod(), map.get(d.getPeriod()) + 1);
//				}
//			}
//		}
//		
//
//		
//		if (result) {
//			messageStr.append("<font color='#339999'>ok</font>"+BREAK);
//		} else {
//			messageStr.append(BREAK);
//		}
//		return result;
//	}
//
//	public boolean checkAnalytics(Message message, StringBuffer messageStr,
//			Map<String, StringBuffer> messageMap) {
//		boolean result = true;
//		messageStr.append("analytics表check： "+BREAK);
//		List<Analytics> list = message.getAnalyticsList();
//		
//		boolean bool2=false;
//		for(Analytics d:list){
//			if (d.getDay() == DateUtil.getTSDA(1)[2]) {
//				bool2=true;
//			}
//		}
//		if(!bool2){
//			
//			message.addErrorMessage("insight的yesterday显示的是再往前的1天 ");
//			message.addErrorType("20");
//			myPrint(
//					"<font color='#6666FF'>insight的yesterday显示的是再往前的1天 :</font> "+BREAK,
//					messageMap, message);
//			messageStr
//					.append("<font color='#FF0000'>insight的yesterday显示的是再往前的1天 ")
//						.append(" </font>");
//
//			result = false;
//			
//		}else{
//			for (Analytics d : list) {
//				if (d.getDay() == DateUtil.getTSDA(1)[2]) {
//					bool2=true;
//					if (message.getModules().getOnlynum() == d.getIncludeBuzz()) {
//						if (!d.getIncludeBuzz()) {              //-----临时修改!
//							if(d.getMedia().equals("all")){
//								if (d.getThreads() < (message.getSolrNum() - ValidatorTool
//										.getDataSection(message.getSolrNum()))
//										|| d.getThreads() > (message.getSolrNum() + ValidatorTool
//												.getDataSection(message.getSolrNum()))) {
//									message.addErrorMessage("Insight显示数据量偏少 ");
//									message.addErrorType("14");
//									myPrint(
//											"<font color='#6666FF'>Insight显示数据量偏少:</font> "+BREAK,
//											messageMap, message);
//									messageStr
//											.append("<font color='#FF0000'>#invalid solr  threads  number[")
//											.append(message.getSolrNum() + " ").append(
//													d.getThreads()).append("] for ")
//											.append(message.getModules().getScope())
//											.append(" in ").append(
//													" include_buzz="
//															+ d.getIncludeBuzz())
//											.append(" where threads!~solr's data</font>");
//									result = false;
//								}
//								if(d.getThreads() < (checkAverageChange(message) - ValidatorTool
//										.getDataSection(checkAverageChange(message)))
//										|| d.getThreads() > (checkAverageChange(message) + ValidatorTool
//												.getDataSection(checkAverageChange(message)))){
////									System.out.println("++++++++++++++++++++++d.getThreads()"+d.getThreads());
////									System.out.println("++++++++++++++++++++++checkAverageChange(message)"+checkAverageChange(message));
//									message.addErrorMessage("Insight变化过高/低于平均值 ");
//									message.addErrorType("18");
//									myPrint(
//											"<font color='#6666FF'>Insight变化过高/低于平均值 :</font> "+BREAK,
//											messageMap, message);
//									result = false;	
//								}
//							}
//							
//						} else {                  // -----临时修改!
//							if(d.getMedia().equals("weibo")){
//								int sum = message.getSolrNum()
//										+ message.getDynamoDbNum();
//								if (d.getThreads() < (sum - ValidatorTool
//										.getDataSection(sum))
//										|| d.getThreads() > (sum + ValidatorTool
//												.getDataSection(sum))) {
//									message.addErrorMessage("Insight显示数据量偏少(抓微博数字) ");
//									message.addErrorType("15");
//									myPrint(
//											"<font color='#6666FF'>Insight显示数据量偏少(抓微博数字):</font> "+BREAK,
//											messageMap, message);
//									messageStr.append(
//											"<font color='#FF0000'>#invalid solr+dynamodb  threads  number[")
//											.append(
//													(message.getSolrNum() + message
//															.getDynamoDbNum())
//															+ " ").append(
//													d.getThreads()).append("] for ")
//											.append(message.getModules().getScope())
//											.append(" in ").append(
//													" include_buzz="
//															+ d.getIncludeBuzz())
//											.append(
//													" solr=" + message.getSolrNum()
//															+ " dynamodb="
//															+ message.getDynamoDbNum())
//											.append(" where threads!~solr's data</font>");
//									result = false;
//								}
//								if(d.getThreads() < (checkAverageChange(message) - ValidatorTool
//										.getDataSection(checkAverageChange(message)))
//										|| d.getThreads() > (checkAverageChange(message) + ValidatorTool
//												.getDataSection(checkAverageChange(message)))){
//									message.addErrorMessage("Insight变化过高/低于平均值 ");
//									message.addErrorType("18");
//									myPrint(
//											"<font color='#6666FF'>Insight变化过高/低于平均值 :</font> "+BREAK,
//											messageMap, message);
//									result = false;	
//								}
//							}
//						}
//					}
//				}
//
//			}
//		}
//		
//
//		if (result) {
//			messageStr.append("<font color='#339999'>ok</font>"+BREAK);
//		} else {
//			messageStr.append(BREAK);
//		}
//		return result ;
//	}
//
//	public boolean checkDashboardAnalytics(Message message, StringBuffer messageStr,
//			Map<String, StringBuffer> messageMap){
//		boolean result=false;
//		messageStr.append("曲线图上的数字和overview的post数字check： "+BREAK);
////		List<Analytics> analyticsList=message.getAnalyticsList();
//		List<Dashboards> dashboardsList=message.getDashboardsList();
//		
////		int analyticsPost=0;
//		int dashboardPost=0;
////		for (Analytics analytics : analyticsList) {
////		
////			if(analytics.getDay() == DateUtil.getTSDA(1)[2]){
////				analyticsPost=analytics.getPosts();
////			}
////		}
//		for(Dashboards dashboards:dashboardsList ){
//			if("1".equals(dashboards.getPeriod())){
//				dashboardPost=dashboards.getPosts();
//			}
//		}
//		if(message.getModules().getOnlynum()&&(dashboardPost==message.getThreads()+message.getDynamoDbNum())){
//			result= true;
//		}
//		else if((!message.getModules().getOnlynum())&&(dashboardPost==message.getThreads())){
//			result=true;
//		}
//		else{
//			
//			message.addErrorMessage("response的thread数与overview不符 ");
//			message.addErrorType("21");
//			myPrint(
//					"<font color='#6666FF'>response的thread数与overview不符:</font> "+BREAK,
//					messageMap, message);
//			messageStr
//					.append("<font color='#FF0000'>response的thread数与overview不符")
//					.append(" </font>");
//			
//			result= false;
//		}
//		
//		if (result) {
//			messageStr.append("<font color='#339999'>ok</font>"+BREAK);
//		} else {
//			messageStr.append(BREAK);
//		}
//		return result ;
//		
//		
//	}
////	public boolean checkThreads(Message message, StringBuffer messageStr,
////			Map<String, StringBuffer> messageMap) {
////		boolean result = true;
////		messageStr.append("thread表check： "+BREAK);
////		Long count = message.getThreads();
////		if (message.getSolrNum()
////				+ ValidatorTool.getDataSection(message.getSolrNum()) < count
////				|| count < message.getSolrNum()
////						- ValidatorTool.getDataSection(message.getSolrNum())) {
////			myPrint("<font color='#6666FF'>Threads数量偏少:</font> "+BREAK, messageMap,
////					message);
////			messageStr.append("<font color='#FF0000'>#invalid solr  threads  number[").append(
////					message.getSolrNum() + " ").append(count).append(
////					"] for period=1").append(" where threads!~solr's data</font>");
////			result = false;
////		}
////		if (result) {
////			messageStr.append("<font color='#339999'>ok</font>"+BREAK);
////		} else {
////			messageStr.append(BREAK);
////		}
////		return result;
////	}
//
//	public int checkAverageChange(Message message) {
//		// 查看可疑数据的变化
//		int count=0,threadCount=0,sum=0;
//		try{
//			Connection connection=JDBC.getConnectionSupport();
//			ResultSet rs=JDBC.query(connection, "select * from t_historical_data where scope='"+message.getModules().getScope()+"'");
//			
//			if(rs.next()){ 
//				count++; 
//				threadCount+=rs.getInt("threadNum");	
//			}
//			connection.close();
//
//			try{
//				sum=(threadCount)/count;
//			}catch(Exception e){
//				if(message.getModules().getOnlynum()){
//					sum=new Long(message.getThreads()+message.getDynamoDbNum()).intValue();
//				}else{
//					sum=new Long(message.getThreads()).intValue();
//				}
//				
//			}
//			return sum;
//
//		}catch(Exception e){
//			e.printStackTrace();
//			return threadCount;
//		}
//		
//	}
//
//	public void printAll(Message message, StringBuffer messageStr,
//			Map<String, StringBuffer> messageMap) {
//	}
//
//	public AnalyticsDao getAnalyticsDao() {
//		return analyticsDao;
//	}
//
//	public void setAnalyticsDao(AnalyticsDao analyticsDao) {
//		this.analyticsDao = analyticsDao;
//	}
//
//	public DashboardDao getDashboardDao() {
//		return dashboardDao;
//	}
//
//	public void setDashboardDao(DashboardDao dashboardDao) {
//		this.dashboardDao = dashboardDao;
//	}
//
//	public ModuleDao getModuleDao() {
//		return moduleDao;
//	}
//
//	public void setModuleDao(ModuleDao moduleDao) {
//		this.moduleDao = moduleDao;
//	}
//
//	public ThreadsDao getThreadsDao() {
//		return threadsDao;
//	}
//
//	public void setThreadsDao(ThreadsDao threadsDao) {
//		this.threadsDao = threadsDao;
//	}
//
//	public WeiboAnalyticsDao getWeiboAnalyticsDao() {
//		return weiboAnalyticsDao;
//	}
//
//	public void setWeiboAnalyticsDao(WeiboAnalyticsDao weiboAnalyticsDao) {
//		this.weiboAnalyticsDao = weiboAnalyticsDao;
//	}
//
//	public WeiboDashboardDao getWeiboDashboardDao() {
//		return weiboDashboardDao;
//	}
//
//	public void setWeiboDashboardDao(WeiboDashboardDao weiboDashboardDao) {
//		this.weiboDashboardDao = weiboDashboardDao;
//	}
//
//	public WeiboThreadDao getWeiboThreadDao() {
//		return weiboThreadDao;
//	}
//
//	public void setWeiboThreadDao(WeiboThreadDao weiboThreadDao) {
//		this.weiboThreadDao = weiboThreadDao;
//	}
//	public void startCheckModules(String modulesNames, String email)
//			throws Exception {
//		// TODO Auto-generated method stub
//		
//	}
//	public void startCheckAllModules() throws Exception {
//		// TODO Auto-generated method stub
//		
//	}
//	public void startCheckModules(String modulesNames, String email,
//			String scope) throws Exception {
//		// TODO Auto-generated method stub
//		
//	}
//	public DailyThreadsDao getDailyThreadsDao() {
//		return dailyThreadsDao;
//	}
//	public void setDailyThreadsDao(DailyThreadsDao dailyThreadsDao) {
//		this.dailyThreadsDao = dailyThreadsDao;
//	}
//	
//}
