package com.yancy.support.dao;

import java.util.Set;

public interface DailyThreadsDao {

	public String[] findTopicFromDailyThreads(String scope) throws Exception;
}
