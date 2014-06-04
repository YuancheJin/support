package com.yancy.support.action.datacheck;

import java.sql.Timestamp;

import com.opensymphony.xwork2.Action;
import com.yancy.support.action.BaseAction;

public class AddMoudleAction extends BaseAction {

	private static final long serialVersionUID = -1866173323837206678L;
	//in
	private String scope;
	private String de;
	private Timestamp date;
	//out
	public String execute() throws Exception{
		
		return Action.SUCCESS;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getDe() {
		return de;
	}
	public void setDe(String de) {
		this.de = de;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	
	
	
}
