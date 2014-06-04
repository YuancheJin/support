package com.yancy.support.dao.redshift;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;




import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.yancy.support.pojo.Modules;



public class ActsocialDataServiceImpl {



    public long moveBuzzDataFromRedshiftToMysql(Modules module, Calendar start,long timestamp) {
    	System.out.println("start");
    	
    	long startTimestamp=start.getTimeInMillis();
    	long endTimestamp=timestamp;
    	System.out.println("time is :"+startTimestamp+" to "+endTimestamp);
    	
        try {
        	
            CrmWeiboBuzzVolumeDao buzzVolumeDao = new CrmWeiboBuzzVolumeDao();
            Map<String, Object> params = Maps.newHashMap();
            params.put("scope", module.getScope());

            List<CrmWeiboBuzzVolume> weiboBuzzVolumeList = Lists.newArrayList();
            if(module!= null && module.getBuzzKeyword()!=null && !"".equals(module.getBuzzKeyword())){
            	System.out.println(module.getBuzzKeyword());
                weiboBuzzVolumeList = buzzVolumeDao.queryByCond(new String[]{"keyword", "timestamp", "timestamp"}, new String[]{"=", ">=", "<="}, new Object[]{module.getBuzzKeyword(),
                		startTimestamp,
                		endTimestamp});
                		
            }
            System.out.println("size is "+weiboBuzzVolumeList.size());
            for(Iterator<CrmWeiboBuzzVolume> it=weiboBuzzVolumeList.iterator();it.hasNext();){
            	return it.next().getVolumeDup();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("end");
        return 0L;
    }

//    public static void main(String[] args){
//    	
//    	Modules module=new Modules();
//    	module.setScope("Audi");
//    	module.setBuzzKeyword("(奥迪 -奥利奥 -迪奥)~(audi -奥利奥 -迪奥)");
//    	new ActsocialDataServiceImpl().moveBuzzDataFromRedshiftToMysql(module, 1397692800000L);
//    }
    public static void main(String[] args){
    	
   	 CrmWeiboBuzzVolumeDao buzzVolumeDao = new CrmWeiboBuzzVolumeDao();
   	 List<CrmWeiboBuzzVolume> weiboBuzzVolumeList = Lists.newArrayList();
   	 int ndaysAgo = 181;
   	 Modules module=new Modules();
    	module.setScope("Audi");
    	module.setBuzzKeyword("(奥迪 -奥利奥 -迪奥)~(audi -奥利奥 -迪奥)");
    	long timestamp=1396627200000L;
    	 System.out.println(111);
   	 weiboBuzzVolumeList = buzzVolumeDao.queryByCond(new String[]{"keyword", "timestamp", "timestamp"}, new String[]{"=", ">=", "<="}, new Object[]{module.getBuzzKeyword(),
                DateUtils.getNDaysAgo(DateUtils.getMidNight(timestamp), ndaysAgo).getTime().getTime(), DateUtils.getNDaysLater(DateUtils.getMidNight(timestamp), 1).getTime().getTime()});
   	 System.out.println(111);
   	 for(Iterator it=weiboBuzzVolumeList.iterator();it.hasNext();){
   		 System.out.println(it.next());
   	 }
   }
   
}
