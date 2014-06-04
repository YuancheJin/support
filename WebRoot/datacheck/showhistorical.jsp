<%@page contentType="text/html;charset=utf-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Wildfire-Support</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description"
			content="Charisma, a fully featured, responsive, HTML5, Bootstrap admin template.">
		<meta name="author" content="Muhammad Usman">

		<!-- The styles -->
		<link id="bs-css" href="css/bootstrap-cerulean.css" rel="stylesheet">
		<style type="text/css">
body {
	padding-bottom: 40px;
}

.sidebar-nav {
	padding: 9px 0;
}
</style>
		<link href="css/bootstrap-responsive.css" rel="stylesheet">
		<link href="css/charisma-app.css" rel="stylesheet">
		<link href="css/jquery-ui-1.8.21.custom.css" rel="stylesheet">
		<link href='css/fullcalendar.css' rel='stylesheet'>
		<link href='css/fullcalendar.print.css' rel='stylesheet' media='print'>
		<link href='css/chosen.css' rel='stylesheet'>
		<link href='css/uniform.default.css' rel='stylesheet'>
		<link href='css/colorbox.css' rel='stylesheet'>
		<link href='css/jquery.cleditor.css' rel='stylesheet'>
		<link href='css/jquery.noty.css' rel='stylesheet'>
		<link href='css/noty_theme_default.css' rel='stylesheet'>
		<link href='css/elfinder.min.css' rel='stylesheet'>
		<link href='css/elfinder.theme.css' rel='stylesheet'>
		<link href='css/jquery.iphone.toggle.css' rel='stylesheet'>
		<link href='css/opa-icons.css' rel='stylesheet'>
		<link href='css/uploadify.css' rel='stylesheet'>

		<!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
		<!--[if lt IE 9]>
	  <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->

		<!-- The fav icon -->
		<link rel="shortcut icon" href="img/favicon.ico">

		<script type="text/javascript" src="../js/jquery-1.4.3.js"></script>	
		
							
  <link rel="stylesheet" href="//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.9.1.js"></script>
  <script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script>
  $(function() {
    $( "#datepicker" ).datepicker();
    $('#datepicker').datepicker('option', {dateFormat: 'yy-mm-dd'})
  });
  
  
  </script>

	</head>

	<body>
		<!-- topbar starts -->
		<div class="navbar">
		<!--  
		<div class="navbar">
			<div class="navbar-inner">
				<div class="container-fluid">
					<a class="btn btn-navbar" data-toggle="collapse"
						data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span> </a>
					<img src="img/logo20.png" />
					<span>Wildfire Support</span>




				</div>
			</div>
		</div>
		 -->
		 </div>
		<!-- topbar ends -->
		<div class="container-fluid">
			<div class="row-fluid">

			<!-- left menu starts -->
			<div class="span2 main-menu-span">
				<div class="well nav-collapse sidebar-nav">
					<ul class="nav nav-tabs nav-stacked main-menu">
							<li>
								<a class="ajax-link" href="index.jsp"><i class="icon-home"></i><span
									class="hidden-tablet"> 仪表盘</span>
								</a>
							</li>
							<li>
								<a class="ajax-link" href="manual.jsp"><i
									class="icon-align-justify"></i><span class="hidden-tablet">手动检查</span>
								</a>
							</li>

							<li>
								<a class="ajax-link" href="historicalData.action"><i
									class="icon-align-justify"></i><span class="hidden-tablet">dailycheck错误数据</span>
								</a>
							</li>
							<li>
								<a class="ajax-link" href="weibo_api_cost.jsp"><i
									class="icon-align-justify"></i><span class="hidden-tablet">微博报价工具</span>
								</a>
							</li>
							
													

							<li>
								<a class="ajax-link" href="data_month.jsp"><i
									class="icon-align-justify"></i><span class="hidden-tablet">历史数据检查 </span>
								</a>
							</li>
							<li>
								<a class="ajax-link" href="new_bug.jsp"><i
									class="icon-align-justify"></i><span class="hidden-tablet">需自动检查的问题 </span>
								</a>
							</li>
							<li>
								<a class="ajax-link" href="setting.action"><i
									class="icon-align-justify"></i><span class="hidden-tablet">设置</span>
								</a>
							</li>
						</ul>
					
					<!--<label id="for-is-ajax" class="hidden-tablet" for="is-ajax"><input id="is-ajax" type="checkbox"> Ajax on menu</label> -->
				</div><!--/.well -->
			</div><!--/span-->
			<!-- left menu ends -->

				<noscript>
					<div class="alert alert-block span10">
						<h4 class="alert-heading">
							Warning!
						</h4>
						<p>
							You need to have
							<a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">JavaScript</a>
							enabled to use this site.
						</p>
					</div>
				</noscript>

				<div id="content" class="span10">
					<!-- content starts -->
					
					
					
					
	<form id="empForm" name="empForm" action="historicalData.action" method="get">	
	
		<!-- 
		<div >
				Scope： 
				<input name="scope" value="" type="text"  style="width: 120px;"/>	
				Date：
				<input name="date" id="datepicker" value="" type="text" style="width: 120px;"/>

				Type： 
				<select name="type" style="width: 300px;">
					<option value="0">
						ALL
					</option>
					<c:if test="${not empty errorType}">
						<c:forEach items="${errorType}" var="type">
							<option value="${type.id}">
								${type.typeName }
							</option>
						</c:forEach>
					</c:if>

				</select>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
				
				<input value="搜索" onclick="historicalData.action" type="submit"/>
				<input value="搜索全部" onclick="window.location.href='historicalData.action'" type="button"/>
			</div>
		 -->
				
					
					
		
		<div class="row-fluid sortable" id="threads">
		<div class="box span12">
		<div class="box-header well" data-original-title>
		<!-- 
			<h2>
				<i class="icon-user"></i> Modules ${error}
			</h2>
		 --><!--  -->

		</div>
		
		
		<div class="box-content">
			
			<table
				class="table table-striped table-bordered bootstrap-datatable datatable">

					<tr >
						<th width="10px">
							Type
						</th>
						<th width="10px">
							Scope
						</th>
						<th width="10px">
							client
						</th>
						<th width="10px">
							Date
						</th>
						<th width="10px">
							CheckDate
						</th>
						<th width="60px">
							需用时
						</th>
						<th >
							ErrorType
						</th>
						
						<th width="120px">
							详细/重查/rerun
						</th>
					</tr>
						<s:iterator value="page.result" var="a">
						<tr>
							<td>
								<%-- <span class="label">${a.type}</span> --%>
								<span class="label">B</span>
							</td>
							<td class="center">
								<span class="label">${a.scope}</span>
							</td>
							<td class="center">
								<span class="label">
	
		

									${a.parent}
	
								</span>
							</td>
							<td class="center">
								<span class="label">${a.year}年${a.month }月${a.day}日
								 	
								
								</span>
							</td>
							<th>
								<span class="label">${a.checkDate}</span>
							</th>
							<td class="center">
								${a.needTime}小时
							<!--  	<font color='#FF0000'>${a.errorMessage}</font>-->
							</td>
							<td class="center">
							<!-- 	<font color='#FF0000'>补数据</font> -->
							  	<font color='#FF0000'>${a.errorMessage}</font>
							</td>
							<td class="center">
							<a class="btn btn-success"  target="_blank" 
								href="getScope.action?moduleName=${a.scope}" > <i
									class="icon-zoom-in icon-white"></i></a>
							<a class="btn btn-success" href="checkModulesByUserEmail.action?scope=${a.scope}&userEmails=${a.scope}" target="_blank"> <i
									class="icon-edit icon-white"></i></a>
								<!-- 
								<a class="btn btn-info"  target="_blank" 
								href="rerun.action?scope=${a.scope}" > 
								 -->
								 <a class="btn btn-info"  target="_blank" 
								href="http://115.29.171.153:8000/modules/Ashley/rerun" > 
								<i	class="icon-zoom-in icon-white"></i></a>
							</td>
						</tr>
					<!-- 使用测试 -->
					</s:iterator>
			</table>

			
			

			
		</div>
		
		<div style="width: 600px;">
