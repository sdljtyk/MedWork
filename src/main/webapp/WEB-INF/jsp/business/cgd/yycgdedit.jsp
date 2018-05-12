<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html> 
<head>
<title>采购单修改</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>

<script type="text/javascript">

//采购单保存
function yycgdsave(){
	$("#yycgdsaveForm").attr("action","${baseurl}/cgd/yycgdsave.action");
	jquerySubByFId('yycgdsaveForm', yycgdsave_callback, null);
}
//采购单提交
function yycgdsubmit(){
	$("#yycgdsaveForm").attr("action","${baseurl}/cgd/yycgdsubmit.action");
	jquerySubByFId('yycgdsaveForm', yycgdsave_callback, null);
}
function yycgdsave_callback(data) {
	var result = getCallbackData(data);
	$.messager.alert("系统提示消息",data.message);
	//如果成功刷新页面，重新跳转至修改页面
	if(result.type==TYPE_RESULT_SUCCESS){
		var yycgdid=result.sysdata.yycgd.id;
		window.location='${baseurl}/cgd/yycgdedit.action?yycgdid='+yycgdid;
	}
	
}

var yycgdmxdelete = function(){
	_confirm('您确定要删除选择的采购药品吗?',null,
	  function(){
				
		var indexs = [];//选择记录的序号
		var rows = $('#yycgdmxlist').datagrid('getSelections');
		for(var i=0;i<rows.length;i++){
			var index=$('#yycgdmxlist').datagrid('getRowIndex',rows[i]);
			indexs.push(index);
		}
		if(rows.length>0){
			$("#indexs").val(indexs.join(','));
			$("#yycgdmxForm").attr("action",'${baseurl}/cgd/yycgdmxdelete.action?yycgdid=${yycgd.id}');
			jquerySubByFId('yycgdmxForm', yycgdmxdelete_callback, null);
		}else{
			alert_warn("请选择要删除的采购药品");
		}
	  }
	)
	
};
//保存采购药品信息
function yycgdmxsave(){
	_confirm("您确定要保存选择的采购药品信息吗？",null,function(){
		
		var indexs = [];//选择记录的序号
		var rows = $('#yycgdmxlist').datagrid('getSelections');
		for(var i=0;i<rows.length;i++){
			var index=$('#yycgdmxlist').datagrid('getRowIndex',rows[i]);
			indexs.push(index);
		}
		if(rows.length>0){
			$("#indexs").val(indexs.join(','));
			$("#yycgdmxForm").attr("action",'${baseurl}/cgd/yycgdmxsave.action');
			jquerySubByFId('yycgdmxForm', yycgdmxsave_callback, null);
		}else{
			alert_warn("请选择要保存的采购药品");
		}
		
	});
}
function yycgdmxdelete_callback(data) {
	$.messager.alert("系统提示消息",data.message);
	yycgdmxquery();
}
function yycgdmxsave_callback(data) {
	$.messager.alert("系统提示消息",data.message);
}
//采购药品添加
function yycgdmxaddshow(){
	var sendUrl="${baseurl}/cgd/yycgdmxadd.action?yycgdid=${yycgd.id}";
	createmodalwindow("供货药品添加", 1000, 500, sendUrl);
}


//工具栏
var toolbar = [{
	id : 'yycgdmxaddshow',
	text : '采购药品添加',
	iconCls : 'icon-add',
	handler : yycgdmxaddshow
	}
	,{
		id : 'yycgdmxdelete',
		text : '采购药品删除',
		iconCls : 'icon-add',
		handler : yycgdmxdelete
	}
	,{
		id : 'yycgdmxsave',
		text : '保存采购药品信息',
		iconCls : 'icon-add',
		handler : yycgdmxsave
	}
	];

var frozenColumns;

