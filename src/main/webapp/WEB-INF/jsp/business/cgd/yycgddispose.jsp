<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html>
<head>
<title>医院采购单受理查询列表</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>

<script type="text/javascript">
	var yycgddisposesubmit = function() {
		_confirm('您确定要对选择的药品发货吗?', null,
				function() {

					var indexs = [];//提交记录的序号
					var rows = $('#yycgdmxlist').datagrid('getSelections');
					for (var i = 0; i < rows.length; i++) {
						var index = $('#yycgdmxlist').datagrid('getRowIndex',
								rows[i]);
						indexs.push(index);
					}
					if (rows.length > 0) {
						$("#indexs").val(indexs.join(','));
						jquerySubByFId('yycgddisposeForm',
								yycgddispose_callback, null);
					} else {
						alert_warn("请选择要发货的药品");
					}

				})

	};

	function yycgddispose_callback(data) {
		$.messager.alert("系统提示消息", data.message);
		yycgdmxquery();
	}

	//工具栏

	var toolbar = [ {
		id : 'yycgddisposesubmit',
		text : '确认发货',
		iconCls : 'icon-add',
		handler : yycgddisposesubmit
	} ];

	var frozenColumns;

	var columns = [ [
			{
				field : 'id',
				checkbox : true
			},
			{
				field : 'orderid',
				hidden : true
			},
			{
				field : 'yyname',
				title : '医院名称',
				width : 100
			},
			{
				field : 'ordernumber',
				title : '采购单编号',
				width : 100
			},
			{
				field : 'ordercreate',
				title : '建单时间',
				width : 120
			},
			{
				field : 'mednumber',
				title : '药品流水号',
				width : 70
			},
			{
				field : 'medname',
				title : '药品名称',
				width : 100
			},
			{
				field : 'medjx',
				title : '剂型',
				width : 70
			},
			{
				field : 'medgg',
				title : '规格',
				width : 60
			},
			{
				field : 'meddw',
				title : '单位',
				width : 60
			},
			{
				field : 'meddj',
				title : '中标价(元)',
				width : 60
			},
			{
				field : 'mednum',
				title : '采购量',
				width : 60
			},
			{
				field : 'medsum',
				title : '采购金额(元)',
				width : 60
			},
			{
				field : 'medmake',
				title : '生产企业',
				width : 150
			},
			{
				field : 'ghstatemc',
				title : '采购状态',
				width : 80
			}] ];

	function initGrid() {
		$('#yycgdmxlist').datagrid({
			title : '采购单列表',
			striped : true,
			url : '${baseurl}/cgd/yycgddispose_result.action',
			columns : columns,
			autoRowHeight : true,
			pagination : true,
			rownumbers : true,
			toolbar : toolbar,
			loadMsg : "",
			pageList : [ 15, 30, 50, 100 ],
			onClickRow : function(index, field, value) {
				$('#yycgdmxlist').datagrid('unselectRow', index);
			}
		});

	}
	$(function() {
		initGrid();

	});

	function yycgdmxquery() {
		var formdata = $("#yycgddisposeForm").serializeJson();
		$('#yycgdmxlist').datagrid('unselectAll');
		$('#yycgdmxlist').datagrid('load', formdata);
	}
</script>
</HEAD>
<BODY>
	<form id="yycgddisposeForm" name="yycgddisposeForm" method="post"
		action="${baseurl}/cgd/yycgddispose_submit.action">
		<input type="hidden" name="indexs" id="indexs" />
		<TABLE class="table_search">
			<TBODY>
				<TR>
					<TD class="left">采购单名称：</td>
					<td><select id="ordername" name="ordername"
						style="width: 200px">
							<option value="0">全部</option>
							<c:forEach items="${cgdNameList}" var="value">
								<option value="${value.id}">${value.ordername}</option>
							</c:forEach>
					</select></TD>
					<TD class="left">采购单状态：</TD>
					<td>审核通过</td>
					<td><a id="btn" href="#" onclick="yycgdmxquery()"
						class="easyui-linkbutton" iconCls='icon-search'>查询</a></td>
				</tr>


			</TBODY>
		</TABLE>

		<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
			<TBODY>
				<TR>
					<TD>
						<table id="yycgdmxlist"></table>
					</TD>
				</TR>
			</TBODY>
		</TABLE>
	</form>

</BODY>
</HTML>

