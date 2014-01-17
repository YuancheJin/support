package com.yancy.support.dao;

import java.util.List;

import com.yancy.support.pojo.Dashboards;

public interface DashboardDao {

	public List<Dashboards> findByScope(String scope,Integer period) throws Exception;
}
