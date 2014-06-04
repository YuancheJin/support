package com.yancy.support.action.datacheck;

import com.opensymphony.xwork2.Action;
import com.yancy.support.action.BaseAction;
import com.yancy.support.dao.jdbc.JDBC;
import com.yancy.support.util.DateUtil;

public class NewBugAction extends BaseAction {

	private String message;
	public String execute() throws Exception {

		JDBC.insert(JDBC.getConnectionSupport(), "insert into t_bug (message) value('"+message+"')");
		return Action.SUCCESS;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
