package com.yancy.support.action.datacheck;

import com.opensymphony.xwork2.Action;
import com.yancy.support.action.BaseAction;
import com.yancy.support.dao.sqs.SQS;

public class SqsAction extends BaseAction{

	private static final long serialVersionUID = 1L;

	//in
	
	//out
	private int actsocial_queue=0;
	private int actsocial_queue_5=0;
	private int buzz_queue=0;
	private int follower_queue=0;
	private int timeline_queue=0;
	private int run_buzz_range_day=0;
	private int actsocial_hourly_queue=0;
	
	public String execute() throws Exception{
		
		
		actsocial_queue=SQS.getCount("actsocial_queue");
		actsocial_queue_5=SQS.getCount("actsocial_queue_5");
		buzz_queue=SQS.getCount("buzz_queue");
		follower_queue=SQS.getCount("follower_queue");
		timeline_queue=SQS.getCount("timeline_queue");
		run_buzz_range_day=SQS.getCount("run_buzz_range_day");
		actsocial_hourly_queue=SQS.getCount("actsocial_hourly_queue");
		
		
		return Action.SUCCESS;
	}

	public int getActsocial_queue() {
		return actsocial_queue;
	}

	public void setActsocial_queue(int actsocial_queue) {
		this.actsocial_queue = actsocial_queue;
	}

	public int getActsocial_queue_5() {
		return actsocial_queue_5;
	}

	public void setActsocial_queue_5(int actsocial_queue_5) {
		this.actsocial_queue_5 = actsocial_queue_5;
	}

	public int getBuzz_queue() {
		return buzz_queue;
	}

	public void setBuzz_queue(int buzz_queue) {
		this.buzz_queue = buzz_queue;
	}

	public int getFollower_queue() {
		return follower_queue;
	}

	public void setFollower_queue(int follower_queue) {
		this.follower_queue = follower_queue;
	}

	public int getTimeline_queue() {
		return timeline_queue;
	}

	public void setTimeline_queue(int timeline_queue) {
		this.timeline_queue = timeline_queue;
	}

	public int getRun_buzz_range_day() {
		return run_buzz_range_day;
	}

	public void setRun_buzz_range_day(int run_buzz_range_day) {
		this.run_buzz_range_day = run_buzz_range_day;
	}

	public int getActsocial_hourly_queue() {
		return actsocial_hourly_queue;
	}

	public void setActsocial_hourly_queue(int actsocial_hourly_queue) {
		this.actsocial_hourly_queue = actsocial_hourly_queue;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
