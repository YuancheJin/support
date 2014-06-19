<%@page contentType="text/html;charset=utf-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<p>
	Search: <input id="filter" type="text" /> keyword: <select
		class="filter-status">
		<option></option>
		<option>Ππ</option>
		<option>Ξξ</option>
		<option>从未正常跑过</option>
		<option>数据正在跑</option>
		<option>跑数据出错</option>
		<option>overview</option>
		<option>analytics</option>
		<option>topic</option>
		<option>insight</option>
		<option>SOV</option>
		<option>超时</option>
		<option>yesterday</option>

	</select> <a href="#clear" class="clear-filter" title="clear filter">[clear]</a>
	<span class="row-count"></span>
</p>
<table class="table demo" data-filter="#filter" data-page-size="20">
	<thead>
		<tr>
			<th data-toggle="true">Module</th>
			<th data-hide="phone" data-name="错误">错误</th>
			<th data-hide="phone,tablet">Update时间</th>
			<th data-hide="phone,tablet">验证时间</th>
			<th data-hide="phone">标记</th>

		</tr>
	</thead>
	<tbody>


<!-- 		<tr>
			<td data-value="1">-</td>
			<td data-value="1">-</td>

			<td data-value="1">-</td>
			<td data-value="1">-</td>


			<td data-value="1">-</td>



		</tr> -->


		<s:iterator value="page.result" var="a">
			<tr>
				<td><a href="getScope.action?moduleName=${a.scope}"
					target="_blank">${a.scope}</a>
				</td>
				<td><s:iterator value="errorMessage" id="inner" var="c2">
						<c:if test="${c2.id==1}">
							<font color="#FF8000">${c2.errorMessage}</font>
						</c:if>
						<c:if test="${c2.id==2}">
							<font color="#8C8C00">${c2.errorMessage}</font>
						</c:if>
						<br />
						<%-- <c:if test="${}">
                     		<font color="#8C8C00">${c2.errorMessage}</font>
                     	</c:if> --%>
					</s:iterator></td>


				<!-- 
                    <td><font color="#4F9D9D">${a.year}年${a.month }月${a.day}日</font></td>
                     -->
				<td><font color="#5B00AE">${a.date}</font>
				</td>
				<td><font color="#4F9D9D">${a.checkDate}</font>
				</td>

				<c:if test="${today==a.day}">
					<td data-value="1"><span class="status-metro status-active"
						title="Active">昨天</span>
					</td>
				</c:if>
				<c:if test="${today==(a.day+1)}">
					<td data-value="1"><span class="status-metro status-disabled"
						title="Active">前天</span>
					</td>
				</c:if>
				<c:if test="${today>(a.day+1)}">
					<td data-value="1"><span class="status-metro status-suspended"
						title="Suspended">更久</span>
					</td>
				</c:if>



			</tr>
		</s:iterator>

	</tbody>
	<tfoot class="hide-if-no-paging">
		<tr>
			<td colspan="10">
				<div class="pagination pagination-centered"></div></td>
		</tr>
	</tfoot>
</table>

<script type="text/javascript">
	$(function() {
		$('table')
				.footable({
					bookmarkable : {
						enabled : true
					}
				})
				.bind(
						{
							'footable_filtering' : function(e) {
								var selected = $('.filter-status').find(
										':selected').text();
								if (selected && selected.length > 0) {
									e.filter += (e.filter && e.filter.length > 0) ? ' '
											+ selected
											: selected;
									e.clear = !e.filter;
								}
							},
							'footable_filtered' : function() {
								var count = $('table.demo tbody tr:not(.footable-filtered)').length;
								$('.row-count').html(count + ' rows found');
							}
						});

		$('.clear-filter').click(function(e) {
			e.preventDefault();
			$('.filter-status').val('');
			$('table.demo').trigger('footable_clear_filter');
			$('.row-count').html('');
		});

		$('.filter-status').change(function(e) {
			e.preventDefault();
			$('table.demo').data('footable-filter').filter($('#filter').val());
		});
	});
</script>
