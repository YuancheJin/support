package com.yancy.support.util;

import java.util.UUID;
//生成验证码
public class VerityUtil {

	public static String createEmailVerifyCode() {
		UUID uuid = UUID.randomUUID();
		System.out.println("生成的验证码为： " + uuid.toString()); // 临时测试匹配验证码功能
		return uuid.toString();
	}

	public static void main(String[] args) {
		System.out.println(createEmailVerifyCode());
	}
}
