<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html> 
<head>
<title>医院退货单维护</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>

<script type="text/javascript">

var yythddelete = function(id){
	_confirm('您确定要删除该退货单吗?',null,
	  function(){
		if(id){
			$("#thddeleteid").val(id);
			jquerySubByFId('yythddeleteForm', yythddelete_callback, null);
		}else{
			
			alert_warn("请选择要删除的退货单");
		}
		
	  }
	)
	
};

function yythddelete_callback(data) {
	$.messager.alert("系统提示消息",data.message);
	yythdquery();
}


function yythdinfo(id){
	var sendUrl = "${baseurl}/thd/yythdinfo.action?yythdid="+id;
	parent.opentabwindow('退货单查看',sendUrl);
}

function yythdedit(id){
	var sendUrl = "${baseurl}/thd/yythdedit.action?yythdid="+id;
	parent.opentabwindow('退货单修改',sendUrl);
}
function yythdadd(id){
	var sendUrl = "${baseurl}/thd/yythdadd.action";
	parent.opentabwindow('退货单创建',sendUrl);
}
//工具栏

var toolbar = [{
	id : 'yythdadd',
	text : '创建退货单',
	iconCls : 'icon-add',
	handler : yythdadd
	}];

var frozenColumns;

var columns = [ [
 {
	field : 'id',
	title : '',
	hidden : true,
},{
	field : 'backnumber',
	title : '退货单编号',
	width : 140
},{
	field : 'backname',
	title : '退货单名称',
	width : 180
},{
	field : 'yylxr',
	title : '联系人',
	width : 70
},{
	field : 'backphone',
	title : '联系方式',
	width : 100
},{
	field : 'backcreat',
	title : '建单时间',
	width : 130
},{
	field : 'backalter',
	title : '修改时间',
	width : 130
},{
	field : 'backsub',
	title : '提交时间',
	width : 130
},{
	field : 'backstatename',
	title : '退货单状态', 
	width : 100
},{
	field : 'opt4',
	title : '修改',
	width : 70,
	formatter:function(value, row, index){
		return '<a href=javascript:yythdedit(\''+row.id+'\')>修改</a>';
	}
},{
	field : 'opt5',
	title : '删除',
	width : 70,
	formatter:function(value, row, index){
		return '<a href=javascript:yythddelete(\''+row.id+'\')>删除</a>';
	}
}]];

function initGrid(){
	$('#yythdlist').datagrid({
		title : '退货单列表',
		striped : true,
		url : '${baseurl}/thd/yythdmanager_result.action',
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
			<input type="hidden" name="indexs" id="indexs" />
			<TABLE  class="table_search">
				<TBODY>
					<TR>
						<TD class="left">退货单编号：</td>
						<td><INPUT type="text"  name="backnumber" /></TD>
					<TD class="left">退货单名称：</TD>
						<td ><INPUT type="text" name="backname" /></td>
						 <TD class="left">退货单状态：</TD>
						<td >
							未提交
							<a id="btn" href="#" onclick="yythdquery()" class="easyui-linkbutton" iconCls='icon-search'>查询</a>
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

<form id="yythddeleteForm" name="yythddeleteForm" action="${baseurl}/thd/yythddelete.action">
<input type="hidden" id="thddeleteid" name="thddeleteid" />
</form>

</BODY>
</HTML>

