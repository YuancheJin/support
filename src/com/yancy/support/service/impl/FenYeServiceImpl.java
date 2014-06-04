package com.yancy.support.service.impl;

import java.sql.Timestamp;
import java.util.List;

import com.yancy.support.dao.FenYeDaoImpl;
import com.yancy.support.vo.Page;


public class FenYeServiceImpl {
	public FenYeServiceImpl(){}

//	 业务层依赖Dao层



	public Page findHistoricalData(String scope, Timestamp date, int type, int pageIndex) throws Exception {
		FenYeDaoImpl fenyedao=new FenYeDaoImpl();
		Page page = null;
		long count = fenyedao.findHistoricalDateCount(scope, date, type);
		page = new Page( (int)count, pageIndex, 15);
		List result = fenyedao.findHistoricalDate(scope, date, type, page.getFirstResult(), page.getMaxResults());
		page.setResult(result);
		return page;
	}

	public Page findHistoricalData_() throws Exception {
		
		FenYeDaoImpl fenyedao=new FenYeDaoImpl();
		Page page = null;
		page = new Page();
		List result = fenyedao.findHistoricalDate();
		page.setResult(result);
		return page;
		
	}

}
