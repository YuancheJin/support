package com.yancy.support.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static int[] getTSDA(Integer day) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, -day);// 得到当前一天（如果前一天就-1）
		calendar.add(Calendar.MONTH, 0);// 得到月
		Date date = calendar.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String time1 = sdf.format(date); 
		String[] dateAr=time1.split("-");
		int[] n=new int[dateAr.length];
		for(int i=0;i<dateAr.length;i++){
			n[i]=Integer.parseInt(dateAr[i]);
		}
		//System.out.println(Arrays.toString(n));
		return n;
	}
	public static void main(String[] args){
		
		System.out.println(getTSDA(1)[0]);
		System.out.println(getTSDA(1)[1]);
		System.out.println(getTSDA(1)[2]);
	}

}
