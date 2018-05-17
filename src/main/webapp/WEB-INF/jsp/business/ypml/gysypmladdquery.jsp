<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html> 
<head>
<title>供货商药品目录添加查询</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>

<script type="text/javascript">

var gysypmladd = function(){
	_confirm('您确定要將选择药品添加至药品目录吗?',null,
	  function(){
		var indexs = [];
		var rows = dataGrid_obj.datagrid('getSelections');
		for(var i=0;i<rows.length;i++){
			indexs.push(rows[i].id);
		}
		if(rows.length>0){
			$("#indexs").val(indexs.join(','));
			jquerySubByFId('gysypmladdqueryForm',gysypmladd_callback, null);
		}else{
			alert_warn("请选择要添加的药品");
		}
		
	  }
	)
	
};

function gysypmladd_callback(data) {
	$.messager.alert("系统提示消息",data.message);
	gysypmladdquery();
}


//工具栏

var toolbar = [ {
	id : 'gysypmladd',
	text : '确认添加',
	iconCls : 'icon-add',
	handler : gysypmladd
	}];

var frozenColumns;

var columns = [ [{
	field : 'check',
	title : '选择',
	checkbox : true
},{
	field : 'id',
	hidden:true
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
	width : 100
},{
	field : 'medmake',
	title : '生产企业',
	width : 180
},{
	field : 'zlccmc',
	title : '质量层次',
	width : 150
},{
	field : 'lbmc',
	title : '药品类别',
	width : 50
},{
	field : 'jyztmc',
	title : '交易状态',
	width : 60
}]];

var dataGrid_obj;

function initGrid(){
	dataGrid_obj = $('#gysypmladdlist');
	
	dataGrid_obj.datagrid({
		title : '供应药品列表',
		striped : true,
		url : '${baseurl}/ypml/gysypmladdquery_result.action',
		idField : 'id',
		columns : columns,
		pagination : true,
		rownumbers : true,
		toolbar : toolbar,
		loadMsg:"",
		pageList:[15,30,50,100],
		onClickRow : function(index, field, value) {
			dataGrid_obj.datagrid('unselectRow', index);
		}
		});

	}
	$(function() {
		initGrid();
		
	});

	function gysypmladdquery() {
 
		var formdata = $("#gysypmladdqueryForm").serializeJson();
		//alert(formdata);
		dataGrid_obj.datagrid('unselectAll');
		dataGrid_obj.datagrid('load', formdata);
	}
</script>
</HEAD>
<BODY>
<div id="ypxxquery_div">
    <form id="gysypmladdqueryForm" name="gysypmladdqueryForm" action="${baseurl}/ypml/gysypmladd.action" method="post">
			<input type="hidden" name="indexs" id="indexs" />
			<TABLE  class="table_search">
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
						</select>
					
				  		</td>
				  		<td colspan=2>
						<a id="btn" href="#" onclick="gysypmladdquery()" class="easyui-linkbutton" iconCls='icon-search'>查询</a>
				  		</td>
						
					</TR>
					
				</TBODY>
			</TABLE>
	    
		<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
			<TBODY>
				<TR>
					<TD>
						<table id="gysypmladdlist"></table>
					</TD>
				</TR>
			</TBODY>
		</TABLE>
		</form>
	</div>

</BODY>
</HTML>

