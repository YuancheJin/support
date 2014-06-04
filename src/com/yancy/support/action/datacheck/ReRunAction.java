package com.yancy.support.action.datacheck;

import com.opensymphony.xwork2.Action;
import com.yancy.support.action.BaseAction;
import com.yancy.support.dao.sqs.SQS;

public class ReRunAction extends BaseAction {

	//in
	private String scope;
	private static final long serialVersionUID = -1919071998733267601L;
	public String execute() throws Exception{
		

		SQS.pushTo("actsocial_queue_5", scope);
		//new CheckModulesByUserEmailAction().reCheck( scope);
		return Action.SUCCESS;
		
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}
	
	
}
