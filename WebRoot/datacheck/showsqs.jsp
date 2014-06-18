<%@page contentType="text/html;charset=utf-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    

 actsocial_queue 
 <c:if test="${actsocial_queue==0}">
 	<span class="status-metro status-active" title="Active">${actsocial_queue}</span>
 </c:if>
 <c:if test="${actsocial_queue!=0}">
 	<span class="status-metro status-suspended" title="Active">${actsocial_queue}</span>
 </c:if>
<br/>  
 actsocial_queue_5 
  <c:if test="${actsocial_queue_5==0}">
 	<span class="status-metro status-active" title="Active">${actsocial_queue_5}</span>
 </c:if>
 <c:if test="${actsocial_queue_5!=0}">
 	<span class="status-metro status-suspended" title="Active">${actsocial_queue_5}</span>
 </c:if>
<br/>
 buzz_queue 
 <c:if test="${buzz_queue==0}">
 	<span class="status-metro status-active" title="Active">${buzz_queue}</span>
 </c:if>
 <c:if test="${buzz_queue!=0}">
 	<span class="status-metro status-suspended" title="Active">${buzz_queue}</span>
 </c:if>
<br/>
  
 follower_queue
 <c:if test="${follower_queue==0}">
 	<span class="status-metro status-active" title="Active">${follower_queue}</span>
 </c:if>
 <c:if test="${follower_queue!=0}">
 	<span class="status-metro status-suspended" title="Active">${follower_queue}</span>
 </c:if>
<br/>
  
 timeline_queue 
  <c:if test="${timeline_queue==0}">
 	<span class="status-metro status-active" title="Active">${timeline_queue}</span>
 </c:if>
 <c:if test="${timeline_queue!=0}">
 	<span class="status-metro status-suspended" title="Active">${timeline_queue}</span>
 </c:if>
<br/>

 actsocial_hourly_queue 
  <c:if test="${actsocial_hourly_queue==0}">
 	<span class="status-metro status-active" title="Active">${actsocial_hourly_queue}</span>
 </c:if>
 <c:if test="${actsocial_hourly_queue!=0}">
 	<span class="status-metro status-suspended" title="Active">${actsocial_hourly_queue}</span>
 </c:if>
<br/>

 run_buzz_range_day 
  <c:if test="${run_buzz_range_day==0}">
 	<span class="status-metro status-active" title="Active">${run_buzz_range_day}</span>
 </c:if>
 <c:if test="${run_buzz_range_day!=0}">
 	<span class="status-metro status-suspended" title="Active">${run_buzz_range_day}</span>
 </c:if>
<br/>

   
 
        