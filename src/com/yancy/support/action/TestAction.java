package com.yancy.support.action;


import com.opensymphony.xwork2.Action;
import com.yancy.support.util.EmailUtil;

public class TestAction extends BaseAction {

	private static final long serialVersionUID = 1L;

	public String execute() throws Exception{
		
		EmailUtil.sendEmail("kyuanche@qq.com", "1234");
		
		return Action.SUCCESS;
	}
}
