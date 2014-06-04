package com.yancy.support.dao.jdbc;

import java.util.HashMap;
import java.util.Map;

public class IapDao {
	private Map<String, Integer> map =null;
	private SimpleJdbcQueryTemplate simpleJdbc=null;
	public IapDao(int year,int month,int day,int year_,int month_,int day_){
		simpleJdbc=new SimpleJdbcQueryTemplate();
		map = new HashMap<String, Integer>();
		getTimeLimit(year,month,day,year_,month_,day_);
	}
	public void getTimeLimit(int year,int month,int day,int year_,int month_,int day_) {
		//-- Total sign-ups:
		String sql1 = "SELECT SUM(login_count) as sum FROM `login_statistics` WHERE year = "+year+" AND month = 2 AND day BETWEEN 10 AND 16";
		map.put("Total sign-ups", simpleJdbc.query(sql1,"sum"));
		//-- Total invitation sign-ups
		String sql2 = "SELECT COUNT(*) as sum FROM `redemptions` WHERE created_at >= '2014-02-10 00:00:00' AND created_at < '2014-02-17 00:00:00' AND redeem_method = 'use_coupon'";
		map.put("Total invitation sign-ups", simpleJdbc.query(sql2,"sum"));
		//-- Total friend invitation sign-ups
		String sql3 = "SELECT count(*) as sum FROM `user_invitation_maps` WHERE created_at >= '2014-02-10 00:00:00' AND created_at < '2014-02-17 00:00:00';";
		map.put("Total invitation sign-ups", simpleJdbc.query(sql3,"sum"));
		//-- Total unique friend invitations sent
		String sql4 = "SELECT count(DISTINCT screen_name) as sum FROM `user_invitation_maps` WHERE created_at >= '2014-02-10 00:00:00' AND created_at < '2014-02-17 00:00:00'";
		map.put("Total invitation sign-ups", simpleJdbc.query(sql4,"sum"));
		//-- Unique visitors
		String sql5 = "SELECT SUM(login_count) as sum FROM `login_statistics` WHERE created_at >= '2014-02-10 00:00:00' AND created_at < '2014-02-17 00:00:00'";
		map.put("Total invitation sign-ups", simpleJdbc.query(sql5,"sum"));
		//-- Unique logins
		String sql6 = "SELECT SUM(login_users_count) as sum FROM `login_statistics` WHERE created_at >= '2014-02-10 00:00:00' AND created_at < '2014-02-17 00:00:00'";
		map.put("Total invitation sign-ups", simpleJdbc.query(sql6,"sum"));
		//-- Total product reviews
		String sql7 = "SELECT SUM(login_count) as sum FROM `login_statistics` WHERE year = 2014 AND month = 2 AND day BETWEEN 10 AND 16";
		map.put("Total invitation sign-ups", simpleJdbc.query(sql7,"sum"));
		//-- Average reviews per user
		String sql8 = "SELECT SUM(login_count) as sum FROM `login_statistics` WHERE year = 2014 AND month = 2 AND day BETWEEN 10 AND 16";
		map.put("Total invitation sign-ups", simpleJdbc.query(sql8,"sum"));
		//-- Total conversations responded
		String sql9 = "SELECT SUM(login_count) as sum FROM `login_statistics` WHERE year = 2014 AND month = 2 AND day BETWEEN 10 AND 16";
		map.put("Total invitation sign-ups", simpleJdbc.query(sql9,"sum"));
		//-- Average conversations responded per user
		String sql10 = "SELECT SUM(login_count) as sum FROM `login_statistics` WHERE year = 2014 AND month = 2 AND day BETWEEN 10 AND 16";
		map.put("Total invitation sign-ups", simpleJdbc.query(sql10,"sum"));
		//-- UGC photo completed
		String sql11 = "SELECT SUM(login_count) as sum FROM `login_statistics` WHERE year = 2014 AND month = 2 AND day BETWEEN 10 AND 16";
		map.put("Total invitation sign-ups", simpleJdbc.query(sql11,"sum"));
		//-- Upload a photo mission completed
		String sql12 = "SELECT SUM(login_count) as sum FROM `login_statistics` WHERE year = 2014 AND month = 2 AND day BETWEEN 10 AND 16";
		map.put("Total invitation sign-ups", simpleJdbc.query(sql12,"sum"));
		//-- Average mission photo completed per user
		String sql13 = "SELECT SUM(login_count) as sum FROM `login_statistics` WHERE year = 2014 AND month = 2 AND day BETWEEN 10 AND 16";
		map.put("Total invitation sign-ups", simpleJdbc.query(sql13,"sum"));
		//-- Vote mission completed
		String sql14 = "SELECT SUM(login_count) as sum FROM `login_statistics` WHERE year = 2014 AND month = 2 AND day BETWEEN 10 AND 16";
		map.put("Total invitation sign-ups", simpleJdbc.query(sql14,"sum"));
		//-- Average mission vote completed per user
		String sql15 = "SELECT SUM(login_count) as sum FROM `login_statistics` WHERE year = 2014 AND month = 2 AND day BETWEEN 10 AND 16";
		map.put("Total invitation sign-ups", simpleJdbc.query(sql15,"sum"));
		//-- Survey mission completed
		String sql16 = "SELECT SUM(login_count) as sum FROM `login_statistics` WHERE year = 2014 AND month = 2 AND day BETWEEN 10 AND 16";
		map.put("Total invitation sign-ups", simpleJdbc.query(sql16,"sum"));
		//-- Average mission survey completed per user
		String sql17 = "SELECT SUM(login_count) as sum FROM `login_statistics` WHERE year = 2014 AND month = 2 AND day BETWEEN 10 AND 16";
		map.put("Total invitation sign-ups", simpleJdbc.query(sql17,"sum"));
		//-- % Sina Weibo actions
		String sql18 = "SELECT COUNT(*) as sum FROM `reposts` WHERE created_at >= '2014-02-10 00:00:00' AND created_at < '2014-02-17 00:00:00' AND topic_type IN ('conversation','product')";
		String sql19 = "SELECT COUNT(*) as sum FROM `products_reviews` WHERE created_at >= '2014-02-10 00:00:00' AND created_at < '2014-02-17 00:00:00'";
		String sql20 = "SELECT COUNT(*) as sum FROM `comments` WHERE created_at >= '2014-02-10 00:00:00' AND created_at < '2014-02-17 00:00:00'";
		map.put("Total invitation sign-ups", simpleJdbc.query(sql18,"sum"));
		//-- G0:
		String sql21 = "SELECT SUM(g0) as sum FROM `buzz_reach` WHERE date_time >= '2014-02-10 00:00:00' AND date_time < '2014-02-17 00:00:00' AND scope = 'barilla_community'";
		map.put("Total invitation sign-ups", simpleJdbc.query(sql21,"sum"));
		//-- External reach  G1
		String sql22 = "SELECT SUM(g1) as sum FROM `buzz_reach` WHERE date_time >= '2014-02-10 00:00:00' AND date_time < '2014-02-17 00:00:00' AND scope = 'barilla_community'";
		map.put("Total invitation sign-ups", simpleJdbc.query(sql22,"sum"));
		//-- External reach  G2
		String sql23 = "SELECT SUM(g2) as sum FROM `buzz_reach` WHERE date_time >= '2014-02-10 00:00:00' AND date_time < '2014-02-17 00:00:00' AND scope = 'barilla_community'";
		map.put("Total invitation sign-ups", simpleJdbc.query(sql23,"sum"));
		//-- Influencer ranking
		String sql24 = "SELECT k.username,k.sp,k.pr,k.rc,k.cc,l.mc FROM (SELECT i.id,i.username,i.sp,i.pr,i.rc,j.cc FROM (SELECT g.id,g.username,g.sp,g.pr,h.rc FROM (SELECT e.id,e.username,e.sp,f.pr FROM (SELECT c.id,c.username,d.sp FROM (SELECT a.id,b.username FROM `users` a LEFT JOIN `authorizations` b ON a.id = b.user_id) AS c LEFT JOIN (SELECT user_id,SUM(point) AS sp FROM `points` GROUP BY user_id) AS d ON c.id = d.user_id ORDER BY sp DESC LIMIT 101) AS e LEFT JOIN (SELECT user_id,SUM(points) AS pr FROM `redemptions` WHERE `status` = 'Approved' GROUP BY user_id) AS f ON e.id = f.user_id) AS g LEFT JOIN (SELECT user_id,COUNT(*) AS rc FROM `products_reviews` GROUP BY user_id) AS h ON g.id = h.user_id) AS i LEFT JOIN (SELECT user_id,COUNT(*) AS cc FROM `comments` GROUP BY user_id) AS j ON i.id = j.user_id) AS k LEFT JOIN (SELECT user_id,COUNT(*) AS mc FROM `answers` GROUP BY user_id) AS l ON k.id = l.user_id";
		map.put("Total invitation sign-ups", simpleJdbc.query(sql24,"sum"));

	}


	public static void main(String[] args) {
		//new IapDao().getTimeLimit();
	}

}
