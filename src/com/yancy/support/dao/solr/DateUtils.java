package com.yancy.support.dao.solr;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;


public class DateUtils {
	
	public final static int ONE_DAY_SECONDS = 1000 * 60 * 60 * 24;

	public static Calendar cnStr2Date(String str){
		String d = "";
		if (str.indexOf("年") != 0) {
			d = str.replace("年", "-").replace("月", "-").replace("日", "");
		}else {
			d = str;
		}
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
		try {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(simpledbDate2Cal(d));
			return calendar;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Date simpledbDate2Cal(String str){
		//2011-1-14 10:32
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		try {
			return sdf.parse(str);
		} catch (Exception e) {
			//"Wed Apr 24 10:04:06 CST 2013"
			try{
				sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy",Locale.ENGLISH);
				return sdf.parse(str);
			}catch (Exception e2) {
				try{
					sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
					return sdf.parse(str);
				}catch (Exception e3) {
					//2012.03.26
					try{
						sdf = new SimpleDateFormat("yyyy.MM.dd");
						return sdf.parse(str);
					}catch (Exception e4) {
						//2012-03-26
						try{
							sdf = new SimpleDateFormat("yyyy-MM-dd");
							return sdf.parse(str);
						}catch (Exception e5) {
							e5.printStackTrace();
						}
					}
				}
			}
			return null;
		}
	}
	
	public static String date2SimpledbDate(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		return sdf.format(date);
	}
	
	public static String date2YMDFormat(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		return sdf.format(date);
	}
	
	public static String timestamp2exportName(long timestamp){
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT+08:00"));
		c.setTimeInMillis(timestamp);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(c.getTime());
	}
	
	public static String timestamp2Date(long timestamp){
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT+08:00"));
		c.setTimeInMillis(timestamp);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		return sdf.format(c.getTime());
	}
	
	public static String timestamp2SolrDate(long timestamp){
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT+00:00"));
		c.setTimeInMillis(timestamp);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		return sdf.format(c.getTime());
	}
	
	public static String cal2SolrDate1MillisBefore(Calendar cal){
		Calendar nc = Calendar.getInstance();
		nc.setTime(cal.getTime());
		nc.add(Calendar.MILLISECOND, -1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		return sdf.format(nc.getTime());
	}
	
	public static String cal2SolrDate(Calendar cal){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		return sdf.format(cal.getTime());
	}
	
	public static String date2MysqlFormat(Calendar cal){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd 00:00:00");
		return sdf.format(cal.getTime());
	}
	
	public static Calendar getMidNight(){
		return getMidNight(System.currentTimeMillis());
	}
	
	public static Calendar getMidNight(long timestamp){
		Calendar now = new GregorianCalendar();
		now.setTimeInMillis(timestamp);
		Calendar cst = Calendar.getInstance(TimeZone.getTimeZone("GMT+08:00"));
		cst.setTimeInMillis(timestamp);
		now.set(Calendar.YEAR, cst.get(Calendar.YEAR));
		now.set(Calendar.MONTH, cst.get(Calendar.MONTH));
		now.set(Calendar.DATE, cst.get(Calendar.DATE));
		now.set(Calendar.HOUR_OF_DAY, 0); 
		now.set(Calendar.SECOND, 0); 
		now.set(Calendar.MINUTE, 0); 
		now.set(Calendar.MILLISECOND, 0);
		return now;
	}
	
	public static Calendar timestamp2Calendar(long timestamp){
		Calendar now = new GregorianCalendar();
		now.setTimeInMillis(timestamp);
		return now;
	}
	
	public static Calendar timestamp2GMT8Calendar(long timestamp){
		Calendar now = new GregorianCalendar();
		now.setTimeInMillis(timestamp);
		Calendar cst = Calendar.getInstance(TimeZone.getTimeZone("GMT+08:00"));
		cst.setTimeInMillis(timestamp);
		now.set(Calendar.YEAR, cst.get(Calendar.YEAR));
		now.set(Calendar.MONTH, cst.get(Calendar.MONTH));
		now.set(Calendar.DATE, cst.get(Calendar.DATE));
		now.set(Calendar.HOUR_OF_DAY, cst.get(Calendar.HOUR_OF_DAY)); 
		now.set(Calendar.SECOND, cst.get(Calendar.SECOND)); 
		now.set(Calendar.MINUTE, cst.get(Calendar.MINUTE)); 
		now.set(Calendar.MILLISECOND, cst.get(Calendar.MILLISECOND));
		return now;
	}
	
	public static Calendar getNDaysAgo(Calendar c,int n){
		Calendar nc = new GregorianCalendar();
		nc.setTime(c.getTime());
		nc.add(Calendar.DATE, -n);
		nc.set(Calendar.HOUR_OF_DAY, 0);
		nc.set(Calendar.SECOND, 0); 
		nc.set(Calendar.MINUTE, 0); 
		nc.set(Calendar.MILLISECOND, 0);
		return nc;
	}
	
	public static Calendar getNDaysLater(Calendar c,int n){
		Calendar nc = new GregorianCalendar();
		nc.setTime(c.getTime());
		nc.add(Calendar.DATE, n);
		nc.set(Calendar.HOUR_OF_DAY, 0);
		nc.set(Calendar.SECOND, 0); 
		nc.set(Calendar.MINUTE, 0); 
		nc.set(Calendar.MILLISECOND, 0);
		return nc;
	}
	
	public static boolean isTodayMidNight(Calendar c){
		if(c == null){
			return false;
		}
		Calendar today = getMidNight();
		return today.getTimeInMillis() == c.getTimeInMillis();
	}

    /**
     * 返回上个月的开始和结束日期
     * @return
     */
    public static BasicDate getLastMonthTime(Calendar startTime) {
        startTime.set(Calendar.MONTH, startTime.get(Calendar.MONTH) - 1);
        Calendar endTime = (Calendar) startTime.clone();
        startTime.set(Calendar.DAY_OF_MONTH, startTime.getActualMinimum(Calendar.DAY_OF_MONTH));
        endTime.set(Calendar.DAY_OF_MONTH, endTime.getActualMaximum(Calendar.DAY_OF_MONTH) + 1);
        BasicDate basicDate = new BasicDate();
        basicDate.setStartTime(startTime);
        basicDate.setEndTime(endTime);

        return basicDate;
    }

    public static Calendar getLastMonthTimeFirstDay(Calendar startTime) {
        Calendar thisTime = (Calendar) startTime.clone();
        thisTime.set(Calendar.MONTH, startTime.get(Calendar.MONTH) - 1);
        thisTime.set(Calendar.DAY_OF_MONTH, startTime.getActualMinimum(Calendar.DAY_OF_MONTH));
        return thisTime;
    }

    public static Calendar getLastMonthTimeLastDay(Calendar startTime) {
        Calendar thisTime = (Calendar) startTime.clone();
        thisTime.set(Calendar.MONTH, startTime.get(Calendar.MONTH) - 1);
        Calendar endTime = (Calendar) thisTime.clone();
        endTime.set(Calendar.DAY_OF_MONTH, endTime.getActualMaximum(Calendar.DAY_OF_MONTH) + 1);
        return endTime;
    }

    /**
     * 获得上一周日期
     * @param startTime
     * @return
     */
    public static BasicDate getLastWeekTime(Calendar startTime) {
        startTime.add(Calendar.WEEK_OF_YEAR, -1);
        startTime.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        Calendar endTime = DateUtils.getMidNight();
        endTime.set(endTime.get(Calendar.YEAR), endTime.get(Calendar.MONTH), endTime.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
        BasicDate basicDate = new BasicDate();
        basicDate.setStartTime(startTime);
        basicDate.setEndTime(endTime);
        return basicDate;
    }

    public static Calendar getLastWeekTimeFirst(Calendar startTime) {
        Calendar thisTime = (Calendar) startTime.clone();
        thisTime.add(Calendar.WEEK_OF_YEAR, -1);
        thisTime.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        return thisTime;
    }

    public static Calendar getLastWeekTimeLast(Calendar startTime) {
        Calendar endTime = DateUtils.getMidNight();
        endTime.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        return endTime;
    }

    @SuppressWarnings("deprecation")
	public static int getHourAtTimeStamps(long createAt) {
        Date date = new Date(createAt);
        int hour = date.getHours();
        return hour;
    }
    
    public static Calendar cloneCalendar(Calendar src){
    	Calendar dst = new GregorianCalendar();
    	dst.setTime(src.getTime());
    	return dst;
    }

    public static Calendar initCalendarWithYearMonthDay(int year, int month, int day) {
        Calendar result = getMidNight();
        result.set(year, month-1, day);
        return result;
    }

    public static Calendar getHourOfDateAndMinutesSecondsZero(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar newCal = Calendar.getInstance();
        newCal.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.HOUR_OF_DAY), 0, 0);
        return newCal;
    }
	
	public static void main(String[] args) {
        System.out.println(timestamp2Calendar(System.currentTimeMillis()).get(Calendar.HOUR_OF_DAY));
    }
	
}
