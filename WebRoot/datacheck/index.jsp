<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE html>
<html lang="en">
<head>
	<title>Wildfire-Support</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="Charisma, a fully featured, responsive, HTML5, Bootstrap admin template.">
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
	<link href='css/fullcalendar.print.css' rel='stylesheet'  media='print'>
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
					<h4 class="alert-heading">Warning!</h4>
					<p>You need to have <a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">JavaScript</a> enabled to use this site.</p>
				</div>
			</noscript>
			
			<div id="content" class="span10">
			<!-- content starts -->
			
			<!-- 
			<div>
				<ul class="breadcrumb">
					<li>
						<a href="#">Home</a> <span class="divider">/</span>
					</li>
					<li>
						<a href="#">Dashboard</a>
					</li>
				</ul>
			</div>
			 -->
			<div class="sortable row-fluid">
			
				<a data-rel="tooltip" title="4 new pro members." class="well span3 top-block" 
				href="manual.jsp">
					<span class="icon32 icon-color icon-star-on"></span>
					<div>shou'dong'jian'cha</div>
					<span class="notification green">1</span>
				</a>
				
				<a data-rel="tooltip" title="$34 new sales." class="well span3 top-block" href="data_email.jsp">
					<span class="icon32 icon-color icon-cart"></span>
					<div>UserEmail check</div>
					<span class="notification red">2</span>
				</a>
				
				<a data-rel="tooltip" title="6 new members." class="well span3 top-block" 
				href="data_month.jsp">
					<span class="icon32 icon-red icon-user"></span>
					<div>Historical(email) check </div>
					<span class="notification">3</span>
				</a>
				
	    		<a data-rel="tooltip" title="12 new messages." class="well span3 top-block" 
				href="historicalData.action">
					<span class="icon32 icon-color icon-cart"></span>
					<div>Historical error data </div>
					<span class="notification red">4</span>
				</a>
	
			</div>
			
			<div class="sortable row-fluid">
			
				<a data-rel="tooltip"  class="well span3 top-block" 
				href="http://alpha.actsocial.com/" target="_blank">
					
					<div>alpha.actsocial</div>
					
				</a>
				
				<a data-rel="tooltip"  class="well span3 top-block" href="https://console.aws.amazon.com/console/home" target="_blank">
					
					<div>aws.amazon.com</div>
					
				</a>
				
				<a data-rel="tooltip"  class="well span3 top-block" 
				href="http://176.32.90.31:8983/solr/#/collection1/query" target="_blank">
					
					<div>Solr</div>
					
				</a>

				
				<a data-rel="tooltip"  class="well span3 top-block" href="http://www.influencerforce.com/sns/watch" target="_blank">
					
					<div>微博红绿灯</div>
					
				</a>
	
			</div>
			
			<div class="sortable row-fluid">
			
				<a data-rel="tooltip"  class="well span3 top-block" 
				href="http://beta.xingxinghuo.com/" target="_blank">
					
					<div>社区</div>
					
				</a>
				
				<a data-rel="tooltip"  class="well span3 top-block" href="http://www.influencerforce.com/" target="_blank">
					
					<div>influencerforce</div>
					
				</a>
				
				<a data-rel="tooltip" class="well span3 top-block" 
				href="http://www.influencerforce.com/zombie_task/index" target="_blank">
					
					<div>zombie_task</div>
					
				</a>

				
				<a data-rel="tooltip"  class="well span3 top-block" href="https://github.com/" target="_blank">
					
					<div>github</div>
					
				</a>
	
			</div>
			
			<div class="sortable row-fluid">
			
				<a data-rel="tooltip"  class="well span3 top-block" 
				href="http://crawler.influencerforce.com/watches/show" target="_blank">
					
					<div>Scanner</div>
					
				</a>
				
				<a data-rel="tooltip"  class="well span3 top-block" href="http://crawler.influencerforce.com/" target="_blank">
					
					<div>crawler.influencerforce</div>
					
				</a>
				
				<a data-rel="tooltip"  class="well span3 top-block" 
				href="http://54.248.85.234:4000/modules/index" target="_blank">
					
					<div>行业表达式(scope重跑)</div>
					
				</a>

				
				<a data-rel="tooltip"  class="well span3 top-block" href="http://crawler.influencerforce.com/detects/monitor" target="_blank">
					
					<div>detects monitor</div>
					
				</a>
	
			</div>
			
			<div class="sortable row-fluid">
			
				<a data-rel="tooltip"  class="well span3 top-block" 
				href="http://115.29.171.153:8000/topics/definitions">
					
					<div>Topics definitions</div>
					
				</a>
				
				<a data-rel="tooltip" class="well span3 top-block" href="http://115.29.171.153:8000/modules/Ashley/rerun" target="_blank">
					
					<div>按时间重跑module</div>
					
				</a>
				
	
			</div>
			
			

