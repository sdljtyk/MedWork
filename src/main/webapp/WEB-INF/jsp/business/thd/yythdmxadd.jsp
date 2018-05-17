<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html> 
<head>
<title>退货药品添加</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>

<script type="text/javascript">

var yythdmxaddsubmit = function(){
	_confirm('您确定要退货选择的药品吗?',null,
	  function(){
				
		var indexs = [];//删除记录的序号
		var rows = $('#yycgdmxlist').datagrid('getSelections');
		for(var i=0;i<rows.length;i++){
			var index=$('#yycgdmxlist').datagrid('getRowIndex',rows[i]);
			indexs.push(index);
		}
		if(rows.length>0){
			$("#indexs").val(indexs.join(','));
			jquerySubByFId('yycgdmxForm', yythdmxaddsubmit_callback, null);
		}else{
			alert_warn("请选择要退货的药品");
		}
	  }
	)
	
};

function yythdmxaddsubmit_callback(data) {
	$.messager.alert("系统提示消息", data.message);
	yycgdmxquery();//提交完成刷新本页面
	parent.yythdmxquery();
}

function selectByOrdername(){
	var backid = ${yythdid}
	var data = {
		ordername:$('#ordername').val(),
		backid:backid,
		page:1,
		rows:15
	};
	
	$.post('yythdmxadd_result.action', data, function(data){
		$('#yycgdmxlist').datagrid('loadData', data);
	});
}


//工具栏
var toolbar = [{
	id : 'yythdmxadd',
	text : '确认添加',
	iconCls : 'icon-add',
	handler : yythdmxaddsubmit
	}];

var frozenColumns;

var columns = [ [ {
	field : 'id',
	checkbox:true
},{
	field : 'medid',
	hidden : true,
	formatter: function(value,row,index){
		return '<input type="hidden" name="yythdmxs['+index+'].medid" value="'+row.medid+'" />';
	}
},{
	field : 'backid',
	hidden : true,
	formatter: function(value,row,index){
		return '<input type="hidden" name="yythdmxs['+index+'].backid" value="${yythdid}" />';
	}
},{
	field : 'orderid',
	hidden : true,
	formatter: function(value,row,index){
		return '<input type="hidden" name="yythdmxs['+index+'].orderid" value="'+row.orderid+'" />';
	}
},{
	field : 'medid',
	hidden : true,
	formatter: function(value,row,index){
		return '<input type="hidden" name="yythdmxs['+index+'].medid" value="'+row.medid+'" />';
	}
},{
	field : 'dj',
	hidden : true,
	formatter: function(value,row,index){
		return '<input type="hidden" name="yythdmxs['+index+'].meddj" value="'+row.meddj+'" />';
	}
},{
	field : 'ghsid',
	hidden : true,
	formatter: function(value,row,index){
		return '<input type="hidden" name="yythdmxs['+index+'].ghsid" value="'+row.ghsid+'" />';
	}
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
		url : '${baseurl}/thd/yythdmxadd_result.action?backid=${yythdid}',
		queryParams:{
			yythdid:'${yythdid}'
		},
		autoRowHeight:true,
		columns : columns,
		pagination : true,
		rownumbers : true,
		toolbar : toolbar,
		loadMsg:"",
		pageList:[15,30,50,100],
		onClickRow : function(index, field, value) {
					$('#yycgdmxlist').datagrid('unselectRow', index);
				}
		});

	}
	$(function() {
		initGrid();

	});

	function yycgdmxquery() {
		console.log($('#yycgdmxForm').serialize());
		$('#yycgdmxlist').datagrid('unselectAll');
		$('#yycgdmxlist').datagrid('reload');
	}
</script>
</HEAD>
<BODY>

 <form id="yycgdmxForm" name="yycgdmxForm" action="${baseurl}/thd/yythdmxaddsubmit.action" method="post">
	<input type="hidden" name="indexs" id="indexs" />
	<input type="hidden" name="backid" value="${yythdid}"/>
			<TABLE  class="table_search">
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
					<TD class="left">采购状态：</TD>
					<td>已入库</td>
					<td ></TD>
					<td colspan=2><a id="btn" href="#" onclick="selectByOrdername()"
						class="easyui-linkbutton" iconCls='icon-search'>查询</a></td>
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

