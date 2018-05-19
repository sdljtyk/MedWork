<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html>
<head>
<title>医院采购单审核</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>


<script type="text/javascript">
	var yycgdreviewsubmit = function() {
		_confirm('您确定要提交采购单的审核结果吗?', null, function() {

			var indexs = [];//提交记录的序号
			var states = [];
			var rows = $('#yycgdlist').datagrid('getSelections');
			for (var i = 0; i < rows.length; i++) {
				indexs.push(rows[i].id);
				states.push($('#reorderstate' + rows[i].id).val());
			}
			if (rows.length > 0) {
				console.log(indexs)
				console.log(states)
				$.post('yycgdreviewsubmit.action', {
					indexs : indexs.join(','),
					states : states.join(','),
				}, function(data) {
					$.messager.alert("系统提示消息", data.message);
					yycgdquery();
				});
			} else {
				alert_warn("请选择要审核的采购单");
			}

		})

	};

	function yycgdinfo(id) {
		var sendUrl = "${baseurl}/cgd/yycgdinfo.action?yycgdid=" + id;
		parent.opentabwindow('采购单查看', sendUrl);
	}

	//工具栏

	var toolbar = [ {
		id : 'yycgdreviewsubmit',
		text : '提交审核结果',
		iconCls : 'icon-add',
		handler : yycgdreviewsubmit
	} ];

	var frozenColumns;

	var columns = [ [
			{
				checkbox : true
			},
			{
				field : 'reorderstate',
				title : '审核结果',
				width : 120,
				formatter : function(value, row, index) {
					return '<select  id="reorderstate'+row.id+'"  style="width:100px">'
							+ '<option value="30" checked></option>'
							+ '<option value="31">审核通过</option>'
							+ '<option value="32">审核不通过</option>' + '</select>';
				}

			},
			{
				field : 'id',
				hidden : true,
			},
			{
				field : 'yyname',
				title : '医院名称',
				width : 130
			},
			{
				field : 'ordernumber',
				title : '采购单编号',
				width : 140
			},
			{
				field : 'ordername',
				title : '采购单名称',
				width : 170 
			},
			{
				field : 'orderctime',
				title : '建单时间',
				width : 120
			},
			{
				field : 'ordersub',
				title : '提交时间',
				width : 120
			},
			{
				field : 'orderstatemc',
				title : '采购单状态',
				width : 100
			},
			{
				field : 'opt3',
				title : '查看',
				width : 80,
				formatter : function(value, row, index) {
					return '<a href=javascript:yycgdinfo(\'' + row.id
							+ '\')>查看</a>';
				}
			} ] ];

	function initGrid() {
		$('#yycgdlist').edatagrid({
			title : '采购单列表',
			striped : true,
			url : '${baseurl}/cgd/yycgdlist_result.action?orderstate=30',
			idField : 'id',//采购单id
			columns : columns,
			autoRowHeight : true,
			pagination : true,
			rownumbers : true,
			toolbar : toolbar,
			loadMsg : "",
			pageList : [ 15, 30, 50, 100 ],
			
		});

	}
	$(function() {
		initGrid();
	});

	function yycgdquery() {
		var formdata = $("#yycgdqueryForm").serializeJson();
		$('#yycgdlist').edatagrid('unselectAll');
		$('#yycgdlist').edatagrid('load', formdata);
	}
</script>
</HEAD>
<BODY>
	<form id="yycgdqueryForm" name="yycgdqueryForm" method="post"
		action="${baseurl}/cgd/yycgdreviewsubmit.action">
		<input type="hidden" name="indexs" id="indexs" />
		<TABLE class="table_search">
			<TBODY>
				<TR>
					<TD class="left">采购单编号：</td>
					<td><INPUT type="text" name="ordernumber" /></TD>
					<TD class="left">采购单名称：</TD>
					<td><INPUT type="text" name="ordername" /></td>
					<TD class="left">采购单状态：</TD>
					<td><select style="width: 168px" name="orderstate" readonly>
							<option value="30" selected>审核中</option>
					</select></td>
					<TD colspan=2><a id="btn" href="#" onclick="yycgdquery()"
						class="easyui-linkbutton" iconCls='icon-search'>查询</a></TD>

				</tr>

			</TBODY>
		</TABLE>

		<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
			<TBODY>
				<TR>
					<TD>
						<table id="yycgdlist">
						
						</table>
					</TD>
				</TR>
			</TBODY>
		</TABLE>
	</form>

	<form id="yycgddeleteForm" name="yycgddeleteForm"
		action="${baseurl}/cgd/yycgddelete.action">
		<input type="hidden" id="cgddeleteid" name="cgddeleteid" />
	</form>

</BODY>
</HTML>

