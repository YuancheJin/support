<%@page contentType="text/html;charset=utf-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="chart" style="margin: 0 auto"></div>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"
	type="text/javascript"></script>
<script src="http://code.highcharts.com/highcharts.js"></script>
<script src="http://code.highcharts.com/modules/exporting.js"></script>
<script type="text/javascript">
	var dateTmp ;
	var sum;

     (function ($) {
     	var dateTmp="";
     	var sum="";
     	 $.post(
			"/support/datacheck/historicalChart.action",
			function(root){
				dateTmp=new Array(root.length); 
				sum=new Array(root.length);
						
				for(var i=0;i<root.length;i++){
					dateTmp[i]=root[i].date;
					sum[i]=root[i].sum;	
				}
				/* alert(dateTmp);
				alert(sum); */
				$('#chart').highcharts({
		             credits:{
		                 enabled:false
		             },
		             chart:{
		                 type: 'spline',
		                 backgroundColor: '#eee',
		                 reflow:true
		             },
		             title: {
		                 text: '最近30天错误量',
		                 x: -20 //center
		             },
		             xAxis: {
		                 categories: dateTmp
		             },
		             yAxis: {
		                 title: {
		                     text: 'Error Num'
		                 },
		                 plotLines: [{
		                     value: 0,
		                     width: 1,
		                     color: '#808080'
		                 }]
		             },
		             tooltip: {
		                 valueSuffix: ''
		             },
		             series: [{
		                 name: 'Error Num:',
		                 
		                 data: sum
		             }]
		         });
			});

         
     })(jQuery);
</script>
