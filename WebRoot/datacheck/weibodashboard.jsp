<%@page contentType="text/html;charset=utf-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
	<div class="box span12">
		<div class="box-header well" data-original-title>
			<h2>
				<i class="icon-user"></i> WeiboDashboards ${error}
			</h2>
			<div class="box-icon">
				<a href="#" class="btn btn-setting btn-round"><i
					class="icon-cog"></i>
				</a>
				<a href="#" class="btn btn-minimize btn-round"><i
					class="icon-chevron-up"></i>
				</a>
				<a href="#" class="btn btn-close btn-round"><i
					class="icon-remove"></i>
				</a>
			</div>
		</div>
		<div class="box-content">
			<table
				class="table table-striped table-bordered bootstrap-datatable datatable">
				<thead>
					<tr>
					<th>
						new_followers
					</th>
					<th>
						tweets
					</th>
					<th>
						reposts
					</th>
					<th>
						comments
					</th>
					</tr>
				</thead>
				<tbody>
					<!-- 使用测试 -->
					<s:iterator value="weiboDashboardId" var="list">
						<tr>
							<td>
								<span class="label">${list.newFollowers} </span>
							</td>
							<td class="center">
								<span class="label">${list.tweets } </span>
							</td>
							<td class="center">
								<span class="label">${list.reposts } </span>
							</td>
							<td class="center">
								<span class="label">${list.comments } </span>
							</td>

							
						</tr>
						</s:iterator>
					<!-- 使用测试 -->
				</tbody>
			</table>
		</div>
	</div>
	<!--/span-->
