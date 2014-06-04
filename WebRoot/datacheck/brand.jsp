<%@page contentType="text/html;charset=utf-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN"
"http://www.w3.org/TR/html4/strict.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>Support</title>
		<script type="text/javascript" src="../js/jquery-1.4.3.js"></script>

		<script type="text/javascript">
	$(function() {
		$("#module").load("module.action", {
			"moduleName" : "Audi"
		});
	});
	$(function() {
		$("#dashboard").load("dashboard.action", {
			"scope" : "Audi"
		});
	});
	$(function() {
		$("#analytics").load("analytics.action", {
			"scope" : "Audi" ,
			"year" : ${date[0]} ,
			"month" : ${date[1] ,
			"day" : ${date[2]
		});
	});
	$(function() {
		$("#threads").load("threads.action", {
			"scope" : "Audi"
		});
	});
</script>
	</head>

	<body>

		<div id="module">
			<img src="../images/window_loading.gif" alt="" />
			正在努力加载中.....
		</div>
		<div id="dashboard">
			<img src="../images/window_loading.gif" alt="" />
			正在努力加载中.....
		</div>
		<div id="analytics">
			<img src="../images/window_loading.gif" alt="" />
			正在努力加载中.....
		</div>
		<div id="threads">
			<img src="../images/window_loading.gif" alt="" />
			正在努力加载中.....
		</div>

		
	</body>
</html>
