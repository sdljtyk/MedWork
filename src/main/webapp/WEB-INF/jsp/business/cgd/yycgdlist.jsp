<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html> 
<head>
<title>医院采购单查询</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>

<script type="text/javascript">


function yycgdinfo(id){
	var sendUrl = "${baseurl}/cgd/yycgdinfo.action?yycgdid="+id;
	parent.opentabwindow('采购单查看',sendUrl);
}


//工具栏

var toolbar = [];

var frozenColumns;

var columns = [ [
 
 {
	field : 'yyname',
	title : '医院名称',
	width : 100
},{
	field : 'ordernumber',
	title : '采购单编号',
	width : 120
},{
	field : 'ordername',
	title : '采购单名称',
	width : 170
},{
	field : 'ordercreateperson',
	title : '联系人',
	width : 120
},{
	field : 'orderphone',
	title : '联系方式',
	width : 120
},{
	field : 'orderctime',
	title : '建单时间',
	width : 120

},{
	field : 'ordersub',
	title : '提交时间',
	width : 120
},{
	field : 'orderwatime',
	title : '审核时间',
	width : 120

},{
	field : 'orderstatemc',
	title : '采购单状态', 
	width : 70
},{
	field : 'opt3',
	title : '查看',
	width : 60,
	formatter:function(value, row, index){
		return '<a href=javascript:yycgdinfo(\''+row.id+'\')>查看</a>';
	}
}]];

function initGrid(){
	$('#yycgdlist').datagrid({
		title : '采购单列表',
		striped : true,
		url : '${baseurl}/cgd/yycgdlist_result.action',
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
				}
		});

	}
	$(function() {
		initGrid();
	});

	function yycgdquery() {
		var formdata = $("#yycgdqueryForm").serializeJson();
		$('#yycgdlist').datagrid('unselectAll');
		$('#yycgdlist').datagrid('load', formdata);
	}
	
</script>
</HEAD>
<BODY>
    <form id="yycgdqueryForm" name="yycgdqueryForm" method="post" >
			<TABLE  class="table_search">
				<TBODY>
					<TR>
						<TD class="left">采购单编号：</td>
						<td><INPUT type="text"  name="ordernumber" /></TD>
					<TD class="left">采购单名称：</TD>
						<td ><INPUT type="text" name="ordername" /></td>
					  <TD class="left">采购单状态：</TD>
						<td >
							<select id="yycgdCustom.zt" name="orderstate" style="width:150px">
								<option value="0">全部</option>
								<c:forEach items="${cgdztList}" var="value">
									<option value="${value.id}">${value.info}</option>
								</c:forEach>
							</select>
						<a id="btn" href="#" onclick="yycgdquery()" class="easyui-linkbutton" iconCls='icon-search'>查询</a>	
						</td>
						
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


</BODY>
</HTML>

