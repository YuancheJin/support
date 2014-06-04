package com.yancy.support.util;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;



public class EmailUtil {

	public static void sendEmail(String emailAddr, String verifyCode) {
		
		SimpleEmail email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setAuthentication("yancy.jin@xingxinghuo.com", "xingji19890326");
		email.setCharset("UTF-8");
		try{
			email.addTo(emailAddr);
			email.setFrom("yancy.jin@xingxinghuo.com");
			email.setSubject("Actsocial dashborad Check");
			email.setMsg(verifyCode);
			email.send();
		}catch(EmailException e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		EmailUtil.sendEmail("kyuanche@qq.com", "1234");
	}
}