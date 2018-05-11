<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html>
<head>
<title>医院药品目录查询</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>

<script type="text/javascript">
	var yyypmldel = function() {
		_confirm('您确定要执行删除选中的药品吗?', null, function() {
			var indexs = [];//删除记录的序号
			var rows = $('#yyypmllist').datagrid('getSelections');
			for (var i = 0; i < rows.length; i++) {
				indexs.push(rows[i].yymedid);
			}
			if (rows.length > 0) {
				$("#indexs").val(indexs.join(','));
				jquerySubByFId('yyypmldeleteForm', yyypmldel_callback, null);
			} else {
				alert_warn("请选择要删除的药品");
			}

		})

	};

	function yyypmldel_callback(data) {
		$.messager.alert("系统提示消息",data.message);
		yyypmlquery();
	}

	function ypxxinfo(id) {
		var sendUrl = "${baseurl}/ypml/ypxxview.action?id=" + id;
		createmodalwindow("药品信息查看", 900, 500, sendUrl);
	}

	//工具栏

	var toolbar = [ {
		id : 'yyypmldel',
		text : '采购目录药品删除',
		iconCls : 'icon-remove',
		handler : yyypmldel
	} ];

	var frozenColumns;

	var columns = [ [
			{
				field : 'yymedid',
				title : '',
				checkbox:true
			},{
				field : 'id',
				hidden : true
			},
			{
				field : 'mednumber',
				title : '流水号',
				width : 90
			},{
				field : 'medname',
				title : '商品名称',
				width : 150
			},{
				field : 'medjx',
				title : '剂型',
				width : 90
			},{
				field : 'medgg',
				title : '规格',
				width : 100
			},{
				field : 'medmake',
				title : '生产企业',
				width : 185
			},{
				field : 'zlccmc',
				title : '质量层次',
				width : 160
			},{
				field : 'lbmc',
				title : '药品类别',
				width : 110
			},{
				field : 'jyztmc',
				title : '交易状态',
				width : 70
			},
			{
				field : 'medsum',
				title : '库存量',
				width : 70
			},
			{
				field : 'opt3',
				title : '详细',
				width : 70,
				formatter : function(value, row, index) {
					return '<a href=javascript:ypxxinfo(\'' + row.id
							+ '\')>查看</a>';
				}
			} ] ];

	function initGrid() {
		$('#yyypmllist').datagrid({
			title : '医院采购目录列表',
			striped : true,
			url : '${baseurl}/ypml/yyypmlquery_result.action?yyid=${activeUser.unitID}',
			idField : 'id',
			columns : columns,
			pagination : true,
			rownumbers : true,
			toolbar : toolbar,
			loadMsg : "",
			pageList : [ 15, 30, 50, 100 ],
			onClickRow : function(index, field, value) {
				$('#yyypmllist').datagrid('unselectRow', index);
			}
		});
	}
	$(function() {
		initGrid();

	});

	function yyypmlquery() {

		var formdata = $("#yyypmldeleteForm").serializeJson();
		//alert(formdata);
		$('#yyypmllist').datagrid('unselectAll');
		$('#yyypmllist').datagrid('load', formdata);
	}
</script>
</HEAD>
<BODY>
	<div id="ypxxquery_div">
		<form id="yyypmldeleteForm" name="yyypmldeleteForm"
			action="${baseurl}/ypml/yyypmldelete.action" method="post">
			<input type="hidden" name="indexs" id="indexs" />
			<TABLE class="table_search">
				<TBODY>
					<TR>
						<TD class="left">商品名称：</td>
						<td><INPUT type="text" name="medname" /></TD>
						<TD class="left">剂型：</TD>
						<td><INPUT type="text" name="medjx" /></td>
						<TD class="left">规格：</TD>
						<td><INPUT type="text" name="medgg" /></td>
					</TR>
					<TR>
						<TD class="left">药品单位：</TD>
						<td><INPUT type="text" name="meddw" /></td>
						<TD class="left">流水号：</TD>
						<td><INPUT type="text" name="mednumber" /></td>
						<TD class="left">生产企业：</TD>
						<td><INPUT type="text" name="medmake" /></td>
					</tr>
					<tr>

						<TD class="left">药品类别：</TD>
						<td><select id="ypxxCustom.medclass" name="medclass"
							style="width: 150px">
								<option value="">全部</option>
								<c:forEach items="${yplbList}" var="value">
									<option value="${value.id}">${value.info}</option>
								</c:forEach>
						</select></td>
						<TD class="left">交易状态：</TD>
						<td><select id="ypxxCustom.medstate" name="medstate"
							style="width: 150px">
								<option value="">全部</option>
								<c:forEach items="${ypjyztList}" var="value">
									<option value="${value.id}">${value.info}</option>
								</c:forEach>
						</select></td>

						<td class="left" height="25">质量层次：</td>
						<td><select id="ypxxCustom.medzl" name="medzl"
							style="width: 150px">
								<option value="">全部</option>
								<c:forEach items="${ypzlccList}" var="value">
									<option value="${value.id}">${value.info}</option>
								</c:forEach>
						</select><a id="btn" href="#" onclick="yyypmlquery()"
							class="easyui-linkbutton" iconCls='icon-search'>查询</a></td>

					</TR>

				</TBODY>
			</TABLE>

			<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
				<TBODY>
					<TR>
						<TD>
							<table id="yyypmllist"></table>
						</TD>
					</TR>
				</TBODY>
			</TABLE>
		</form>
	</div>


</BODY>
</HTML>

