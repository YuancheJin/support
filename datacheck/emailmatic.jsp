<%@page contentType="text/html;charset=utf-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Check Actsocial Data</title>
    <meta name="robots" content="index, nofollow" />
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
    
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap-2.3.2.min.css">
    <link rel="stylesheet" href="assets/bootstrap/css/docs.css">
    <link rel="stylesheet" href="assets/bootstrap-tagsinput.css">
    <style>
      .bootstrap-tagsinput { width: 100%; }
      .accordion { margin-top:-19px; }
    </style>

  </head>
  <body>
    <header class="jumbotron subhead">
      <div class="container">
        <h1>Check Actsocial Data</h1>

        <p> --by email.</p>

        <p class="btn-group text-center span12">
          <a class="btn btn-primary" onclick="go()">
            <i class="icon-download-alt icon-white"></i> Send Email！
          </a><a class="btn" href="manual.jsp"><i class="icon-github"></i>Manual <small>check</small></a>
          <a class="btn" href="automatic.jsp"><i class="icon-github"></i>File/All <small>check</small></a>
          <a class="btn" href="index.jsp"><i class="icon-github"></i>Go <small>home</small></a>

        </p>
      </div>
    </header>
    <div class="container">
      <section id="examples">
      		<form name="form1" action="checkModulesByUserEmail.action" method="get">
            待检查的客户邮箱：<input type="text" name="userEmails"  value="barilla@wildfire.asia,bellamy@wildfire.asia,bellyarmor@wildfire.asia,ferrero@wildfire.asia,parkway@wildfire.asia,pistachios@wildfire.asia,porsche@wildfire.asia,retailer@wildfire.asia,imf@wildfire.asia,baby_diaper@wildfire.asia,childrens_clothing@wildfire.asia,baby_food_supplement@wildfire.asia,infant_nutrition@wildfire.asia,Maternal_mall@wildfire.asia" 
            data-role="tagsinput" />
            日志接收邮箱：<input type="text"  name="email"  value="data@wildfire.asia,it@wildfire.asia" data-role="tagsinput" />
            </form>
            <img id="hdden1"  style="display:none"  src="../images/window_loading.gif" alt="" />
      </section>
    </div>
      <footer class="footer">
      <p>Code by Wildfire-Support</p>
    </footer>

    <script src="assets/jquery.min.js"></script>
    <script src="assets/bootstrap/bootstrap.min.js"></script>
    <script src="assets/bootstrap-tagsinput.js"></script>
    <script src="assets/bootstrap-tagsinput-angular.js"></script>
    <script language="javascript">
  	 function go() {
  	  var emailInfoSpan1 = document.getElementById('hdden1');
      emailInfoSpan1.style.display='';
      document.form1.submit();
  	 }
	</script>

  </body>
</html>
