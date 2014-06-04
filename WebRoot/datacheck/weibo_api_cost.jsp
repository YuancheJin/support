<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Wildfire-Support</title>
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
		<script src="js/jquery-1.9.1.min.js"></script>
		<script src="js/json2.js"></script>
		<script language="javascript">
			var d = new Date();
			var vYear = d.getFullYear();
			var vMon = d.getMonth() + 1;
			var vDay = d.getDate();
			var now_date=vYear+"-"+vMon+"-"+vDay;
			d = new Date();
			d.setMonth(d.getMonth() - 1);
			vYear = d.getFullYear();
			vMon = d.getMonth() + 1;
			vDay = d.getDate();
			var one_monage_date=vYear+"-"+vMon+"-"+vDay;
			
		</script>
		<script type="text/javascript">
			$(document).ready(function(){
				$("#test_ajax").click(function(){
					var weibo_id=$("#weibo_id").val();
					//alert("https://c.api.weibo.com/2/users/behavior_trend.json?access_token=2.009l8yFCeXuwhD420d882846hBaTBD&starttime="+now_date+"&endtime="+one_monage_date+"&uid= "+weibo_id);
					$.ajax({
						type: "GET",
						url:"https://c.api.weibo.com/2/users/behavior_trend.json?access_token=2.009l8yFCeXuwhD420d882846hBaTBD&starttime="+one_monage_date+"&endtime="+now_date+"&uid= "+weibo_id,
						dataType:"jsonp",
						success:function(data,status){
							if(status ==="success"){
								var arr = new Array();
								arr=eval(data.data.result);
								if(arr.length>0){
									var repost=0;
									var comments=0;
									var new_followers=0;
									for(var i=0;i<arr.length;i++){
										repost=Number(repost)+Number(arr[i].reposted_count); 
										comments=Number(comments)+Number(arr[i].receive_comments_count); 
									}
									new_followers=Number(arr[arr.length-1].followers_count)-Number(arr[0].followers_count);
									$("#test_ajax_content").html('retweets: '+repost+", comments:"+comments+", new_followers:"+new_followers);
								}else{
									$("#test_ajax_content").html("该微博不存在!");
								}
							}
							else
								$("#test_ajax_content").html("error");
						}
					});
				});	
			});
		</script>
	</head>

	<body>
		<!-- topbar starts -->
		<div class="navbar">
		
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



					
						<h3>获取最近一个月微博的评论/转发/粉丝数</h3><br/>
						 
        			    请输入微博ID：<input id="weibo_id" type="text" name="email" value="" />
						<br/>
						<button id="test_ajax"
							class="btn btn-large btn-primary visible-desktop"
							data-toggle="button">
							Get Result
						</button>
						<span id="test_ajax_content"></span>




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