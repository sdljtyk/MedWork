<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html>
<head>
<title>医院采购单维护</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>

<script type="text/javascript">

var yycgddelete = function(id){
	_confirm('您确定要删除该采购单吗?',null,
	  function(){
		if(id){
			$("#cgddeleteid").val(id);
			jquerySubByFId('yycgddeleteForm', yycgddelete_callback, null);
		}else{
			
			alert_warn("请选择要删除的采购单");
		}
		
	  }
	)
	
};

function yycgddelete_callback(data) {
	$.messager.alert("系统提示消息",data.message);
	yycgdquery();
}


function yycgdinfo(id){
	var sendUrl = "${baseurl}/cgd/yycgdinfo.action?yycgdid="+id;
	parent.opentabwindow('采购单查看',sendUrl);
}

function yycgdedit(id){
	var sendUrl = "${baseurl}/cgd/yycgdedit.action?yycgdid="+id;
	parent.opentabwindow('采购单修改',sendUrl);
}
function yycgdadd(id){
	var sendUrl = "${baseurl}/cgd/yycgdadd.action";
	parent.opentabwindow('采购单创建',sendUrl);
}
//工具栏

var toolbar = [{
	id : 'yycgdadd',
	text : '创建采购单',
	iconCls : 'icon-add',
	handler : yycgdadd
	}];

var frozenColumns;

var columns = [ [
	{
		field : 'id',
		hidden : true
	},{
		field : 'ordernumber',
		title : '采购单编号',
		width : 130
	},{
		field : 'ordername',
		title : '采购单名称',
		width : 180
	},{
		field : 'ordercreateperson',
		title : '联系人',
		width : 110
	},{
		field : 'orderphone',
		title : '联系方式',
		width : 110
	},{
		field : 'orderctime',
		title : '建单时间',
		width : 130

	},{
		field : 'ordersub',
		title : '提交时间',
		width : 130
	},{
		field : 'orderwatime',
		title : '审核时间',
		width : 130

	},{
		field : 'orderstatemc',
		title : '采购单状态', 
		width : 80
	},{
	field : 'opt4',
	title : '修改',
	width : 60,
	formatter:function(value, row, index){
		return '<a href=javascript:yycgdedit(\''+row.id+'\')>修改</a>';
	}
},{
	field : 'opt5',
	title : '删除',
	width : 60,
	formatter:function(value, row, index){
		return '<a href=javascript:yycgddelete(\''+row.id+'\')>删除</a>';
	}
}]];

function initGrid(){
	$('#yycgdlist').datagrid({
		title : '采购单列表',
		//nowrap : false,
		striped : true,
		//collapsible : true,
		url : '${baseurl}/cgd/yycgdmanager_result.action?orderstate=29',
		idField : 'id',//采购单id
		columns : columns,
		autoRowHeight:true,
		pagination : true,
		rownumbers : true,
		toolbar : toolbar,
		loadMsg:"",
		pageList:[15,30,50,100],
		onClickRow : function(index, field, value) {
					$('#yycgdlist').datagrid('unselectRow', index);
				},
		});

	}
	$(function() {
		initGrid();
		
	});

	function yycgdquery() {
		var formdata = $("#yycgdqueryForm").serializeJson();
		//alert(formdata);
		$('#yycgdlist').datagrid('unselectAll');
		$('#yycgdlist').datagrid('load', formdata);
	}
</script>
</HEAD>
<BODY>
	<form id="yycgdqueryForm" name="yycgdqueryForm" method="post">
		<input type="hidden" name="indexs" id="indexs" />
		<TABLE class="table_search">
			<TBODY>
				<TR>
					<TD class="left">采购单编号：</td>
					<td><INPUT type="text" name="ordernumber" /></TD>
					<TD class="left">采购单名称：</TD>
					<td><INPUT type="text" name="ordername" /></td>
					<TD class="left">采购单状态：</TD>
					<td width="160px">未提交</td>
					<TD colspan=2><a id="btn" href="#" onclick="yycgdquery()"
						class="easyui-linkbutton" iconCls='icon-search'>查询</a></TD>

				</tr>

			</TBODY>
		</TABLE>

		<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
			<TBODY>
				<TR>
					<TD>
						<table id="yycgdlist"></table>
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

