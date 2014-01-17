package com.yancy.support.dao.dynamo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Test;

import com.yancy.support.dao.solr.DateUtils;
import com.yancy.support.pojo.Modules;

public class DynamoDBService extends TestCase {

	private ActsocialDataQuerierImpl actsocialDataQuerier = new ActsocialDataQuerierImpl();

	public Integer queryBuzzDistributionByDay(Modules module, int year,
			int month, int day) {
		int sum=0;
		try {
			long timestamp = System.currentTimeMillis();
			Calendar cal1 = getCalTime(year, month, day-1);
			Calendar cal2 = getCalTime(year, month, day);
			
			Map<Long, WeiboBuzzVolume> buzzDistribution = actsocialDataQuerier
					.queryBuzzDistributionByDay(module, cal1, cal2, timestamp);
			for (WeiboBuzzVolume wbv : buzzDistribution.values()) {
				wbv.getVolumeDup();
				wbv.getVolumeNoDup();
				sum += wbv.getVolumeDup();
			}
			System.out.println("@@@@@@@@@@@@sum= "+sum);
			return sum;
		} catch (Exception e) {
			System.out.println("error return "+0);
			return 0;
		}
	}

	public Calendar getCalTime(int year, int month, int day)
			throws ParseException {
		String str = year + "-" + month + "-" + day;
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(str);
		System.out.println("dnamDB s time is :"+date.getTime());
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal;
	}

	public static void main(String[] args) {
//		int year = 2014;
//		int month = 10;
//		int day = 06;
//		String str = year + "-" + month + "-" + day;
//		// Date date=new Date("2013-03-13");
//		// System.out.println(date);
//		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//		try {
//			Date date = format.parse(str);
//			System.out.println(date.getTime());
//		} catch (ParseException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		Modules module=new Modules();
		//module.setBuzzKeyword("奥迪");
		module.setBuzzKeyword("宝马~BMW");
		 Integer a=new DynamoDBService().queryBuzzDistributionByDay(module, 2014,
					1, 12);
		 System.out.println(a);
	}

	@Test
	public void testqueryBuzzDistributionByDay() {
		Modules module = new Modules();
		module.setBuzzKeyword("快客");
		long timestamp = System.currentTimeMillis();
		// Map<Long,WeiboBuzzVolume> result = new
		// HashMap<Long,WeiboBuzzVolume>();
		Map<Long, WeiboBuzzVolume> buzzDistribution = actsocialDataQuerier
				.queryBuzzDistributionByDay(module, DateUtils.getNDaysAgo(
						DateUtils.getMidNight(timestamp), 180), DateUtils
						.getMidNight(timestamp), timestamp);
		Calendar c1 = DateUtils.getNDaysAgo(DateUtils.getMidNight(timestamp),
				180);
		Date date = c1.getTime();
		Calendar c2 = DateUtils.getMidNight(timestamp);
		Date date1 = c2.getTime();

		System.out.println(date.getTime());
		System.out.println(date1.getTime());
		// for (Iterator<WeiboBuzzVolume> iterator =
		// buzzDistribution.iterator(); iterator.hasNext();) {
		// WeiboBuzzVolume weiboBuzzVolume = (WeiboBuzzVolume) iterator
		// .next();
		// result.put(weiboBuzzVolume.getTimestamp(), weiboBuzzVolume);
		// }
		System.out.println(buzzDistribution);
		System.out.println(buzzDistribution.size());
	}


}
