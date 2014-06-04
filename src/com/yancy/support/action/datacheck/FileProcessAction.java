package com.yancy.support.action.datacheck;

import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.opensymphony.xwork2.Action;
import com.yancy.support.action.BaseAction;
import com.yancy.support.util.ExcelReader;

public class FileProcessAction extends BaseAction {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public String execute() throws Exception {
		
		System.out.println("被执行！");
		List<String> list = null;
		// 创建一个DiskFileItemFactory,该对象用来
		// 为解析器提供一些解析时的缺省的配置。
		DiskFileItemFactory factory = new DiskFileItemFactory();
		// 创建一个解析器
		ServletFileUpload sfu = new ServletFileUpload(factory);
		// 使用解析器分析InputStream,解析器会将
		// 每一个表单域中的数据封装成一个FileItem
		// 对象。
		try {
			System.out.println("request: "+request);
			List<FileItem> items = sfu.parseRequest(request);
			// 只需要对集合进行遍历，就可以获得
			// 表单中的数据
			for (int i = 0; i < items.size(); i++) {
				FileItem item = items.get(i);
				if (!item.isFormField()) {
					InputStream is = item.getInputStream();
					// ExcelReader.k(is);
					list = new ExcelReader().readExcelTitle(is);
					for(Iterator<String> it=list.iterator();it.hasNext();){
			        	String s=it.next();
			        	System.out.println(s);
			        }
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return Action.SUCCESS;
	}

}
