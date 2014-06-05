<%@page contentType="text/html;charset=utf-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Wildfire-Support</title>
    <meta name="viewport"
          content="width = device-width, initial-scale = 1.0, minimum-scale = 1.0, maximum-scale = 1.0, user-scalable = no"/>
  	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  	<meta http-equiv="refresh" content="43200">
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
    <link href="css/footable.core.css?v=2-0-1" rel="stylesheet" type="text/css"/>
    <link href="css/footable-demos.css" rel="stylesheet" type="text/css"/>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js" type="text/javascript"></script>
    <script>
        if (!window.jQuery) {
            document.write('<script src="js/jquery-1.9.1.min.js"><\/script>');
        }
    </script>
    <script src="js/footable.js?v=2-0-1" type="text/javascript"></script>
    <script src="js/footable.sort.js?v=2-0-1" type="text/javascript"></script>
    <script src="js/footable.filter.js?v=2-0-1" type="text/javascript"></script>
    <script src="js/footable.paginate.js?v=2-0-1" type="text/javascript"></script>
    <script src="js/footable.bookmarkable.js?v=2-0-1" type="text/javascript"></script>
    <script src="js/bootstrap-tab.js" type="text/javascript"></script>
    <script src="js/demos.js" type="text/javascript"></script>
    
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script src="http://code.highcharts.com/highcharts.js"></script>
<script src="http://code.highcharts.com/modules/exporting.js"></script>
    <script type="text/javascript">
	$(function() {
		$("#demo").load("historicalData.action", {		
		});
	});
	
	$(function() {
		$("#setup").load("historicalChart.action", {		
		});
	});
	

	</script>
</head>
<body>
<div class="demo-container">
    
    <div class="alert">
        dailycheck 2.0 (beta)  ---> <a href="index.action" >原版</a>
    </div>
    
    <ul class="nav nav-tabs">
        <li class="active"><a href="#demo">详细</a></li>
        <li><a href="#setup">图表</a></li>
    </ul>

    <div class="tab-content">
    
        <div class="tab-pane active" id="demo">
        	<img src="../images/window_loading.gif" alt="" />
					
        </div>

		<!--  <div class="tab-pane active" id="setup">
            <img src="../images/window_loading.gif" alt="" />
					
        </div> -->
        
    </div>
</div>

</body>
</html>
