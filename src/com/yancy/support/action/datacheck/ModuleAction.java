package com.yancy.support.action.datacheck;

import com.opensymphony.xwork2.Action;
import com.yancy.support.action.BaseAction;
import com.yancy.support.pojo.Modules;
import com.yancy.support.service.BrandService;

public class ModuleAction extends BaseAction {
	private BrandService brandService;
	private static final long serialVersionUID = 1L;
	//in
	private String moduleName;
	//out
	private Modules modules;
	private Integer solrNum;
	private Integer dynamodbNum;
	private String error;
	
	public String execute() throws Exception{
		
		try{
		solrNum=null;
		dynamodbNum=null;
		modules=brandService.findModuleByName(moduleName);
		
			solrNum=brandService.findSolrNum(modules);
			dynamodbNum=brandService.findDynamoNum(modules);
		}catch(Exception e){
			System.out.println(e.toString());
			e.printStackTrace();
			error="查询出错！";
		}
		

		
		return Action.SUCCESS;
		
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public Modules getModules() {
		return modules;
	}
	public void setModules(Modules modules) {
		this.modules = modules;
	}
	public void setBrandService(BrandService brandService) {
		this.brandService = brandService;
	}
	public Integer getSolrNum() {
		return solrNum;
	}
	public void setSolrNum(Integer solrNum) {
		this.solrNum = solrNum;
	}
	public Integer getDynamodbNum() {
		return dynamodbNum;
	}
	public void setDynamodbNum(Integer dynamodbNum) {
		this.dynamodbNum = dynamodbNum;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}

	
	
}
