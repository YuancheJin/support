package com.yancy.support.util;

import java.security.MessageDigest;

import sun.misc.BASE64Encoder;
//MD5加密算法
public class EncryptUtil {
	public static String md5(String str) throws Exception{
		MessageDigest md = 
			MessageDigest.getInstance("MD5");
		//采用md5加密算法将str加密
		byte[] bts = md.digest(str.getBytes());
		//采用Base64编码表示
		BASE64Encoder encoder = 
			new BASE64Encoder();
		return encoder.encode(bts);
	}
	
	public static void main(String[] args) throws Exception{
		
		System.out.println(md5("123"));
		System.out.println(md5("1111111111111"));
	
	}
	
}
