package com.yancy.support.service;

import com.yancy.support.vo.User;


public interface UserService {

	public void register(User user) throws Exception;
	//将用户信息接入d_user表(增)
	public void save(User user);
	//通过id 得到User对象
	public User findUserById(Integer id);
	//检查用户登录
	public User login(String uname, String pwd);

	
}
