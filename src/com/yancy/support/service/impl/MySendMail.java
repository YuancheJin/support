package com.yancy.support.service.impl;

import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Vector;

import javax.activation.*;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;


/**
 * <p>
 * Title: 使用javamail发送邮件
 * </p>
 */
public class MySendMail {

	String to = "";// 收件人
	String from = "";// 发件人
	String host = "";// smtp主机
	String username = "";
	String password = "";
	String filename = "";// 附件文件名
	String subject = "";// 邮件主题
	String content = "";// 邮件正文
	Vector file = new Vector();// 附件文件集合

	/**
	 * <br>
	 * 方法说明：默认构造器 <br>
	 * 输入参数： <br>
	 * 返回类型：
	 */
//	public MySendMail() {
//	}

	/**
	 * <br>
	 * 方法说明：构造器，提供直接的参数传入 <br>
	 * 输入参数： <br>
	 * 返回类型：
	 */
//	public MySendMail(String to, String from, String smtpServer,
//			String username, String password, String subject, String content) {
//		this.to = to;
//		this.from = from;
//		this.host = smtpServer;
//		this.username = username;
//		this.password = password;
//		this.subject = subject;
//		this.content = content;
//	}

	/**
	 * <br>
	 * 方法说明：设置邮件服务器地址 <br>
	 * 输入参数：String host 邮件服务器地址名称 <br>
	 * 返回类型：
	 */
	public void setHost(String host) {
		this.host = host;
	}

	/**
	 * <br>
	 * 方法说明：设置登录服务器校验密码 <br>
	 * 输入参数： <br>
	 * 返回类型：
	 */
	public void setPassWord(String pwd) {
		this.password = pwd;
	}

	/**
	 * <br>
	 * 方法说明：设置登录服务器校验用户 <br>
	 * 输入参数： <br>
	 * 返回类型：
	 */
	public void setUserName(String usn) {
		this.username = usn;
	}

	/**
	 * <br>
	 * 方法说明：设置邮件发送目的邮箱 <br>
	 * 输入参数： <br>
	 * 返回类型：
	 */
	public void setTo(String to) {
		this.to = to;
	}

	/**
	 * <br>
	 * 方法说明：设置邮件发送源邮箱 <br>
	 * 输入参数： <br>
	 * 返回类型：
	 */
	public void setFrom(String from) {
		this.from = from;
	}

	/**
	 * <br>
	 * 方法说明：设置邮件主题 <br>
	 * 输入参数： <br>
	 * 返回类型：
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * <br>
	 * 方法说明：设置邮件内容 <br>
	 * 输入参数： <br>
	 * 返回类型：
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * <br>
	 * 方法说明：把主题转换为中文 <br>
	 * 输入参数：String strText <br>
	 * 返回类型：
	 */
	public String transferChinese(String strText) {
		try {
			strText = MimeUtility.encodeText(new String(strText.getBytes(),
					"GB2312"), "GB2312", "B");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return strText;
	}

	/**
	 * <br>
	 * 方法说明：往附件组合中添加附件 <br>
	 * 输入参数： <br>
	 * 返回类型：
	 */
	public void attachfile(String fname) {
		file.addElement(fname);
	}

	/**
	 * <br>
	 * 方法说明：发送邮件 <br>
	 * 输入参数： <br>
	 * 返回类型：boolean 成功为true，反之为false
	 */
	final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
	public boolean sendMail() {
		
		// 构造mail session
		Properties props = new Properties() ;
		//props.put("mail.smtp.host", host);
		//props.put("mail.smtp.auth", "true");
		  props.setProperty("mail.smtp.host", "smtp.gmail.com");
		  props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
		  props.setProperty("mail.smtp.socketFactory.fallback", "false");
		  props.setProperty("mail.smtp.port", "465");
		  props.setProperty("mail.smtp.socketFactory.port", "465");
		  props.put("mail.smtp.auth", "true");
		Session session = Session.getDefaultInstance(props,
				new Authenticator() {
					public PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(username, password);
					}
				});
		//Session session = Session.getDefaultInstance(props);
//		Session session = Session.getDefaultInstance(props, null);

		try {
			// 构造MimeMessage 并设定基本的值
			MimeMessage msg = new MimeMessage(session);
			//MimeMessage msg = new MimeMessage();
			msg.setFrom(new InternetAddress(from));
		 
			
			//msg.addRecipients(Message.RecipientType.TO, address); //这个只能是给一个人发送email
			msg.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(to)) ;
			subject = transferChinese(subject);
			msg.setSubject(subject);

			// 构造Multipart
			Multipart mp = new MimeMultipart();

			// 向Multipart添加正文
			MimeBodyPart mbpContent = new MimeBodyPart();
			mbpContent.setContent(content, "text/html;charset=UTF-8");
			
			// 向MimeMessage添加（Multipart代表正文）
			mp.addBodyPart(mbpContent);

			// 向Multipart添加附件
			Enumeration efile = file.elements();
			while (efile.hasMoreElements()) {

				MimeBodyPart mbpFile = new MimeBodyPart();
				filename = efile.nextElement().toString();
				FileDataSource fds = new FileDataSource(filename);
				mbpFile.setDataHandler(new DataHandler(fds));
				
				String filename= new String(fds.getName().getBytes(),"UTF-8");

				mbpFile.setFileName(filename);
				// 向MimeMessage添加（Multipart代表附件）
				mp.addBodyPart(mbpFile);

			}

			file.removeAllElements();
			// 向Multipart添加MimeMessage
			msg.setContent(mp);
			msg.setSentDate(new Date());
			msg.saveChanges() ;
			// 发送邮件
			
			Transport transport = session.getTransport("smtp");
			transport.connect(host, username, password);
			transport.sendMessage(msg, msg.getAllRecipients());
			transport.close();
		} catch (Exception mex) {
			mex.printStackTrace();
//			Exception ex = null;
//			if ((ex = mex.getNextException()) != null) {
//				ex.printStackTrace();
//			}
			return false;
		}
		return true;
	}


	
	/**
	 * <br>
	 * 方法说明：主方法，用于测试 <br>
	 * 输入参数： <br>
	 * 返回类型：
	 */
 	public  void startSent(String emails,String fileName) {
 		MySendMail sendmail = new MySendMail();
 		
 		sendmail.setHost("smtp.gmail.com");
 		sendmail.setUserName("yancy.jin@xingxinghuo.com");
 		sendmail.setPassWord("xingji19890326");
 		sendmail.setTo(emails);
 		sendmail.setFrom("yancy.jin@xingxinghuo.com");
 		sendmail.setSubject("support/it Acosocial Dashboard daily check");
 		sendmail.setContent("hi all！\r\n查询详情请使用support manual check 功能 (http://115.29.171.153:8888/support/datacheck/login.jsp)\r\n日志文件在附件中请查看。\r\n谢谢！");
 		sendmail.attachfile(fileName);
 		//sendmail.attachfile("d:\\jhjl.rar");
 		
 		System.out.println(sendmail.sendMail());

 	}
 	public static void main(String[] args){
 		new MySendMail().startSent("kyuanche@qq.com","123");
 	}
}

