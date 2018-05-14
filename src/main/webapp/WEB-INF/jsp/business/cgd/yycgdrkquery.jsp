<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html>
<head>
<title>采购药品入库</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>

<script type="text/javascript">

var yycgdrksubmit = function(){
	_confirm('您确定要入库选择的药品吗?',null,
	  function(){
		
		var indexs = [];//提交记录的序号
		var rows = $('#yycgdmxlist').datagrid('getSelections');
		for(var i=0;i<rows.length;i++){
			indexs.push(rows[i].id);
		}
		if(rows.length>0){
			$("#indexs").val(indexs.join(','));
			jquerySubByFId('yycgdrkForm', yycgdrk_callback, null);
		}else{
			alert_warn("请选择要入库的药品");
		}
		
	  }
	)
	
};

function yycgdrk_callback(data) {
	$.messager.alert("系统提示消息",data.message);
	yycgdmxquery();
}



//工具栏

var toolbar = [{
	id : 'yycgdrksubmit',
	text : '确认入库',
	iconCls : 'icon-add',
	handler : yycgdrksubmit
	}];

var frozenColumns;

var columns = [ [ {
	field : 'id',
	checkbox:true
},{
	field : 'mednumber',
	title : '流水号',
	width : 80
}, {
	field : 'medname',
	title : '药品名称',
	width : 160
}, {
	field : 'medjx',
	title : '剂型',
	width : 80
}, {
	field : 'medgg',
	title : '规格',
	width : 70
}, {
	field : 'meddw',
	title : '单位',
	width : 70
},{
	field : 'meddj',
	title : '中标价(元)',
	width : 80
}, {
	field : 'mednum',
	title : '采购量',
	width : 70
}, {
	field : 'medsum',
	title : '采购金额(元)',
	width : 80
}, {
	field : 'medmake',
	title : '生产企业',
	width : 180
}, {
	field : 'ghstatemc',
	title : '采购状态',
	width : 100
}, {
	field : 'ghsname',
	title : '供货商',
	width : 150
}]];

function initGrid(){
	$('#yycgdmxlist').datagrid({
		title : '采购单列表',
		striped : true,
		url : '${baseurl}/cgd/yycgdrkquery_result.action',
		idField : 'id',
		columns : columns,
		autoRowHeight:true,
		pagination : true,
		rownumbers : true,
		toolbar : toolbar,
		loadMsg:"",
		pageList:[15,30,50,100]
		});

	}
	$(function() {
		initGrid();
		
	});

	function yycgdmxquery() {
		var formdata = $("#yycgdrkForm").serializeJson();
		//alert(formdata);
		$('#yycgdmxlist').datagrid('unselectAll');
		$('#yycgdmxlist').datagrid('load', formdata);
	}
	
</script>
</HEAD>
<BODY>
	<form id="yycgdrkForm" name="yycgdrkForm" method="post"
		action="${baseurl}/cgd/yycgdrk_submit.action">
		<input type="hidden" name="indexs" id="indexs" />
		<TABLE class="table_search">
			<TBODY>
				<TR>
					<TD class="left">采购单名称：</td>
					<td>
						<select id="ordername" name="ordername"
						style="width: 200px">
							<option value="0">全部</option>
							<c:forEach items="${cgdNameList}" var="value">
								<option value="${value.id}">${value.ordername}</option>
							</c:forEach>
					</select>
					</TD>
					<TD class="left">采购状态：</td>
					<td>已发货</TD>
					<td colspan=2><a id="btn" href="#" onclick="yycgdmxquery()"
						class="easyui-linkbutton" iconCls='icon-search'>查询</a></TD>
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