<div class="row-fluid sortable">
			
				<!--  
				<div class="box span4">
					<div class="box-header well" data-original-title>
						<h2><i class="icon-user"></i>check report</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<div class="box-content">
							<ul class="dashboard-list">
								<li>
									<a href="#">
										<img class="dashboard-avatar" alt="Abdullah" src="http://www.gravatar.com/avatar/46056f772bde7c536e2086004e300a04.png?s=50"></a>
										<strong>name:</strong> <a href="#">BMW 
									</a><br>
									<strong>status:</strong> 2<br>
									<strong>report time:</strong> 
									<span class="label label-important">10:10</span>                  
								</li>
								<li>
									<a href="#">
										<img class="dashboard-avatar" alt="Abdullah" src="http://www.gravatar.com/avatar/46056f772bde7c536e2086004e300a04.png?s=50"></a>
										<strong>name:</strong> <a href="#">Land Rover 
									</a><br>
									<strong>status:</strong> 1<br>
									<strong>report time:</strong> 
									<span class="label label-important">10:15</span>                  
								</li>

							
							</ul>
						</div>
					</div>
				</div> -->
				
				

			<div class="row-fluid sortable">
				
					
				<!--  
				<div class="box span4">
					<div class="box-header well" data-original-title>
						<h2><i class="icon-list"></i> Duty</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
							<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<ul class="dashboard-list">
							<li>
								<a href="#">
									<i class="icon-arrow-up"></i>                               
									<span class="green">星期一</span>
									yancy                                 
								</a>
							</li>
							<li>
								<a href="#">
									<i class="icon-arrow-up"></i>                               
									<span class="green">星期二</span>
									anping                                 
								</a>
							</li>
							<li>
								<a href="#">
									<i class="icon-arrow-up"></i>                               
									<span class="green">星期三</span>
									qiantianyang                                 
								</a>
							</li>
							<li>
								<a href="#">
									<i class="icon-arrow-up"></i>                               
									<span class="green">星期四</span>
									fermin                                 
								</a>
							</li>
							<li>
								<a href="#">
									<i class="icon-arrow-up"></i>                               
									<span class="green">星期五</span>
									fandansheng                                 
								</a>
							</li>
							<li>
								<a href="#">
									<i class="icon-arrow-up"></i>                               
									<span class="green">星期六</span>
									LJJ                                 
								</a>
							</li>
							<li>
								<a href="#">
									<i class="icon-arrow-up"></i>                               
									<span class="green">星期日</span>
									yancy                                 
								</a>
							</li>

						</ul>
					</div>
				</div> -->
			</div><!--/row-->
				  

		  
       
					<!-- content ends -->
			</div><!--/#content.span10-->
				</div><!--/fluid-row-->







				
		<hr>

		<div class="modal hide fade" id="myModal">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">脳</button>
				<h3>Settings</h3>
			</div>
			<div class="modal-body">
				<p>Here settings can be configured...</p>
			</div>
			<div class="modal-footer">
				<a href="#" class="btn" data-dismiss="modal">Close</a>
				<a href="#" class="btn btn-primary">Save changes</a>
			</div>
		</div>

	</div><!--/.fluid-container-->

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
