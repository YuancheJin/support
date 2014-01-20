<%@page contentType="text/html;charset=utf-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<div class="box span12">
	<div class="box-header well" data-original-title>
		<h2>
			<i class="icon-user"></i> Analytics ${error}
			
		</h2>
		<div class="box-icon">
			<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i>
			</a>
			<a href="#" class="btn btn-minimize btn-round"><i
				class="icon-chevron-up"></i> </a>
			<a href="#" class="btn btn-close btn-round"><i
				class="icon-remove"></i> </a>
		</div>
	</div>
	<div class="box-content">
		<table
			class="table table-striped table-bordered bootstrap-datatable datatable">
			<thead>
				<tr>
					<th>
						data's date(y+m+d)
					</th>
					<th>
						threads
					</th>
					<th>
						posts
					</th>

					<th>
						media
					</th>
					<th>
						site_id
					</th>
					<th>
						created_time
					</th>
					<th>
						include_buzz
					</th>
				</tr>
			</thead>
			<tbody>
				<!-- 使用测试 -->
				<s:iterator value="analyticsList" var="list">
					<tr>
						<td class="center">
							<span class="label">${list.year}/${list.month}/${list.day}</span>
						</td>
						<td class="center">
							<span class="label">${list.threads}</span>
						</td>
						<td class="center">
							<span class="label">${list.posts}</span>
						</td>

						<td class="center">
							<span class="label">${list.media}</span>
						</td>
						<td class="center">
							<span class="label">${list.siteId}</span>
						</td>
						<td class="center">
							<span class="label">${list.createdTime}</span>
						</td>
						<td class="center">
							<span class="label">${list.includeBuzz}</span>
						</td>
					</tr>
				</s:iterator>
				<!-- 使用测试 -->
			</tbody>
		</table>
	</div>
</div>
<!--/span-->

