<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html>
<head>
<title>供货商药品目录控制查询</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-ghsmedstate" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>

<script type="text/javascript">
	var gysypmlcontrolsubmit = function() {
		_confirm('您确定要提交选择的供货状态吗?', null, function() {
			var indexs = [];
			var states = [];
			var rows = $('#gysypmllist').datagrid('getSelections');
			for (var i = 0; i < rows.length; i++) {
				indexs.push(rows[i].id);
				states.push($('#reghsmedstate'+rows[i].id).val());
			}
			console.log(indexs)
			console.log(states)
			 if (rows.length > 0) {
				$.post('gysypmlcontrolsubmit.action',{indexs:indexs.join(','),states:states.join(',')},function(data){
							$.messager.alert("系统提示消息",data.message);
							gysypmlquery();
				});
				
			} else {
				alert_warn("请选择要提交的供货状态");
			}

		})

	};

	function ypxxinfo(id) {
		var sendUrl = "${baseurl}/ypml/ypxxview.action?id=" + id;
		createmodalwindow("药品信息查看", 900, 500, sendUrl);
	}

	//工具栏

	var toolbar = [ {
		id : 'gysypmladd',
		text : '提交供货状态',
		iconCls : 'icon-add',
		handler : gysypmlcontrolsubmit
	} ];

	var frozenColumns;

	var columns = [ [
			{
				field : 'id',
				title : '',
				checkbox : true
			},
			{
				field : 'medid',
				hidden : true
			},
			{
				field : 'ghsunitid',
				hidden : true
			},
			{
				field : 'ghsname',
				title : '供货企业',
				width : 100
			},
			{
				field : 'controlmc',
				title : '供货状态',
				width : 100
			},
			{
				field : 'reghsmedstate',
				title : '修改供货状态',
				width : 100,
				formatter : function(value, row, index) {
					return '<select  id="reghsmedstate'+row.id+'" style="width:80px">'
							+ '<option value="0">默认</option>'
					<c:forEach items="${ypghztList}" var="value">
							+ '<option value="${value.id}">${value.info}</option>'
					</c:forEach> + '</select>';
				}
			},
			{
				field : 'mednumber',
				title : '流水号',
				width : 80
			},
			{
				field : 'medjx',
				title : '剂型',
				width : 80
			},
			{
				field : 'medgg',
				title : '规格',
				width : 100
			},
			{
				field : 'medmake',
				title : '生产企业',
				width : 200
			},
			{
				field : 'medname',
				title : '商品名称',
				width : 120
			},
			{
				field : 'meddj',
				title : '中标价',
				width : 60
			},
			{
				field : 'jyztmc',
				title : '交易状态',
				width : 80
			},
			{
				field : 'opt3',
				title : '详细',
				width : 60,
				formatter : function(value, row, index) {
					return '<a href=javascript:ypxxinfo(\'' + row.medid
							+ '\')>查看</a>';
				}
			} ] ];

	function initGrid() {
		$('#gysypmllist').datagrid({
			title : '供应药品列表',
			striped : true,
			url : '${baseurl}/ypml/gysypmlcontrolquery_result.action',
			columns : columns,
			pagination : true,
			rownumbers : true,
			toolbar : toolbar,
			loadMsg : "",
			pageList : [ 15, 30, 50, 100 ],
			onClickRow : function(index, field, value) {
				$('#gysypmllist').datagrid('unselectRow', index);
			}
		});

	}
	$(function() {
		initGrid();

	});

	function gysypmlquery() {

		var formdata = $("#gysypmlcontrolForm").serializeJson();
		//alert(formdata);
		$('#gysypmllist').datagrid('unselectAll');
		$('#gysypmllist').datagrid('load', formdata);
	}
</script>
</HEAD>
<BODY>
	<div id="ypxxquery_div">
		<form id="gysypmlcontrolForm" name="gysypmlcontrolForm"
			action="${baseurl}/ypml/gysypmlcontrolsubmit.action" method="post">
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
						<TD class="left">生产企业：</TD>
						<td><INPUT type="text" name="medmake" /></td>
					</TR>
					<tr>
						<TD class="left">药品类别：</TD>
						<td><select id="medclass" name="medclass"
							style="width: 165px">
								<option value="0">全部</option>
								<c:forEach items="${yplbList}" var="value">
									<option value="${value.id}">${value.info}</option>
								</c:forEach>
						</select></td>
						<TD class="left">交易状态：</TD>
						<td><select id="medstate" name="medstate"
							style="width: 165px">
								<option value="0">全部</option>
								<c:forEach items="${ypjyztList}" var="value">
									<option value="${value.id}">${value.info}</option>
								</c:forEach>
						</select></td>
						<td class="left" height="25">单价不大于：</td>
						<td><input type="text" name="Meddj" id="Meddj" />

						</td>
						<td class="left" height="25">供货状态：</td>
						<td><select id="ghsmedstate"
							name="ghsmedstate" style="width: 80px;">
								<option value="0">全部</option>
								<c:forEach items="${ypghztList}" var="value">
									<option value="${value.id}">${value.info}</option>
								</c:forEach>
						</select> <a id="btn" href="#" onclick="gysypmlquery()"
							class="easyui-linkbutton" iconCls='icon-search'>查询</a></td>
						</td>

					</TR>

				</TBODY>
			</TABLE>

			<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
				<TBODY>
					<TR>
						<TD>
							<table id="gysypmllist" align="center"></table>
						</TD>
					</TR>
				</TBODY>
			</TABLE>
		</form>
	</div>


</BODY>
</HTML>

