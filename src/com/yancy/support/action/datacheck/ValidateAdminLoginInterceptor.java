package com.yancy.support.action.datacheck;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.yancy.support.vo.User;

public class ValidateAdminLoginInterceptor extends  AbstractInterceptor{

	private static final long serialVersionUID = 1L;

	// 用来判断当前的session中是否有登陆的用户对象（userLoginInfo）
	// 有，执行后续的Action对象
	// 没有跳转到登陆页面
	public String intercept(ActionInvocation invocation) throws Exception {
		
		// 需要session对象，需要request，response
		// 1、 request response
		ActionContext actionContext = invocation.getInvocationContext();
		HttpServletRequest request = (HttpServletRequest) actionContext
				.get(ServletActionContext.HTTP_REQUEST);
		HttpServletResponse response = (HttpServletResponse) actionContext
				.get(ServletActionContext.HTTP_RESPONSE);
		// 2 session
		HttpSession session = request.getSession(false);
		
		// 3 标记变量，来代替session中是否还有user对象
		boolean flag = false;
		if (session != null) {
			User user = (User) session.getAttribute("adminInfo");
			if (user != null) {
				flag = true;
			}
		}
		System.out.println(request.getRequestURL());
		
		StringBuffer url=request.getRequestURL(); //对登录这种特殊情况作判断
		if (flag||url.substring(url.lastIndexOf("/")).equals("/login")) {
			return invocation.invoke();// // 继续执行后续的拦截器及Action对象
		} else {
			response.sendRedirect(request.getContextPath() + "/datacheck/login.jsp");
		}
		return null;
	}
	
}
