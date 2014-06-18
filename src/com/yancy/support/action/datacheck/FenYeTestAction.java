package com.yancy.support.action.datacheck;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.yancy.support.action.BaseAction;
import com.yancy.support.dao.jdbc.JDBC;
import com.yancy.support.service.BrandService;
import com.yancy.support.service.impl.BrandServiceImpl;
import com.yancy.support.service.impl.FenYeServiceImpl;
import com.yancy.support.util.DateUtil;
import com.yancy.support.vo.ErrorType;
import com.yancy.support.vo.Page;

public class FenYeTestAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	//in

	//out
	private Page page;//把page对象放到request作用域，分页就可以实现了
	private int today=DateUtil.getTSDA(1)[2];
	
	
	//private HistoricalDataVo historicalDataVo = new HistoricalDataVo(); //需要从数据库取出

//	private String uri;
	private FenYeServiceImpl fenYeServiceImpl=new FenYeServiceImpl();
	public String execute() throws Exception{
		
//		HttpServletRequest request= ServletActionContext.getRequest();
//		System.out.println(request.getRequestURI());
//		System.out.println(request.getRequestURL());

//		调用业务层

		System.out.println("today is "+today);

//		page = fenYeServiceImpl.findHistoricalData(scope, date, type, pageIndex);
		
		page=fenYeServiceImpl.findHistoricalData_();
		
		System.out.println("data action!");
		return Action.SUCCESS;
	}

	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}

	public int getToday() {
		return today;
	}

	public void setToday(int today) {
		this.today = today;
	}


	
}
