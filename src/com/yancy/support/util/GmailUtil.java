package com.yancy.support.util;

import java.security.Security;
import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.yancy.support.service.impl.MySendMail;

public class GmailUtil {

	 public void sendGmail(String emails,String fileName,String text) throws AddressException, MessagingException {
	  Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
	  final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
	  // Get a Properties object
	  Properties props = System.getProperties();
	  props.setProperty("mail.smtp.host", "smtp.gmail.com");
	  props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
	  props.setProperty("mail.smtp.socketFactory.fallback", "false");
	  props.setProperty("mail.smtp.port", "465");
	  props.setProperty("mail.smtp.socketFactory.port", "465");
	  props.put("mail.smtp.auth", "true");
	  final String username = "yancy.jin@xingxinghuo.com";
	  final String password = "xingji19890326";
	  Session session = Session.getDefaultInstance(props, new Authenticator(){
	      protected PasswordAuthentication getPasswordAuthentication() {
	          return new PasswordAuthentication(username, password);
	      }});

	       // -- Create a new message --
	  Message msg = new MimeMessage(session);

	  // -- Set the FROM and TO fields --attachfile
	  msg.setFrom(new InternetAddress(username));
	  msg.setRecipients(Message.RecipientType.TO, 
	    InternetAddress.parse(emails,false));
	  msg.setSubject("Acosocial Dashboard daily check ("+new Date()+")");
	  //msg.setText(text);
	  msg.setSentDate(new Date());
	  //msg.setFileName(fileName);
	   
	  // 向multipart对象中添加邮件的各个部分内容，包括文本内容和附件
	   Multipart multipart = new MimeMultipart();
	  
	// 设置邮件的文本内容
	   BodyPart contentPart = new MimeBodyPart();
	   contentPart.setText(text);
	   multipart.addBodyPart(contentPart);
	   
	   // 添加附件
	   BodyPart messageBodyPart = new MimeBodyPart();
	   DataSource source = new FileDataSource(fileName);
	   // 添加附件的内容
	   messageBodyPart.setDataHandler(new DataHandler(source));
	   // 添加附件的标题
	   messageBodyPart.setFileName("dailychecklog-"+DateUtil.getTSDA(0)[0]+"-"+DateUtil.getTSDA(0)[1]+"-"+DateUtil.getTSDA(0)[2]+".html");
	   // 这里很重要，通过下面的Base64编码的转换可以保证你的中文附件标题名在发送时不会变成乱码
	   sun.misc.BASE64Encoder enc = new sun.misc.BASE64Encoder();
	   messageBodyPart.setFileName("=?UTF-8?B?"+ enc.encode(fileName.getBytes()) + "?=");
	   //messageBodyPart.setFileName(fileName);
	   multipart.addBodyPart(messageBodyPart);
	   
	   // 将multipart对象放到message中
	   msg.setContent(multipart);
	   // 保存邮件
	   msg.saveChanges();
	   
	  Transport.send(msg);
	  
	  System.out.println("Message sent.");
	 }
	 
	 public  void startSent(String emails,String fileName,String text) {
	 		try {
				sendGmail(emails,fileName,text);
			} catch (AddressException e) {
				e.printStackTrace();
			} catch (MessagingException e) {
				e.printStackTrace();
			}

	 	}
	 public static void main(String[] args){
		 new GmailUtil().startSent("kyuanche@qq.com","","hahahahahahaa");
	 }
	}