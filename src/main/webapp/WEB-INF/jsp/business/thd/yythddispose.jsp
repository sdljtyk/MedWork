<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html>
<head>
<title>医院退货单受理</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>

<script type="text/javascript">
	var yythddisposesubmit = function() {
		_confirm('您确定对选择的药品退货吗?', null,
				function() {

					var indexs = [];//提交记录的序号
					var rows = $('#yythdmxlist').datagrid('getSelections');
					for (var i = 0; i < rows.length; i++) {
						indexs.push(rows[i].id);
					}
					if (rows.length > 0) {
						$("#indexs").val(indexs.join(','));
						jquerySubByFId('yythddisposeForm',
								yythddispose_callback, null);
					} else {
						alert_warn("请选择要退货的药品");
					}

				})

	};

	function yythddispose_callback(data) {
		$.messager.alert("系统提示消息", data.message);
		yythdmxquery();
	}

	//工具栏

	var toolbar = [ {
		id : 'yythddisposesubmit',
		text : '确认退货',
		iconCls : 'icon-add',
		handler : yythddisposesubmit
	} ];

	var frozenColumns;

	var columns = [ [
			{
				checkbox : true
			},
			{
				field : 'yyname',
				title : '医院名称',
				width : 100
			},
			{
				field : 'backnumber',
				title : '退货单编号',
				width : 80
			},
			{
				field : 'backcreat',
				title : '建单时间',
				width : 80
			},
			{
				field : 'id',
				hidden : true
			},
			{
				field : 'ordernumber',
				title : '采购单编号',
				width : 70
			},
			{
				field : 'mednumber',
				title : '流水号',
				width : 70
			},
			{
				field : 'medname',
				title : '商品名称',
				width : 100
			},
			{
				field : 'medjx',
				title : '剂型',
				width : 60
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
				title : '交易价',
				width : 60
			},
			{
				field : 'medsum',
				title : '采购金额',
				width : 70
			},
			{
				field : 'backnum',
				title : '退货量',
				width : 50
			},
			{
				field : 'backsum',
				title : '退货金额',
				width : 70
			},
			{
				field : 'backreason',
				title : '退货原因',
				width : 90
			}, {
				field : 'backstatemc',
				title : '退货状态',
				width : 70
			} ] ];

	function initGrid() {
		$('#yythdmxlist').datagrid({
			title : '退货单列表',
			striped : true,
			url : '${baseurl}/thd/yythddispose_result.action',
			columns : columns,
			autoRowHeight : true,
			pagination : true,
			rownumbers : true,
			toolbar : toolbar,
			loadMsg : "",
			pageList : [ 15, 30, 50, 100 ],
			onClickRow : function(index, field, value) {
				$('#yythdmxlist').datagrid('unselectRow', index);
			}
		});

	}
	$(function() {
		initGrid();

	});

	function yythdmxquery() {
		var formdata = $("#yythddisposeForm").serializeJson();
		//alert(formdata);
		$('#yythdmxlist').datagrid('unselectAll');
		$('#yythdmxlist').datagrid('load', formdata);
	}
</script>
</HEAD>
<BODY>
	<form id="yythddisposeForm" name="yythddisposeForm" method="post"
		action="${baseurl}/thd/yythddispose_submit.action">
		<input type="hidden" name="indexs" id="indexs" />
		<TABLE class="table_search">
			<TBODY>
				<TR>
					<TD class="left">退货单名称：</td>
					<td><select id="backname" name="backname" style="width: 200px">
							<option value="0">全部</option>
							<c:forEach items="${thdNameList}" var="value">
								<option value="${value.id}">${value.backname}</option>
							</c:forEach>
					</select></TD>
					<TD class="left">退货单状态：</TD>
					<td>已提交至供货商 <a id="btn" href="#" onclick="yythdmxquery()"
						class="easyui-linkbutton" iconCls='icon-search'>查询</a>
					</td>
				</tr>


			</TBODY>
		</TABLE>

		<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
			<TBODY>
				<TR>
					<TD>
						<table id="yythdmxlist"></table>
					</TD>
				</TR>
			</TBODY>
		</TABLE>
	</form>

</BODY>
</HTML>

