<%@page contentType="text/html;charset=utf-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
        
            <p>
                Search: <input id="filter" type="text"/>
                keyword:
                <select class="filter-status">
                	<option></option>
                    <option>跑数据错误</option>
                    <option >数据不一致</option>
                    <option >数据变化大</option>
                    <option >系统自身异常</option>
                </select>
                <a href="#clear" class="clear-filter" title="clear filter">[clear]</a>
                <span class="row-count"></span>
            </p>
            <table class="table demo" data-filter="#filter" data-page-size="20">
                <thead>
                <tr>
                    <th data-toggle="true">
                        Scope
                    </th>
                    <th data-hide="phone">
                        Client
                    </th>
                    <th data-hide="phone,tablet">
                        Thread
                    </th>
                    <th data-hide="phone,tablet" data-name="Solr">
        	             Solr
                    </th>
                    <th data-hide="phone,tablet" data-name="OnlyN">
                        OnlyN
                    </th>
                   <th data-hide="phone,tablet" data-name="RedShift">
                        RedShift
                    </th>
                   <th data-hide="phone">
                        日期
                    </th>
                    <th data-hide="phone" >
                        标记
                    </th>
                    <th>
                        ErrorType
                    </th>
                </tr>
                </thead>
                <tbody>
                <s:iterator value="page.result" var="a">
                <tr>
                    <td><a href="getScope.action?moduleName=${a.scope} target="_blank">${a.scope}</a></td>
                    <td><font color="#5B00AE">${a.parent}</font></td>
                    <td><font color="#4F9D9D">${a.threadNum}</font></td>
                    <td><font color="#FF8000">${a.solrNum}</font></td>
                    <td><font color="#FF79BC">${a.onlynum}</font></td>
                    <td><font color="#000093">${a.dynamoNum}</font></td>
                      
                    <td>${a.year}年${a.month }月${a.day}日</td>
                    <!--
                    <td data-value="78025368997">${a.checkDate}</td>
                    -->
                    
                   	<c:if test="${today==a.day}">
                    	<td data-value="1"><span class="status-metro status-active" title="Active">昨天</span></td>
                    </c:if>
                    <c:if test="${today==(a.day+1)}">
                    	<td data-value="1"><span class="status-metro status-disabled" title="Active">	前天</span></td>
                    </c:if>
                    <c:if test="${today>(a.day+1)}">
                    	<td data-value="1"><span class="status-metro status-suspended" title="Suspended">更久</span></td>
                    </c:if>
                   
                    
                     <td><font color="#FF0000">${a.errorMessage}</font></td>
                </tr>
                </s:iterator>
                
                </tbody>
                <tfoot class="hide-if-no-paging">
                <tr>
                    <td colspan="10">
                        <div class="pagination pagination-centered"></div>
                    </td>
                </tr>
                </tfoot>
            </table>
            
 <script type="text/javascript">
    $(function () {
		   $('table').footable({ bookmarkable: { enabled: true }}).bind({
            'footable_filtering': function (e) {
                var selected = $('.filter-status').find(':selected').text();
                if (selected && selected.length > 0) {
                    e.filter += (e.filter && e.filter.length > 0) ? ' ' + selected : selected;
                    e.clear = !e.filter;
                }
            },
            'footable_filtered': function() {
                var count = $('table.demo tbody tr:not(.footable-filtered)').length;
                $('.row-count').html(count + ' rows found');
            }
        });

        $('.clear-filter').click(function (e) {
            e.preventDefault();
            $('.filter-status').val('');
            $('table.demo').trigger('footable_clear_filter');
            $('.row-count').html('');
        });

        $('.filter-status').change(function (e) {
            e.preventDefault();
            $('table.demo').data('footable-filter').filter( $('#filter').val() );
        });
    });
</script>
        