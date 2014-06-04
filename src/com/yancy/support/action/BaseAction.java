package com.yancy.support.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
//获得一些 参数的 基本类

public class BaseAction extends ActionSupport implements ServletRequestAware,
		ServletResponseAware, SessionAware, RequestAware {

	private static final long serialVersionUID = -7711485018081624903L;
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected HttpSession session;
	protected Map<String, Object> requestSope;
	protected Map<String, Object> sessionSope;

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
		this.session=request.getSession();

	}

	public void setServletResponse(HttpServletResponse response) {
		this.response = response;

	}

	public void setSession(Map<String, Object> sessionSope) {
		this.sessionSope = sessionSope;

	}

	public void setRequest(Map<String, Object> requestSope) {
		this.requestSope = requestSope;

	}

}
