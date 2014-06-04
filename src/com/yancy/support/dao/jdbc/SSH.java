package com.yancy.support.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class SSH {
	static int lport;
	static String rhost;
	static int rport;

	public static void go() {
		String user = "root";
		String password = "660f8979";
		String host = "115.29.171.153";
		int port = 22;
		try {
			JSch jsch = new JSch();
			System.out.println(1);
			Session session = jsch.getSession(user, host, port);
			System.out.println(1);

			lport = 3306;
			rhost = "115.29.171.153";
			rport = 3306;
			session.setPassword(password);
			Properties sshConfig = new Properties();
			sshConfig.put("StrictHostKeyChecking", "no");
			session.setConfig(sshConfig);
			System.out.println("Establishing Connection...");
			session.connect();
			System.out.println(1);
			// session.setPortForwardingL(lport, rhost, rport);
			// System.out.println("localhost:"+assinged_port+" -> "+rhost+":"+rport);
		} catch (Exception e) {
			System.err.print(e);
		}
	}

	// public static void main(String[] args) throws ClassNotFoundException,
	// SQLException {
	// try {
	// go();
	// } catch (Exception ex) {
	// ex.printStackTrace();
	// }
	// System.out
	// .println("An example for updating a Row from Mysql Database!");
	// Connection con = null;
	// String driver = "com.mysql.jdbc.Driver";
	// String url = "jdbc:mysql://" + rhost + ":" + lport + "/";
	// String db = "support";
	// String dbUser = "root";
	// String dbPasswd = "123456";
	//
	// Class.forName(driver);
	// System.out.println("123");
	// con = DriverManager.getConnection(url + db, dbUser, dbPasswd);
	// System.out.println("123" + con);
	// try {
	// Statement st = con.createStatement();
	// String sql = "UPDATE MyTableName "
	// + "SET email = 'ripon.wasim@smile.com' WHERE email='peace@happy.com'";
	//
	// int update = st.executeUpdate(sql);
	// if (update >= 1) {
	// System.out.println("Row is updated.");
	// } else {
	// System.out.println("Row is not updated.");
	// }
	// } catch (SQLException s) {
	// System.out.println("SQL statement is not executed!");
	// }
	// }

	public static boolean connect() {
		try {
			Session sshSession = null;
			if (sshSession == null || !sshSession.isConnected()) {
				JSch jsch = new JSch();
				sshSession = jsch.getSession("root", "115.29.171.153");
				sshSession.setPassword("660f8979");
				Properties sshConfig = new Properties();
				sshConfig.put("StrictHostKeyChecking", "no");
				sshSession.setConfig(sshConfig);
				sshSession.connect();
				Channel channel = sshSession.openChannel("sftp");
				channel.connect();
				// sftp = (ChannelSftp) channel;

				return true;
			}

		} catch (Exception e) {

			return false;
		}
		return false;

	}

	public static void main(String[] args){
		System.out.println(connect());
		JDBC.getConnectionSupport();
	}
}
