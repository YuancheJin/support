package com.yancy.support.action.datacheck;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.sun.org.apache.commons.beanutils.BeanUtils;
import com.yancy.support.action.BaseAction;
import com.yancy.support.exception.LoginFailException;
import com.yancy.support.service.UserService;
import com.yancy.support.vo.User;

public class LoginAction extends BaseAction implements ModelDriven<User> {
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	private static final long serialVersionUID = 1L;
	private User user = new User();

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String execute() throws Exception {

		User user_ = userService.login(user.getEmail(), user.getPassword());

		BeanUtils.copyProperties(user, user_);

		if (user != null) {
			sessionSope.put("adminInfo", user);
			System.out.println(session.getAttribute("adminInfo"));
			return Action.SUCCESS;
		}
		throw new LoginFailException("您没有权限访问！");

	}

	public User getModel() {

		return user;
	}

}
