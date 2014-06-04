package com.yancy.support.dao.sqs;

import java.util.Calendar;

/**
 * 保存开始结束日期
 * User: Administrator
 * Date: 13-9-9
 * Time: 下午1:20
 * 修改描述
 */
public class BasicDate {
    private Calendar startTime;
    private Calendar endTime;

    public BasicDate() {
    }

    public BasicDate(Calendar startTime, Calendar endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Calendar getStartTime() {
    	Calendar ns = Calendar.getInstance();
    	ns.setTime(startTime.getTime());
        return ns;
    }

    public void setStartTime(Calendar startTime) {
        this.startTime = startTime;
    }

    public Calendar getEndTime() {
    	Calendar ne = Calendar.getInstance();
    	ne.setTime(endTime.getTime());
        return ne;
    }

    public void setEndTime(Calendar endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "BasicDate{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
