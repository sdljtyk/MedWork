<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html>
<head>
<title>医院退货单查询</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>

<script type="text/javascript">


function yythdinfo(id){
	var sendUrl = "${baseurl}/thd/yythdinfo.action?yythdid="+id;
	parent.opentabwindow('退货单查看',sendUrl);
}


//工具栏

var toolbar = [];

var frozenColumns;

var columns = [ [
 
	{
		field : 'id',
		title : '',
		hidden : true,
	},{
		field : 'backnumber',
		title : '退货单编号',
		width : 160
	},{
		field : 'backname',
		title : '退货单名称',
		width : 180
	},{
		field : 'yylxr',
		title : '联系人',
		width : 80
	},{
		field : 'backphone',
		title : '联系方式',
		width : 120
	},{
		field : 'backcreat',
		title : '建单时间',
		width : 135
	},{
		field : 'backalter',
		title : '修改时间',
		width : 135
	},{
		field : 'backsub',
		title : '提交时间',
		width : 135
	},{
		field : 'backstatename',
		title : '退货单状态', 
		width : 100
	},{
	field : 'opt3',
	title : '查看',
	width : 60,
	formatter:function(value, row, index){
		return '<a href=javascript:yythdinfo(\''+row.id+'\')>查看</a>';
	}
}]];

function initGrid(){
	$('#yythdlist').datagrid({
		title : '退货单列表',
		striped : true,
		url : '${baseurl}/thd/yythdlist_result.action',
		idField : 'id',//退货单id
		columns : columns,
		autoRowHeight:true,
		pagination : true,
		rownumbers : true,
		toolbar : toolbar,
		loadMsg:"",
		pageList:[15,30,50,100],
		onClickRow : function(index, field, value) {
					$('#yythdlist').datagrid('unselectRow', index);
				}
		});

	}
	$(function() {
		initGrid();
	});

	function yythdquery() {
		var formdata = $("#yythdqueryForm").serializeJson();
		$('#yythdlist').datagrid('unselectAll');
		$('#yythdlist').datagrid('load', formdata);
	}

</script>
</HEAD>
<BODY>
	<form id="yythdqueryForm" name="yythdqueryForm" method="post">
		<TABLE class="table_search">
			<TBODY>
				<TR>
						<TD class="left">退货单编号：</td>
						<td><INPUT type="text"  name="backnumber" /></TD>
					<TD class="left">退货单名称：</TD>
						<td ><INPUT type="text" name="backname" /></td>
					<TD class="left">退货单状态：</TD>
					<td><select id="backstate" name="backstate" style="width:150px">
								<option value="0">全部</option>
								<c:forEach items="${thdztList}" var="value">
									<option value="${value.id}">${value.info}</option>
								</c:forEach>
							</select>
					 <a id="btn" href="#" onclick="yythdquery()"
						class="easyui-linkbutton" iconCls='icon-search'>查询</a>
					</td>
				</tr>

			</TBODY>
		</TABLE>

		<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
			<TBODY>
				<TR>
					<TD>
						<table id="yythdlist"></table>
					</TD>
				</TR>
			</TBODY>
		</TABLE>
	</form>


</BODY>
</HTML>