<c:if test="${not empty page}">
	<div  style="float: left;width: 200px;">
	 &nbsp&nbsp   共有${page.totalRowNum }条记录，当前是${page.currentPageIndex}/${page.totalPageNum }页
	</div>
	 
	<div  style="float:right;width: 400px;text-align: right;">
	<c:if test="${page.hasFirst}">
		<a href="historicalData.action?pageIndex=1"> 首页 </a>
	</c:if>
   
	<c:if test="${page.hasPrev}">
		<a href="historicalData.action?pageIndex=${page.currentPageIndex}"> 上一页 </a>
	</c:if>
	
	<c:forEach begin="${page.startPageIndex}" end="${page.endPageIndex}" var="i">
		<c:choose>
			<c:when test="${i==page.currentPageIndex}">
				[${i }]
	 		</c:when>
			<c:otherwise>
					<a href="historicalData.action?pageIndex=${i }">${i }</a>
			</c:otherwise>
		</c:choose>

	</c:forEach>
	
	<c:if test="${page.hasNext}">
		<a href="historicalData.action?pageIndex=${page.currentPageIndex+1 }"> 下一页 </a>
	</c:if>

	<c:if test="${page.hasLast}">
		<!--  <a href="${param.url}&pageIndex=${page.totalPageNum}"> 尾页 </a>-->
		<a href="historicalData.action?pageIndex=${page.totalPageNum}"> 尾页 </a>
	</c:if>
	</div>
