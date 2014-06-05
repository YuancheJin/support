package com.yancy.support.action;


import java.util.ArrayList;

import com.opensymphony.xwork2.Action;
import com.yancy.support.util.EmailUtil;

public class TestAction extends BaseAction {

	private static final long serialVersionUID = 1L;

	public String execute() throws Exception{
		
		EmailUtil.sendEmail("kyuanche@qq.com", "1234");
		
		return Action.SUCCESS;
	}
	
//	public static void main(String[] args) throws Exception{
//		
////		QuartzManager.removeJob("1");
////		QuartzManager.addJob("1", "com.yancy.support.action.datacheck.CheckModulesByUserEmailAction", "0 43 01 ? * *");
//		
//		
//		
//		URL url = new URL("http://localhost:8080/support/datacheck/checkModulesByUserEmail.action"); 
//		URLConnection connection = url.openConnection(); 
//
//		connection.setDoOutput(true); 
//
//		OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream(), "8859_1"); 
//
//		out.write("userEmails=retailer@wildfire.asia&email=kyuanche@qq.com"); //这里组织提交信息 
//
//		out.flush(); 
//
//		out.close(); 
//
//		//获取返回数据 
//		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream())); 
//
//		String line = null; 
//
//		StringBuffer content= new StringBuffer(); 
//
//		while((line = in.readLine()) != null) 
//		{ 
//		   //line为返回值，这就可以判断是否成功、 
//		    content.append(line); 
//		} 
//
//		in.close() ;
//	}
	
	public static void main(String[] args){
		ArrayList<String> arrayListC=new ArrayList<String>();
		arrayListC.add("asd");
		arrayListC.add("dfasd");
		if(arrayListC.contains("asd1")){
			System.out.println(1);;
		}else{
			System.out.println(2);;
		}
	}
//	public static void main(String[] args){
//		
//	}
}
