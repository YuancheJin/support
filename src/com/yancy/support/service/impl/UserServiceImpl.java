package com.yancy.support.service.impl;

import com.yancy.support.exception.LoginFailException;
import com.yancy.support.service.UserService;
import com.yancy.support.vo.User;




public class UserServiceImpl implements UserService {

	
	public void register(User user) throws Exception {

		
	}
	public User login(String email, String md5) {
		// TODO Auto-generated method stub
		if("wildfire".equals(email)&&"wildfire".equals(md5))
		   return new User(email,md5);
		else
			throw new LoginFailException("用户名或密码错误");
	}
	public User checkEmail(String code) {
		
		return null;
	}
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	public User findUserById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	public void save(User user) {
		// TODO Auto-generated method stub
		
		
	}
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}



}
