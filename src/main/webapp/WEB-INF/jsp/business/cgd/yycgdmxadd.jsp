<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html>
<head>
<title>采购药品添加</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>

<script type="text/javascript">
	var yycgdmxaddsubmit = function() {
		_confirm('您确定要采购选择的药品吗?', null, function() {

			var indexs = [];//删除记录的序号
			var rows = $('#yyypmllist').datagrid('getSelections');
			for (var i = 0; i < rows.length; i++) {
				var index = $('#yyypmllist').datagrid('getRowIndex', rows[i]);
				indexs.push(index);
			}
			if (rows.length > 0) {
				$("#indexs").val(indexs.join(','));
				jquerySubByFId('yyypmlForm', yycgdmxaddsubmit_callback, null);
			} else {
				alert_warn("请选择要采购的药品");
			}
		})

	};

	function yycgdmxaddsubmit_callback(data) {
		$.messager.alert("系统提示消息", data.message);
		yyypmlquery();//提交完成刷新本页面
		parent.yycgdmxquery();
	}

	//工具栏
	var toolbar = [ {
		id : 'yycgdmxadd',
		text : '确认添加',
		iconCls : 'icon-add',
		handler : yycgdmxaddsubmit
	} ];

	var frozenColumns;

	var columns = [ [
			{
				checkbox : true
			},
			{
				field : 'medid',
				hidden : true,
				formatter : function(value, row, index) {
					return '<input type="hidden" name="yycgdmxs['+index+'].medid" value="'+row.medid+'" />';
				}
			},
			{
				field : 'yycgdid',
				hidden : true,
				formatter : function(value, row, index) {
					return '<input type="hidden" name="yycgdmxs['+index+'].orderid" value="${yycgdid}" />';
				}
			},
			{
				field : 'ghsunitid',
				hidden : true,
				formatter : function(value, row, index) {
					return '<input type="hidden" name="yycgdmxs['+index+'].ghsid" value="'+row.ghsunitid+'" />';
				}
			}, {
				field : 'mednumber',
				title : '流水号',
				width : 80
			}, {
				field : 'medname',
				title : '商品名称',
				width : 120
			}, {
				field : 'medjx',
				title : '剂型',
				width : 70
			}, {
				field : 'medgg',
				title : '规格',
				width : 70
			}, {
				field : 'meddj',
				title : '中标价',
				width : 70,
			},{
			field : 'dj',
			title : '',
			hidden : true,
			formatter : function(value, row, index) {
				return '<input type="hidden" name="yycgdmxs['+index+'].meddj" value="'+row.meddj+'" />';
			}
		}, {
				field : 'medmake',
				title : '生产企业',
				width : 180
			}, {
				field : 'jyztmc',
				title : '交易状态',
				width : 60
			}, {
				field : 'ghsname',
				title : '供货商',
				width : 200
			} ] ];

	function initGrid() {
		$('#yyypmllist')
				.datagrid(
						{
							title : '采购单列表',
							striped : true,
							url : '${baseurl}/cgd/yycgdmxadd_result.action?ghsmedstate=16&medstate=18',
							queryParams : {
								yycgdid : '${yycgdid}'
							},
							autoRowHeight : true,
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
		
		$('#yyypmllist').datagrid('reload');
		$('#yyypmllist').datagrid('unselectAll');
	}
</script>
</HEAD>
<BODY>

	<form id="yyypmlForm" name="yyypmlForm"
		action="${baseurl}/cgd/yycgdmxaddsubmit.action" method="post">
		<input type="hidden" name="indexs" id="indexs" /> <input
			type="hidden" name="yycgdid" value="${yycgdid}" />
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
					<TD class="left">生产企业：</TD>
					<td><INPUT type="text" name="medmake" /></td>
					<TD class="left">药品类别：</TD>
					<td><select id="ypxxCustom.medclass" name="medclass"
						style="width: 150px">
							<option value="0">全部</option>
							<c:forEach items="${yplbList}" var="value">
								<option value="${value.id}">${value.info}</option>
							</c:forEach>
					</select></td>
					<td class="left" height="25">供货状态：</td>
					<td><INPUT type="text" name="medmake" value="正常" readonly="readonly" /> <a id="btn" href="#" onclick="yyypmlquery()"
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

</BODY>
</HTML>

