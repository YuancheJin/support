<%@page contentType="text/html;charset=utf-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script src="http://code.highcharts.com/highcharts.js"></script>
<script src="http://code.highcharts.com/modules/exporting.js"></script>
        
<p>待完成....</p>

<div id="chart" style="margin: 0 auto"></div>

<script type="text/javascript">
    (function ($) {
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
                categories: ["2014.05.12","2014.05.17","2014.05.20","2014.05.23","2014.06.02"]
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
           /* legend: {
                layout: 'vertical',
                align: 'right',
                verticalAlign: 'middle',
                borderWidth: 0
            },*/
            series: [{
                name: 'Error Num:',
                data: [304,98,46,65,22]
            }]
        });
    })(jQuery);
</script>
