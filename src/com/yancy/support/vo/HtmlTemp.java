package com.yancy.support.vo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class HtmlTemp {

	public static String part1="";
	
	public static String part2="";
	
	public static String part3="";
	
	public static String part4="";
	
	public static String part5="";
	
	public static String part6="";
	
	public static void main(String[] args)throws Exception{
		
		File f=new File("asd");
		//System.out.println(f.getAbsoluteFile());
        //文件绝对路径改成你自己的文件路径
		FileReader fr=new FileReader("Untitled-2.html");
		//可以换成工程目录下的其他文本文件
		BufferedReader br=new BufferedReader(fr);
		String s="";
		while(br.readLine()!=null){
		    s+=br.readLine()+"\r\n";
		   
		}
		br.close();
		 System.out.println(s);
		}
	
}
