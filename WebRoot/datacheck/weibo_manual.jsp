<%@page contentType="text/html;charset=utf-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
		
		<script type="text/javascript">
	$(function() {
	var v='1${moduleName}';
		if(v!='1'){
			var emailInfoSpan1 = document.getElementById('hdden1');
            emailInfoSpan1.style.display='';
            var emailInfoSpan2 = document.getElementById('hdden2');
            emailInfoSpan2.style.display='';
            var emailInfoSpan3 = document.getElementById('hdden3');
            emailInfoSpan3.style.display='';
            var emailInfoSpan4 = document.getElementById('hdden4');
            emailInfoSpan4.style.display='';
		}
		if(v!='1'){
	$(function() {
		$("#module").load("module.action", {
			"moduleName" : '${moduleName}'
		});
	});
	$(function() {
		$("#dashboard").load("weibodashboard.action", {
			"scope" : '${scope}'
		});
	});
	$(function() {
		$("#analytics").load("weiboanalytics.action", {
			"scope" : '${scope}'
		});
	});
	$(function() {
		$("#threads").load("weibothreads.action", {
			"scope" : '${scope}'
		});
	});
	}
	});
</script>
	</head>

	<body>
		<!-- topbar starts -->
		<div class="navbar">
			<div class="navbar-inner">
				<div class="container-fluid">
					<a class="btn btn-navbar" data-toggle="collapse"
						data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span> </a>
					<img src="img/logo20.png" />
					<span>Wildfire Support</span>

					<!-- theme selector starts -->
					<div class="btn-group pull-right theme-container">
						<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
							<i class="icon-tint"></i><span class="hidden-phone">
								Change Theme / Skin</span> <span class="caret"></span> </a>
						<ul class="dropdown-menu" id="themes">
							<li>
								<a data-value="classic" href="#"><i class="icon-blank"></i>
									Classic</a>
							</li>
							<li>
								<a data-value="cerulean" href="#"><i class="icon-blank"></i>
									Cerulean</a>
							</li>
							<li>
								<a data-value="cyborg" href="#"><i class="icon-blank"></i>
									Cyborg</a>
							</li>
							<li>
								<a data-value="redy" href="#"><i class="icon-blank"></i>
									Redy</a>
							</li>
							<li>
								<a data-value="journal" href="#"><i class="icon-blank"></i>
									Journal</a>
							</li>
							<li>
								<a data-value="simplex" href="#"><i class="icon-blank"></i>
									Simplex</a>
							</li>
							<li>
								<a data-value="slate" href="#"><i class="icon-blank"></i>
									Slate</a>
							</li>
							<li>
								<a data-value="spacelab" href="#"><i class="icon-blank"></i>
									Spacelab</a>
							</li>
							<li>
								<a data-value="united" href="#"><i class="icon-blank"></i>
									United</a>
							</li>
						</ul>
					</div>
					<!-- theme selector ends -->

					<!-- user dropdown starts -->
					<div class="btn-group pull-right">
						<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
							<i class="icon-user"></i><span class="hidden-phone"> admin</span>
							<span class="caret"></span> </a>
						<ul class="dropdown-menu">
							<li>
								<a href="#">Profile</a>
							</li>
							<li class="divider"></li>
							<li>
								<a href="#">Logout</a>
							</li>
						</ul>
					</div>
					<!-- user dropdown ends -->


				</div>
			</div>
		</div>
		<!-- topbar ends -->
		<div class="container-fluid">
			<div class="row-fluid">

				<!-- left menu starts -->
				<div class="span2 main-menu-span">
					<div class="well nav-collapse sidebar-nav">
						<ul class="nav nav-tabs nav-stacked main-menu">
							<li class="nav-header hidden-tablet">
								Main
							</li>
							<li>
								<a class="ajax-link" href="index.jsp"><i class="icon-home"></i><span
									class="hidden-tablet"> Dashboard</span>
								</a>
							</li>
							<li class="nav-header hidden-tablet">
								Others
							</li>
							<li>
								<a class="ajax-link" href="manual.jsp"><i
									class="icon-align-justify"></i><span class="hidden-tablet">Manual
										Check</span>
								</a>
							</li>
							<li>
								<a class="ajax-link" href="emailmatic.jsp"><i
									class="icon-align-justify"></i><span class="hidden-tablet">UserEmail 
										Check</span>
								</a>
							</li>
							<li>
								<a class="ajax-link" href="automatic.jsp"><i
									class="icon-align-justify"></i><span class="hidden-tablet">File/All
										Check</span>
								</a>
							</li>
							<li>
								<a class="ajax-link" href="data_month.jsp"><i
									class="icon-align-justify"></i><span class="hidden-tablet">Historical error data</span>
								</a>
							</li>
							<li>
								<a class="ajax-link" href="weibo_api_cost.jsp"><i
									class="icon-align-justify"></i><span class="hidden-tablet">Weibo module cost</span>
								</a>
							</li>
							<li>
							<a class="ajax-link" href="#" >
								<i
									class="icon-picture"></i><span class="hidden-tablet"  id="toggle-fullscreen">Toggle Fullscreen</span>
									</a>
							</li>


						</ul>
	
						<!--<label id="for-is-ajax" class="hidden-tablet" for="is-ajax"><input id="is-ajax" type="checkbox"> Ajax on menu</label> -->
					</div>
					<!--/.well -->
				</div>
				<!--/span-->
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


					<div>
						<ul class="breadcrumb">
							<li>
								<a href="#">Home</a>
								<span class="divider">/</span>
							</li>
							<li>
								<a href="#">Manual</a>
							</li>
						</ul>
					</div>
					
					
					
					<form  action="getScope.action" method="post"> 
					Modules name :<input type="text" name="moduleName"  id="select_text" >
					<input id="Submit1" type="submit" value="GO" /> 
					</form>
					
					
					
					<div class="row-fluid sortable" id="threads">
						<img id="hdden1"  style="display:none" src="../images/window_loading.gif" alt="" />
						
					</div>

					<div class="row-fluid sortable" id="module">
						<img id="hdden2"  style="display:none" src="../images/window_loading.gif" alt="" />
						
					</div>
					<div class="row-fluid sortable" id="dashboard">
						<img id="hdden3"  style="display:none" src="../images/window_loading.gif" alt="" />
						
					</div>
					<div class="row-fluid sortable" id="analytics">
						<img id="hdden4"  style="display:none" src="../images/window_loading.gif" alt="" />
						
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