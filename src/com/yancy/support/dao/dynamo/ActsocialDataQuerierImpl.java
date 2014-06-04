package com.yancy.support.dao.dynamo;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazonaws.services.dynamodb.datamodeling.PaginatedQueryList;
import com.yancy.support.dao.solr.DateUtils;
import com.yancy.support.pojo.Modules;


public class ActsocialDataQuerierImpl {
	
	public static final Logger logger = LoggerFactory.getLogger(ActsocialDataQuerierImpl.class);
	
	public static final Logger toCheckLogger = LoggerFactory.getLogger(ActsocialDataQuerierImpl.class.getName()+".toCheck");
	

	

	public Map<Long, WeiboBuzzVolume> queryBuzzDistributionByDay(
			Modules module, Calendar start, Calendar end,long timestamp){
		Map<Long,WeiboBuzzVolume> result = new HashMap<Long,WeiboBuzzVolume>();
		if(module!= null && module.getBuzzKeyword()!=null && !"".equals(module.getBuzzKeyword())){
			
			String startRangeKey = String.valueOf(start.getTimeInMillis());
			String endRangeKey = String.valueOf(DateUtils.getMidNight(timestamp).getTimeInMillis());
			System.out.println("!!!!!  :"+startRangeKey);
			System.out.println("!!!!!  :"+endRangeKey);
			PaginatedQueryList<WeiboBuzzVolume> query = DynamoModel.query(WeiboBuzzVolume.class, module.getBuzzKeyword(), startRangeKey, endRangeKey);
			for (Iterator<WeiboBuzzVolume> iterator = query.iterator(); iterator.hasNext();) {
				WeiboBuzzVolume weiboBuzzVolume = (WeiboBuzzVolume) iterator
						.next();
				result.put(weiboBuzzVolume.getTimestamp(), weiboBuzzVolume);
			}
		}
		//logger.info(module+"[" +start.getTime()+" to "+ end.getTime() + "]["+timestamp+"]:queryBuzzDistributionByDay");
		logger.info(module+"[" +start.getTime()+" to "+ end.getTime() + "]:queryBuzzDistributionByDay");
		System.out.println(start.getTime());
		System.out.println(end.getTime());
		System.out.println("result is "+result);
		return result;
	}
	public Map<Long, WeiboBuzzVolume> queryBuzzDistributionByDay2(
			Modules module, Calendar start, Calendar end,long timestamp){
		Map<Long,WeiboBuzzVolume> result = new HashMap<Long,WeiboBuzzVolume>();
		if(module!= null && module.getBuzzKeyword()!=null && !"".equals(module.getBuzzKeyword())){
			
			String startRangeKey = String.valueOf(start.getTimeInMillis());
			String endRangeKey = String.valueOf(end.getTimeInMillis());
			System.out.println("!!!!!  :"+startRangeKey);
			System.out.println("!!!!!  :"+endRangeKey);
			PaginatedQueryList<WeiboBuzzVolume> query = DynamoModel.query(WeiboBuzzVolume.class, module.getBuzzKeyword(), startRangeKey, endRangeKey);
			for (Iterator<WeiboBuzzVolume> iterator = query.iterator(); iterator.hasNext();) {
				WeiboBuzzVolume weiboBuzzVolume = (WeiboBuzzVolume) iterator
						.next();
				result.put(weiboBuzzVolume.getTimestamp(), weiboBuzzVolume);
			}
		}
		//logger.info(module+"[" +start.getTime()+" to "+ end.getTime() + "]["+timestamp+"]:queryBuzzDistributionByDay");
		logger.info(module+"[" +start.getTime()+" to "+ end.getTime() + "]:queryBuzzDistributionByDay");
		System.out.println(start.getTime());
		System.out.println(end.getTime());
		System.out.println("result is "+result);
		return result;
	}
	
//	public static void main(String[] args){
//		new ActsocialDataQuerierImpl().queryBuzzDistributionByDay(module, start, end, timestamp)
//	}
	
}
