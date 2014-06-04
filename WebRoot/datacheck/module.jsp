<%@page contentType="text/html;charset=utf-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
	<div class="box span12">
		<div class="box-header well" data-original-title>
			<h2>
				<i class="icon-user"></i> Modules (name is ${modules.name}) ${error}
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
							scope
						</th>
						<th>
							module_type
						</th>
						<th>
							status
						</th>
						<th>
							 instance
						</th>


						<th>
							updated_time
						</th>
						<th>
							error_date
						</th>
						<th>
							error_log
						</th>

					</tr>
				</thead>
				<tbody>
						<tr>
							<td>
								<span class="label">${modules.scope}</span>
							</td>
							<td class="center">
								<span class="label">${modules.moduleType} </span>
							</td>
							<td class="center">
								<span class="label">${modules.status}</span>
							</td>
							<td class="center">
								<span class="label">${modules.instance}</span>
							</td>
							<td class="center">
								<span class="label">${modules.updatedTime} </span>
							</td>
							<td class="center">
								<span class="label">${modules.errorDate} </span>
							</td>
							<td class="center">
								<span class="label">${modules.errorLog} </span>
							</td>

							
						</tr>
					<!-- 使用测试 -->
				</tbody>
			</table>
		</div>
		<div class="box-content">
			<table
				class="table table-striped table-bordered bootstrap-datatable datatable">
				<thead>
					<tr>
						<th>
							动作
						</th>
						<th>
							onlynum
						</th>
						<th>
							expression
						</th>

						<th>
							buzz_keyword
						</th>
						<th>
							sites
						</th>

					</tr>
				</thead>
				<tbody>
						<tr>
						
							<td class="center">
								<a class="btn btn-success"  target="_blank" 
								href="http://176.32.90.31:8983/solr/#/collection1/query" > <i
									class="icon-zoom-in icon-white"></i> solr is ${solrNum} </a>
								<a class="btn btn-info" href="https://console.aws.amazon.com/console/home" target="_blank"> <i
									class="icon-edit icon-white"></i> redshift is ${dynamodbNum }</a>
								
			
							</td>
							<td class="center">
								<span class="label">${modules.onlynum} </span>
							</td>



							<td class="center">
								<span class="label">${modules.expression} </span>
							</td>

							<td class="center">
								<span class="label">${modules.buzzKeyword} </span>
							</td>
							<td class="center">
								<span class="label">${modules.sites} </span>
							</td>
							
						</tr>
					<!-- 使用测试 -->
				</tbody>
			</table>
		</div>
	</div>
	<!--/span-->

