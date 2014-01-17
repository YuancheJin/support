package com.yancy.support.dao;


public interface WeiboThreadDao {
	
	public Long findCountByScope(String scope) throws Exception;
}