var columns = [ [{
	checkbox:true
},{
	field : 'medid',
	hidden : true,
	formatter: function(value,row,index){
		if(row.medid){
			return '<input type="hidden" name="yycgdmxs['+index+'].medid" value="'+row.medid+'" />';
		}else{
			return value;
		}
		
	}
},{
	field : 'yycgdid',
	hidden : true,
	formatter: function(value,row,index){
		if(row.ypxxid){
			return '<input type="hidden" name="yycgdmxs['+index+'].yycgdid" value="'+row.yycgdid+'" />';
		}else{
			return value;
		}
	}
},{
	field : 'ghsid',
	hidden : true,
	formatter: function(value,row,index){
		if(row.medid){
			return '<input type="hidden" name="yycgdmxs['+index+'].ghsid" value="'+row.ghsid+'" />';
		}else{
			return value;
		}
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
},{
	field : 'mednum',
	title : '采购量',
	width : 50,
	formatter:function(value,row,index){
		if(row.ypxxid){
		   return '<input type="text" name="yycgdmxs['+index+'].mednum" value="'+(value?value:"")+'" />';
		}else{
			return value;
		}
	}
},{
	field : 'medsum',
	title : '采购金额',
	width : 50
},{
	field : 'medmake',
	title : '生产企业',
	width : 100
},{
	field : 'ghstatemc',
	title : '采购状态',
	width : 80
},{
	field : 'ghsname',
	title : '供货商',
	width : 100
}]];

function initGrid(){
	$('#yycgdmxlist').datagrid({
		title : '采购药品列表',
		showFooter:true,
		striped : true,
		url : '${baseurl}/cgd/yycgdedit_cgdmxresult.action?yycgdid=${yycgd.id}',
		idField : 'yycgdmxid',//采购药品明细id
		columns : columns,
		pagination : true,
		rownumbers : true,
		toolbar : toolbar,
		loadMsg:"",
		pageList:[15,30,50,100]
		
		} );

	}
	$(function() {
		initGrid();
	});

	function yycgdmxquery() {
		var formdata = $("#yycgdmxForm").serializeJson();
		//alert(formdata);
		$('#yycgdmxlist').datagrid('unselectAll');
		$('#yycgdmxlist').datagrid('load', formdata);
	}
</script>
</HEAD>
<BODY>

<form id="yycgdsaveForm" name="yycgdsaveForm" action="${baseurl}/cgd/yycgdsave.action" method="post">
<input type="hidden" name="yycgd.id" value="${yycgd.id}"/>
<TABLE border=0 cellSpacing=0 cellPadding=0 width="70%" bgColor=#c4d8ed align=center>
		<TBODY>
			<TR>
				<TD background=${baseurl}/images/r_0.gif width="100%">
					<TABLE cellSpacing=0 cellPadding=0 width="100%">
						<TBODY>
							<TR>
								<TD>&nbsp;药品采购单</TD>
								<TD align=right>&nbsp;</TD>
							</TR>
						</TBODY>
					</TABLE>
				</TD>
			</TR>
			<TR>
				<TD>
					<TABLE class="toptable grid" border=1 cellSpacing=1 cellPadding=4
						align=center>
						<TBODY>
							
							<TR>
									<TD height=30 width="15%" align=right>采购单编号：</TD>
									<TD class=category width="35%">${yycgd.ordernumber}</TD>
									<TD height=30 width="15%" align=right>采购单名称：</TD>
									<TD class=category width="35%">
										<div>
											<input type="text" id="yycgd_mc" name="yycgd.mc"
												value="${yycgd.ordername}" style="width: 260px" />
										</div>
										<div id="yycgd_mcTip"></div>
									</TD>
								</TR>
								<TR>
									<TD height=30 width="15%" align=right>建单时间：</TD>
									<TD class=category width="35%">${yycgd.orderctime}</TD>
									<TD height=30 width="15%" align=right>提交时间：</TD>
									<TD class=category width="35%">${yycgd.ordersub}</TD>

								</TR>
								<TR>
									<TD height=30 width="15%" align=right>联系人：</TD>
									<TD class=category width="35%"><input type="text"
										name="ordercreateperson" id="yycgd.lxr"
										value="${yycgd.ordercreateperson}" style="width: 260px" /></TD>
									<TD height=30 width="15%" align=right>联系电话：</TD>
									<TD class=category width="35%"><input type="text"
										name="orderphone" id="yycgd.lxdh" value="${yycgd.orderphone}"
										style="width: 260px" /></TD>
								</TR>
								<TR>
									<TD height=30 width="15%" align=right>采购单状态：</TD>
									<TD class=category width="35%">${yycgd.orderstatemc}</TD>
									<TD height=30 width="15%" align=right>备注：</TD>
									<TD colspan=3><textarea rows="2" cols="30"
											name="orderother">${yycgd.orderother}</textarea></TD>
								</TR>

								<TR>
									<TD height=30 width="15%" align=right>审核时间：</TD>
									<TD class=category width="35%">${yycgd.orderwatime}</TD>
								</TR>
							
							<tr>
							  <td colspan=4 align=center class=category>
								<a  href="#" onclick="yycgdsave()" class="easyui-linkbutton" iconCls='icon-save'>保存</a>
								 <a  href="#" onclick="yycgdsubmit()" class="easyui-linkbutton" iconCls='icon-ok'>提交</a>
							  </td>
							</tr>
						</TBODY>
					</TABLE>
				</TD>
			</TR>
		</TBODY>
	</TABLE>
</form>

<TABLE border=0 cellSpacing=0 cellPadding=0 width="100%" bgColor=#c4d8ed>
		<TBODY>
			<TR>
				<TD background=${baseurl}/images/r_0.gif width="100%">
					<TABLE cellSpacing=0 cellPadding=0 width="100%">
						<TBODY>
							<TR>
								<TD>&nbsp;采购药品列表</TD>
								<TD align=right>&nbsp;</TD>
							</TR>
						</TBODY>
					</TABLE>
				</TD>
			</TR>
		</TBODY>
	</TABLE>
 <form id="yycgdmxForm" name="yycgdmxForm" method="post">
	<input type="hidden" name="indexs" id="indexs" />
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