</c:if>
			</div>
			</form>
		
	</div>
	<!--/span-->
						
					
					</div>

				





				</div>
				<!--/.fluid-container-->

				<!-- external javascript
	================================================== -->
				<!-- Placed at the end of the document so the pages load faster -->

				<!-- jQuery -->
				<script src="js/jquery-1.7.2.min.js"></script>
				<!-- jQuery UI -->
				<script src="js/jquery-ui-1.8.21.custom.min.js"></script>
				<!-- transition / effect library -->
				<script src="js/bootstrap-transition.js"></script>
				<!-- alert enhancer library -->
				<script src="js/bootstrap-alert.js"></script>
				<!-- modal / dialog library -->
				<script src="js/bootstrap-modal.js"></script>
				<!-- custom dropdown library -->
				<script src="js/bootstrap-dropdown.js"></script>
				<!-- scrolspy library -->
				<script src="js/bootstrap-scrollspy.js"></script>
				<!-- library for creating tabs -->
				<script src="js/bootstrap-tab.js"></script>
				<!-- library for advanced tooltip -->
				<script src="js/bootstrap-tooltip.js"></script>
				<!-- popover effect library -->
				<script src="js/bootstrap-popover.js"></script>
				<!-- button enhancer library -->
				<script src="js/bootstrap-button.js"></script>
				<!-- accordion library (optional, not used in demo) -->
				<script src="js/bootstrap-collapse.js"></script>
				<!-- carousel slideshow library (optional, not used in demo) -->
				<script src="js/bootstrap-carousel.js"></script>
				<!-- autocomplete library -->
				<script src="js/bootstrap-typeahead.js"></script>
				<!-- tour library -->
				<script src="js/bootstrap-tour.js"></script>
				<!-- library for cookie management -->
				<script src="js/jquery.cookie.js"></script>
				<!-- calander plugin -->
				<script src='js/fullcalendar.min.js'></script>
				<!-- data table plugin -->
				<script src='js/jquery.dataTables.min.js'></script>

				<!-- chart libraries start -->
				<script src="js/excanvas.js"></script>
				<script src="js/jquery.flot.min.js"></script>
				<script src="js/jquery.flot.pie.min.js"></script>
				<script src="js/jquery.flot.stack.js"></script>
				<script src="js/jquery.flot.resize.min.js"></script>
				<!-- chart libraries end -->

				<!-- select or dropdown enhancer -->
				<script src="js/jquery.chosen.min.js"></script>
				<!-- checkbox, radio, and file input styler -->
				<script src="js/jquery.uniform.min.js"></script>
				<!-- plugin for gallery image view -->
				<script src="js/jquery.colorbox.min.js"></script>
				<!-- rich text editor library -->
				<script src="js/jquery.cleditor.min.js"></script>
				<!-- notification plugin -->
				<script src="js/jquery.noty.js"></script>
				<!-- file manager library -->
				<script src="js/jquery.elfinder.min.js"></script>
				<!-- star rating plugin -->
				<script src="js/jquery.raty.min.js"></script>
				<!-- for iOS style toggle switch -->
				<script src="js/jquery.iphone.toggle.js"></script>
				<!-- autogrowing textarea plugin -->
				<script src="js/jquery.autogrow-textarea.js"></script>
				<!-- multiple file upload plugin -->
				<script src="js/jquery.uploadify-3.1.min.js"></script>
				<!-- history.js for cross-browser state change on ajax -->
				<script src="js/jquery.history.js"></script>
				<!-- application script for Charisma demo -->
				<script src="js/charisma.js"></script>
	</body>
</html>