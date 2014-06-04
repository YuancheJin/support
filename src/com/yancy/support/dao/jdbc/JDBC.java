package com.yancy.support.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args){
		getConnectionSupport();
		
		//insert(getConnectionSupport(),"insert into t_user(password) value ('kkkkkkkk')");
	}
	/* 插入数据记录，并输出插入的数据记录数 */
	public static void insert(Connection conn,String sql) {

		//conn = getConnection(); // 首先要获取连接，即连接到数据库

		try {
//			String sql = "INSERT INTO staff(name, age, sex,address, depart, worklen,wage)"
//					+ " VALUES ('Tom1', 32, 'M', 'china','Personnel','3','3000')"; // 插入数据的sql语句

			Statement st = (Statement) conn.createStatement(); // 创建用于执行静态sql语句的Statement对象

			int count = st.executeUpdate(sql); // 执行插入操作的sql语句，并返回插入数据的个数

			System.out.println("表中插入 " + count + " 条数据"); // 输出插入操作的处理结果

			conn.close(); // 关闭数据库连接

		} catch (SQLException e) {
			System.out.println("插入数据失败" + e.getMessage());
		}
	}

	/* 更新符合要求的记录，并返回更新的记录数目 */
	public static void update(Connection conn,String sql) {
		//conn = getConnection(); // 同样先要获取连接，即连接到数据库
		try {
//			String sql = "update staff set wage='2200' where name = 'lucy'";// 更新数据的sql语句

			Statement st = (Statement) conn.createStatement(); // 创建用于执行静态sql语句的Statement对象，st属局部变量

			int count = st.executeUpdate(sql);// 执行更新操作的sql语句，返回更新数据的个数

			System.out.println("表中更新 " + count + " 条数据"); // 输出更新操作的处理结果

			conn.close(); // 关闭数据库连接

		} catch (SQLException e) {
			System.out.println("更新数据失败");
		}
	}

	/* 查询数据库，输出符合要求的记录的情况 */
	public static ResultSet query(Connection conn,String sql) {

		//conn = getConnection(); // 同样先要获取连接，即连接到数据库
		try {
//			String sql = "select * from staff"; // 查询数据的sql语句
			Statement st = (Statement) conn.createStatement(); // 创建用于执行静态sql语句的Statement对象，st属局部变量

			ResultSet rs = st.executeQuery(sql); // 执行sql查询语句，返回查询数据的结果集
			
//			System.out.println("最后的查询结果为：");
//			while (rs.next()) { // 判断是否还有下一个数据
//
//				// 根据字段名获取相应的值
//				String name = rs.getString("name");
//				int age = rs.getInt("age");
//				String sex = rs.getString("sex");
//				String address = rs.getString("address");
//				String depart = rs.getString("depart");
//				String worklen = rs.getString("worklen");
//				String wage = rs.getString("wage");
//
//				// 输出查到的记录的各个字段的值
//				System.out.println(name + " " + age + " " + sex + " " + address
//						+ " " + depart + " " + worklen + " " + wage);

//			}
			//conn.close(); // 关闭数据库连接
			return rs;
		} catch (SQLException e) {
			System.out.println("查询数据失败");
			return null;
		}
	}

	/* 删除符合要求的记录，输出情况 */
	public static void delete(Connection conn,String sql) {

		//conn = getConnection(); // 同样先要获取连接，即连接到数据库
		try {
//			String sql = "delete from staff  where name = 'lili'";// 删除数据的sql语句
			Statement st = (Statement) conn.createStatement(); // 创建用于执行静态sql语句的Statement对象，st属局部变量

			int count = st.executeUpdate(sql);// 执行sql删除语句，返回删除数据的数量

			System.out.println("表中删除 " + count + " 条数据\n"); // 输出删除操作的处理结果

			conn.close(); // 关闭数据库连接

		} catch (SQLException e) {
			System.out.println("删除数据失败");
		}

	}

	/* 获取数据库连接的函数 */
	public static Connection getConnectionIap() {
		Connection con = null; // 创建用于连接数据库的Connection对象
		try {
			Class.forName("com.mysql.jdbc.Driver");// 加载Mysql数据驱动

			con = DriverManager.getConnection(
					"jdbc:mysql://iapaliyunostrakon.mysql.rds.aliyuncs.com:3306/production?useUnicode=true&characterEncoding=utf8", "wildfire", "AGEm7qUF7QpR");// 创建数据连接

		} catch (Exception e) {
			System.out.println("数据库连接失败" + e.getMessage());
		}
		return con; // 返回所建立的数据库连接
	}
	
	/* 获取数据库连接的函数 */
	public static Connection getConnectionSupport() {
		Connection con = null; // 创建用于连接数据库的Connection对象
		try {
			Class.forName("com.mysql.jdbc.Driver");// 加载Mysql数据驱动

			con = DriverManager.getConnection(
					//测试修改
					"jdbc:mysql://127.0.0.1:3306/support?useUnicode=true&characterEncoding=utf8", "root", "123456");// 创建数据连接
			//"jdbc:mysql://127.0.0.1:3306/support?useUnicode=true&characterEncoding=utf8", "root", "");// 创建数据连接

		} catch (Exception e) {
			System.out.println("数据库连接失败" + e.getMessage());
		}
		return con; // 返回所建立的数据库连接
	}
}
