package com.yancy.support.action.datacheck;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.yancy.support.action.BaseAction;
import com.yancy.support.service.HistoricalDataService;
import com.yancy.support.vo.HistoricalDataVo;

public class HistoricalDaoAction extends BaseAction {

	private static final long serialVersionUID = 2211462375564260880L;
	private List<HistoricalDataVo> list;
	private HistoricalDataService historicalDataService;
	public String execute() throws Exception{
		
		list=historicalDataService.getHistoricalData();
		return Action.SUCCESS;
	}
	public List<HistoricalDataVo> getList() {
		return list;
	}
	public void setList(List<HistoricalDataVo> list) {
		this.list = list;
	}
	public void setHistoricalDataService(HistoricalDataService historicalDataService) {
		this.historicalDataService = historicalDataService;
	}
	
	
	

	
}
