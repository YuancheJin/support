package com.yancy.support.dao;

import java.util.List;

import com.yancy.support.pojo.WeiboDashboards;

public interface WeiboDashboardDao {
	public List<WeiboDashboards> findByScope(String scope,Integer period) throws Exception;
}
