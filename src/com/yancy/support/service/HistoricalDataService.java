package com.yancy.support.service;

import java.util.List;

import com.yancy.support.vo.HistoricalDataVo;

public interface HistoricalDataService {

	public List<HistoricalDataVo> getHistoricalData() throws Exception;
}
