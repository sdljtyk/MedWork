<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html>
<head>
<title>药品信息查询</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>

<script type="text/javascript">

var ypxxexport = function(){
	window.location.href = 'http://localhost:8080/ypml/ypxxexport.action';
	//jquerySubByFId('ypxxqueryForm', ypxxexport_callback, null, "json");
};

function ypxxexport_callback(data) {
	$.messager.alert("系统提示消息",data.message);
}
var ypxxdelList = function(){
	_confirm('您确定要执行删除操作吗?',null,
	  function(){
		var ids = [];
		var rows = $('#ypxxlist').datagrid('getSelections');
		for(var i=0;i<rows.length;i++){
			ids.push(rows[i].id);
		}
		if(ids.length>0){
			$("#ypxxdelid").val(ids.join(','));
			jquerySubByFId('ypxxdelForm', ypxxdel_callback, null, "json");
		}else{
			alert_warn("请选择要删除的项目");
		}
		
	  }
	)
	
};
var ypxxdel = function(id){
	_confirm('您确定要执行删除操作吗?',null,
			function(){
				$("#ypxxdelid").val(id);
				jquerySubByFId('ypxxdelForm', ypxxdel_callback, null, "json");
			}
	)
};
function ypxxdel_callback(data) {
	$.messager.alert("系统提示消息",data.message);
	ypxxquery();
}
var ypxxedit = function (id){
	//alert(id);
	var sendUrl = "${baseurl}/ypml/ypxxedit.action?editid="+id;
	
	createmodalwindow("药品信息修改", 900, 500, sendUrl);
};

function ypxxinfo(id){
var sendUrl = "${baseurl}/ypml/ypxxview.action?id="+id;
	
	createmodalwindow("药品信息查看", 900, 500, sendUrl);
}
var ypxxadd = function (){
	var sendUrl = "${baseurl}/ypml/ypxxedit.action";
	createmodalwindow("药品信息添加", 900, 500, sendUrl);
};


//工具栏
<c:if test="${ismanager=='1'}">
var toolbar = [ {
	id : 'ypxxadd',
	text : '添加',
	iconCls : 'icon-add',
	handler : ypxxadd
	},{
	id : 'export',
	text : '导出',
	iconCls : 'icon-redo',
	handler : ypxxexport
	},{
	id : 'ypxxdel',
	text : '批量删除',
	iconCls : 'icon-remove',
	handler : ypxxdelList
	}];

</c:if>
<c:if test="${ismanager==null || ismanager!='1'}">
var toolbar = [ {
	id : 'export',
	text : '导出',
	iconCls : 'icon-redo',
	handler : ypxxexport
	}];
</c:if>
var frozenColumns;

var columns = [ [{
	field : 'id',
	title : '',
	checkbox:true
},{
	field : 'mednumber',
	title : '流水号',
	width : 80
},{
	field : 'medname',
	title : '商品名称',
	width : 130
},{
	field : 'medjx',
	title : '剂型',
	width : 80
},{
	field : 'medgg',
	title : '规格',
	width : 120
},{
	field : 'medmake',
	title : '生产企业',
	width : 210
},{
	field : 'zlccmc',
	title : '质量层次',
	width : 130
},{
	field : 'lbmc',
	title : '药品类别',
	width : 100
},{
	field : 'jyztmc',
	title : '交易状态',
	width : 60
}
<c:if test="${ismanager=='1'}">
,{
	field : 'opt1',
	title : '修改',
	width : 60,
	formatter:function(value, row, index){
		return '<a href=javascript:ypxxedit(\''+row.id+'\')>修改</a>';
	}
},{
	field : 'opt2',
	title : '删除',
	width : 60,
	formatter:function(value, row, index){
		return '<a href=javascript:ypxxdel(\''+row.id+'\')>删除</a>';
	}
}
</c:if>
,{
	field : 'opt3',
	title : '详细',
	width : 60,
	formatter:function(value, row, index){
		return '<a href=javascript:ypxxinfo(\''+row.id+'\')>查看</a>';
	}
}]];

function initGrid(){
	$('#ypxxlist').datagrid({
		title : '药品信息列表',
		striped : true,
		url : '${baseurl}/ypml/ypxxquery_result.action',
		idField : 'id',
		columns : columns,
		pagination : true,
		rownumbers : true,
		toolbar : toolbar,
		loadMsg:"",
		pageList:[15,30,50,100],
		onClickRow : function(index, field, value) {
					$('#ypxxlist').datagrid('unselectRow', index);
				}
		});

	}
	$(function() {
		initGrid();
		
	});

	function ypxxquery() {
 
		var formdata = $("#ypxxqueryForm").serializeJson();
		//alert(formdata);
		$('#ypxxlist').datagrid('unselectAll');
		$('#ypxxlist').datagrid('load', formdata);
	}
</script>
</HEAD>
<BODY>
	<div id="ypxxquery_div">
		<form id="ypxxqueryForm" name="ypxxqueryForm"
			action="${baseurl}/ypml/ypxxexport.action" method="post">
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
						</select></td>
						<td colspan=2><a id="btn" href="#" onclick="ypxxquery()"
							class="easyui-linkbutton" iconCls='icon-search'>查询</a></td>
					</TR>

				</TBODY>
			</TABLE>
		</form>
		<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
			<TBODY>
				<TR>
					<TD>
						<table id="ypxxlist"></table>
					</TD>
				</TR>
			</TBODY>
		</TABLE>
	</div>
	<div id="ypxximport_div"></div>
	<div id="ypxxedit_div"></div>
	<form id="ypxxdelForm" name="ypxxdelForm"
		action="${baseurl}/ypml/ypxxdel.action" method="post">
		<input type="hidden" id="ypxxdelid" name="ypxxdelid" />
	</form>
</BODY>
</HTML>

