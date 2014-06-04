package com.yancy.support.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 *@author JYC
 * data validator tool  2014-01-14
 */
public class ValidatorTool {

	/**
	 *调整容错率
	 */
	public static double x=0.3;//百分比调整
	
	public static int getDataSection(int num){
		
		int result=0;
		if(num>=1&&num<=2){
			result=1;
		}
		if(num<=20){
			result=(int) (num*0.5);
			return result;
		}
		result=(int) (num*x);
		return result;
		
	}
	/**
	 *get Calendar by int[](year,month,day)
	 */
	public static Calendar getCalTime(int year, int month, int day)
			throws java.text.ParseException {
		try{
			String str = year + "-" + month + "-" + day;
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date date = format.parse(str);
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			return cal;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	/**
	 *get solr's data (int[]) by some days ago
	 */
	public static int[] getTSDA(Integer dayAgo) {
		try{
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
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	public static void sendEmail(String emailAddr, String verifyCode) {
		
		SimpleEmail email = new SimpleEmail();
		email.setHostName("smtp.163.com");
		email.setAuthentication("kyuanche@163.com", "xingji19890326");
		email.setCharset("UTF-8");
		try{
			email.addTo(emailAddr);
			email.setFrom("kyuanche@163.com");
			email.setSubject("Actsocial dashborad Check");
			email.setMsg(verifyCode);
			email.send();
		}catch(EmailException e){
			e.printStackTrace();
		}
	}
}
